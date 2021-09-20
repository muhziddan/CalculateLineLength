package com.ziddan.line;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateLineLengthTest {

    @Test
    public void variableTest() {

        CalculateLineLength calculateLineLength = new CalculateLineLength(1,2,3,4);

        assertEquals(1, calculateLineLength.x1);
    }
}
