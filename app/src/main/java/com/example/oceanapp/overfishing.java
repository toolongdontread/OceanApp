package com.example.oceanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class overfishing extends AppCompatActivity {

    private Button ytlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overfishing);

        ytlink = findViewById(R.id.button7);
        ytlink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=WNdR808jMSA&ab_channel=TED-Ed");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}