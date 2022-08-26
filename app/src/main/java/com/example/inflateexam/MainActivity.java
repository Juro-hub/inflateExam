package com.example.inflateexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 버튼을 클릭했을 때 동작처리 메소드
    public void btn_addlayout(View view) {
        addLayout();
    }

    // add_layout.xml 을 activity_main.xml 에 추가하는 메소드
    private void addLayout() {
        LinearLayout add_layout = findViewById(R.id.addLayout);

        // 인플레이션
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.add_layout, add_layout, true);

        // add_layout.xml 에 버튼 객체 참조
        Button btnTest = (Button) findViewById(R.id.btnTest);
        final CheckBox agree = (CheckBox) findViewById(R.id.agree);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (agree.isChecked()) {
                    agree.setChecked(false);
                } else {
                    agree.setChecked(true);
                }
            }
        });

    }
}