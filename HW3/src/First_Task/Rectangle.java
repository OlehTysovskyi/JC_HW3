package First_Task;

public class Rectangle {
	
	private int lenght;
	private int width;

	Rectangle() {
		this.lenght = 11;
		this.width = 8;

	}

	Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}
	
	public int Square() {
		int sq = this.lenght * this.width;
		return sq;
	}
	
	public int Perimeter() {
		int pr = 2*(this.lenght + this.width);
		return pr;
	}
}
