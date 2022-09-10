package entities;

public class Champion {
	
	public String name;
	public int life;
	public int attack;
	public int armor;
	
	public Champion(){		
	}
	
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}
	
	public void takeDamage (Champion other) {
		if(armor > other.attack) {
			life -= 1;
		}
		else {
			life -= (other.attack - armor);
		}		
	}
	
	public String status() {
		return name 
				+ ": "
				+ life
				+ " de vida";
	}

}
