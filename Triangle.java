package org.uzma.javaBrains;

public class Triangle {
	
		private Point pointA;
		private Point pointB;
		private Point pointC;
		
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		/*private String TypeOfTriangle;
		
		

		public Triangle(String TypeOfTriangle,int point)
		{
			this.TypeOfTriangle=TypeOfTriangle;
			this.point=point;
		}
		
		public int getPoint() {
			return point;
		}
		/*public void setPoint(int point) {
			this.point = point;
		}*/
		/*public String getTypeOfTriangle() {
			return TypeOfTriangle;
		}*/
		public void Draw()
		{
			System.out.println("Point A is--"+ getPointA().getX()+"Point A is--"+getPointA().getY());
			System.out.println("Point B is--"+ getPointB().getX()+"Point B is--"+getPointB().getY());
			System.out.println("Point C is--"+ getPointC().getX()+"Point C is--"+getPointC().getY());
		}
}
