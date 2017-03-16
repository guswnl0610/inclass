package com.example.guswn_000.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eample);
        init();


    }

    void init()
    {
        r1 = (RadioButton)findViewById(R.id.radioButton2);
        r2 = (RadioButton)findViewById(R.id.radioButton3);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    Toast.makeText(getApplicationContext(), "고등학생이 선택됨", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
