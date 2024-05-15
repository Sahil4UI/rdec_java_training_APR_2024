import java.util.Scanner;

interface MyGame{
	void showMatrix();
	
	String player_turn();
	
	void cpu_turn();
	
	String winner(String choice);
}

class Game implements MyGame{

	String x[] = {"1","2","3","4","5","6","7","8","9"}; 
	int wincomb[][] = {{0,1,2},{3,4,5},{6,7,8},
						{0,3,6},{1,4,7},{2,5,8},
						{0,4,8},{2,4,6}};
	
	String user_choice,cpu_choice;
	int cpu_pos,my_pos;
	
	Game(String user_choice,String cpu_choice)
	{
		this.user_choice = user_choice;
		this.cpu_choice = cpu_choice;
	}
	@Override
	public void showMatrix() {
		// TODO Auto-generated method stub
		for (int i=0;i<x.length;i++)
		{
			if ((i+1)%3==0)
			{
				System.out.println(x[i]+" | ");
				System.out.println("-----------");
			}
			else {
				System.out.print(x[i]+" | ");
			}
		}
		
	}

	@Override
	public String player_turn() {
		// TODO Auto-generated method stub
		x[my_pos-1] = user_choice;
		showMatrix();
		return winner(user_choice);
		
	}

	@Override
	public void cpu_turn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String winner(String choice) {
		// TODO Auto-generated method stub
		for (int arr[] : wincomb)
		{
			if (x[arr[0]]==choice && 
				x[arr[1]]==choice &&
				x[arr[2]]==choice)
			{
				return choice;
			}
		}
		return null;
	}
	
}

public class TicTacToe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		String player_choice,cpu_choice;
		System.out.println("Enter Choice X/0 : ");
		player_choice = sc.nextLine().toUpperCase();
		cpu_choice = (player_choice=="X")?"0":"X";
		Game mygame = new Game(player_choice,cpu_choice);
		mygame.showMatrix();
		while (true)
		{
			System.out.println("Enter Pos 1-9 : ");
			mygame.my_pos=sc.nextInt();
			String res = mygame.player_turn();
			if (res==player_choice)
			{
				System.out.println("Player Wins");
				break;
			}
		}

	}

}
