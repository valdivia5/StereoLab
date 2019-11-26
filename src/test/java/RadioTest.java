import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    private Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void startsWithNoStation(){
        assertEquals("", radio.getStation());
    }
    @Test
    public void canChangeStation(){
        radio.tune("Radio 1");
        assertEquals("Radio 1", radio.getStation());
    }
    @Test
    public void hasVolume(){
        assertEquals(4, radio.getVolume());
    }

}
