import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    private HashMap <E, Integer> counts = new HashMap<>();

    public Counter(E[] things) {

        for (int i = 0; i < things.length; i++) {
            Integer count = 1;

            for (E c: counts.keySet()) {
                if (c.equals(things[i])) count++;
            }

            counts.put(things[i], count);
        }
    }

    public Integer getCount(E element){
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
        Integer max = 0;
        E maxKey = null;

        for (E key : counts.keySet() ) {
            if (counts.get(key) > max) {
                max = counts.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
}
