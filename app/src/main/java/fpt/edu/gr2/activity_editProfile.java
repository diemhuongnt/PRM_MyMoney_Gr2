package fpt.edu.gr2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_editProfile extends AppCompatActivity {

    private EditText etDob, etAnswer, etOldPassword, etNewPassword, etConfirmNewPassword;
    private Spinner spinnerSecurityQuestion;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        // Liên kết các view với layout XML
        etDob = findViewById(R.id.et_dob);
        etAnswer = findViewById(R.id.et_answer);
        etOldPassword = findViewById(R.id.et_old_password);
        etNewPassword = findViewById(R.id.et_new_password);
        etConfirmNewPassword = findViewById(R.id.et_confirm_new_password);
        spinnerSecurityQuestion = findViewById(R.id.spinner_security_question);

        // Thiết lập các câu hỏi bảo mật cho Spinner
        String[] securityQuestions = {
                "Your first pet's name?",
                "Your mother's maiden name?",
                "Your favorite book?"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, securityQuestions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSecurityQuestion.setAdapter(adapter);

        // Xử lý sự kiện cho nút "Back"
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Quay về màn hình trước đó
            }
        });

        // Xử lý sự kiện cho nút "Save Changes"
        findViewById(R.id.btn_save_changes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfileChanges();
            }
        });
    }

    // Hàm lưu thay đổi thông tin profile
    private void saveProfileChanges() {
        String dob = etDob.getText().toString().trim();
        String answer = etAnswer.getText().toString().trim();
        String oldPassword = etOldPassword.getText().toString().trim();
        String newPassword = etNewPassword.getText().toString().trim();
        String confirmNewPassword = etConfirmNewPassword.getText().toString().trim();

        // Kiểm tra nếu các thông tin đã nhập hợp lệ
        if (dob.isEmpty()) {
            Toast.makeText(this, "Please enter your date of birth", Toast.LENGTH_SHORT).show();
            return;
        }

        if (answer.isEmpty()) {
            Toast.makeText(this, "Please answer the security question", Toast.LENGTH_SHORT).show();
            return;
        }

        if (oldPassword.isEmpty()) {
            Toast.makeText(this, "Please enter your old password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (newPassword.isEmpty()) {
            Toast.makeText(this, "Please enter a new password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!newPassword.equals(confirmNewPassword)) {
            Toast.makeText(this, "New password and confirmation do not match", Toast.LENGTH_SHORT).show();
        } else {
            // Thực hiện lưu thay đổi (thay bằng thao tác thực tế như lưu vào database, v.v.)
            Toast.makeText(this, "Profile updated successfully", Toast.LENGTH_SHORT).show();
        }
    }
}
