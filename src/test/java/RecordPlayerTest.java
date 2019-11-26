import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {
    private RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer();
    }
    @Test
    public void canPlayTrack(){
        assertEquals("Playing Billie Jean", recordPlayer.play("Billie Jean"));
    }
}
