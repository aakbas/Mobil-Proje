package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class checkpoint14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint14);

        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=14,karaRelation=2");
        Toast.makeText(getApplicationContext(),"Kara Bunu Hatırlayacak...",Toast.LENGTH_LONG).show();
    }
    public void Checkpoint17(View view){
        Intent intent=new Intent(checkpoint14.this,checkpoint17.class);
        startActivity(intent);
    }
}
