package locationcaculator;

public abstract class Shape {

    public int length(int a, int b)
    {
        if(a > b)
            return a-b;
        return b-a;

    }

    public abstract double area();
}
