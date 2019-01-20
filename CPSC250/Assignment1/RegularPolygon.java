package Assignment1;

public class RegularPolygon {
	private int numSides;//integer storing the number of sides for the polygon
	private double sideLength;//integer storing the length of the sides
	
	public RegularPolygon(){//default polygon creator
		numSides = 3;
		sideLength = 1.0;
	}
	public RegularPolygon(int numSides){
		this.numSides = numSides;
		if(numSides<3)
		{
			this.numSides = 3;
		}
			sideLength = 1.0;
	}
	public int getSides(){
		return numSides;
	}
	public void setSides(int numSides){
		this.numSides = numSides;
		if(numSides<3)
		{
			this.numSides = 3;
		}
	}
	public double getLength(){
		return sideLength;
	}
	public void setLength(double sideLength){
		this.sideLength = sideLength;
		if(sideLength<0.0||sideLength==0.0)
		{
			this.sideLength = 1.0;
		}
	}
	public double getPerimeter(){//returns the parameter of the polygon
		double perim = numSides * sideLength;
		return perim;
	}
	public double getArea(){//returns the area of the polygon
		double area = (numSides*Math.pow(sideLength, 2))/(4*Math.tan(Math.PI/numSides));
		return area;
	}
	public void newPolyMaxCount(double [] dubArray){//compares side lengths in an array; finds largest and counts how many times largest occurs
		double large = 0.0;
		int count = 0;
		for(int i =0; i<dubArray.length;i++)
		{
			if(dubArray[i]>large)
			{
				large = dubArray[i];
			}	
		}
		for(int i =0; i<dubArray.length;i++){
			if(dubArray[i]==large)
			{
				count++;
			}
		}
		if(count>=3&&large>0.0)
		{
			numSides = count;
			sideLength = large;
		}
		
	}
}
