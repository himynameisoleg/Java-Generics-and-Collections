import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;

    public Bag(){
        objects = new ArrayList<>();
    }

    public void add (T element) throws BagException {
        if (element == null) {
            throw new BagException("Cannot add null to a Bag");
        }

        objects.add(element);
    }

    public T drawOne () {
        Random rand = new Random();
        return this.objects.get(rand.nextInt(this.objects.size()));
    }

    public ArrayList<T> drawMany(int howMany) {
        ArrayList<T> objects = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            objects.add(this.drawOne());
        }

        return objects;
    }

    public void add(T element, double prob) throws BagException{
        if (prob < 0 || prob > 1) {
            throw new BagException("Probability should be between 0 and 1");
        }

        int tot = (int) Math.round(objects.size() * prob);
        for (int i = 0; i < tot; i++) {
            System.out.println("Adding " + i);
            objects.add(element);
        }
    }
}
