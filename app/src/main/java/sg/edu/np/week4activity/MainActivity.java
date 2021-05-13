package sg.edu.np.week4activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> myList = new ArrayList<>();
    ArrayList<myObject> myObj = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList.add("Samsung");
        myList.add("LG");
        myList.add("Sony");
        myList.add("Acer");

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        BrandsAdapter myAdaptor = new BrandsAdapter(myList);
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager((myLayoutManager));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdaptor);

        for (int i = 0; i < 100; i++){
            myObject obj = new myObject(R.drawable.doge, String.valueOf(i), String.valueOf(i+1));
            myObj.add(obj);
        }

        RecyclerView rv = findViewById(R.id.rv);
        CustomAdaptor ca = new CustomAdaptor((myObj));
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(ca);
    }
}