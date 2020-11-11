import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int maze[][] = new int[n][n];
		maze[0][0] = arr[0][0];
		for(int i=1;i<n;i++)
		{
		    maze[0][i] = max(maze[0][i-1],arr[0][i]);
		}
		for(int j=1;j<n;j++)
		{
		    maze[j][0] = max(maze[j-1][0],arr[j][0]);
		}
		for(int i = 1;i<n;i++)
		{
		    for(int j=1;j<n;j++)
		    {
		        maze[i][j] = max(arr[i][j],min(maze[i-1][j],maze[i][j-1]));
		    }
		}
		System.out.println(maze[n-1][n-1]);
	}
	public static int max(int a,int b)
	{
	    return (a>b)?a:b;
	}
	public static int min(int a,int b)
	{
	    return (a<b)?a:b;
	}
}
