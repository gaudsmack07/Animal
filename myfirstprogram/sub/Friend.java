package myfirstprogram.sub;

public class Friend {
	
	public static int a = 21;
	
	public static int totalFriends;
	public String name  = "hello";
	public boolean goodFriend;
	
//	static {
//		System.out.println("inside the static block");
//		totalFriends = 10;
//	}
	
	public Friend(){
		System.out.println("empty constructor of the parent class running");
	}
	
	public Friend(String name){
		this.name = name;
		totalFriends++;
	}
	
	public static void console() {
		System.out.println("dude are you okay");
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public boolean isGoodFriend() {
		if(Friend.totalFriends == 1) {
			goodFriend = true;
		}
		if(goodFriend) {
			changeName("best friend");
		}
		return goodFriend;
	}
	
	public static void setTotalFriends(int totalFriends) {
//		Friend f = new Friend("ballu");
//		System.out.println(f.isGoodFriend());
		Friend.totalFriends = totalFriends;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
}
