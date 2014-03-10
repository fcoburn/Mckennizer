import java.util.Scanner;

/*
 * @author Frank Coburn
 */

public class Mckennizer {
    
    //int constants for iching rows and columns
    //6x3 2D boolean array to represent throwing three coins six times
    private static final int ROW = 6;
    private static final int COL = 3;
    private static boolean[][] iChing = new boolean[ROW][COL];

    public static void main(String[] args) {
        menu();       
    }
    
	//simple menu method to get things started
	//calls getRand() for an initial throw
    public static void menu() {        
		System.out.println("************************************");
		System.out.println("***                              ***");
		System.out.println("***  Welcome to the Mckennizer!  ***");
		System.out.println("***                              ***");
		System.out.println("************************************");
		System.out.println();
		System.out.println("Here is your hexagram:");
        getRand();
    }
    
	//after inital throw, userResp() is called, uses while loop
	//with boolean method isValidResp for user validation
    public static void userResp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press t to throw again, press q to quit.");
        String resp = sc.nextLine();
        while (!isValidResp(resp)) {
            resp = sc.nextLine();
        }
    }
    
	//boolean returning method for user validation
	//user is stuck in loop until they type q or t
	//t for new throw, q for quit, with polite error message
	//t calls getRand(), q prints a parting message before exiting 
    private static boolean isValidResp(String resp) {
        if (resp.equals("t")) {
			System.out.println();
			System.out.println("Here is your new hexagram:");
            getRand();        
        }
        if (resp.equals("q")) {
			System.out.println();
            System.out.println("Goodbye!");
            System.exit(0);
        }
        if (resp != "q" || resp != "t") {
			System.out.println();
            System.out.println("Not a valid character!");
            System.out.println("Press t to throw again, press q to quit, please!");
            return false;
        }
        return true;
    }
    
    //populates iChing with random boolean value like tossing a coin
    //false = heads
    //true = tails    Tails = True = how I remember which is which...
	//after doing this, dispChing() is called, displaying the hexagram
    public static void getRand() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                double rand = Math.random();
                if(rand > 0.5) {
                    iChing[i][j] = true;
                } else{
                iChing[i][j] = false;
                }
            }            
        }
        dispChing();
    } 
    
    //dispChing() is a horrible mess of if/else logic to display hexagram 
    //w/changing lines. if three heads or three tails are thrown, this is a
    //special "changing line" and is displayed to the user differently.
    //
    //otherwise, if 2/3 coins are heads or tails, this will also be displayed
    //as a non-changing straight or broken line. there are therefore only 4 
    //options for display:
    //
    // 2/3 heads: ------------------
    // 2/3 tails: ------      ------
    // ALL heads: XXXXXXXXXXXXXXXXXX
    // ALL tails: ------000000------
	//
	//after displaying the hexagram, userResp() is called so the user can throw
	//another, or choose to exit the program
    
    public static void dispChing() {
        System.out.println();
        for (int r = 0; r < ROW; r++) {
            if (iChing[r][0] == false) {
                if (iChing[r][1] == false) {
                    if (iChing[r][2] == false) {
                        System.out.println("XXXXXXXXXXXXXXXXXX");  		//HHH	(changing line)
                    } else {
                        System.out.println("------------------");		//HHT
                    }
                } else if (iChing[r][2] == true) {
                    System.out.println("------      ------");			//HTT
                } else {
                    System.out.println("------------------");			//HTH
                }
            } else if (iChing[r][1] == true) {
                if (iChing[r][2] == true) {
                    System.out.println("------000000------");			//TTT	(changing line)
                } else {
                    System.out.println("------      ------");			//TTH
                }
            } else if (iChing[r][2] == true) {
                System.out.println("------      ------");				//THT				
            } else {
                System.out.println("------------------");				//THH
            }
        }
        System.out.println();
        userResp();
    }
}
