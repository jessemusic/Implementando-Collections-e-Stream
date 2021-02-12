package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExerciciosEstadosDoBrasil {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Monta a árvore com as capitais
        treeCapitais.put("RS", "Rio Grande do Sul");
        treeCapitais.put("SC", "Santa Catarina");
        treeCapitais.put("PR", "Paraná");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "MInas Gerais");
        treeCapitais.put( "AC", "Acre" );
        treeCapitais.put( "AL","Alagoas" );
        treeCapitais.put( "AP","Amapá" );
        treeCapitais.put( "AM","Amazonas" );
        treeCapitais.put( "BA","Bahia" );
        treeCapitais.put( "CE","Ceará" );
       // treeCapitais.put( "DF","Distrito Federal (Brasilia)" );
        treeCapitais.put( "ES","Espirito Santo" );
        treeCapitais.put( "GO","Goiás" );
        treeCapitais.put( "MA","Maranhão" );
        treeCapitais.put( "MT","Mato Grosso" );
        treeCapitais.put( "MS","Mato Grosso do Sul" );
        treeCapitais.put( "PA","Pará" );
        treeCapitais.put( "PB","Paraíba" );
        treeCapitais.put( "PE","Pernambuco" );
        treeCapitais.put( "PI","Piauí" );
        treeCapitais.put( "RN","Rio Grande do Norte" );
        treeCapitais.put( "RO","Rondônia" );
        treeCapitais.put( "RR","Roraima" );
        treeCapitais.put( "SE","Sergipe" );
        treeCapitais.put( "TO","Tocantins" );
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.size());

        String EstadoRemove = treeCapitais.remove("MG");
        System.out.println(EstadoRemove);

        System.out.println(treeCapitais);
        System.out.println(treeCapitais.size());


        System.out.println( treeCapitais.containsValue("Mato Grosso do Sul" ) );



        System.out.println(treeCapitais);
        System.out.println(treeCapitais.size());


        // Navega em todos as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " -iterator- " + treeCapitais.get(key));
        }

        for (String X: treeCapitais.keySet()) {
            System.out.println( X + " -1 for- " + treeCapitais.get(X));
        }

        for (Map.Entry<String, String> capX: treeCapitais.entrySet()) {
            System.out.println(capX.getKey() + " --2 forMAP- " + capX.getValue());
        }

    }
}
