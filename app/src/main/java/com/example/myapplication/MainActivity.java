package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button b;
    TextView op;
    EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        op=findViewById(R.id.textView);
        n1=findViewById(R.id.editTextNumber);
        n2=findViewById(R.id.editTextNumber2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(n1.getText().toString());
                int y=Integer.parseInt(n2.getText().toString());
                Log.d("ADDITION",x+y+"");
                op.setText(x+y+"");

            }
        });

    }
}
