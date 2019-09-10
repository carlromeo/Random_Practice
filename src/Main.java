import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Random random = new Random();
        String[] words = new String[10];
        Scanner input = new Scanner(System.in);
        String word;

        for(int counter = 0; counter < 10; counter ++) {
            System.out.println("Please enter word number " + (counter) + ": ");
            word = input.nextLine();

            words[counter] = word;
        }
int sz=0;
       for(int counter = 0; counter < 10; counter ++){
           word=words[counter];
           sz=word.length();
           System.out.println(words[counter] + " length is " + sz);
       }

       int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(words[randomNumber]);


















        Random dice = new Random();
        int number;
        for(int counter = 1; counter <4; counter ++) {
       number = 1 + dice.nextInt(6);
            System.out.println("My random number is" + number);


//    Random dice = new Random();
//    int number = 1 + dice.nextInt(6);
//
//            System.out.println("My random number is" + number);


        }

    }
}

