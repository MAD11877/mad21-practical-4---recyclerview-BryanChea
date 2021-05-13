package sg.edu.np.week4activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomViewHolder> {
    ArrayList<myObject> list_members;

    public CustomAdaptor(ArrayList<myObject> input) {
        this.list_members = input;
    }

    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout, parent, false);
        return new CustomViewHolder(item);
    }

    public void onBindViewHolder(CustomViewHolder holder, int position) {
        myObject list_items = list_members.get(position);
        holder.txt1.setText(list_items.getMyText1());
        holder.txt2.setText(list_items.getMyText2());
        holder.img.setImageResource(list_items.getMyImageID());
    }

    public int getItemCount() {
        return list_members.size();
    }
}
