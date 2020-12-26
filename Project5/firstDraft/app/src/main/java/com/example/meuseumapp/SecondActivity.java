/**
 * this is the second activity of the app, this lets the user calculate the prices of the tickets and also
 * click on the image of the museum to visit the website of the musuem online.
 * @author Syed Abbas Haider (netid: sah300), Syed Fazeel Haider (netid: sfh55)
 */
package com.example.meuseumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    String text;

    /**
     * creates our second screen and lets user enter the amounts of tickets
     * and visit the museum's website.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        super.onCreate(savedInstanceState);

        if(text.equals("The Metropolitan Museum of Art")){
            setContentView(R.layout.activity_metropolitan);
            findViewById(R.id.metroImage).setBackgroundResource(R.drawable.metrobumin);
            TextView newlabel = (TextView) findViewById(R.id.labelDisplay);
            newlabel.setText("The Metropolitan Museum of Art");

        }
        if(text.equals("The Rubin Museum of Art")){
            setContentView(R.layout.activity_metropolitan);
            findViewById(R.id.metroImage).setBackgroundResource(R.drawable.rubin_museum_exterior_nyc);
            TextView dispayAdultText = (TextView)findViewById(R.id.adult);
            TextView dispaySeniorText = (TextView)findViewById(R.id.senior);
            TextView dispayStudentText = (TextView)findViewById(R.id.student);
            TextView newlabel = (TextView) findViewById(R.id.labelDisplay);



            dispayAdultText.setText("adult: $19");
            dispaySeniorText.setText("senior: $14");
            dispayStudentText.setText("student: $14");
            newlabel.setText("The Rubin Museum of Art");

        }
        if(text.equals("The Museum of Chinese in America")){
            setContentView(R.layout.activity_metropolitan);
            findViewById(R.id.metroImage).setBackgroundResource(R.drawable.chinese_museum);
            TextView dispayAdultText = (TextView)findViewById(R.id.adult);
            TextView dispaySeniorText = (TextView)findViewById(R.id.senior);
            TextView dispayStudentText = (TextView)findViewById(R.id.student);
            TextView newlabel = (TextView) findViewById(R.id.labelDisplay);



            dispayAdultText.setText("adult: $12");
            dispaySeniorText.setText("senior: $8");
            dispayStudentText.setText("student: $8");
            newlabel.setText("The Museum of Chinese in America");
        }
        if(text.equals("The Museum of City of New York")){
            setContentView(R.layout.activity_metropolitan);
            findViewById(R.id.metroImage).setBackgroundResource(R.drawable.exterior);
            TextView dispayAdultText = (TextView)findViewById(R.id.adult);
            TextView dispaySeniorText = (TextView)findViewById(R.id.senior);
            TextView dispayStudentText = (TextView)findViewById(R.id.student);
            TextView newlabel = (TextView) findViewById(R.id.labelDisplay);



            dispayAdultText.setText("adult: $20");
            dispaySeniorText.setText("senior: $14");
            dispayStudentText.setText("student: $14");
            newlabel.setText("The Museum of City of New York");
        }



        Spinner adult = (Spinner) findViewById(R.id.adultspinner);
        Integer[] agenumbers1 = new Integer[]{0,1,2,3,4,5};
        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, agenumbers1);
        adult.setAdapter(adapter1);

        Spinner senior = (Spinner) findViewById(R.id.seniorspinner);
        Integer[] agenumbers2 = new Integer[]{0,1,2,3,4,5};
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, agenumbers2);
        senior.setAdapter(adapter2);

        Spinner student = (Spinner) findViewById(R.id.studentspinner);
        Integer[] agenumbers3 = new Integer[]{0,1,2,3,4,5};
        ArrayAdapter<Integer> adapter3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, agenumbers3);
        student.setAdapter(adapter3);
    }

    /**
     * takes you to the museum's website
     * @param view
     */
    public void goToWebsite(View view){
        if(text.equals("The Metropolitan Museum of Art")){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metmuseum.org/")));
        }
        if(text.equals("The Rubin Museum of Art")){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://rubinmuseum.org/")));
        }
        if(text.equals("The Museum of Chinese in America")){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mocanyc.org/")));
        }
        if(text.equals("The Museum of City of New York")){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mcny.org/")));
        }

    }

    /**
     * calculates the ticket prices
     * @param view
     */
    public void calculateTotalPrice(View view) {
        Spinner adultSpinner = (Spinner) findViewById(R.id.adultspinner);
        Spinner seniorSpinner = (Spinner) findViewById(R.id.seniorspinner);
        Spinner studentSpinner  = (Spinner) findViewById(R.id.studentspinner);
        if(text.equals("The Metropolitan Museum of Art")){
            int first = (int) adultSpinner.getSelectedItem() * 25;
            int second = (int) seniorSpinner.getSelectedItem() * 17;
            int third = (int) studentSpinner.getSelectedItem() * 12;
            int valueToDisplay = first + second + third;
            TextView newValue = (TextView)findViewById(R.id.displayTicketPrice);
            newValue.setText("$" + valueToDisplay );
            TextView newSales = (TextView) findViewById(R.id.displaySalesTax);
            double st = (double) (0.08875 * valueToDisplay);
            newSales.setText("$" + String.format("%.2f", st));
            TextView newtotalprice = (TextView) findViewById(R.id.displayTicketTotal);
            double tp = st + valueToDisplay;
            newtotalprice.setText("$" +String.format("%.2f", tp));
        }
        if(text.equals("The Rubin Museum of Art")){
            int first = (int) adultSpinner.getSelectedItem() * 19;
            int second = (int) seniorSpinner.getSelectedItem() * 14;
            int third = (int) studentSpinner.getSelectedItem() * 14;
            int valueToDisplay = first + second + third;
            TextView newValue = (TextView)findViewById(R.id.displayTicketPrice);
            newValue.setText("$" + valueToDisplay );
            TextView newSales = (TextView) findViewById(R.id.displaySalesTax);
            double st = (double) (0.08875 * valueToDisplay);
            newSales.setText("$" +String.format("%.2f", st));
            TextView newtotalprice = (TextView) findViewById(R.id.displayTicketTotal);
            double tp = st + valueToDisplay;
            newtotalprice.setText("$" +String.format("%.2f", tp));
        }
        if(text.equals("The Museum of Chinese in America")){
            int first = (int) adultSpinner.getSelectedItem() * 12;
            int second = (int) seniorSpinner.getSelectedItem() * 8;
            int third = (int) studentSpinner.getSelectedItem() * 8;
            int valueToDisplay = first + second + third;
            TextView newValue = (TextView)findViewById(R.id.displayTicketPrice);
            newValue.setText("S" + valueToDisplay );
            TextView newSales = (TextView) findViewById(R.id.displaySalesTax);
            double st = (double) (0.08875 * valueToDisplay);
            newSales.setText("$" +String.format("%.2f", st));
            TextView newtotalprice = (TextView) findViewById(R.id.displayTicketTotal);
            double tp = st + valueToDisplay;
            newtotalprice.setText("$" +String.format("%.2f", tp));
        }
        if(text.equals("The Museum of City of New York")){
            int first = (int) adultSpinner.getSelectedItem() * 20;
            int second = (int) seniorSpinner.getSelectedItem() * 14;
            int third = (int) studentSpinner.getSelectedItem() * 14;
            int valueToDisplay = first + second + third;
            TextView newValue = (TextView)findViewById(R.id.displayTicketPrice);
            newValue.setText("$" + valueToDisplay );
            TextView newSales = (TextView) findViewById(R.id.displaySalesTax);
            double st = (double) (0.08875 * valueToDisplay);
            newSales.setText("$" +String.format("%.2f", st));
            TextView newtotalprice = (TextView) findViewById(R.id.displayTicketTotal);
            double tp = st + valueToDisplay;
            newtotalprice.setText("$" +String.format("%.2f", tp));
        }


    }
}