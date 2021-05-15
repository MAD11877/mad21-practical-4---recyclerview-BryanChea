package sg.edu.np.practical4;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class User implements Serializable {

    private Integer imageID;
    private String name;
    private String desc;
    private boolean followed;

    public User(String t1, String t2, boolean b) {
        this.name = t1;
        this.desc = t2;
        this.followed = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int id) {
        this.imageID = id;
    }
}