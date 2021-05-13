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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<User> myUsers = new ArrayList<>();
        User user;
        String name;
        String desc;
        int nameInt = 0;
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            name = "Name";
            desc = "Description ";
            nameInt = rand.nextInt();
            name += String.valueOf(nameInt);
            desc += String.valueOf(rand.nextInt());
            user = new User(nameInt, name, desc, rand.nextBoolean());
            myUsers.add(user);
        }

        RecyclerView rv = findViewById(R.id.rv);
        ProfileAdaptor pa = new ProfileAdaptor(myUsers);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(pa);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setCancelable(false);

        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        ImageView img = findViewById(nameInt);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("RIP");
                builder.setPositiveButton("View", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ListActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
/*
        for (User u : myUsers) {
            findViewById(u.getImageID()).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    builder.setMessage(u.getName());
                    builder.setPositiveButton("View", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(ListActivity.this, MainActivity.class);
                            intent.putExtra("User", u);
                            startActivity(intent);
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });
        }
        Log.v(TAG, "b");
    }*/
}