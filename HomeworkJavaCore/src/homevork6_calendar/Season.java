package homevork6_calendar;

public enum Season {
	WINTER(Month.JUNUARY, Month.FEBRYARY, Month.DECEMBER), SPRING(Month.APRIL, Month.MAY, Month.MARCH),
	SUMMER(Month.JUNE, Month.JULY, Month.AUGUST), AUTUMN(Month.SEPTEMBER, Month.OCTOUBER, Month.NOVEMBER);
	
	private Month month;

	private Season(Month month1, Month month2, Month month3) {
		this.month = month;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}
	
	
}
