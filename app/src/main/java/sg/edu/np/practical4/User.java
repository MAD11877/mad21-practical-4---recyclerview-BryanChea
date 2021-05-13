package sg.edu.np.practical4;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private int imageID;
    private String name;
    private  String desc;
    private boolean followed;

    public User(int id, String t1, String t2, boolean b){
        this.imageID = id;
        this.name = t1;
        this.desc = t2;
        this.followed = b;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() { return desc; }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFollowed() { return followed; }

    public void setFollowed(boolean followed) { this.followed = followed; }

    public int getImageID() { return imageID; }

    public void setImageID(int id) { this.imageID = id; }

    public User(Parcel in){
        String[] data= new String[3];

        in.readStringArray(data);
        this.name= data[0];
        this.desc= data[1];
        this.followed= Boolean.parseBoolean(data[2]);
    }
    @Override
    public int describeContents() {
// TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
// TODO Auto-generated method stub

        dest.writeStringArray(new String[]{this.name,this.desc,String.valueOf(this.followed)});
    }

    public static final Parcelable.Creator<User> CREATOR= new Parcelable.Creator<User>() {

        @Override
        public User createFromParcel(Parcel source) {
// TODO Auto-generated method stub
            return new User(source);  //using parcelable constructor
        }

        @Override
        public User[] newArray(int size) {
// TODO Auto-generated method stub
            return new User[size];
        }
    };
}

