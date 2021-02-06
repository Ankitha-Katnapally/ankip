import java.util.Scanner;

public abstract class ThreeStudentMarks {
	static void dispmarks(int[][] val){
		for(int i = 0;i<val.length; i++){
			for(int j=0; j<val.length; j++){
				System.out.println(val[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stud[][] = new int [2][2];
		System.out.println("enter " +stud.length+ " students info");
		for(int i = 0; i<stud.length; i++){
			System.out.println("enter "+(i+1)+"st student "+stud[i].length+" sub marks");
			for(int j = 0; j<stud.length; j++){
				stud[i][j] = sc.nextInt();
			}
		}
		dispmarks(stud);
	}

}
