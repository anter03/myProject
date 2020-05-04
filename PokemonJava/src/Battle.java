
public class Battle {

	private Pokemon p1, pEnemy;
	private int hp, hpEnemy;

	public Battle(Pokemon p1, Pokemon pEnemy) {

		this.p1 = p1;
		this.pEnemy = pEnemy;
		hp = 100;
		hpEnemy = 100;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHpEnemy() {
		return hpEnemy;
	}

	public void setHpEnemy(int hpEnemy) {
		this.hpEnemy = hpEnemy;
	}

	public boolean attacco(String mossa) {
		if (mossa.compareToIgnoreCase("tuono") == 0) {
			setHpEnemy(hpEnemy - 40);
			
		}

		else
			setHpEnemy(hpEnemy - 20);

		if (hpEnemy <= 0)
			return true;
		return false;
	}

	public boolean difesa(String mossa) {
		setHp(hp - 20);
		if (hp == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p = new Pokemon("Pikachu", "Pikachu.png", "tuono", "azione", "elettro", "normale", "elettro");
		Pokemon p2 = new Pokemon("Squirtle", "Squirtle.png", "pistolacqua", "azione", "acqua", "normale", "acqua");
		Battle b = new Battle(p, p2);// attacco nemico
		b.difesa(p.getMossa2());
		System.out.println(b.getHp());
		// attacco1
		b.attacco(p.getMossa2());
		System.out.println("1 " + b.getHpEnemy()); // 80

		// attacco superefficace
		b.attacco("tuono");
		System.out.println("2 " + b.getHpEnemy()); // 40
		// attacco3
		b.attacco(p.getMossa2());
		System.out.println("3 " + b.getHpEnemy()); // 20
		System.out.println(b.attacco(p.getMossa2()));
		System.out.println("4 " + b.getHpEnemy()); // 0

	}

}
