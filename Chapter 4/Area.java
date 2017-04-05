//Area.java
public class Area
{

    public Area()
    {
        int x = 0;
    }

    public int rectA(int l, int w)
    {
        return l * w;
    }
    
    public double triangleA(int l, int w)
    {
        return (double)(l * w)/2;
    }
    
    public double circleA(int r)
    {
        return Math.PI * r * r;
    }
    
    public double polyhedron (int h, int s)
    {
        return h/4.0 * s;
    }
}
