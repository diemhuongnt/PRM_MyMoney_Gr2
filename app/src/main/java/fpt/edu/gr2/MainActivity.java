package fpt.edu.gr2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Xử lý sự kiện khi nhấn vào nút Log In
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình LoginActivity
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện khi nhấn vào nút Sign Up
        Button btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình SignUpActivity
                Intent intent = new Intent(MainActivity.this, activity_signup.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện khi nhấn vào dòng chữ Forget Password?
        TextView forgetPassword = findViewById(R.id.forget_password);
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình ChangePasswordActivity
                Intent intent = new Intent(MainActivity.this, activity_forgetPass.class);
                startActivity(intent);
            }
        });
    }
}