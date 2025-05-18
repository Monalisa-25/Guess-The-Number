import java.util.Scanner;

public class GuessTheNumber{
public static void main(String[]args){
int random=(int)(Math.random()*100);
System.out.println("guess the number");
Scanner sc =new Scanner(System.in);
int guess=sc.nextInt();
boolean flag=true;
while(true){
if(guess ==random){
flag=false;
System.out.println("Congratulations!your guess was correct");
}
else if(guess>random) {
System.out.println("The number is smaller than this");
System.out.print("Guess the number again:");
guess=sc.nextInt();
}
else{
System.out.println("The number is greater than this");
System.out.println("Guess the number");
guess=sc.nextInt();
}}} }
