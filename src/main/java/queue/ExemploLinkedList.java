package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args){
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add( "Juliana" );
        filaBanco.add( "Pedro" );
        filaBanco.add( "Carlos" );
        filaBanco.add( "Larissa" );
        filaBanco.add( "João" );

        System.out.println(filaBanco);

        String primeiroLista = filaBanco.element();
        System.out.println(primeiroLista);
        System.out.println(filaBanco);
        String primeroListaRemove = filaBanco.poll();
        System.out.println(primeroListaRemove);
        System.out.println(filaBanco);
        filaBanco.add( "Daniel" );
        System.out.println(filaBanco);
        int tamanhoDaLista = filaBanco.size();
        System.out.println(tamanhoDaLista);
        Boolean listaVazia = filaBanco.isEmpty();
        System.out.println(listaVazia);
        boolean estaNaLista = filaBanco.contains( "Carlos" );
        System.out.println(estaNaLista);
        filaBanco.clear();
        String filaVazia = filaBanco.poll();
        System.out.println(filaVazia);







    }
}

