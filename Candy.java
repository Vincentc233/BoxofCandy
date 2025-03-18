import javax.swing.*;

public class Candy {
    private String flavor;
    public static void main(String[] args){
        Candy[][]box = new Candy[4][3];
        BoxOfCandy b = new BoxOfCandy(box);
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
        System.out.println(b);
    }
    public Candy(String f){
        flavor = f;
    }

    public String getFlavor() {return "";}

    public String toString(){
        return flavor;
    }

}