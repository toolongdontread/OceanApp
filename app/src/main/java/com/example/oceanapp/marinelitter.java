package com.example.oceanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class marinelitter extends AppCompatActivity {

    private Button ytlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marinelitter);

        ytlink = findViewById(R.id.button6);
        ytlink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=MnCbTTTi7ic&ab_channel=TJWatson");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}