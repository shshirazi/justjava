package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class Receipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

    }

public void summary(int priceMsg){

    String aa= "Order Summary = " + priceMsg +"\n Thank You!";
        displayMessage(aa);

}

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.totalBill);
        priceTextView.setText(message);
    }
}
