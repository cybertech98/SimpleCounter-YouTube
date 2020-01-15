package com.example.simplecounter_youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView number = (TextView) findViewById(R.id.num);
        Button add = (Button)findViewById(R.id.add);
        Button minus = (Button)findViewById(R.id.minus);

        int n=0;

        number.setText(String.valueOf(n));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String currentS =  number.getText().toString();
              int current = Integer.parseInt(currentS);

              int NewVar = current  +1 ;

                number.setText(String.valueOf(NewVar));

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String currenS =  number.getText().toString();
                int curren = Integer.parseInt(currenS);

                int NewVa = curren - 1 ;

                number.setText(String.valueOf(NewVa));


            }
        });
    }
}
