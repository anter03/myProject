/**
*
* visto dal prof Gervasi
*/
public class Pokemon {

	private String nome,sprite,mossa1,mossa2,tipoMossa1,tipoMossa2,tipoPokemon;
	
	
	
	
	public Pokemon(String nome, String sprite, String mossa1, String mossa2, String tipoMossa1, String tipoMossa2,String tp) {
		
		this.nome = nome;
		this.sprite = sprite;
		this.mossa1 = mossa1;
		this.mossa2 = mossa2;
		this.tipoMossa1 = tipoMossa1;
		this.tipoMossa2 = tipoMossa2;
	tipoPokemon=tp;
	}




	public String getTipoPokemon() {
		return tipoPokemon;
	}




	public void setTipoPokemon(String tipoPokemon) {
		this.tipoPokemon = tipoPokemon;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getSprite() {
		return sprite;
	}




	public void setSprite(String sprite) {
		this.sprite = sprite;
	}




	public String getMossa1() {
		return mossa1;
	}




	public void setMossa1(String mossa1) {
		this.mossa1 = mossa1;
	}




	public String getMossa2() {
		return mossa2;
	}




	public void setMossa2(String mossa2) {
		this.mossa2 = mossa2;
	}




	public String getTipoMossa1() {
		return tipoMossa1;
	}




	public void setTipoMossa1(String tipoMossa1) {
		this.tipoMossa1 = tipoMossa1;
	}




	public String getTipoMossa2() {
		return tipoMossa2;
	}




	public void setTipoMossa2(String tipoMossa2) {
		this.tipoMossa2 = tipoMossa2;
	}

public String toString ()
{
	String s="";
	s+="nome: "+nome+"\n"
			+"tipo "+tipoPokemon+"\n"
			+"sprite: "+sprite+"\n"
			+"mossa1: "+mossa1+"\n"
			+"mossa2: "+mossa2+"\n"
			+"tipo mossa1: "+tipoMossa1+"\n"
			+"tipo mossa2"+tipoMossa2;
	return s;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p=new Pokemon("Pikachu", "Pikachu.png", "tuono", "azione", "elettro", "normale","elettro");
		System.out.println(p.getMossa1());
		System.out.println(p.toString());
	}

}
