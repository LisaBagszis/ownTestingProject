import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnTestingProject {

    @Test
    void IfTrueOrNot () {

        //Given
        int i = 1;

        //When
        boolean actual = smallerThanZero.smallerthanzero(i);

        //Then
        assertEquals(true, actual);
    }

}