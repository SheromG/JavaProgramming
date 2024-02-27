import java.util.*;

public class Main
{
    public static void BFSTraversal(int[][] var)
    {
        boolean[] x = new boolean[var.length];
        BFSTraversal(var,x,0);
    }
    public static void BFSTraversal(int[][] var, boolean[] x, int a)
    {
        if (a >= var.length)
        {return;}
        Queue<Integer> queue = new LinkedList<>();
        if(!x[a])
        {
            x[a] = true;
            queue.add(a);
            for(int i = 0; i < var.length; i++)
            {
                x[i] = true;
                queue.add(i);
            }
        }
        while(!queue.isEmpty())
        {
            int element = queue.poll();
            System.out.print(element + " ");
        }
        BFSTraversal(var, x, a+1);
    }
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.print("Input the number of Vertices: ");
	    int vertices = input.nextInt();
	    System.out.print("Input the number of Edges: ");
	    int edges = input.nextInt();
	    
	    int[][] var = new int[vertices][vertices];
	    
	    for(int j = 0; j < edges; j++)
	    {
            System.out.print("Row["+ j + "]\t : ");
	        int parameter1 = input.nextInt();
	        System.out.print("Column["+ j + "]: ");
	        int parameter2 = input.nextInt();
	        var[parameter1][parameter2] = 1;
	    }
	    for(int[] print: var)
	    {
	        System.out.println(Arrays.toString(print));
	    }
	    BFSTraversal(var);
	}
}