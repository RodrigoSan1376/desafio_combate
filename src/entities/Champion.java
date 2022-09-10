package entities;

public class Champion {
	
	public String name;
	public int life;
	public int attack;
	public int armor;
	
	Champion(){		
	}
	
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}
	
	public void takeDamage (Champion other) {
		life -= other.attack;
	}
	
	public String status() {
		return name 
				+ ": "
				+ life
				+ " de vida";
	}

}
