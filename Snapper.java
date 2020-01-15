
import java.util.*;
import java.io.*;
public class Snapper{
	Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int n;	
	int k;
		public static void main (String args[]) {
			Snapper lefant = new Snapper();
			lefant.logicks();
		}
		
		public void logicks() {
			int t = this.scanner.nextInt();
			String Ans = ONOFF();
			for (int i=0;i<t;i++) {
				ScanLine();
				Ans = ONOFF();
				System.out.println("Case #"+(i+1)+": "+Ans);
			}	
		} 	

		private void ScanLine() {
			this.n = scanner.nextInt();
			this.k = scanner.nextInt();
		}
		private String ONOFF(){
			k++;
			if((k%(Math.pow(2,n)))==0){
				return("On");
			}
			else {
				return ("Off");
			}
		}
    }