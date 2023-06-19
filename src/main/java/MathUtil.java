/*
Essa classe não vai possuir nenhum atributo e por isso não vou precisar criar um objeto dela.
Sendo assim, os métodos serão estáticos para possibilitar o acesso sem precisar criar um objeto da classe
 */
public class MathUtil {
    //uma vez que eu tenha uma classe com métodos eu posso criar uma classe de teste
    public static int mdc(int a, int b){
        //escrever o mínimo de código possível para resolver o problema do teste 1 propriedade
        //segunda versão do passed
        //if(b > 0){
        //    if(a % b == 0){ //verifica se a é divisivel por b
        //        return b;
        //    }
        //}
        //terceira versão do refectory
        if (b>0 && a%b ==0){
            return b;
        }

        //esse método é a segunda versão do mdcP3
        if(b==0){
            return Math.abs(a);
        }
        //primeira versão do failed
        return -1;//mdc inválido
    }
}
