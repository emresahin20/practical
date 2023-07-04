
public class PenFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.setColor("red"); 
		firstPen.setLenght(6);
	
		String massage="İlk Kaleminiz Üretildi";
		firstPen.writeMassage(massage);
		
		Pen secondPen= new Pen();
		secondPen.setColor("black");
		secondPen.setLenght(8);
		
		secondPen.writeMassage(secondPen.getColor() + " " + secondPen.getLenght()) ;

	}

}
