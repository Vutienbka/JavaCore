package AbsoluteNumberCalculator;
// De tao test case ta se su dung phim tat Alt-Enter

import AbsoluteNumberCaculator.AbsoluteNumberCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0(){
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        // number la gia tri dau vao
        assertEquals(expected,result);
        // expected la gia tri mong muon
        // result la gia tri thuc te do findSsolute() tinh toan tra ve
        //assertEquals() su dung de so sanh gia tri thuc te va gia tri mong muon
    }

    @Test
    void testFindAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void testFindAbsolute2(){
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

}