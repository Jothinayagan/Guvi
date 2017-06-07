import java.util.*;
import java.io.*;
import java.lang.Math;
class CirRectTri
{
    public static float cicl(float rad)
    {
        float ca=(float)(3.14*rad*rad);
        return ca;
    }
    
    public static float rectan(float with,float heiht)
    {
        float ra=with*heiht;
        return ra;
    }
    
    static public float trinle(float breth,float heiht)
    {
        float ta=(float)(0.5*breth*heiht);
        return ta;
    }
    
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Circle:");
        System.out.println("Enter radius:");
        float cirad=s.nextFloat();
        System.out.println("Area of Rectangle:");
        System.out.println("Enter width and height:");
        float recwid=s.nextFloat();
        float rechet=s.nextFloat();
        System.out.println("Area of Triangle:");
        System.out.println("Enter breath and height:");
        float tribre=s.nextFloat();
        float trihet=s.nextFloat();
        float circ;
        float rect;
        float tri;
        System.out.println(cicl(cirad));
        System.out.println(rectan(recwid,rechet));
        System.out.println(trinle(tribre,trihet));
    }
}
