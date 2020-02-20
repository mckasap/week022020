package org.kasapbasi.week022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

public void myClick(View v){
  Intent myInt= new Intent(ActivitySecond.this,MainActivity.class);
  startActivity(myInt);

}

}
