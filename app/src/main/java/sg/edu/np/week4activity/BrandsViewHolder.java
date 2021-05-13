package sg.edu.np.week4activity;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BrandsViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public BrandsViewHolder(View itemView) {
        super(itemView);
        txt = itemView.findViewById(R.id.textView2);
    }
}
