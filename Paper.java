package KaiBaiBo;

public class Paper implements Gesture {
	@Override
	public String check(Gesture g) {
		if(g.GetType().equals("scissor"))
			return "win";
		else if(g.GetType().equals("rock"))
			return "loss";
		else return "draw";
	}

	@Override
	public String GetType() {
		// TODO Auto-generated method stub
		return "paper";

}
}
