package homework.zad2;

public class Main {

	public static void main(String[] args) {
		String mesec = "����";
		int godina = 2020;
		
		if (mesec == "������" || mesec == "����" || mesec == "���" || mesec == "���" || 
				mesec == "������" || mesec == "��������" || mesec == "��������") {
			System.out.println("31 ���");
		} else if (mesec == "�����" || mesec == "���" || mesec == "���������" || mesec == "�������") {
			System.out.println("30 ���");
		} else {
			if (godina % 4 == 0) {
				System.out.println("29 ���");
			} else {
				System.out.println("28 ���");
			}
		}
		
		
	}

}
