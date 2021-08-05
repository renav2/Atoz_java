import java.util.*;

public class palindrom_no
{
public static void main(String args[]){
    System.out.println("enter ur no");
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int rev=0,rem=0;
    int cpy=a;
while(a!=0){

    rem=a%10;
    rev=rev*10+rem;
    a=a/10;
}
    if(cpy==rev){
        System.out.println("no is palindrom");
    }else{
        System.out.println("no is not a palindrom ");
    }
}

}
