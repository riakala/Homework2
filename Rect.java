package hw2;

public class Rect {
	private int length;
	private int width;
	private String colour;
	
	// Methods
	
	public void rectTest(int length, int width) {
		// length and width
		this.length = length;
		this.width = width;
	}
	
	public void rectTest(int length) {
		// square
		this.length = length;
		this.width = length;
	}
	
	public void rectTest(int length, int width, String colour) {
		// length, width, and colour
		this.length = length;
		this.width = width;
		this.colour = colour;
	}
	
	public void rectTest(int length, String colour) {
		// square, and colour
		this.length = length;
		this.width = length;
		this.colour = colour;	
	}
	
	// Mutators
	
	public void setLength(int newLength) {
		this.length = newLength + 5;
	}
	
	public void setWidth(int newWidth) {
		this.length = newWidth + 5;
	}
	
	public void setColour(String newColour) {
		this.colour = newColour;
		newColour = "red";
	}
	
	// Accessors
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	// Instance methods
	
	public int calcPerimeter() {
		int rectPerimeter = (this.length*2) + (this.width*2);
		return rectPerimeter;
	}
	
	public double calcArea() {
		double rectArea = this.length * this.width;
		return rectArea;
	}
	
}
