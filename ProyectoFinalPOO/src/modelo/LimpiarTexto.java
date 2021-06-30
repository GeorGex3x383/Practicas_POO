package modelo;

//Con esta clase se limpia el archivo para quitar caracteres no deseados por el usuario
public class LimpiarTexto {
	
	public String limpiarTexto(String nuevoTexto){
		nuevoTexto = nuevoTexto.replaceAll("�", "a");
		nuevoTexto = nuevoTexto.replaceAll("�", "e");
		nuevoTexto = nuevoTexto.replaceAll("�", "i");
		nuevoTexto = nuevoTexto.replaceAll("�", "o");
		nuevoTexto = nuevoTexto.replaceAll("�", "u");
		nuevoTexto = nuevoTexto.replaceAll("\\d", "");
		nuevoTexto = nuevoTexto.replaceAll("\t", " ");
		nuevoTexto = nuevoTexto.toLowerCase();
		nuevoTexto = nuevoTexto.replaceAll("[^\\w\\s]", " ");
		while(nuevoTexto.contains("  ")) {
			nuevoTexto = nuevoTexto.replace("  ", " ");
		}
		nuevoTexto = nuevoTexto.strip();
		return nuevoTexto;
	}

}
