
package KaiBaiBo;

public class Scissor implements Gesture {
	@Override
	public String check(Gesture g) {
		if(g.GetType().equals("paper"))
			return "loss";
		else if(g.GetType().equals("rock"))
			return "win";
		else return "draw";
	}

	@Override
	public String GetType() {
		// TODO Auto-generated method stub
		return "scissors";
}
}
