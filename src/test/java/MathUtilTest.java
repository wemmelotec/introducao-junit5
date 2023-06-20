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
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
        //utilizo o final para não ficar testando com outro valores ao invés de criar novos teste apenas alterar o valor
    void mdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcParesP2() {
        //Todo número que for divisor comum de a  e  b também é um divisor de m d c ( a , b ) mdc(a,b);
        //como na primeira chamada minha função não falhou preciso ficar alerta pois eu ainda não havia escrito código pra ela
        //mas como a função já resolver esse teste da P2 eu posso refatorar o teste nesse momento
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        //final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }

    @Test
    void mdcImparP2() {
        final int a = 9;
        final int b = 3;
        final int divisor = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
        //importante lembrar que eu devo pensar neste mesmo modelo de teste com outros valores
    }

    @Test
    void mdcAPositivoP3() {
        final int a = 16;
        final int b = 0;
        final int esperado = 16;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcANegativoP3() {
        final int a = -16;
        final int b = 0;
        final int esperado = 16;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        //mdc(a*m, b*m) == m * mdc(a,b)
        //mdc(18,6) == 2 * mdc(9,3)
        // 6 == 2 * 3
        final int esperado = MathUtil.mdc(a * m, b * m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    //A propriedade P5 precisa dividir o teste em duas partes
    @Test
    void mdcP5() {
        //se mdc(a,b) ==1, então mdc(a*b, c) == mdc(b,c)
        //tenho que escolher valores que deem o mdc = 1, de acordo com a minha condição
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(b, c);
        //assertEquals(esperado,obtido);
        //o teste passou de primeira, quando o  teste passa sem eu ter escrito código para ele
        //eu preciso desconfiar do resultado
        assertEquals(esperado, 1);
    }

    @Test
    void mdcP6() {
        //mdc(a,b) == mdc(b,a)
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);

    }

    @Test
    void mdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }
}