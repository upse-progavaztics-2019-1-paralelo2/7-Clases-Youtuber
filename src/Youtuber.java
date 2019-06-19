
public class Youtuber {
	
	private String nombreCanal;
	private String nombrePersona;
	private String correo;
	private int edad;
	private String descripcion;
	private int suscriptores;
	private int visitas;
	private int numeroVideos;
	private String locacion;
	private String facebook;
	private String instagram;
	private String nombrePrimerVideo;
	private boolean banned = false;
	private boolean contenidoAdulto = false;
	public static final String URL_BASE = "http://youtube.com/";
	
	
	public Youtuber(String nombreCanal, String nombrePersona, 
			String correo, int edad, String locacion)
	{
		this.nombreCanal = nombreCanal;
		//nombrePersona = "Chucky";
		this.nombrePersona = nombrePersona;
		this.correo = correo;
		this.edad = edad;
		this.locacion = locacion;
		this.suscriptores = 0;
		this.visitas = 0;
		this.banned = false;
	}
	
	public Youtuber(String nombreCanal, String nombrePersona, String correo,
			int edad, String descripcion, int suscriptores, int visitas,
			int numeroVideos, String locacion, String facebook, String instagram,
			String nombrePrimerVideo)
	{
		this.nombreCanal = nombreCanal;
		this.nombrePersona = nombrePersona;
		this.correo = correo;
		this.edad = edad;
		this.descripcion = descripcion;
		this.suscriptores = suscriptores;
		this.visitas = visitas;
		this.numeroVideos = numeroVideos;
		this.locacion = locacion;
		this.facebook = facebook;
		this.instagram = instagram;
		this.nombrePrimerVideo = nombrePrimerVideo;
		this.banned = false;
	}
	
	public void saludar()
	{
		System.out.println("Hola soy " + this.nombrePersona +
				" y este es mi canal: " + this.nombreCanal);
		System.out.println("Tengo " + edad + " anios!");
	}
	
	public void saludar(String saludoPersonalizado)
	{
		System.out.println(saludoPersonalizado);
		saludar();
	}
	
	public int aumentarVisitantes(int i)
	{
		this.visitas = this.visitas+i;
		return this.visitas;
	}
	
	public int aumentarVisitantes(double i)
	{
		int visitasParametro = (int) i;
		System.out.println("Descontar plata");
		this.visitas = this.visitas + visitasParametro;
		return this.visitas;
	}
		
	public int subscribirse()
	{
		System.out.println("Estas subscrito a " + this.nombreCanal);
		this.suscriptores++;
		System.out.println("Eres el subscriptor " + this.suscriptores);
		return this.suscriptores;
	}
	
	public void desubscribirse()
	{
		System.out.println("Que pena, te vas a desuscribir de " + this.nombreCanal);
		System.out.println("TE VAS A PERDER TODOS SUS FABULOSOS VIDEOS");
		this.suscriptores--;
	}
	
	
	public void entrevistar(Youtuber entrevistado)
	{
		System.out.println(this.nombrePersona + " de " + this.nombreCanal 
				+ " entrevista a " + entrevistado.nombrePersona + " de " + entrevistado.nombreCanal);
	}
	
	public boolean isBanned()
	{
		return this.banned;
	}
	
	@Override
	public String toString()
	{
		String youtuberEnTexto = this.nombreCanal + " by " + this.nombrePersona;
		return youtuberEnTexto;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
		{
			return true;
		}
		
		if(o instanceof Youtuber)
		{
			Youtuber otroYoutuber = (Youtuber) o;
			
			if(this.nombreCanal.equals(otroYoutuber.nombreCanal))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void subirVideo(String nombreVideo)
	{
		if(numeroVideos==0)
		{
			this.nombrePrimerVideo = nombreVideo;
		}
		System.out.println("subiendo video " + nombreVideo + "... ");
		numeroVideos++;
	}
	
	public void borrarVideo(String nombreVideo)
	{
		System.out.println("borrando video " + nombreVideo + "... ");
		numeroVideos--;
	}
	
	public String getFacebook()
	{
		//Ponner n validaciones
		return this.facebook;
	}
	
	public void setFacebook(String nuevoFacebook)
	{
		//Validar que sea un usuario valido de facebook
		this.facebook = nuevoFacebook;
	}
	
	public String getNombreCanal()
	{
		return this.nombreCanal;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	public String getDescripcion()
	{
		return this.descripcion;
	}
	
	public void setBanned(boolean banned)
	{
		this.banned = banned;
	}
	
	public int getSuscriptores()
	{
		return this.suscriptores;
	}
	
	public int getVisitas()
	{
		return this.visitas;
	}
	
	public int getNumeroVideos()
	{
		return this.numeroVideos;
	}
	
	public String getNombrePrimerVideo()
	{
		return this.nombrePrimerVideo;
	}
	
	public String getLocacion()
	{
		return this.locacion;
	}
	
	public void setLocacion(String locacion)
	{
		this.locacion = locacion;
	}
	
	public String getInstagram()
	{
		return this.instagram;
	}
	
	public void setInstagram(String instagram)
	{
		this.instagram = instagram;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Liberando memoria");
	}
	
	public void metodoPendejo()
	{
		metodoPendejo();
	}
	
}
