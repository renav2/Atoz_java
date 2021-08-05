import java.util.Scanner;

public class string_palindrom {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("entr ur string");
        String orignal=in.next();
        System.out.println("entr ur string"+orignal);
        String cpy =orignal;
        String rev="";
        for(int i=orignal.length()-1;i>=0;i--){
            rev=rev+orignal.charAt(i);

        }
        System.out.println("reverse string is"+rev);
        if(cpy.equals(rev)){
            System.out.println(" string is palindrom");


        }else{
            System.out.println("String is not palindrom");

        }


    }
}
