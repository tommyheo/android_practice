package com.example.dwi_assignment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /* 로그 태그 정의 */
    private static final String TAG = "MainActivity";

    /*onCreate 실행*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* 시스템 초기화 */
        super.onCreate(savedInstanceState);

        /* 상단 상태 표시줄과 하단 내비게이션바 영역 뒤까지 레이아웃이 그려지게 하는 설정 */
        EdgeToEdge.enable(this);

        /* setContentView를 통해서 Layout 가벼옴 */
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate 메소드 호출");

        /* 레이아웃의 요소 가져오기 */
        TextView textView = findViewById(R.id.textView);    // Text
        Button button = findViewById(R.id.button);   //Button

        /* 클릭 시 Text 변경 */
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d(TAG, "버튼이 클릭 되었음");
                textView.setText("Welcome!!!");
                button.setText("Well Done!!!");
            }
        });
    }


}