import javax.swing.*;

public class Candy {
    private String flavor;
    public static void main(String[] args){
        Candy[][]box1 = new Candy[4][3];
        BoxOfCandy b = new BoxOfCandy(box1);
        box1[0][1] = new Candy("lime");
        box1[1][1] = new Candy("orange");
        box1[2][2] = new Candy("cherry");
        box1[3][1] = new Candy("lemon");
        box1[3][2] = new Candy("grape");
        //System.out.println(b);
        Candy[][] box2 = new Candy[3][5];
        BoxOfCandy b2 = new BoxOfCandy(box2);
        box2[0][0] = new Candy("lime");
        box2[0][1] = new Candy("lime");
        box2[0][3] = new Candy("lemon");
        box2[1][0] = new Candy("orange");
        box2[1][3] = new Candy("lime");
        box2[1][4] = new Candy("lime");
        box2[2][0] = new Candy("cherry");
        box2[2][2] = new Candy("lemon");
        box2[2][4] = new Candy("orange");
        System.out.println(b2.removeNextByFlavor("cherry"));
        //System.out.println(b2);
        System.out.println(b2.removeNextByFlavor("lime"));
        System.out.println(b2);
        //System.out.println(b2.removeNextByFlavor("grape"));
    }
    public Candy(String f){
        flavor = f;
    }

    public String getFlavor() {return flavor;}

    public String toString(){
        return flavor;
    }

}

