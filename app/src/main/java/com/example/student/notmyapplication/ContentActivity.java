package com.example.student.notmyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContentActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        //Anh Xa :
        tv = findViewById(R.id.tv_content_activity);
        Intent intent = getIntent();
        String s = intent.getStringExtra("guidulieuquaText");
        tv.setText(s);
    }
}
