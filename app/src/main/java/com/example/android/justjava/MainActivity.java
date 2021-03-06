/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    boolean check= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void increment(View view) {


        quantity = quantity + 1 ;
        displayQuantity(quantity);

    }

    public void decrement(View view) {


        quantity = quantity - 1 ;
        displayQuantity(quantity);



    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        CheckBox whippedCream = (CheckBox) findViewById(R.id.checkboxCream);
        boolean haswhippedCream = whippedCream.isChecked();
        Log.v("MainActivity", "Has whipped cream " + haswhippedCream);
        int Price= calculatePrice();
        String msg = orderSummary(Price, haswhippedCream);

        displayMessage(msg);

        //Intent new_screen = new Intent(MainActivity.this,Receipt.class);
        //startActivity(new_screen);
    }

    private int calculatePrice(){
        int priceMsg =  quantity * 5;
        return (priceMsg);
    }

    private String orderSummary (int Price, boolean add) {


           String sum = "Name: Hamza Shirazi" + "\nQuantity: " + quantity + "\nWhip Cream added? " + add + "\nTotal: "+ Price + "\nThank You!";
            return(sum);


    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_view);
        quantityTextView.setText("" + number);
    }



    /**
     * This method displays the given price on the screen.
     */
    private void finalPrice(int number) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.orderSummary_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.orderSummary_view);
        orderSummaryTextView.setText(message);
    }

}