import java.util.Random;

public class Videogame {
	
	private String ID;
	private int cantidad;
	
	
	public Videogame(String id) {
		Random rand = new Random();
		
		ID = id;
		cantidad = rand.nextInt(46);
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	
	
}
