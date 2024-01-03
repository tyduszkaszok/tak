public class Main {
    public static void main(String[] args) {
        Kolo kolo1 = new Kolo(5);
        kolo1.obliczPole();
        kolo1.opiszFigure();

        Prostokat prostokat1 = new Prostokat(87.1, 90.1);
        prostokat1.obliczPole();
        prostokat1.opiszFigure();

        Kwadrat kwadrat1 = new Kwadrat(40.1);
        kwadrat1.obliczPole();
        kwadrat1.opiszFigure();
    }
}
