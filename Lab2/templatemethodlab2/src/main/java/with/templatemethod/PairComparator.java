package with.templatemethod;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.getK().compareTo(o2.getK());
    }
}
