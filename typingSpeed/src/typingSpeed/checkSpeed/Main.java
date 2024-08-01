package typingSpeed.checkSpeed;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String sentence="I fell head over heals with the little goat lady";
		System.out.println("Type the following sentence:");
		System.out.println(sentence);
		
		
		
		Scanner sc=new Scanner(System.in);
		long startTime= System.currentTimeMillis();
		String userEnter=sc.nextLine();
		
		long endTime=System.currentTimeMillis();
		long time=(endTime-startTime)/1000;
		
		String[] sch=sentence.split(" ");
		String[] uch=userEnter.split(" ");
		
		int correctCount=0;
		int wrongCount=0;
		
		for(int i=0;i<Math.min(sch.length, uch.length);i++) {
			if(sch[i].equals(uch[i])) {
				correctCount++;
			}
			else {
				wrongCount++;
			}	
		}
		wrongCount+=Math.max(0, sch.length-uch.length);
		
		double typespeed=(correctCount/(double)time)*60;
		
		System.out.println("Time taken: "+time+" sec");
		System.out.println("Words Typed Correctly: "+correctCount);
		System.out.println("Words incorrectly types: "+wrongCount);
		System.out.println("Type speed: "+typespeed);
		
		

	}

}
