
public class Pen {

	private String color;
	private int lenght;

	void writeMassage(String massage) {
		System.out.println("Mesajınız :" + massage);

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if ("red".equals(color) || "blue".equals(color) || "black".equals(color)) {
			this.color = color;
		}else {
			throw new IllegalArgumentException();
		}
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
}
