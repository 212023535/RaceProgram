package RaceProgram.domain;

import RaceProgram.Domain.Grid;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class GridTest
{
    @Test
    public void testGrid() throws Exception
    {
        Grid grid = new Grid.Builder(18).gridPosition(4).classCode("S&GT").driverName("Johan Engelbrecht").build();
        Assert.assertEquals(4,grid.getGridPosition());
    }
}
