package fpt.edu.gr2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem; // Thêm import cho MenuItem

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_addTransaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_transaction);

        // Thiết lập insets cho nút chỉnh sửa
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_edit), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Thiết lập BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        // Đặt mục Add Transaction là mục đã chọn
        bottomNavigationView.setSelectedItemId(R.id.navigation_add_transaction);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.navigation_home) {
                    Intent addTransactionIntent = new Intent(activity_addTransaction.this, activity_home.class);
                    startActivity(addTransactionIntent);
                    // Chuyển về màn hình Home (nếu cần thiết)
                    return true;
                } else if (id == R.id.navigation_add_transaction) {
                    // Chuyển sang màn hình Add Transaction
                    return true;
                } else if (id == R.id.navigation_statistics) {
                    // Chuyển sang màn hình Statistics (tùy chỉnh activity khác nếu có)
                    Intent statisticsIntent = new Intent(activity_addTransaction.this, activity_statistics.class);
                    startActivity(statisticsIntent);
                    return true;
                } else if (id == R.id.navigation_settings) {
                    // Chuyển sang màn hình Settings (tùy chỉnh activity khác nếu có)
                    Intent settingsIntent = new Intent(activity_addTransaction.this, activity_settings.class);
                    startActivity(settingsIntent);
                    return true;
                }

                return false;
            }

        });
    }
}
