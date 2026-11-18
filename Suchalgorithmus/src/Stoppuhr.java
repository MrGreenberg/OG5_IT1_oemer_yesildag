public class Stoppuhr {

    private long anfang;
    private long ende;

    public void start() {
        this.anfang = System.currentTimeMillis();
    }

    public void stopp() {
        this.ende = System.currentTimeMillis();
    }

    public void reset() {
        this.anfang = 0;
        this.ende = 0;
    }

    public long getMillis() {
        return ende - anfang;
    }

    public long getSeconds() {
        return getMillis() / 1000;
    }

    public long getRestMillis() {
        return getMillis() % 1000;
    }

}
