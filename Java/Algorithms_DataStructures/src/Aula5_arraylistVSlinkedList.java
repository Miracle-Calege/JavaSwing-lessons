import java.util.ArrayList;
import java.util.LinkedList;

public class Aula5_arraylistVSlinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        /*
        Em java estruturas de dados dinamicas(que reajustam os seus tamanhos)  nao armazenam tipo de dados primitivos(int, double,long, etc) eles armazenam objectos/wrapper clsses

        int-> Integer
        double->Double
        long->Long
        String->String
        char->Character
        float->Float
         */

        long inicio,fim,total;
        for(int i=0;i<1000000;i++){
            linkedList.offer(i);
            arrayList.add(i);
        }
        //*******LinkedList********
        inicio=System.nanoTime();//retorna o tempo actual da jdk em nanosegundos
         /*
        Entre os system.nanoTime(); colocamos as actividades que queremos saber a duracao e depois fazemos a diferenca entre o tempo final pelo inicial
         */
        //linkedList.getFirst();
        //linkedList.get(500000);
        //linkedList.get(999999);
        linkedList.remove(0);
        fim=System.nanoTime();

        total=fim-inicio;
        System.out.println("Linkedlist:"+ total +" ns");

        //*********ArrayList*******
        inicio=System.nanoTime();//retorna o tempo actual da jdk em nanosegundos
        //arrayList.get(0);
        //arrayList.get(500000);
       // arrayList.get(999999);
        arrayList.remove(0);
        fim=System.nanoTime();

        total=fim-inicio;
        System.out.println("Arraylist:"+ total +" ns");

        /*
        Acessar um elemento com arraylist e muito mais rapido do que acessar com linkedist
        linkedList e ligeiramente mais para remover e adicionar elementos em relacao arraylist
         */


    }
}
