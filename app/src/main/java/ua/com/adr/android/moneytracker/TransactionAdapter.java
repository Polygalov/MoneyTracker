package ua.com.adr.android.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Andy on 30.01.2017.
 */



public class TransactionAdapter extends ArrayAdapter<Transactions> {
    List<Transactions> transactions;

    public TransactionAdapter(Context context, List<Transactions> transactions) {
        super(context, 0, transactions);
        this.transactions = transactions;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Transactions transaction = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvSum = (TextView) convertView.findViewById(R.id.sum);
        TextView tvDate = (TextView) convertView.findViewById(R.id.date);
        // Populate the data into the template view using the data object

        tvName.setText(transaction.title);
        tvDate.setText(transaction.mDate.toString());

        tvSum.setText(Integer.toString(transaction.sum));


        return convertView;
    }
}