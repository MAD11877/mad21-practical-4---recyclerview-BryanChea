package sg.edu.np.practical4;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final String TAG = "Create Activity";
    public static ArrayList<User> myUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        myUsers = new ArrayList<User>();
        User user;
        String name;
        String desc;
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            name = "Name";
            desc = "Description ";
            name += String.valueOf(rand.nextInt());
            desc += String.valueOf(rand.nextInt());
            user = new User(name, desc, rand.nextBoolean());
            myUsers.add(user);
        }

        RecyclerView rv = findViewById(R.id.rv);
        ProfileAdaptor pa = new ProfileAdaptor(myUsers, this);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(pa);
    }
}