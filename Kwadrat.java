public class Kwadrat extends Figura {

    private double a;
    private double area;

    Kwadrat(double a)
    {
        this.a = a;
    }

    @Override
    public double obliczPole()
    {
        area = Math.round(a*a*100.0)/100.0;
        return area;
    }

    public void opiszFigure()
    {
        System.out.print("Dane Kwadratu: \n");
        System.out.print("Bok: " + a + "\n");
        System.out.print("Pole: " + area + "\n");
    }

    public double getPoleKwadratu(){
        return area;
    }
}
