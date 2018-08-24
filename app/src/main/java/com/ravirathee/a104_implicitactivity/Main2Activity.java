package com.ravirathee.a104_implicitactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    EditText et;
    Button bt;

    final int RESULT_ok = 1;
    final int RESULT_ERROR = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = findViewById(R.id.et);
        bt = findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String st = et.getText().toString();

        if( st.equals("admin")){
            Intent i = new Intent();
            i.putExtra("Message","admin");
            setResult(1,i);
            finish();

        }
        else{
            Intent i = new Intent();
            i.putExtra("Message", "user");
            setResult(2,i);
            finish();
        }
    }
}
