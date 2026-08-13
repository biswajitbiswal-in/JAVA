import java.util.*;
class adult_not{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >=18){
            System.out.print("Person is adult");
        }else{
            System.out.print("Not adult");
        }
    }
}
