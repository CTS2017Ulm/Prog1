public class Vector3D_Test
{
    public static void main(String[] args)
    {
        Vector3D a = new Vector3D(3,4,5);
        Vector3D b = new Vector3D(10,0,0);
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.mult(2.5));
        System.out.println(a.add(b));
    }
}
