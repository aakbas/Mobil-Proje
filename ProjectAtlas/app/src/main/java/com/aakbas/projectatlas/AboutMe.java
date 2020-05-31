package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }
    public void GameOver1(View view){
        Intent intent=new Intent(AboutMe.this,MainActivity.class);
        startActivity(intent);
    }
}
