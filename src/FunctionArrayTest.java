import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionArrayTest {

    @Test
    void produceSumArrayTestException() {
        int[] tb1={1,2,3,4,5};
        int[] tb2={6,7,8,9,10,11};
        Exception exception=assertThrows(Exception.class,
                ()->{
                    FunctionArray.produceSumArray(tb1,tb2);
                });
        String expectedMessage = "Erreur de la taille du tableau";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
