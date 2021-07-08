package _06_overloading;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane lop = new LeagueOptionPane();
		
		lop.showMessageDialog("Bob");
		lop.showMessageDialog("Dave", "Names");
		lop.showMessageDialog("Kate", "Things", "leagueDark.png");
	}
}
