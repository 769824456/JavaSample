package arithmetic.二叉树;

public class TreeNode {
    public int key = 0;
    public String data = null;
    public boolean isVisited = false;//是否被访问
    public TreeNode leftChild = null;//右子树
    public TreeNode rightChild = null;//左子树

    public TreeNode(int key, String data) {
        this.key = key;
        this.data = data;
    }
}
