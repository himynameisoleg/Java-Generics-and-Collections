public class BingoChip <T, S> {
    T t;
    S s;

    BingoChip(T t, S s) {
        this.t = t;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Chip:" + this.t + "-" + this.s;
    }
}

