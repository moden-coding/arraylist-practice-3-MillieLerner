import java.util.ArrayList;

public class Lineup {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold the full roster (10 players)
        ArrayList<String> Start = new ArrayList<String>();
        ArrayList<String> Bench = new ArrayList<String>();
        

        // Step 2: Add exactly 10 player names using .add()
        // The first 5 you add will be the starters; the last 5 will be the bench
        Start.add("Shayna");
        Start.add("Rose");
        Start.add("Aeden");
        Start.add("Velvel");
        Start.add("Bentzi");

        Bench.add("Millie");
        Bench.add("Penny");
        Bench.add("Maia");
        Bench.add("Lyra");
        Bench.add("Tomer");
        Bench.add("Jacob");

        // Step 3: Print a "STARTERS" label, then loop through and print the first 5 players
        // Each player should be numbered (Player 1, Player 2, etc.)
    System.out.println("---STARTERS---");
    int i=0;
    int starters=1;
    int benchers=Start.size()+1;
    while(i<5){
        System.out.println(starters+". "+Start.get(i));
        i++;
        starters++;
    }
    System.out.println("---BENCH---");
    i=0;
    while(i<Bench.size()){
        System.out.println(benchers+". "+Bench.get(i));
        i++;
        benchers++;
    }

    System.out.println("There are: "+(Integer.valueOf(Start.size())+Integer.valueOf(Bench.size()))+" people.");

        // Step 4: Print a "BENCH" label, then loop through and print the last 5 players
        // Continue your numbering (Player 6, Player 7, etc.) OR restart at 1 — your choice


        // Step 5: Print the total roster size using .size()

    }
}
