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

public class activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        // Lấy button từ layout
        Button btnAddTransaction = findViewById(R.id.btn_add_transaction);

        // Thêm listener cho button
        btnAddTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo Intent để chuyển sang màn hình Add Transaction
                Intent intent = new Intent(activity_home.this, activity_addTransaction.class);
                startActivity(intent);
            }
        });

    }
}
