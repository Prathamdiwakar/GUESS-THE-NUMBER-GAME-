import java.util.Scanner;
import java.util.Random;
class Guessthenumber {

    public int Userinput, Computerinput, yourguess = 0;

    public int getYourguess() {
        return yourguess;
    }

    public void setYourguess(int yourguess) {
        this.yourguess = yourguess;
    }

    public void Userinput(int num) {
        this.Userinput = num;
    }

    public int Game() {
        Random random = new Random();
        Computerinput = random.nextInt(10);
        return Computerinput;
    }

    public boolean isCorrectnumber() {
        if (Userinput > Computerinput) {
            System.out.println("THE NUMBER IS TO HIGH TO GUESS NUMBER");
            yourguess += 1;
            return false;
        } else if (Userinput < Computerinput) {
            System.out.println("THE NUMBER IS LESS THAN THE GUESS NUMBER");
            yourguess += 1;
            return false;
        } else {
            System.out.println("YOUR NUMBER IS MATCHED :-");
            System.out.println(" CONGRATES YOU WON !!!");
            yourguess += 1;
            return true;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======= WELCOME TO THE GUESS GAME =======");

        Guessthenumber game = new Guessthenumber();
        System.out.println();
        System.out.println(" =======+ THE RULE OF THE GAME +=======");
        System.out.println();
        System.out.println(" ======+ GUESS THE BETWEEN 0 TO 10 +=========");
        game.Userinput(sc.nextInt());
        game.Game();
        while (!game.isCorrectnumber()) {
            System.out.println("===== YOUR GUESS IS NOT MATCHED RE-TRY AGAIN =====");
            game.Userinput(sc.nextInt());
            game.getYourguess();
        }
        System.out.println();
        System.out.println("YOUR NUMBER OF GUESS ARE  : " + game.getYourguess());
        sc.close();
    }
}
