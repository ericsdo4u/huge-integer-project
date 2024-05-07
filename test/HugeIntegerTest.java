import exception.HugeIntegerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    @Test
    public void testThatWhen40IntegerArrayIsParsed_41IntegerIsReceived(){
        assertThrows(HugeIntegerException.class,()->  new HugeInteger("12345678901234567890123456789012345678901"));

    }
     @Test
     public void testThatWhen40IntegerArrayIsParsed_40IntegerIsReceived(){
        assertThrows(HugeIntegerException.class,()->  new HugeInteger("123456789012345678901234567890123456789f"));
     }

//     @Test
//    public void testThatNegativeNumbersCanBeParsed(){
//        HugeInteger hugeInteger = new HugeInteger("-123456789012345");
//        assertEquals(16, hugeInteger.);
//     }

    @Test
    public void testThatNumbersCanBeParsed(){
        HugeInteger hugeInteger = new HugeInteger("123456789");
        int[] arrays = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(arrays, hugeInteger.getArrayOfFortyElement());
    }
  @Test
    public void testThatNumbersBeAdd(){
        HugeInteger hugeInteger = new HugeInteger("123456789");
      HugeInteger hugeInteger1 = new HugeInteger("123456789");
      HugeInteger result = hugeInteger.add(hugeInteger1);
      assertEquals("246913578",result);
  }

}