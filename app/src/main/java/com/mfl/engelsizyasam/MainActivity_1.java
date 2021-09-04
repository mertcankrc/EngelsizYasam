package com.mfl.engelsizyasam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_1 extends AppCompatActivity {
    Button button;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_engelsecimi);
        button = (Button) super.findViewById(R.id.button);
        rg = (RadioGroup) super.findViewById(R.id.rg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg.getCheckedRadioButtonId();
                System.out.println(selectedId);

            }
        });


    }
}
