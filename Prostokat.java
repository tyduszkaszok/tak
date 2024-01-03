public class Prostokat extends Figura{
    private double a;
    private double b;
    private double area;

    Prostokat(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole()
    {
        area = Math.round(a*b*100.0)/100.0;
        return area;
    }

    public void opiszFigure()
    {
        System.out.print("Dane Prostokata: \n");
        System.out.print("Bok a: " + a + "\n");
        System.out.print("Bok b: " + b + "\n");
        System.out.print("Pole: " + area + "\n");

    }
    public double getPoleProstokata(){
        return area;
    }




}
