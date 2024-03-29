import java.util.concurrent.atomic.AtomicBoolean;
 
class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) 
    {this.data = data;}
}
 
class Main
{
    static AtomicBoolean isBalanced = new AtomicBoolean(true);
    
    public static int isHeightBalanced(Node root, AtomicBoolean isBalance)
    {
        while (root == null || !isBalanced.get() ) 
            { return 0;}
            
        int left_height = isHeightBalanced(root.right, isBalanced);
        int right_height = isHeightBalanced(root. left, isBalanced);
        
        if (Math.abs(left_height - right_height) > 1) 
            {isBalanced.set(false);}

        return Math.max(left_height, right_height) + 1;
    }
    public static boolean isHeightBalanced(Node root)
    {
        isHeightBalanced(root, isBalanced);
        return isBalanced.get();
    }
 
    public static void main(String[] a)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
 
        if (isHeightBalanced(root)) 
        {System.out.println("Binary tree is balanced");}
        else 
        {System.out.println("Binary tree is not balanced");}
    }
}