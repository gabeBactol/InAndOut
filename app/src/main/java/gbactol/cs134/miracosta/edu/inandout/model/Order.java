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

    //default constructor, initialize variables when no values are passed in
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
     * Sets the amount of cheeseburgers the customer is buying
     * @param mCheeseburgers The amount of cheeseburgers
     */
    public void setLargeDrinks(int mLargeDrinks)
    {
        this.mLargeDrinks = mLargeDrinks;
    }
    public void setMediumDrinks(int mMediumDrinks)
    {
        this.mMediumDrinks = mMediumDrinks;
    }
    public void setSmallDrinks(int mSmallDrinks)
    {
        this.mSmallDrinks = mSmallDrinks;
    }
    public void setShakes(int mShakes)
    {
        this.mShakes = mShakes;
    }
    public int getCheeseburgers()
    {
        return mCheeseburgers;
    }
    public int getDoubleDoubles()
    {
        return mDoubleDoubles;
    }
    public int getFrenchFries()
    {
        return mFrenchFries;
    }
    public int getLargeDrinks()
    {
        return mLargeDrinks;
    }
    public int getMediumDrinks()
    {
        return mMediumDrinks;
    }
    public int getSmallDrinks()
    {
        return mSmallDrinks;
    }
    public int getShakes()
    {
        return mShakes;
    }
    public int getNumberItemsOrdered()
    {
        return (mShakes + mSmallDrinks + mMediumDrinks + mLargeDrinks + mFrenchFries + mDoubleDoubles + mCheeseburgers);
    }
    public double calculateSubtotal()
    {
        return(PRICE_CHEESEBURGER* getCheeseburgers()) + (PRICE_DOUBLE_DOUBLE * getDoubleDoubles()) + (PRICE_FRENCH_FRIES * getFrenchFries()) + (PRICE_LARGE_DRINK * getLargeDrinks()) + (PRICE_MEDIUM_DRINK * getMediumDrinks()) + (PRICE_SMALL_DRINK * getSmallDrinks()) + (PRICE_SHAKE * getShakes());
    }
    public double calculateTax()
    {
        return TAX_RATE * calculateSubtotal();
    }
    public double calculateTotal()
    {
        return calculateSubtotal() + calculateTax();
    }

}
