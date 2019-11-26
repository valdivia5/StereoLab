import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    private Stereo stereo;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;

    @Before
    public void before(){
        stereo = new Stereo("Panning");
        cdPlayer = new CDPlayer();
        recordPlayer = new RecordPlayer();
        radio = new Radio();
    }
    @Test
    public void canGetRadioStation(){
        assertEquals("", stereo.getRadioStation());

    }


    @Test
    public void stereoCanTuneRadio(){
     assertEquals("Radio 1", stereo.tuneRadio("Radio 1"));
    }



}
