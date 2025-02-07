package dev.alejandra;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MultiplierTest {
    @Test
    public void testGetMultiplicationTable(){
        Multiplier multiplier = new Multiplier();
        List<String> result = multiplier.getMultiplier(5);
        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0) );
        assertEquals("5 x 5 = 25", result.get(4) );
        assertEquals("5 x 10 = 50", result.get(9) );
    }
}
