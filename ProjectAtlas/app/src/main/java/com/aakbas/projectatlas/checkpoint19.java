package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class checkpoint19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint19);
    }
    public void checkpoint20(View view){
        Intent intent=new Intent(checkpoint19.this,checkpoint21.class);
        startActivity(intent);
    }
}
