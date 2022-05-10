import java.io.Console;

public class leap {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("enter the year you were born?");
        String stringBirthYear = myConsole.readLine();
       Integer birthYear = Integer.parseInt(stringBirthYear);

        System.out.println("you were alive during this leap year");
        for (Integer year = birthYear; year<2022; birthYear++) {
            if (year % 4==0) {
                System.out.println(year);
            }
       }


    }
}


