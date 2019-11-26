import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    private CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer();
    }
    @Test
    public void canPlayTrack(){
        assertEquals("Playing Thriller", cdPlayer.play("Thriller"));
    }
    @Test
    public void hasVolume(){
        assertEquals(4, cdPlayer.getVolume());
    }
}