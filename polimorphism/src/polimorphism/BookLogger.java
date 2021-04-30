package polimorphism;

public class BookLogger extends BaseLogger {
	public void log(String message){
		System.out.println("Logged to Book : "+ message);
	}
}