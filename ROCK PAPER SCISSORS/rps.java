import java.util.Scanner;
public class rps {
public static void main(String args []){
Scanner g = new Scanner(System.in);
int human_point =0;
int my_point =0;
System.out.println("RPS GAME [MADE BY SUDKOSTIK]");
System.out.println("1- Rock 2-Paper 3- Scissors");
while(true) {
System.out.println("Choose: ");
int ok = g.nextInt();
int qwe = (int)(Math.random()*3);
if (ok == 1) {
if (qwe == 1) {
System.out.println("My choose: Rock Status: Draw, pff...");
System.out.println("Your point "+human_point+" My point "+my_point);
} else if (qwe == 2) {
System.out.println("My choose: Paper Status: You lose, loser.");
my_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
} else {
System.out.println("My choose: Scissors Status: You win, just novice luck.");
human_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
}
} else if (ok == 2) {
if (qwe == 1) {
System.out.println("My choose: Rock Status: You win, I think you're using cheats.");
human_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
} else if (qwe == 2) {
System.out.println("My choose: Paper Status: Draw, bruh.");
System.out.println("Your point "+human_point+" My point "+my_point);
} else {
System.out.println("My choose: Paper Status: I WIN YOU LOSE HAHA LOSER");
my_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
}} else if (ok == 3) {
if (qwe == 1) {
System.out.println("My choose: Rock Status: You lose, again. XD");
my_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
} else if (qwe == 2) {
System.out.println("My choose: Paper Status: I thought I'd give you some advance, so u win.");
human_point++;
System.out.println("Your point "+human_point+" My point "+my_point);
} else {
System.out.println("My choose: Scissors Status: Draw? Are u serious?");
System.out.println("Your point "+human_point+" My point "+my_point);
}
} else{
System.out.println("wtf, what are u doing?");
continue;}
if(human_point==3){
System.out.println("You won the game, totally based on your luck with "+human_point+"-"+my_point+" points");
break; }
else if(my_point==3){
System.out.println("You losed with "+my_point+"-"+human_point+" points, f**king loser");
break; }
}
}
}