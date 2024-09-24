package fpt.edu.gr2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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

        // Lấy BottomNavigationView từ layout
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set sự kiện chọn item cho BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.navigation_home) {
                    // Chuyển về màn hình Home (nếu cần thiết)
                    return true;
                } else if (id == R.id.navigation_add_transaction) {
                    // Chuyển sang màn hình Add Transaction
                    Intent addTransactionIntent = new Intent(activity_home.this, activity_addTransaction.class);
                    startActivity(addTransactionIntent);
                    return true;
                } else if (id == R.id.navigation_statistics) {
                    // Chuyển sang màn hình Statistics (tùy chỉnh activity khác nếu có)
                    Intent statisticsIntent = new Intent(activity_home.this, activity_statistics.class);
                    startActivity(statisticsIntent);
                    return true;
                } else if (id == R.id.navigation_settings) {
                    // Chuyển sang màn hình Settings (tùy chỉnh activity khác nếu có)
                    Intent settingsIntent = new Intent(activity_home.this, activity_settings.class);
                    startActivity(settingsIntent);
                    return true;
                }

                return false;
            }

        });
    }
}
