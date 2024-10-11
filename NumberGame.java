
import java.util.*;
class NumberGame {
    public static void main(String[] args) {
        int ran,score=0;
       int option;
        Random ss =new Random();
        Scanner s1 = new Scanner(System.in);
        do{
        System.out.println("***You have three chances***");
        System.out.println("Guess a number(1-100):");
        for(int i=0;i<3;i++){
            ran=ss.nextInt(101);
        while(true){
            int n = s1.nextInt();
        if(ran==n){
            System.out.println("Hurry,you won!!!");
            score +=10;
            System.out.println("Your score is:"+score);
            break;
        }
        else{
            System.out.println("Random number from computer is:"+ran);
            System.out.println("Try again!!!");
            
            if(score>0){
                score -=5;
            }
            break;
        }
        
    }
}
     System.out.println("Restart the game enter(1) or to terminate enter (0)");
     option = s1.nextInt();
     }while(option == 1);
     System.out.println("Game Over.Your final score:"+score);
   }
}