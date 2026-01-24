import java.util.*;
 class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
           
        }
    }
public class queueintree{

    static void levelorder(TreeNode root){
        if(root==null)
        return;
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        TreeNode current=q.poll();
        System.out.println(current.data);
        if(current.left!=null){
            q.add(current.left);
        }
        if(current.right!=null){
            q.add(current.right);
        }

    }
}
    public static void main(String[]args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        System.out.print("level order");
        levelorder(root);
    }
    

}
