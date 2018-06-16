package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Point3dTest {

	private Point3d point3d;
	private static final double DELTA = 1e-15;
	/**
	 * Set some Point3d for testing their functionality
	 */
	@Before
	public void setupTest() {
		point3d = new Point3d(new Point3d(1.1,2.2,3.3));
	}


	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		point3d.setX(12.1);
		assertEquals(12.1, point3d.getX(), DELTA);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		point3d.setY(13.3);
		assertEquals(13.3, point3d.getY(), DELTA);
	}
	

	/**
	 * Test the Setter of the z-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of z
	 */
	@Test
	public void testSetZ(){
		point3d.setZ(14.4);
		assertEquals(14.4, point3d.getZ(), DELTA);
	}

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		//point3d = new Point3d(new Point3d(1.1,2.2,3.3));
		Point3d point3d2 = new Point3d(1, 2, 3);

		double hx = 1.1 - 1;
		double hy = 2.2 - 2;
		double hz = 3.3 - 3;
		double exp = Math.sqrt(hx*hx+hy*hy+hz*hz);

		assertEquals(exp, point3d2.distanceFrom(point3d), DELTA);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		Point3d point3d2 = new Point3d(1, 2, 3);
		double hx = 0 - 1;
		double hy = 0 - 2;
		double hz = 0 - 3;
		double exp = Math.sqrt(hx*hx+hy*hy+hz*hz);

		assertEquals(exp, point3d2.distanceFromOrigin(), DELTA);
	}
}
