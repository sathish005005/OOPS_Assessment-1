package oopsAssessment1;

public class Main {
	private static final String G = "Welcome to ";
	
	public static void main(String[] args) {
		
		Hr_Department hd = new Hr_Department();
		Tech_Department td = new Tech_Department();
		Admin_Department ad = new Admin_Department();
		Super_Department sd = new Super_Department();
		
		System.out.println(G + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();
		System.out.println(G + hd.departmentName());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		System.out.println();
		System.out.println(G + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(sd.isTodayAHoliday());
	}
	

}
