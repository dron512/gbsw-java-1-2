public class AA {
    int a;
    int b;
    String c;

    public AA(){}
    public AA(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + "'명";
    }
}
