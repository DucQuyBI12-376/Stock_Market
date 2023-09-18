package vn.edu.usth.weather.stock_market;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyStockFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyStockFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyStockFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyStockFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyStockFragment newInstance(String param1, String param2) {
        MyStockFragment fragment = new MyStockFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        ArrayList<StockItem> entries = new ArrayList<>();
        entries.add(new StockItem("VNM", "VanEck VietNam ETF", "15,56 US$", "+0,19%")); // Sample data point 1
        entries.add(new StockItem("Dow Jones", "Dow Jones Industrial Average", "34.576,59 US$", "+0,22%")); // Sample data point 2
        entries.add(new StockItem("AAPL", "Apple Inc.", "178,18 US$", "+0,35%")); // Sample data point 3
        // Add more data points as needed

        View view = inflater.inflate(R.layout.fragment_my_stock, container, false);
        ListView listView = view.findViewById(R.id.listView);
        StockListAdapter adapter = new StockListAdapter(requireContext(), entries);
        listView.setAdapter(adapter);
        return view;
    }
}