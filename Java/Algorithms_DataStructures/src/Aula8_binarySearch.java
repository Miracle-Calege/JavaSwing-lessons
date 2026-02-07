import java.util.Arrays;

public class Aula8_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search so funciona com a estrutura ordenada, metade da estrutura e eliminada durante cada passo
        nao e eficiente para estruturas com  quantidades de dados menores

         */
        int array[] = new int[1000000];
        int alvo = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index= Arrays.binarySearch(array,alvo); metodo ja pronto(do pacote util)
        int index = binarySearch(array, alvo);
        if(index==-1){
            System.out.println(alvo+" nao encontrado");
        }else{
            System.out.println("Elemento  encontrado no indice: "+index );
        }


    }
        private static  int binarySearch(int [] array, int alvo){

        int primeiro=0;
        int ultimo=array.length-1;
        while(primeiro <=ultimo){
            int meio=primeiro+(ultimo-primeiro)/2;
            int valor=array[meio];
            System.out.println("meio: "+valor);
            if(valor<alvo) primeiro=meio+1;// se tivermos um if e so uma linha de codigo nao precisamos de chavetas
            else if(valor>alvo) ultimo=meio-1;
            else return meio;//encontrado
            /*
            o algoritmo funciona basicamente assim:
            temos o primeiro indice da estrutura (primeiro) e o ultimo(ultimo)
            usamos esta formula para achar o indice no centro primeiro+(ultimo-primeiro)/2(esta formula evita overflow e preferivel na maioria dos casos em relacao a (primeiro+ultimo)/2 que pode causar overflow)
            se o valor que estiver no centro da estrutura for menor que o nosso alvo primeiro=meio+1(porque ja concluimos que o valor esta no indice meio nao e o alvo entao o nosso alvo so pode ser um dos valores depois do indice meio )
            se o valor que estiver no centro da estrutura for maior que o nosso alvo ultimo=meio-1(porque ja concluimos que o valor esta no indice meio nao e o alvo entao o nosso alvo so pode ser um dos valores antes do indice meio)





             */

        }
//[0,1,2,3,4,5,6]

        return  -1;//nao encontrado

        }



}
