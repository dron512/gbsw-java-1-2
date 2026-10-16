
public class Ex03 {
    private AA aa;
    Ex03(BB bb){
        this.aa = bb;
    }
    Ex03(CC cc){
        this.aa = cc;
    }
    public void print(){
        if ( aa instanceof BB)
            ((BB) aa).printBB();
        else if ( aa instanceof CC)
            ((CC) aa).printCC();
    }
    public static void main(String[] args) {
        Ex03 ex03bb = new Ex03(new BB());
        ex03bb.print();
        Ex03 ex03cc = new Ex03(new CC());
        ex03cc.print();
    }
}
