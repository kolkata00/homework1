package homework.zad2;

public class Main {

	public static void main(String[] args) {
		String mesec = "Март";
		int godina = 2020;
		
		if (mesec == "Януари" || mesec == "Март" || mesec == "Май" || mesec == "Юли" || 
				mesec == "Август" || mesec == "Октомври" || mesec == "Декември") {
			System.out.println("31 дни");
		} else if (mesec == "Април" || mesec == "Юни" || mesec == "Септември" || mesec == "Ноември") {
			System.out.println("30 дни");
		} else {
			if (godina % 4 == 0) {
				System.out.println("29 дни");
			} else {
				System.out.println("28 дни");
			}
		}
		
		
	}

}
