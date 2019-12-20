import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum()  {
        assertEquals((12), Quickmaths.sum(5, 7));
    }



    @Test
    public void testGennemsnit()  {
        assertEquals((6), Quickmaths.gennemsnit(4, 8));
    }

    }

