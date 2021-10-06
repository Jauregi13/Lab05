package transakzioak;

public class Ordainketa {
	private int nork; //ordainketa egin duen jokalaria
	private int nori; //ordainketa jasotzen duen jokalaria
	private int kopurua; //zenbat billete ordaindu diren
	
	public Ordainketa(int nork, int nori, int kopurua) {
		this.nork = nork;
		this.nori = nori;
		this.kopurua = kopurua;
	}
	
	//getterrak eta setterrak
	public int getNork() {
		return nork;
	}
	public void setNork(int nork) {
		this.nork = nork;
	}
	public int getNori() {
		return nori;
	}
	public void setNori(int nori) {
		this.nori = nori;
	}
	public int getKopurua() {
		return kopurua;
	}
	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}
	
	
}
