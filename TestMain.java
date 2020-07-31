import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{

    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testPlantCross();
    }

    @Test
    public void testPlantCross() {
       Main.runJerooCode();

       assertTrue("(6, 3)", Map.getInstance().isFlower(3,6));
       assertTrue("(7, 3)", Map.getInstance().isFlower(3,7));
       assertTrue("(8, 3)", Map.getInstance().isFlower(3,8));
        
       assertTrue("(6, 4)", Map.getInstance().isFlower(4,6));
       assertTrue("(8, 4)", Map.getInstance().isFlower(4,8));
       assertTrue("(6, 5)", Map.getInstance().isFlower(5,6));
       assertTrue("(8, 5)", Map.getInstance().isFlower(5,8));
        
       assertTrue("(3, 6)", Map.getInstance().isFlower(6,3));
       assertTrue("(4, 6)", Map.getInstance().isFlower(6,4));
       assertTrue("(5, 6)", Map.getInstance().isFlower(6,5));
       assertTrue("(6, 6)", Map.getInstance().isFlower(6,6));
       assertTrue("(8, 6)", Map.getInstance().isFlower(6,8));
       assertTrue("(9, 6)", Map.getInstance().isFlower(6,9));
       assertTrue("(10, 6)", Map.getInstance().isFlower(6,10));
       assertTrue("(11, 6)", Map.getInstance().isFlower(6,11));
        
        
       assertTrue("(3, 7)", Map.getInstance().isFlower(7,3));
       assertTrue("(11, 7)", Map.getInstance().isFlower(7,11));
        
       assertTrue("(3, 8)", Map.getInstance().isFlower(8,3));
       assertTrue("(4, 8)", Map.getInstance().isFlower(8,4));
       assertTrue("(5, 8)", Map.getInstance().isFlower(8,5));
       assertTrue("(6, 8)", Map.getInstance().isFlower(8,6));
       assertTrue("(8, 8)", Map.getInstance().isFlower(8,8));
       assertTrue("(9, 8)", Map.getInstance().isFlower(8,9));
       assertTrue("(10, 8)", Map.getInstance().isFlower(8,10));
       assertTrue("(11, 8)", Map.getInstance().isFlower(8,11));
        
       assertTrue("(6, 9)", Map.getInstance().isFlower(9,6));
       assertTrue("(8, 9)", Map.getInstance().isFlower(9,8));
       assertTrue("(6, 10)", Map.getInstance().isFlower(10,6));
       assertTrue("(8, 10)", Map.getInstance().isFlower(10,8));
        
       assertTrue("(6, 11)", Map.getInstance().isFlower(11,6));
       assertTrue("(7, 11)", Map.getInstance().isFlower(11,7));
       assertTrue("(8, 11)", Map.getInstance().isFlower(11,8));
    }


}
