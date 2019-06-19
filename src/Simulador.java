
public class Simulador {

	public static void main(String[] args) {
		
		String url = Youtuber.URL_BASE;
		
		Youtuber youtuber1 = new Youtuber("Campomania", "Luis Campoverde", 
				"campomania@campomania.com", 23, "Ecuador");
		System.out.println("Nuestro primer youtuber es: " + youtuber1.getNombreCanal());
		
		Youtuber youtuber11 = new Youtuber("Campomania", "Chuqui", 
				"campomaniafalseta@outlook.com", 13, "Chile");
		System.out.println("Nuestro primer youtuber es: " + youtuber1.getNombreCanal());
		
		youtuber1.setBanned(true);
		
		//youtuber1 = youtuber11;

		String nombreCanalTest = "Campomania";
	
		if(youtuber1.equals(nombreCanalTest))
		{
			System.out.println("Iguaaaaaaaa");
		}else {
			System.out.println("Chuzo, no ha sido el mismo.");
		}
		
		System.out.println(youtuber1);
		System.out.println(youtuber1.toString());
		
		if(youtuber1.isBanned())
		{
			System.out.println("El usuario que buscas esta bloqueado por violacion a las politicas de Youtube.");
		}else {
			System.out.println("Bienvenido a " + youtuber1.getNombreCanal());
		}
		
		String nombre = "pepito";
		Youtuber youtuber2 = new Youtuber("Felipe Crespo", nombre, 
				"felipec@youtube.com", 33, "Ecuador");
		System.out.println("Nuestro segundo youtuber es: " + youtuber2.getNombreCanal() 
				+ " y tiene " + youtuber2.getEdad());
		System.out.println(youtuber2);
		
		
		Youtuber youtuber3 = new Youtuber("Momo593", "Alf", "alftrapero@gmail.com", 25, "Ecuador");
		//youtuber3.facebook = "momo593Alf";
		youtuber3.setFacebook("momo593Alf");
		System.out.println("Nuestro tercer youtuber es: " + youtuber3.getNombreCanal() + 
				" y su facebook es: " + youtuber3.getFacebook());
		
		Youtuber youtuber4 = new Youtuber("Dobla2", "Jose Antonio", "doblados@youtube.com", 
					21, "Canal de cabeza de gato y 4 ojos!", 5000, 25000, 63, "Ecuador", 
					"dobla2EC", "dobla2", "El pan de sal de la memoria");
		System.out.println("Nuestro cuarto youtuber es: " + youtuber4.getNombreCanal() + 
				" y su facebook es: " + youtuber4.getFacebook() +
				" tiene " + youtuber4.getSuscriptores() + " subscriptores!");
		
		youtuber1.saludar();
		youtuber2.saludar();
		youtuber3.saludar();
		youtuber4.saludar();
		
		System.out.println();
		System.out.println("Saludos personalizados");
		youtuber2.saludar("Hola Que tal!");
		youtuber3.saludar("Se van pelear! ");
		youtuber4.saludar("Que belleza mi pana, por eso es que no te pongo veneno!");
		
		int subscritoresY1 = youtuber1.subscribirse();
		System.out.println(subscritoresY1 + " suscriptores tiene el youtuber1");
		youtuber1.subscribirse();
		
		youtuber1.entrevistar(youtuber4);
		
		youtuber1.aumentarVisitantes(1);
		youtuber1.aumentarVisitantes(2);
		youtuber1.aumentarVisitantes(2.4);
		
		youtuber1.metodoPendejo();
		
		do {
			Youtuber youtuberN = new Youtuber("PiewDiePie", "XYZ", 
					"pdp@youtube.com", 33, "Suecia");
			System.out.println("mas espacio en memoria");
			//System.gc();
		}while(true);
	}

}
