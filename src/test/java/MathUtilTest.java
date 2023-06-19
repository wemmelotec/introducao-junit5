import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //teste unitário, você tem um determinado número de dado e para aqueles dados eu espero um resultado
    @Test
    void mdcAParP1() {
        //Se b > 0 b > 0 e é um divisor de a a, então m d c ( a , b ) = b mdc(a,b)=b.
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }
    @Test
    //utilizo o final para não ficar tentato do invés de criar novos teste apenas alterar o valor
    void mdcAImparP2(){
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }
}