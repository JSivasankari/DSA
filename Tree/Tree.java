public class Tree {

    class TreeNode {
        int data;
        TreeNode leftchild;
        TreeNode rightchild;

        TreeNode(int data) {
            this.data = data;
           
        }
    }

    TreeNode root;

    
    Tree() {
        root = new TreeNode(1);     
        root.leftchild = new TreeNode(2);   
        root.rightchild = new TreeNode(3);  
        
    }

    void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.leftchild);
        System.out.print(node.data);
        inorder(node.rightchild);

    }
    void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.data);
        preorder(node.leftchild);
        preorder(node.rightchild);
    }
     void postorder(TreeNode node){
        if(node==null){
            return;
        }
        
        postorder(node.leftchild);
        postorder(node.rightchild);
        System.out.print(node.data);
    }


    public static void main(String[] args) {
        Tree t = new Tree(); 
        System.out.println("Inorder:");
        t.inorder(t.root);
     System.out.println("preorder:");
        t.preorder(t.root);
        System.out.println("postorder:");
        t.postorder(t.root);


    }
}
