package gbactol.cs134.miracosta.edu.inandout;

/**
 * OrderActivity.java: A class that handles food orders from the customer.
 *
 * @author Gabriel Bactol
 * @since 2-21-19
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;

import gbactol.cs134.miracosta.edu.inandout.model.Order;

public class OrderActivity extends AppCompatActivity {

    //Member variables to format as currency (NumberFormat)
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    //variables where user enters values
    private EditText doubleDoublesValue;
    private EditText cheeseBurgerValue;
    private EditText frenchFriesValue;
    private EditText shakesValue;
    private EditText smallValue;
    private EditText mediumValue;
    private EditText largeValue;

    //button that transfers to a new activity
    private Button placeOrderButton;

    //the order object calculating and storing values
    private Order newOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        //initializing any instance variables
        doubleDoublesValue = findViewById(R.id.doubleDoublesValue);
        cheeseBurgerValue = findViewById(R.id.cheeseburgerValue);
        frenchFriesValue = findViewById(R.id.frenchFriesValue);
        shakesValue = findViewById(R.id.shakesValue);
        smallValue = findViewById(R.id.smallValue);
        mediumValue = findViewById(R.id.mediumValue);
        largeValue = findViewById(R.id.largeValue);

        placeOrderButton = findViewById(R.id.placeOrderButton);

        //initializing the object
        newOrder = new Order();

    }

    /**
     * A method that checks whether the program should do something after the text has changed
     *
     * @param v - The object that reads the input
     */
    public void transferTotalMenu(View v)
    {

        //the intent is used to transfer information between classes
        Intent helpTransfer = new Intent(this, SummaryActivity.class);


        //all these if statements are a bunch of checks on whether the user inputs
        //a number in the program, and tries calculate a blank value
        //should any of these values be blank, the value is zero
        if(doubleDoublesValue.getText().toString().equals(""))
        {
            newOrder.setDoubleDoubles(0);
        }
        else
        {
            newOrder.setDoubleDoubles(Integer.parseInt(doubleDoublesValue.getText().toString()));
        }
        if(cheeseBurgerValue.getText().toString().equals(""))
        {
            newOrder.setCheeseburgers(0);
        }
        else
        {
            newOrder.setCheeseburgers(Integer.parseInt(cheeseBurgerValue.getText().toString()));
        }
        if(frenchFriesValue.getText().toString().equals(""))
        {
            newOrder.setFrenchFries(0);
        }
        else
        {
            newOrder.setFrenchFries(Integer.parseInt(frenchFriesValue.getText().toString()));
        }
        if(shakesValue.getText().toString().equals(""))
        {
            newOrder.setShakes(0);
        }
        else
        {
            newOrder.setShakes(Integer.parseInt(shakesValue.getText().toString()));
        }
        if(smallValue.getText().toString().equals(""))
        {
            newOrder.setSmallDrinks(0);
        }
        else
        {
            newOrder.setSmallDrinks(Integer.parseInt(smallValue.getText().toString()));
        }
        if(mediumValue.getText().toString().equals(""))
        {
            newOrder.setMediumDrinks(0);
        }
        else
        {
            newOrder.setMediumDrinks(Integer.parseInt(mediumValue.getText().toString()));
        }
        if(largeValue.getText().toString().equals(""))
        {
            newOrder.setLargeDrinks(0);
        }
        else
        {
            newOrder.setLargeDrinks(Integer.parseInt(largeValue.getText().toString()));
        }
        //stores the values to transfer the values
        Intent total = new Intent(this, SummaryActivity.class);

        //converts the string into a dollar format
        String s = String.format("%.2f", newOrder.calculateSubtotal());
        String tax = String.format("%.2f", newOrder.calculateTax());
        String t = String.format("%.2f", newOrder.calculateTotal());

        //converts the values to a specific currency based on their locale
        /*
        s = currency.format(Double.parseDouble(s));
        tax = currency.format(Double.parseDouble(tax));
        t = currency.format(Double.parseDouble(t))
        */

        //These values are transfered into the other class
        total.putExtra("numItems", String.valueOf(newOrder.getNumberItemsOrdered()));
        total.putExtra("subTotal", s);
        total.putExtra("Tax", tax);
        total.putExtra("Total", t);

        //used to start the other activity
        startActivity(total);
    }
}
