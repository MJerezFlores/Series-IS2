package serie;

import java.util.Iterator;

public class Serie implements Iterable<Integer> {

    private final Pattern pattern;

    public Serie(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new Iterator() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Object next() {
                return pattern.next();
            }
        };
        
       return iterator;
    }


    public interface Pattern {

        Integer next();

    }

}
