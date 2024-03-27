package java_oop;
import java.util.*;
class Name extends Exception{
    String name;
    Name(String n){
       name=n;
    }
    public String toString(){
       return name+" is the employee";
    }
}
class Age extends Exception{
    int age;
    Age(int n){
       age=n;
    }
    public String toString(){
       return age+" is the age employee";
    }
}
class employee{
    int a;String n;
    public employee(int a,String n){
         this.a=a;
         this.n=n;
    }
    void display(){
        System.out.println("the name of employee is "+n+" age is "+a);
    }
}
public class exception{
    public static void main(String[] args) throws Name,Age{
        Scanner sc=new Scanner(System.in);
       int h,a;
       String n;
       boolean b=true;
       System.out.println("Enter name and Age ");
       n=sc.next(); 
       a=sc.nextInt();
       try{
        h=Integer.parseInt(n);
        b=false;throw new Name(n);
       }
       catch(Name e){
        System.out.println(e);
       }
       catch(Exception e){

       }
       try{
        if(a>50){
            b=false;
            throw new Age(a);
        }
    }
        catch(Age e){
            System.out.println(e);
        }
        if(b==true){
            employee e=new employee(a,n);
            e.display();
        }
       }
    }
