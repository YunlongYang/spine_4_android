package com.play.android.spine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.play.android.spine.ui.gdx.GdxExampleActivity;
import com.play.android.spine.ui.superbody.SuperBoyActivity;
import com.play.android.spine.ui.xiaoqiao.XiaoQiaoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.go_spine_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, XiaoQiaoActivity.class));
            }
        });
    }
}
