package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        List<String> nomes_1 = new ArrayList<>();
        nomes.add( "Juliana" );
        nomes.add( "Pedro" );
        nomes.add( "Carlos" );
        nomes.add( "Larissa" );
        nomes.add( "João" );
        nomes_1.add( "Ismael" );
        nomes_1.add( "Rodrigo" );

        System.out.println(nomes);
        nomes.set( 2, "Roberto" );
        System.out.println(nomes);
        String nome = nomes.get( 1 );
        System.out.println(nome);
        nomes.remove( 4 );
        System.out.println(nomes);
        nomes.remove( "João" );
        int qt = nomes.size();
        System.out.println(qt);
        boolean temNome = nomes.contains( "Juliano" );
        System.out.println(temNome);

        nomes.addAll(nomes_1);
        System.out.println(nomes);
        Collections.sort( nomes );
        System.out.println(nomes);
        boolean listVazia = nomes.isEmpty();
        System.out.println(listVazia);





    }
}
