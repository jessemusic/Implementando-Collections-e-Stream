package Camparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemplosList {

    public static void main(String[] args) {

        List<Estudantes> estudantes = new ArrayList<>();

        estudantes.add(new Estudantes("Pedro", 19));
        estudantes.add(new Estudantes("Carlos", 23));
        estudantes.add(new Estudantes("Mariana", 21));
        estudantes.add(new Estudantes("João", 18));
        estudantes.add(new Estudantes("Thiago", 20));
        estudantes.add(new Estudantes("George", 22));
        estudantes.add(new Estudantes("Larissa", 21));
        estudantes.add(new Estudantes("Jesse", 50));
        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort( Comparator.comparingInt(Estudantes::getIdade));

        System.out.println("--- ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudantes::getIdade).reversed());

        System.out.println("--- ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);
        System.out.println("___________________________________________");

        Collections.sort(estudantes);

        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Collections.sort(estudantes, new EstudantesOrdemIdadeReversaComparator());

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);

    }

}
