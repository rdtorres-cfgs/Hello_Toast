package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton_toast;
    private Button mButton_Count;
    private TextView mCountNumber;
    private Integer mNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton_toast = (Button) findViewById(R.id.button_toast);
        mButton_Count = (Button) findViewById(R.id.button_count);
        mCountNumber = (TextView) findViewById(R.id.show_count);

        mButton_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, mCountNumber.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        mButton_Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum = Integer.parseInt(mCountNumber.getText().toString());
                mNum++;
                mCountNumber.setText(mNum.toString());
            }
        });

    }

}