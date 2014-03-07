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

		//testChing();
        
		System.out.println("************************************");
		System.out.println("***                              ***");
		System.out.println("***  Welcome to the Mckennizer!  ***");
		System.out.println("***                              ***");
		System.out.println("************************************");
		System.out.println();
		System.out.println("Here is your hexagram:");
		System.out.println();
		getRand();        		
        dispChing();
    }
    
    //populates iChing with random boolean value like tossing a coin
    //false = heads
    //true = tails    
    public static void getRand() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                double rand = Math.random();
                if(rand > 0.5) {
                    iChing[i][j] = true;
                }
            }            
        }
    }
    
    //prints out boolean values (for testing purposes)
    public static void testChing() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(iChing[i][j]);
            }
            System.out.println();
        }
    }
    
    //dispChing() is a horrible mess of if/else logic to display hexagram 
    //w/changing lines. If three heads or three tails are thrown, this is a
    //special "changing line" and is displayed to the user differently.
    //
    //Otherwise, if 2/3 coins are heads or tails, this will also be displayed
    //as a non-changing straight or broken line. There are therefore only 4 
    //options for display:
    //
    // 2/3 heads: ------------------
    // 2/3 tails: ------      ------
    // ALL heads: XXXXXXXXXXXXXXXXXX
    // ALL tails: ------000000------
    
    public static void dispChing() {

        for (int r = 0; r < ROW; r++) {
            if (iChing[r][0] == false) {
                if (iChing[r][1] == false) {
                    if (iChing[r][2] == false) {
                        System.out.println("XXXXXXXXXXXXXXXXXX");  	//HHH	(changing line)
                    } else {
                        System.out.println("------------------");	//HHT
                    }
                } else if (iChing[r][2] == true) {
                    System.out.println("------      ------");		//HTT
                } else {
                    System.out.println("------------------");		//HTH
                }
            } else if (iChing[r][1] == true) {
                if (iChing[r][2] == true) {
                    System.out.println("------000000------");		//TTT	(changing line)
                } else {
                    System.out.println("------      ------");		//TTH
                }
            } else if (iChing[r][2] == true) {
                System.out.println("------      ------");			//THT				
            } else {
                System.out.println("------------------");			//THH
            }
        }
        System.out.println();
    }
}
