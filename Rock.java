package KaiBaiBo;

public class Rock implements Gesture {

	@Override
	public String check(Gesture g) {
		if(g.GetType().equals("paper"))
			return "win";
		else if(g.GetType().equals("rock"))
			return "draw";
		else return "loss";
	}

	@Override
	public String GetType() {
		// TODO Auto-generated method stub
		return "rock";
	}
	

}
