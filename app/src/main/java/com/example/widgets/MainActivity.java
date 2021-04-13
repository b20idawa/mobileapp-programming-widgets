package com.example.widgets;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
        my_listeview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Skriv din text här", Toast.LENGTH_LONG).show();

            }
        });

    }
}
