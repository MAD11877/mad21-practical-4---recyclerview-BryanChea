package sg.edu.np.week4activity;

public class myObject {

    private int myImageID;
    private String myText1;
    private String myText2;

    public myObject(int imageName, String t1, String t2){
        this.myImageID = imageName;
        this.myText1 = t1;
        this.myText2 = t2;

    }

    public String getMyText1() {
        return myText1;
    }

    public String getMyText2() {
        return myText2;
    }

    public int getMyImageID() {
        return myImageID;
    }

}
