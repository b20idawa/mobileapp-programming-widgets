package com.example.widgets;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    private String[] Städer = {"Stockholm", "Göteborg", "Malmö"};
    private ArrayList<String> ListData=new ArrayList<>(Arrays.asList(Städer));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.my_edittext);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,R.layout.list_view_file,R.id.list_view_file_xml,ListData);
        ListView my_listeview=(ListView) findViewById(R.id.list_view_file_xml);
        my_listeview.setAdapter(adapter);

    }
}
