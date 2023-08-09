package stuff;


class Super {
    protected int x = 1;
    public Super() {
        System.out.print("Super");
    }
}

class Duper extends Super {
    protected int y = 2;
    public Duper() {
        System.out.println(" duper");
    }
}

public class Fly extends Super {
    private int z, y;
    public Fly() { this(0); }
    public Fly(int n) {
        z = x + y + n;
        System.out.println(" fly times " + z);
    }
    public static void main(String[] args) {
        Duper d = new Duper();
        int delta = 1;
        Fly f = new Fly(delta);
    }
}