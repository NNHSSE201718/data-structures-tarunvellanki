

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MazeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MazeTest
{
    
    /**
     * Default constructor for test class MazeTest
     */
    public MazeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public void loadMazeTest()
    {
        Maze mz= new Maze();
        boolean var= mz.loadMaze("maze-1");
        assertEquals(true, var);
    }
}
