package gbactol.cs134.miracosta.edu.inandout;

/**
 * SummaryActivity.java: A class displaying the user's total into the activity from OrderActivity.java
 *
 * @author Gabriel Bactol
 * @since 2-21-19
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    //any values that should be displaying text
    private TextView orderTotal;
    private TextView itemsOrdered;
    private TextView subTotalValue;
    private TextView taxValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        //initialize variables
        orderTotal = findViewById(R.id.orderTotal);
        itemsOrdered = findViewById(R.id.itemsOrderedValue);
        subTotalValue = findViewById(R.id.subtotalValue);
        taxValue = findViewById(R.id.taxValue);

        //used to grab information from OrderActivity.java
        Intent transferInfo = getIntent();

        //display any passed in from the intent of the values
        orderTotal.setText( "Order Total: $" +  transferInfo.getStringExtra("Total"));
        itemsOrdered.setText(transferInfo.getStringExtra("numItems"));
        subTotalValue.setText("$" + transferInfo.getStringExtra("subTotal"));
        taxValue.setText("$" + transferInfo.getStringExtra("Tax"));
    }

    /**
     * A method that would end the activity
     *
     * @param v - The object that reads the input, being the start new order button
     */
    public void closeActivity(View v)
    {
        this.finish();
    }
}
