package Collection_Code.Set;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        //Name -----For a Sting
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.next();

        //Age ------For a Integer

        System.out.println("Enter Your Age :");
        Integer age = sc.nextInt();


        System.out.println("Enter Your Gender :");
        char gender = sc.next().charAt(0);

        System.out.println("Enter Your Phone No");
        long phone = sc.nextLong();

        System.out.println("-------------------------------------------------");
        System.out.println("Name    :-"+ name);
        System.out.println("Age     :-"+ age);
        System.out.println("Gender  :-"+ gender);
        System.out.println("Phone No:-"+ phone);






    }
}
