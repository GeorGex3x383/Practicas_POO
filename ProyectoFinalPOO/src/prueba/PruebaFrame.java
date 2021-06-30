package prueba;

import controlador.ControladorInterfaz;
import vista.EjemploGUI;

//Esta es la clase principal
public class PruebaFrame {

	public static void main(String[] args) {
		
		//Aqui se llama al frame principal
		EjemploGUI frame1 = new EjemploGUI();
		@SuppressWarnings("unused")
		//Con esta clase podemos controlar y actualizar los datos que se manejan
		ControladorInterfaz controlador = new ControladorInterfaz(frame1);
		frame1.setVisible(true);
	}

}
