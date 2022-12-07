package classEx;

public class Main {
    public static void main(String[] args) {
        Bucket b1 = new Bucket();
        b1.setCapacity(10);
        b1.addLiter();
        b1.addLiter();
        b1.addLiter();
        System.out.println(b1.percent());
        System.out.println(b1);
        System.out.println(b1.spill(2));
        Bucket b2 = new Bucket();
        b2.setCapacity(12);
        b2.addLiters(3);
        b1.fill(b2);
        System.out.println(b1);
        System.out.println(b2);

    }
}
