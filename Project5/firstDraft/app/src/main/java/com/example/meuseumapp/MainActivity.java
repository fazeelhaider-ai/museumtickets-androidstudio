/**
 * This is the main activity of the program. It will show the list of all the available museums.
 * @author Syed Abbas Haider (netid: sah300), Syed Fazeel Haider (netid: sfh55)
 */
package com.example.meuseumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_TEXT = "com.example.meuseumapp.EXTRA_TEXT";
    ListView listview;

    /**
     * creates our first screen as soon as the app is launched
     * and makes an arraylist of all the museums
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);

        final ArrayList<String> array1 = new ArrayList<>();
        array1.add("The Metropolitan Museum of Art");
        array1.add("The Rubin Museum of Art");
        array1.add("The Museum of Chinese in America");
        array1.add("The Museum of City of New York");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,array1);

        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /**
             * this method runs when the user clicks on a certain museum.
             * @param parent
             * @param view
             * @param position
             * @param id
             */
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    String selectedFromList = (String) (listview.getItemAtPosition(position));
                    intent.putExtra(EXTRA_TEXT, selectedFromList);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Maximum of 5 tickets for each!", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    String selectedFromList = (String) (listview.getItemAtPosition(position));
                    intent.putExtra(EXTRA_TEXT, selectedFromList);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Maximum of 5 tickets for each!", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    String selectedFromList = (String) (listview.getItemAtPosition(position));
                    intent.putExtra(EXTRA_TEXT, selectedFromList);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Maximum of 5 tickets for each!", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    String selectedFromList = (String) (listview.getItemAtPosition(position));
                    intent.putExtra(EXTRA_TEXT, selectedFromList);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Maximum of 5 tickets for each!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}