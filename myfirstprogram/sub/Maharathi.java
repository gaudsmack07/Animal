package myfirstprogram.sub;

public class Maharathi {
	
	
	//inner class
	private class Weapon {
		String name;
		int powerLevel;
		
		Weapon(String name, int powerLevel){
			this.name = name;
			this.powerLevel = powerLevel;
		}
	}
	
	
	private static Maharathi mr;
	
	private String name;
	private Weapon[] weaponStack;
	
	private Maharathi(String name) {
		this.name = name;
	}
	
	public void fillStack(String ...w) {
		weaponStack = new Weapon[w.length];
		for(int i=0; i<weaponStack.length; i++) {
			StringBuilder v = new StringBuilder(w[i]);
			int pl = Integer.parseInt(v.substring(v.length()-3));
			v.delete(v.length()-3, v.length());
			weaponStack[i] = new Weapon(v.toString(), pl);
		}
	}
	
	public void displayStack() {
		System.out.println(name + "'s weapon stack");
		for(int i=0; i<weaponStack.length; i++) {
			System.out.println(weaponStack[i].name + " with a power level of " + weaponStack[i].powerLevel);
		}
	}
	
	public static Maharathi getInstance(String name) {
		if(mr == null) {
			mr = new Maharathi(name);
		}
		return mr;
	}
	
	public String getName() {
		return name;
	}
	
}
