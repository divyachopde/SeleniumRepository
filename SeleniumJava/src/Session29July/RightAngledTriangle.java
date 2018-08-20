package Session29July;

public class RightAngledTriangle extends Triangle {
	
	public RightAngledTriangle(double l, double h) {
		this.arm1 = l;
		this.arm2 = h;
		this.arm3 = Math.sqrt(this.arm1* this.arm1+this.arm2 * this.arm2);
//		this.l = l;
//		this.h = h;
	}
     
	

	@Override
	public String toString() {
		return "RightAngledTriangle [arm1=" + arm1 + ", arm2=" + arm2 + ", arm3=" + arm3 + "]";
	}



	@Override
	public double area() {
		double areaRightAnTri = (this.arm1 * this.arm2) / 2;
		return areaRightAnTri;
	}

}
