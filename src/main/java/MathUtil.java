/*
Essa classe não vai possuir nenhum atributo e por isso não vou precisar criar um objeto dela.
Sendo assim, os métodos serão estáticos para possibilitar o acesso sem precisar criar um objeto da classe
 */
public class MathUtil {
    //uma vez que eu tenha uma classe com métodos eu posso criar uma classe de teste
    public static int mdc(int a, int b) {
        //escrever o mínimo de código possível para resolver o problema do teste 1 propriedade
        //segunda versão do passed
        //if(b > 0){
        //    if(a % b == 0){ //verifica se a é divisivel por b
        //        return b;
        //    }
        //}

        //esse código foi para resolver P7 e o erro inserido por essas três linhas abaixo no mdcANegativoP3
        a = Math.abs(a);
        b = Math.abs(b);
        //esse código foi inserido para resolver a P6
        //essas três linhas evitam que eu faça um if para ordenar
        //quando eu fiz a inclusão desse código eu o quebrei e isso foi detectado no teste completo
        //pois falhou o mdcANegativoP3
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //terceira versão do refactory P1
        if (b > 0 && a % b == 0) {
            return b;
        }

        //esse método é a segunda versão do mdcP3
        if (b == 0) {
            return Math.abs(a);
        }

        //esse método foi incluído por conta da propriedade mdcP5
        if (a % b != 0) {
            return 1;
        }
        //primeira versão do failed
        return -1;//mdc inválido
    }
}
