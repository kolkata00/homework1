package homework.zad3;

public class Main {

	public static void main(String[] args) {
		int etaji = 9;
		
		while(etaji >= 0) {
			switch(etaji) {
			case 8 :
				System.out.println("Здравей Мими");
				break;
			case 7 :
				System.out.println("Здравей Веси");
				break;
			case 6 :
				System.out.println("Здравей Ваня");
				break;
			case 5 :
				System.out.println("Здравей Гергана");
				break;
			case 4 :
				System.out.println("Здравей Анелия");
				break;
			case 3 :
				System.out.println("Здравей Пламена");
				break;
			case 2 :
				System.out.println("Здравей Зори");
				break;
			case 1 :
				System.out.println("Здравей Силвия");
				break;
			}
			etaji--;
		}
		
		System.out.println("АУЧ");
	}

}
