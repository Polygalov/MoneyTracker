package ua.com.adr.android.moneytracker;

import java.util.Date;

/**
 * Created by Andy on 30.01.2017.
 */
public class Transactions {
    public String title;
    public int sum;
    public Date mDate;

    public Transactions (String title, int sum){
        this.title = title;
        this.sum = sum;
        mDate = new Date();
    }
}
