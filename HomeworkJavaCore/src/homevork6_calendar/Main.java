package homevork6_calendar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean exitTheProg = false;
		while(exitTheProg == false){
			UserCoice.userChoice();
			while(!scanner.hasNextInt()){
				System.out.println("������ ���� �����");
				scanner.next();
			}//check correct user choice
		
		int userSelection = scanner.nextInt();
		switch (userSelection) {
		case 1:{
			UserCoice.firstTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 2:{
			UserCoice.socondTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 3:{
			UserCoice.thirdTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 4:{
			UserCoice.fourthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 5:{
			UserCoice.fifthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 6:{
			UserCoice.sixthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 7:{
			UserCoice.seventhTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 8:{
			UserCoice.eighthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 9:{
			UserCoice.ninthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		case 10:{
			UserCoice.tenthTestConditions();
			System.out.println("�� �� ����� ������� ���?: ");
			break;
		}
		
		default:{
			exitTheProg = true;
			break;
		}
		}
		}//end of cycle;
		System.out.println("�����������:)");

	}

}
