import java.util.Scanner;

interface Game{
	void gameBoard();
	String playerMove(String choice,int pos);
	void cpuMove(String cpu_choice);
	String winner(String choice);
}

class TicTacToe1 implements Game{
	String x[] =
		{"1","2","3","4","5","6","7","8","9"};
	
	int win_combs[][] = {{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}};

	@Override
	public void gameBoard() {
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
	public String playerMove(String choice, int pos) {
		// TODO Auto-generated method stub
		x[pos-1] = choice;
		gameBoard();
		return winner(choice);
	}

	@Override
	public void cpuMove(String cpu_choice) {
		System.out.println("CPU's Turn");
		// TODO Auto-generated method stub
		int cpu_pos=(int)(Math.random()*9);
		x[cpu_pos] = cpu_choice;
		gameBoard();
	}

	@Override
	public String winner(String choice) {
		// TODO Auto-generated method stub
		for (int arr[] : win_combs)
		{
			if (x[arr[0]]==choice 
					&& x[arr[1]]==choice 
					&& x[arr[2]]==choice)
			{
				return choice;
			}
		}
		
		return "";
		
	}
	
}


public class TicTacToeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe1 obj = new TicTacToe1();
		String cpu_choice,my_choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Choice (X/0):");
		my_choice = sc.next().toUpperCase();
		cpu_choice = (my_choice.equals("X"))?"0":"X";
		obj.gameBoard();
		while (true)
		{
			System.out.println("Enter Pos b/w (1-9)");
			int pos = sc.nextInt();
			String r = obj.playerMove(my_choice, pos);
			if (r==my_choice)
			{
				System.out.println(r+" is Winner");
				break;
			}
			obj.cpuMove(cpu_choice);
		}

	}

}
