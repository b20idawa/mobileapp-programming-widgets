package com.example.widgets;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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

    }
}
