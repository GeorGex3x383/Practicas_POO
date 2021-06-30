package vista;

import javax.swing.JFrame;

@SuppressWarnings("serial")
//Clase con la ventana principal
public class EjemploGUI extends JFrame{
	
	@SuppressWarnings("static-access")
	public EjemploGUI() {
		//atributos de la ventana
		super("Tweets COVID19");
		setBounds(0, 0, 850, 580);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creacion del panel con sus atributos
		PanelUno pan1 = new PanelUno();
		pan1.setBackground(getForeground().white);;
		this.add(pan1);
		
	}

}

