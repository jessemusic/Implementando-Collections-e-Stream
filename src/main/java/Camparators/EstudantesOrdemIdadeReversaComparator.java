package Camparators;

import java.util.Comparator;

public class EstudantesOrdemIdadeReversaComparator implements Comparator<Estudantes> {

    @Override
    public int compare(Estudantes o1, Estudantes o2) {

        return o2.getIdade() - o1.getIdade();
    }

}
