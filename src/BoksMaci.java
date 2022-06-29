public class BoksMaci {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("A", 10, 100, 100,40);
        Fighter f2 = new Fighter("B", 25, 80, 130,30);

        Match match = new Match(f1, f2, 150, 70);
        match.run();
    }
}
