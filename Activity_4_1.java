public class Activity_4_1 
{
    
    public static void Print()
    {
        Laboratory_4 granada = new Laboratory_4();
        
        for(int x = 0; x <4 ; x++)
        {
            System.out.println(granada.data[x] + granada.david[x]);
        }
        int b = 5, c = 4;
        for(int a = 0; a <2 ; a++)
        {
            System.out.println(granada.data[4] + granada.sherom[a] + granada.unit[a]);
            System.out.println(granada.data[b] + granada.david[c]);b++;c++;
        }
    }
    public static void main(String[] args) 
    {
        Print();
    }
}
