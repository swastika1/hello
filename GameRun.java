package KaiBaiBo;

public class GameRun {
	public static void main(String[] args) {
		Rock r=new Rock();
		String result=r.check(new Paper());
		System.out.println(result);
	}

}
