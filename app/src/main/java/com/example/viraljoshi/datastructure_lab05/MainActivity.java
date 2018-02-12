package com.example.viraljoshi.datastructure_lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

//An adapter actually bridges between UI components and the data source that fill data into UI Component.
// Adapter holds the data and send the data to adapter view, the view can takes the data from adapter view and shows the data on different views like as spinner, list view, grid view etc.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String array is passed which will be used to make text in the List view
        String[] electroMusic={"Tiesto","Pioneer","Martin Garrix","DJ2017","DJ","Mixer"};
        //Android ListView is a view which groups several items and display them in vertical scrollable list.
        // The list items are automatically inserted to the list using an Adapter that pulls content from a source such as an array or database.
        ListAdapter listAdapter=new Custom_Adapter(this,electroMusic);
        //List view casted from xml file
        ListView listView=(ListView)findViewById(R.id.listView);
        //setAdapter() method is called after creating list view Adapter
        listView.setAdapter(listAdapter);
//if any item on the list view is clicked then onItemClickListener is called and the Toast message will pop up which will show the text of the List view.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //getItemAtPosition will return the position of the Text
                String em=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,em,Toast.LENGTH_LONG).show();

            }
        });
    }
}
