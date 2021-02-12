package set;

import java.util.TreeSet;

public class ExercicioSet {

    public static void main(String[] args) {

        TreeSet<Integer> numerosInteiros = new TreeSet<>();
        numerosInteiros.add( 3 );
        numerosInteiros.add( 88 );
        numerosInteiros.add( 20 );
        numerosInteiros.add( 44 );
        numerosInteiros.add( 3 );
        System.out.println(numerosInteiros);

        int removePrimeiro = numerosInteiros.pollFirst();
        System.out.println(removePrimeiro);
        System.out.println(numerosInteiros);
        System.out.println(numerosInteiros.size());
        numerosInteiros.add( 23 );
        System.out.println(numerosInteiros);

        int tamanhoSet = numerosInteiros.size();
        System.out.println(tamanhoSet);
        boolean estaVazio = numerosInteiros.isEmpty();
        System.out.println(estaVazio);




    }
}
