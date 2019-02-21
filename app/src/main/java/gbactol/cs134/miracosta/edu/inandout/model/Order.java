package gbactol.cs134.miracosta.edu.inandout.model;

/**
 * Order.java: A class that would store all of the prices of the In and Out Burger,
 * along with the customer's order
 *
 * @author Gabriel Bactol
 * @since 2-21-19
 */
public class Order
{
    //prices and tax rate of the In and Out Burger
    public final double PRICE_CHEESEBURGER = 2.15;
    public final double PRICE_DOUBLE_DOUBLE = 3.6;
    public final double PRICE_FRENCH_FRIES = 1.65;
    public final double PRICE_LARGE_DRINK = 1.75;
    public final double PRICE_MEDIUM_DRINK = 1.55;
    public final double PRICE_SMALL_DRINK = 1.45;
    public final double PRICE_SHAKE = 2.2;
    public final double TAX_RATE = 0.08;

    //values used to store the customer's order
    private int mCheeseburgers;
    private int mDoubleDoubles;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mSmallDrinks;
    private int mShakes;

    /**
     * Default constructor, initialize variables when no parameters had been passed in
     */
    public Order()
    {
        mCheeseburgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mSmallDrinks = 0;
        mShakes = 0;
    }
    /**
     * Sets the amount of cheeseburgers the customer is buying
     * @param mCheeseburgers The amount of cheeseburgers
     */
    public void setCheeseburgers(int mCheeseburgers)
    {
        this.mCheeseburgers = mCheeseburgers;
    }
    /**
     * Sets the amount of double doubles the customer is buying
     * @param mDoubleDoubles The amount of double double burgers
     */
    public void setDoubleDoubles(int mDoubleDoubles)
    {
        this.mDoubleDoubles = mDoubleDoubles;
    }
    /**
     * Sets the amount of french fries the customer is buying
     * @param mFrenchFries The amount of french fries
     */
    public void setFrenchFries(int mFrenchFries)
    {
        this.mFrenchFries = mFrenchFries;
    }

    /**
     * Sets the amount of large drinks the customer is buying
     * @param mLargeDrinks The amount of large drinks
     */
    public void setLargeDrinks(int mLargeDrinks)
    {
        this.mLargeDrinks = mLargeDrinks;
    }
    /**
     * Sets the amount of medium drinks the customer is buying
     * @param mMediumDrinks The amount of medium drinks
     */
    public void setMediumDrinks(int mMediumDrinks)
    {
        this.mMediumDrinks = mMediumDrinks;
    }
    /**
     * Sets the amount of small drinks the customer is buying
     * @param mSmallDrinks The amount of small drinks
     */
    public void setSmallDrinks(int mSmallDrinks)
    {
        this.mSmallDrinks = mSmallDrinks;
    }
    
    /**
     * Sets the amount of shakes the customer is buying
     * @param mShakes The amount of mShakes
     */
    public void setShakes(int mShakes)
    {
        this.mShakes = mShakes;
    }
    /**
     * Accessor getting the amount of cheeseburgers a customer types in.
     *
     * @return mCheeseBurgers, The amount of cheeseburgers
     */
    public int getCheeseburgers()
    {
        return mCheeseburgers;
    }
    /**
     * Accessor getting the amount of double double burgers a customer types in.
     *
     * @return mCheeseBurgers, The amount of double double burgers
     */
    public int getDoubleDoubles()
    {
        return mDoubleDoubles;
    }

    /**
     * Accessor getting the amount of french fries a customer types in.
     *
     * @return mFrenchFries, The amount of french fries.
     */
    public int getFrenchFries()
    {
        return mFrenchFries;
    }

    /**
     * Accessor getting the amount of large drinks a customer types in.
     *
     * @return mLargeDrinks, The amount of large drinks
     */
    public int getLargeDrinks()
    {
        return mLargeDrinks;
    }

    /**
     * Accessor getting the amount of medium drinks a customer types in.
     *
     * @return mMediumDrinks, The amount of medium drinks
     */
    public int getMediumDrinks()
    {
        return mMediumDrinks;
    }

    /**
     * Accessor getting the amount of small drinks a customer types in.
     *
     * @return mMediumDrinks, The amount of medium drinks
     */
    public int getSmallDrinks()
    {
        return mSmallDrinks;
    }

    /**
     * Accessor getting the amount of shakes a customer types in.
     *
     * @return mMediumDrinks, The amount of shakes
     */
    public int getShakes()
    {
        return mShakes;
    }

    /**
     * An helper method that calculates how many items the user had ordered by adding all class variables other than final
     * @return the total amount of items the customer ordered
     */
    public int getNumberItemsOrdered()
    {
        return (mShakes + mSmallDrinks + mMediumDrinks + mLargeDrinks + mFrenchFries + mDoubleDoubles + mCheeseburgers);
    }
    /**
     * An helper method that calculates the total cost based on adding items individually along with multiplying them with their corresponding prices
     * @return the cost of all the items together from how much the customer bought along with their prices
     */
    public double calculateSubtotal()
    {
        return(PRICE_CHEESEBURGER* getCheeseburgers()) + (PRICE_DOUBLE_DOUBLE * getDoubleDoubles()) + (PRICE_FRENCH_FRIES * getFrenchFries()) + (PRICE_LARGE_DRINK * getLargeDrinks()) + (PRICE_MEDIUM_DRINK * getMediumDrinks()) + (PRICE_SMALL_DRINK * getSmallDrinks()) + (PRICE_SHAKE * getShakes());
    }

    /**
     * An helper method that calculates the tax by multiplying the tax rate with the total cost of the items.
     * @return the subtotal multiplied by the tax rate
     */
    public double calculateTax()
    {
        return TAX_RATE * calculateSubtotal();
    }

    /**
     * An helper method that calculates the total by adding the total and the calcuated tax
     * @return the total from adding the total cost and tax together
     */
    public double calculateTotal()
    {
        return calculateSubtotal() + calculateTax();
    }

}
