package day34interface;

public interface Lastik extends DisDonanim  {//DisDonanim'in cocugu yapcam

	/*interface'yi interface'ye parent yaparken extends keyword'u kullanilir
	  
	  class==>class :extends
	  interface==>interface : extends
	  class===>interface: implements
	  
	  interface===>class: OLMAZ. Bir interface'nin parenti class olamaz.
	
	*/
	
	public static final String MARKA = "Audi"; //hata vermedi
	
	
	void garanti();
	void jant();
	
}
