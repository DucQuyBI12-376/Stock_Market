package vn.edu.usth.weather.stock_market;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StockActivity extends AppCompatActivity {

    MyStockFragment myStockFragment = new MyStockFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);
        getSupportFragmentManager().beginTransaction().add(R.id.container, myStockFragment).commit();
    }
}
