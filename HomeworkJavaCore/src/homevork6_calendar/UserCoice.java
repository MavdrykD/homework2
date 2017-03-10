package homevork6_calendar;

import java.util.Scanner;

public class UserCoice {
	
	
	public static void userChoice(){
		System.out.println("натисни 1 дл€ перев≥рки м≥с€ц€ в на€вност≥");
		System.out.println("натисни 2 дл€ виведенн€ вс≥х м≥с€ц≥в з такою порою року");
		System.out.println("натисни 3 дл€ виведенн€ вс≥х м≥с€ц≥в з такою к≥льк≥стю дн≥в");
		System.out.println("натисни 4 дл€ виведенн€ вс≥х м≥с€ц≥в з меншою к≥льк≥стю дн≥в");
		System.out.println("натисни 5 дл€ виведенн€ вс≥х м≥с€ц≥в з б≥льшою к≥льк≥стю дн≥в");
		System.out.println("натисни 6 дл€ виведенн€ на екран наступноњ пори року");
		System.out.println("натисни 7 дл€ виведенн€ на екран попередню пори року");
		System.out.println("натисни 8 дл€ виведенн€ на екран м≥с€ц≥ з парною к≥льк≥стю дн≥в");
		System.out.println("натисни 9 дл€ виведенн€ на екран м≥с€ц≥ з непарною к≥льк≥стю дн≥в");
		System.out.println("натисни 10 дл€ перев≥рки чи введений м≥с€ць маЇ парну к≥льк≥сть дн≥в");
		System.out.println("натисни будь €ке ≥нше число дл€ виходу з програми");
	}
	
	public static void firstTestConditions(){
		Month[] months = Month.values();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");

		String nameMonth = scanner.next();
		boolean exit = false;
		for (int i = 0; i < months.length; i++) {	
			if (nameMonth.equalsIgnoreCase(months[i].name())) {
				System.out.println("в роц≥ Ї " + nameMonth);
				exit = true;
			}
		}
		System.out.println();
		if (exit == false) {
		System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
		}
	}
		
		
		public static void socondTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
				}
		}
		
		public static void thirdTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("м≥с€ц≥в з такою к≥льк≥стю дн≥в б≥льше немаЇ");
			}
			if (exit == false) {
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
				}
		}
		
		public static void fourthTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("м≥с€ц≥в з меншою к≥льк≥стю дн≥в немаЇ");
			}
			if (exit == false) {
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
				}
		}
			
		public static void fifthTestConditions(){
			Month[] months = Month.values();
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("м≥с€ц≥в з б≥льшою к≥льк≥стю дн≥в немаЇ");
			}
			if (exit == false) {
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
				}
		}
		
		public static void sixthTestConditions(){
			Month[] months = Month.values();
			Season[] seasons = Season.values();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("наступна пора року " + seasons[nextSeason]);
			}else{
				nextSeason = 0;
				System.out.println("наступна пора року " + seasons[nextSeason]);
			}
			if (exit == false) {
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
				}
		}
		
		
		public static void seventhTestConditions(){
			Month[] months = Month.values();
			Season[] seasons = Season.values();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");
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
				System.out.println("попередн€ пора року " + seasons[previousSeason]);
				
			}else{
				previousSeason = seasons.length -1;
				System.out.println("попередн€ пора року " + seasons[previousSeason]);
			}
			if (exit == false) {
				System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
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
			
			System.out.println("введ≥ть назву м≥с€ц€ €кий бажаЇте перев≥рити");

			String nameMonth = scanner.next();
			boolean exit = false;
			for (int i = 0; i < months.length; i++) {	
				if (nameMonth.equalsIgnoreCase(months[i].name())) {
					if ((months[i].getDays() % 2) == 0){
						System.out.println(months[i] + " маЇ парну к≥льк≥сть дн≥в");
					}else{
						System.out.println(months[i] + " маЇ непарну к≥льк≥сть дн≥в");
					}
					exit = true;
				}
			}
			System.out.println();
			if (exit == false) {
			System.out.println("м≥с€ц€ " + nameMonth + " немаЇ в роц≥");
			}
		}
		
		
}
