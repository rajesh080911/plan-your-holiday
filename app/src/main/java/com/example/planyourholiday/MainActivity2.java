package com.example.planyourholiday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String[] items = {"YEAR I", "YEAR II", "YEAR III", "YEAR IV"};

    AutoCompleteTextView autoCompleteText;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        autoCompleteText = findViewById(R.id.auto_complete_text);
        adapterItems = new ArrayAdapter<String>(this, R.layout.item_list, items);
        autoCompleteText.setAdapter(adapterItems);
        autoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), "Item", Toast.LENGTH_SHORT).show();
            }
        });

    }
}