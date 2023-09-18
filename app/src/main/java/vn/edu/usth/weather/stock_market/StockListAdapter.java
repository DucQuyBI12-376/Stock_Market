package vn.edu.usth.weather.stock_market;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

public class StockListAdapter extends ArrayAdapter<StockItem> {
    public StockListAdapter(Context context, ArrayList<StockItem> stockList){
        super(context, 0, stockList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the list item layout (you can create a custom layout for it)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.stock_list_items, parent, false);
        }

        // Get the StockItem at this position
        StockItem currentItem = getItem(position);

        // Populate the views in the list item layout with data from StockItem
        TextView symbolTextView = convertView.findViewById(R.id.symbolTextView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        LineChart lineChart = convertView.findViewById(R.id.lineChart);
        TextView moneyTextView = convertView.findViewById(R.id.moneyTextView);
        TextView percentageTextView = convertView.findViewById(R.id.percentage);

        symbolTextView.setText(currentItem.getSymbol());
        nameTextView.setText(currentItem.getName());
        moneyTextView.setText(currentItem.getMoney());
        percentageTextView.setText(currentItem.getPercentage());

        return convertView;
    }
}
