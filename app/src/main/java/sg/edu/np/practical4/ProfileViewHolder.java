package sg.edu.np.practical4;

import android.media.session.PlaybackState;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView t1;
    TextView t2;

    public ProfileViewHolder(View item) {
        super(item);
        t1 = item.findViewById(R.id.textView2);
        t2 = item.findViewById(R.id.textView4);
        img = item.findViewById(R.id.imageView2);
    }
}
