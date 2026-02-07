public class Aula7_linearSearch {
    public static void main(String[] args) {

        //linear search-> usa uma unica estrutura de repeticao que percorre a estrutura indice a indice
        //complexidade->o(n)

        // desvantagens: lento para conjuntos de dados grandes

        /*
        vantagens:
        rapido para procuras de dados de tamanho pequeno e medio
        nao precisa de estar em ordem
        util para estruturas que nao permitem acesso aleatorio
         */
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 1);
        if(index!=-1){
            System.out.println("Elemebto encontrado no indice:"+ index);
        }else {
            System.out.println("Elemento nao encontrado");
        }
    }

        private static int linearSearch(int [] array, int valor){
            for(int i=0;i< array.length;i++){
                if(array[i]==valor) {
                    return i;
                }
            }
            return -1;
        }

}
