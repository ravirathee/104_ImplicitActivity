package com.ravirathee.a104_implicitactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int j = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = findViewById(R.id.ll);
        ll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this , Main2Activity.class);
        i.putExtra("j",j);
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String s = data.getStringExtra("Message");

        if( resultCode == 1){
            Toast.makeText(this,s,Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,s,Toast.LENGTH_LONG).show();
        }

    }
}
