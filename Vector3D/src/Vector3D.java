import java.util.Vector;

public class Vector3D
{
	private double x;
	private double y;
	private double z;

	public Vector3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getZ()
	{
		return z;
	}

	public Vector3D mult(double factor)
	{
		return new Vector3D(x * factor, y * factor, z * factor);
	}

	public Vector3D add(Vector3D v)
	{
		return new Vector3D(x + v.x, y + v.y, z + v.z);
	}

	public double length()
	{
		return Math.sqrt(x * x + y * y + z * z);
	}

	public String toString()
	{
		return "X: " + x + ", Y: " + y + ", Z: " + z;
	}
}
