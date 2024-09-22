package fpt.edu.gr2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        // Lấy tham chiếu đến nút "Get Started"
        Button btnGetStarted = findViewById(R.id.btn_get_started);

        // Xử lý sự kiện khi nhấn nút "Get Started"
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình LoginActivity
                Intent intent = new Intent(activity_launch.this, MainActivity.class);
                startActivity(intent);
                finish(); // Kết thúc LaunchActivity để không quay lại khi nhấn Back
            }
        });
    }
}