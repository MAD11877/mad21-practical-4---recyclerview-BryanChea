package sg.edu.np.week4activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrandsAdapter extends RecyclerView.Adapter<BrandsViewHolder> {
    ArrayList<String> data;

    public BrandsAdapter(ArrayList<String> input) {
        data = input;
    }

    public BrandsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);
        return new BrandsViewHolder(item);
    }

    public void onBindViewHolder(BrandsViewHolder holder, int position) {
        String s = data.get(position);
        holder.txt.setText((s));
    }

    public int getItemCount() {
        return data.size();
    }
}
