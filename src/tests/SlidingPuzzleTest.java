package tests;

import game.SlidingPuzzle;
import org.junit.Assert;
import org.junit.Test;
import game.Tile;

public class SlidingPuzzleTest {

    @Test
    public void shouldBeInitialised()
    {
        SlidingPuzzle game = new SlidingPuzzle();
        game.initTiles();
        Assert.assertNotEquals(null, game.getSetOfTiles());
    }

    @Test
    public void tilesShouldGetSwapped()
    {
        SlidingPuzzle game = new SlidingPuzzle();
        game.initTiles();
        Tile tileInPlace = game.getSetOfTiles()[0][0];
        game.swapTiles(0,0, 1,1);

        boolean testPassed = false;

        if(tileInPlace.getNumberOnTile() != game.getSetOfTiles()[0][0].getNumberOnTile())
        {
            testPassed = true;
        }

        Assert.assertTrue(testPassed);
    }

    @Test
    public void shouldEndGame()
    {
        SlidingPuzzle game = new SlidingPuzzle();
        game.initTiles();
        Assert.assertTrue(game.isGameOver());
    }

}