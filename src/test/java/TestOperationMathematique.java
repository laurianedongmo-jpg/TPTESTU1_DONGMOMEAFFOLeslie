import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import operation.operationMathematique;

public class TestOperationMathematique {

    @Test
    public void testEstPositif() {
        operationMathematique op = new operationMathematique();
        assertTrue(op.estPositif(5));
        assertFalse(op.estPositif(-3));
    }

    @Test
    public void testFactoriel() {
        operationMathematique op = new operationMathematique();
        assertEquals(120, op.factoriel(5));
    }
}
