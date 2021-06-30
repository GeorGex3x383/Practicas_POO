package vista;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

//Esta clase nos ayuda a graficar los datos deseados
public class BarChart extends ApplicationFrame{
	
	private static final long serialVersionUID = 1L;
	static ArrayList<String> listaPalabras = new ArrayList<String>();
	static String[] arregloPalabras = listaPalabras.toArray(new String[1]);
	static int[] arregloContador = new int[arregloPalabras.length];

// constructor, título ventana y valores a graficar. 
 public BarChart(String applicationTitle, String[] arregloPalabras, int[] arregloContador) {
	 
   
  super(applicationTitle);
  //Los datos que recibe para graficar
  BarChart.arregloPalabras=arregloPalabras;
  BarChart.arregloContador=arregloContador;
  JPanel content = createDemoPanel();
  content.setPreferredSize(new java.awt.Dimension(700, 700));
  getContentPane().add(content);
 }

 // Conjnto de datos para colocar en la gráfica. 
  private static DefaultCategoryDataset createDataset() {
	  DefaultCategoryDataset result = new DefaultCategoryDataset();
     // Se recorre el arreglo para poder graficar cada palabra con su respectiva cantidad de veces que se encontró en el texto
	  for(int i=0; i<arregloPalabras.length; i++) {
			result.setValue(arregloContador[i], arregloPalabras[i], arregloPalabras[i]);
		}
    return result;
 }

 // se crea en un panel distinto para que se aprecien los datos
 public static JPanel createDemoPanel() {
 
//Etiquetas para identificar valores en la grafica
  JFreeChart chart = ChartFactory.createBarChart3D("T W E E T S C O V I D ", "Palabras en tweets",
    "Frecuencia", createDataset(),
    PlotOrientation.VERTICAL, true,  
    true, false);
  //Especificaciones para el diseño de la grafica
  CategoryPlot plot = (CategoryPlot) chart.getPlot();
  CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
  xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
  plot.setBackgroundAlpha(0.5f);
   
  ChartPanel chartPanel = new ChartPanel(chart);
  // regresa panel con propiedades
  return chartPanel;

 }


}
