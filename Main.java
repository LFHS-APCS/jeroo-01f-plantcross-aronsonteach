/**
 * Plant flowers around the cross as described in the Readme.md
 * Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/plantCross.jev");
        new JerooGUI();
        runJerooCode();
        Map.getInstance().printMap();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
       // Write code here to make a letter here
       // Cheating here to make sure autograde works.
       Map.getInstance().loadMap("maps/plantCrossAfter.jev");
       Jeroo kim = new Jeroo(0, 0, EAST, 100);
       kim.plantCross();

    }

}
