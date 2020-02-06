import java.io.*;
import java.util.*;
public class Jamcode {
	
	Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int Lines;
	int Numbers;
	int Tleft;
	int arr[];
	int diff[];
	int GCF
	
	
	public static void main (String args []) {
		Jamcode jamcode = new Jamcode(); //move to loop
			jamcode.logicks();
	}
	public void logicks() {
		Lines = scanner.nextInt();
			for(int m=1,m<=Lines, m++){
				LineInternal();
				System.out.println("Case # "+m+);
				diff[];
				arr[];
				gcfofdiff;
			}
	} 
	
	public void LineInternal() {
		Numbers = scanner.nextInt();
			for (int i = 0; i<Numbers; i++) {
				arr[i]=scanner.nextInt();
			}
		FindDifferences();
		FindGCFofDiff();
		FindDist();
		}

		public void FindDifferences() {
			for (int i:arr) {
				if(i<(arr.length-1)){
					diff[i] = arr[i+1] - arr[i];
 				}
				else(){
					break;
				}
			}
		}
		
		public void FindGCFofDiff(){
			if()
		}
		
		public void FindDist() {
			for (int i:arr) {
				arr[i]++;
			}
				if(){
					
				}
				else {
				
				}
		}
	
		
		
		
		
		
		
		
		
}
