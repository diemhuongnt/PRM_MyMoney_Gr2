package fpt.edu.gr2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Xử lý sự kiện khi nhấn vào dòng chữ Sign In
        TextView tvSignIn = findViewById(R.id.tv_sign_in);
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình LoginActivity
                Intent intent = new Intent(activity_signup.this, activity_login.class);
                startActivity(intent);
            }
        });

        // Lấy Spinner
        Spinner securityQuestionSpinner = findViewById(R.id.spinner_security_question);

        // Tạo Adapter từ mảng câu hỏi bảo mật
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.security_questions_array, android.R.layout.simple_spinner_item);

        // Thiết lập layout cho dropdown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Gán Adapter cho Spinner
        securityQuestionSpinner.setAdapter(adapter);

    }
}
