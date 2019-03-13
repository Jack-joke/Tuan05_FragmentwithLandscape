package com.example.student.notmyapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentB extends Fragment {
    Button btna, btnb, btnc;
    //TruyenData truyenData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        btna = (Button)view.findViewById(R.id.btn_A);
        btnb = (Button)view.findViewById(R.id.btn_B);
        btnc = (Button)view.findViewById(R.id.btn_C);

      //  truyenData = (TruyenData) getActivity();
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //truyenData.btnTruyenData("A");
                FragmentA fragA = (FragmentA) getFragmentManager().findFragmentById(R.id.frag_content);
                if (fragA!=null&&fragA.isInLayout()){
                    fragA.tv.setText("A");
                }else {
                    Intent it = new Intent(getActivity(),ContentActivity.class);
                    it.putExtra("guidulieuquaText","A");
                    startActivity(it);
                }
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentA fragA = (FragmentA) getFragmentManager().findFragmentById(R.id.frag_content);
                if (fragA!=null&&fragA.isInLayout()){
                    fragA.tv.setText("B");
                }else {
                    Intent it = new Intent(getActivity(),ContentActivity.class);
                    it.putExtra("guidulieuquaText","B");
                    startActivity(it);
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentA fragA = (FragmentA) getFragmentManager().findFragmentById(R.id.frag_content);
                if (fragA!=null&&fragA.isInLayout()){
                    fragA.tv.setText("C");
                }else {
                    Intent it = new Intent(getActivity(),ContentActivity.class);
                    it.putExtra("guidulieuquaText","C");
                    startActivity(it);
                }
            }
        });

        return view;
    }
}
