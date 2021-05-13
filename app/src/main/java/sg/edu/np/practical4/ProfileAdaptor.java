package sg.edu.np.practical4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdaptor extends RecyclerView.Adapter<ProfileViewHolder> {
    ArrayList<User> profiles;

    public ProfileAdaptor(ArrayList<User> userList) {
        profiles = userList;
    }

    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.obj_layout, parent, false);
        return new ProfileViewHolder(item);
    }

    public void onBindViewHolder(ProfileViewHolder vh, int pos) {
        User users = profiles.get(pos);
        vh.t1.setText(users.getName());
        vh.t2.setText(users.getDesc());
        vh.img.setId(users.getImageID());//unique for each image set as User name
    }

    public int getItemCount() {
        return profiles.size();
    }
}
