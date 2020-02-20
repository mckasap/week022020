package org.kasapbasi.week022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btnSecond);

      /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MCK","TIKLANDI İç SINIF");
            }
        });*/
    }


    public void onMyClick(View v) {
        Log.d("MCK","TIKLANDI İç METOT");
        Intent myInt = new Intent(MainActivity.this,ActivitySecond.class);
        startActivity(myInt);

    }

}
