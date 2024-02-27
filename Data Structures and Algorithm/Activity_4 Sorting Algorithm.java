public class Main
{
    void ascending(int var[], int a, int b)
    {
        int x = b;
        int y = 2*b + 1;
        int z = 2*b + 2;
        
        if(y < a && var[y] > var[x])
        { x = y;}
        
        if(z < a && var[z] > var[x])
        { x = z;}
        
        if(x != b)
        {
            int temp = var[b];
            var[b] = var[x];
            var[x] = temp;
            
            ascending (var, a, x);
        }
    }
    void descending(int var[], int a, int b)
    {
        int x = b;
        int y = 2*b + 1;
        int z = 2*b + 2;
        
        if(y < a && var[y] < var[x])
        { x = y;}
        
        if(z < a && var[z] < var[x])
        { x = z;}
        
        if(x != b)
        {
            int temp = var[b];
            var[b] = var[x];
            var[x] = temp;
            
            descending(var, a, x);
        }
    }
    public void ascendingsort(int var[])
    {
        int size = var.length;
        for(int x = size/2-1; x >= 0; x--)
        {
            ascending(var,size,x);
        }
        for(int y = size-1; y >= 0; y--)
        {
            int z = var[0];
            var[0] = var[y];
            var[y] = z;
            
            ascending(var,y,0);
        }
    }
    public void descendingsort(int var[])
    {
        int size = var.length;
        for(int x = size/2-1; x >= 0; x--)
        {
            descending(var,size,x);
        }
        for(int y = size-1; y >= 0; y--)
        {
            int z = var[0];
            var[0] = var[y];
            var[y] = z;
            
            descending(var,y,0);
        }
    }
    static void output(int var[])
    {
        for(int out: var)
        {
            System.out.print(out + " ");
        }
    }
	public static void main(String[] args) 
	{
		int array[] = {12, 8, 2001, 1, 2, 4, 20, 14, 17};
		Main call = new Main();
		
		System.out.print("Original Order of the arrays are: ");
		output(array);
		
		call.ascendingsort(array);
		System.out.print("\nAscending Order of the arrays are: ");
		output(array);
		
	    call.descendingsort(array);
		System.out.print("\nDescending Order of the arrays are: ");
		output(array);
	}
}