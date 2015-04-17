package RaceProgram.domain;

import RaceProgram.Domain.Standings;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class StandingsTest
{
    @Test
    public void testStandings() throws Exception
    {
        Standings standings = new Standings.Builder("S&GT").className("Sports & GT").driverName("Francis Currathers").position(2).build();
        Assert.assertEquals(2,standings.getPosition());
    }
}
