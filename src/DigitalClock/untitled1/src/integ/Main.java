package integ;
import java.util.*;
public class Main {
    public static void main(String[] args){
            Scanner x=new Scanner(System.in) ;
            int num=x.nextInt();
            int bag=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    bag++;
                }
            }
            if(bag==2){
                System.out.println("Yes");


            }else{
                System.out.println("No");
            }
        }

    }


