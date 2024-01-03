public class Kolo extends Figura {

    private double radius;

    private double area;
    public Kolo(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double obliczPole()
    {
        area = Math.round(Math.PI * radius * radius*100.0)/100.0;
        return area;
    }

    public void opiszFigure()
    {
        System.out.print("Dane Kola: \n");
        System.out.print("Promien: " + radius + "\n");
        System.out.print("Pole: " + area + "\n");

    }
    public double getPoleKola(){
        return area;
    }
}
