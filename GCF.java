
public class GCF {
	public static void main(String args[]) {
		int[] arr =  new int [] {10,15,20,25};
		int n = -1;
		int ans = greatest(arr,n);
		System.out.println(ans);
	}
	public static int greatest(int[] arr, int n) {
		n++;
		if(arr[n]%arr[n+1]==arr[n+1]%arr[n+2]){
			if(arr[n+1]%arr[n+2]==arr[n+2]%arr[n+2]) {
				return (arr[n+1]%arr[n+2]);
			}
			return 0;
		}
		return 0;
	}
}
