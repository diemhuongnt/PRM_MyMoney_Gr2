package fpt.edu.gr2;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_language extends AppCompatActivity {

    private RadioButton radioVietnamese, radioEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        // Liên kết các view
        radioVietnamese = findViewById(R.id.radio_vietnamese);
        radioEnglish = findViewById(R.id.radio_english);

        // Thiết lập sự kiện cho nút quay lại
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // Quay lại màn hình trước đó (Settings)
            }
        });

        // Xử lý sự kiện chọn ngôn ngữ
        radioVietnamese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi chọn Tiếng Việt, uncheck English
                radioEnglish.setChecked(false);
                // Thực hiện các thao tác liên quan đến chuyển đổi ngôn ngữ tại đây
            }
        });

        radioEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi chọn English, uncheck Vietnamese
                radioVietnamese.setChecked(false);
                // Thực hiện các thao tác liên quan đến chuyển đổi ngôn ngữ tại đây
            }
        });
    }
}
