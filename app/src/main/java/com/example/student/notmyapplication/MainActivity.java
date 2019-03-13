package com.example.student.notmyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public void btnTruyenData(String s) {
//
//        FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.frag_content);
//        if(fragmentA != null && fragmentA.isInLayout()){
//            fragmentA.nhanString(s);
//        }
//        else {
//            Intent intent = new Intent(MainActivity.this,ContentActivity.class);
//            intent.putExtra("Thongtintruyen","A");
//            startActivity(intent);
//        }
//    }
}
