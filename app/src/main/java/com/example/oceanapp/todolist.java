package com.example.oceanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class todolist extends AppCompatActivity {

    public String[] str = {"Don't eat shark’s fin",
            "Don't throw litter to the sea",
            "Participating the beach clean-up event",
            "Smart use of plastic",
            "Recycling and disposing of trash properly",
            "Don't leave any litter on the beach and coast",
            "Minimize use of fertilizer",
            "Using environmentally friendly mode of transportation",
            "Save electricity",
            "Donate to NGO",
            "Spreading the message of protecting the ocean",
            "Understanding more about ocean issue"
    };

    public String[] str_cate = {"Hunting Shark",
            "Marine Litter",
            "Marine Litter",
            "Marine Litter",
            "Marine Litter",
            "Marine Litter",
            "Marine Litter",
            "Coral bleaching",
            "Coral bleaching",
            "ALL",
            "ALL",
            "ALL"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        ListView listview = (ListView) findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                str);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(onClickListView);

    }

    private AdapterView.OnItemClickListener onClickListView = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(todolist.this,"Thank you for protecting ocean!\n" +
                    "This action ease the following critical ocean Issues : "+str_cate[position], Toast.LENGTH_SHORT).show();
        }
    };

}