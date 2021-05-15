package sg.edu.np.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Create Activity";
    private User user;
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create Activity");

        TextView name = findViewById(R.id.textView3);
        TextView desc = findViewById(R.id.textView);
        Button followed = findViewById(R.id.button);
        Button msg = findViewById(R.id.button2);

        Intent i = getIntent();
        //String selectedUserName = i.getStringExtra("Name");
        User user = (User) i.getSerializableExtra("User");
        name.setText(user.getName());
        desc.setText(user.getDesc());
        //ArrayList<User> userList = (ArrayList<User>) i.getSerializableExtra("Users");

        if (user.isFollowed()) {
            followed.setText("Unfollow");
        } else {
            followed.setText("Follow");
        }

        for (int k = 0; k < ListActivity.myUsers.size(); k++) {
            if (ListActivity.myUsers.get(k).getName().equals((user.getName()))) {
                index = k;
                break;
            }
        }

        followed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!user.isFollowed()){
                    followed.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", '0').show();
                }
                else{
                    followed.setText("Follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", '0').show();
                }
                (ListActivity.myUsers.get(index)).setFollowed(!user.isFollowed());

                System.out.println(user.isFollowed());
            }
        });
    }
}