import java.util.Scanner;

class mathsin extends Thread{
    double deg,res;
    mathsin(double deg){
        this.deg=deg;
    }
    public void run(){
        res=Math.sin(deg);
    }
}
class mathcos extends Thread{
    double deg,res;
    mathcos(double deg){
        this.deg=deg;
    }
    public void run(){
        res=Math.cos(deg);
    }
}
class mathtan extends Thread{
    double deg,res;
    mathtan(double deg){
        this.deg=deg;
    }
    public void run(){
        res=Math.tan(deg);
    }
}
public class employee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle");
        double s,c,t;
        s=sc.nextInt();
        c=sc.nextInt();
        t=sc.nextInt();
        double tl;
        mathsin ms=new mathsin(s);
        mathcos mc=new mathcos(c);
        mathtan mt=new mathtan(t);
        ms.start();
        mc.start();
        mt.start();
        try{
            ms.join();
            mc.join();
            mt.join();
            tl=ms.res+mc.res+mt.res;
            System.out.println("totall "+tl);
        }
        catch(Exception e){

        }
        sc.close();
    }
}