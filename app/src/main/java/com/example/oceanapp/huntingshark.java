package com.example.oceanapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class huntingshark extends AppCompatActivity {

    private Button ytlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huntingshark);

        ytlink = findViewById(R.id.button);
        ytlink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=7iIyKPpII20&ab_channel=AdventuresofTwoAfloat");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}