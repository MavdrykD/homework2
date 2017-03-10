package homevork6_calendar;

import java.util.Scanner;

public class UserCoice {
	
	
	public static void userChoice(){
		System.out.println("������� 1 ��� �������� ����� � ��������");
		System.out.println("������� 2 ��� ��������� ��� ������ � ����� ����� ����");
		System.out.println("������� 3 ��� ��������� ��� ������ � ����� ������� ���");
		System.out.println("������� 4 ��� ��������� ��� ������ � ������ ������� ���");
		System.out.println("������� 5 ��� ��������� ��� ������ � ������ ������� ���");
		System.out.println("������� 6 ��� ��������� �� ����� �������� ���� ����");
		System.out.println("������� 7 ��� ��������� �� ����� ��������� ���� ����");
		System.out.println("������� 8 ��� ��������� �� ����� ����� � ������ ������� ���");
		System.out.println("������� 9 ��� ��������� �� ����� ����� � �������� ������� ���");
		System.out.println("������� 10 ��� �������� �� �������� ����� �� ����� ������� ���");
		System.out.println("������� ���� ��� ���� ����� ��� ������ � ��������");
	}
	
	public static void firstTestConditions(){
		Month[] months = Month.values();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ����� ����� ���� ������ ���������");

		String nameMonth = scanner.next();
		boolean exit = false;
		for (int i = 0; i < months.length; i++) {	
			if (nameMonth.equalsIgnoreCase(months[i].name())) {
				System.out.println("� ���� � " + nameMonth);
				exit = true;
			}
		}
		System.out.println();
		if (exit == false) {
		System.out.println("����� " + nameMonth + " ���� � ����");
		}
	}
		
		
		public static void socondTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			Month thisMonth;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					thisMonth = months[i];
					for (int j = 0; j < months.length; j++) {
						if(months[j].getSeason().equals(thisMonth.getSeason())){
							System.out.println(months[j]);
						}
					}
					System.out.println();
					exit = true;
				}
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
		
		public static void thirdTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			int ifNoWordJoy = 0;
			Month day;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					day = months[i];
					for (int j = 0; j < months.length; j++) {
						if(months[j].getDays() == day.getDays()){
							System.out.println(months[j]);
							ifNoWordJoy++;
						}
					}
					System.out.println();
					exit = true;
				}
			}
			if( ifNoWordJoy == 1){
				System.out.println("������ � ����� ������� ��� ����� ����");
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
		
		public static void fourthTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			int ifNoWordJoy = 0;
			Month day;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					day = months[i];
					for (int j = 0; j < months.length; j++) {
						if(months[j].getDays() < day.getDays()){
							System.out.println(months[j]);
							ifNoWordJoy++;
						}
					}
					System.out.println();
					exit = true;
				}
			}
			if(ifNoWordJoy == 0){
				System.out.println("������ � ������ ������� ��� ����");
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
			
		public static void fifthTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			int ifNoWordJoy = 0;
			Month day;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					day = months[i];
					for (int j = 0; j < months.length; j++) {
						if(months[j].getDays() > day.getDays()){
							System.out.println(months[j]);
							ifNoWordJoy++;
						}
					}
					System.out.println();
					exit = true;
				}
			}
			if(ifNoWordJoy == 0){
				System.out.println("������ � ������ ������� ��� ����");
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
		
		public static void sixthTestConditions(){
			Month[] months = Month.values();
			Season[] seasons = Season.values();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			int nextSeason = 0;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					nextSeason = months[i].getSeason().ordinal();
					exit = true;
					break;
				}
			}
			
			if(nextSeason < seasons.length -1){
				nextSeason = nextSeason + 1;
				System.out.println("�������� ���� ���� " + seasons[nextSeason]);
			}else{
				nextSeason = 0;
				System.out.println("�������� ���� ���� " + seasons[nextSeason]);
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
		
		
		public static void seventhTestConditions(){
			Month[] months = Month.values();
			Season[] seasons = Season.values();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ ����� ����� ���� ������ ���������");
			String nameMonth = scanner.next();
			boolean exit = false;
			int previousSeason = 0;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					previousSeason = months[i].getSeason().ordinal();
					exit = true;
					break;
				}
			}
			
			if(previousSeason > 0){
				--previousSeason;
				System.out.println("��������� ���� ���� " + seasons[previousSeason]);
				
			}else{
				previousSeason = seasons.length -1;
				System.out.println("��������� ���� ���� " + seasons[previousSeason]);
			}
			if (exit == false) {
				System.out.println("����� " + nameMonth + " ���� � ����");
				}
		}
		public static void eighthTestConditions(){
			Month[] months = Month.values();
			for (int i = 0; i < months.length; i++){	
				if ((months[i].getDays() % 2) == 0){
					System.out.println(months[i]);
				}
			}
		}
		
		public static void ninthTestConditions(){
			Month[] months = Month.values();
			for (int i = 0; i < months.length; i++){	
				if ((months[i].getDays() % 2) != 0){
					System.out.println(months[i]);
				}
			}
		}
	
		public static void tenthTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("������ ����� ����� ���� ������ ���������");

			String nameMonth = scanner.next();
			boolean exit = false;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					if ((months[i].getDays() % 2) == 0){
						System.out.println(months[i] + " �� ����� ������� ���");
					}else{
						System.out.println(months[i] + " �� ������� ������� ���");
					}
					exit = true;
				}
			}
			System.out.println();
			if (exit == false) {
			System.out.println("����� " + nameMonth + " ���� � ����");
			}
		}
		
		
}
