package arithmetic.二叉树;

import org.junit.Test;

import java.util.Stack;

/**
 * PACKAGE_NAME: arithmetic.二叉树
 * USER : yulongsun
 * DATE : 2016/6/17
 * VERSION : 1.0
 * DESC : 二叉树
 * http://blog.csdn.net/wuwenxiang91322/article/details/12231657
 */
public class BinaryTree {

////    //节点个数
////    int count() {
////        return
////    }
////
////    //高度
////    int height();
//
//    //先序遍历
//    public void preOrder(Node<T> node) {
//        if (node != null) {
//            System.out.println(node.data.toString() + "\t");
//            preOrder(node.leftNode);
//            preOrder(node.rightNode);
//        }
//    }
//
//
//    //中序遍历
//    public void inOrder(Node<T> node) {
//        if (node != null) {
//            inOrder(node.leftNode);
//            System.out.println(node.data.toString() + "\t");
//            inOrder(node.rightNode);
//        }
//    }
//
//    //后序遍历
//    public void postOrder(Node<T> node) {
//
//    }
//
//    //层次遍历
//    public void levelOrder(Node<T> node) {
//
//    }

    private class TreeNode {
        private int key = 0;
        private String data = null;
        private boolean isVisted = false;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;

        public TreeNode() {
        }

        public TreeNode(int key, String data) {
            this.key = key;
            this.data = data;
        }
    }


    private TreeNode root = null;

    public BinaryTree() {
        root = new TreeNode(1, "rootNode(A)");
    }

    /**
     * 创建一棵二叉树
     * A
     * B          C
     * D     E            F
     */
    /*创建一颗二叉树*/
    public void createBinTree(TreeNode root) {
        TreeNode B = new TreeNode(2, "B");
        TreeNode C = new TreeNode(3, "C");
        TreeNode D = new TreeNode(4, "D");
        TreeNode E = new TreeNode(5, "E");
        TreeNode F = new TreeNode(6, "F");
        root.leftChild = B;
        root.rightChild = C;
        B.leftChild = D;
        B.rightChild = E;
        C.rightChild = F;
    }

    /**
     * A 2,2 return 3
     * B 1,1 return 2
     * D 0,0 return 1
     * <p>
     * C 0,1 reutn 2
     * F 0,0 return 1
     */
    /*返回树的高度*/
    private int height(TreeNode subTree) {
        if (subTree == null) {
            return 0;//递归结束。空树高度为0
        } else {
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height() {
        return height(root);
    }

    public int size() {
        return size(root);
    }

    /*返回节点个数*/
    public int size(TreeNode subTree) {
        if (subTree == null) {
            return 0;
        } else {
            return 1 + size(subTree.leftChild) + size(subTree.rightChild);
        }
    }


    /*先序遍历 递归实现*/
    public void preOrder(TreeNode subTree) {
        if (subTree != null) {
            System.out.print(subTree.data.toString() + "\t");
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    @Test
    public void testPreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        binaryTree.preOrder(binaryTree.root);
    }

    /*中序遍历*/
    public void inOrder(TreeNode subTree) {
        if (subTree != null) {
            inOrder(subTree.leftChild);
            System.out.print(subTree.data.toString() + "\t");
            inOrder(subTree.rightChild);
        }
    }

    /*后序遍历*/
    public void postOrder(TreeNode subTree) {
        if (subTree != null) {
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            System.out.print(subTree.data.toString() + "\t");
        }
    }

    /*先序遍历 非递归实现*/
    public void noRecPreOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = p;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                visited(node);
                stack.push(node);
                node = node.leftChild;
            }
            while (stack.size() > 0) {
                node = stack.pop();
                node = node.rightChild;
            }
        }
    }


    public void visited(TreeNode subTree) {
        subTree.isVisted = true;
    }

    //// TODO: 2016/6/22 未实现完
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        //size
        int size = binaryTree.size();
        System.out.println("size=" + size);
        //height
        int height = binaryTree.height();
        System.out.println("height=" + height);
        //preOrder
        binaryTree.preOrder(binaryTree.root);
        //inOrder
        binaryTree.inOrder(binaryTree.root);
        //postOrder
        binaryTree.postOrder(binaryTree.root);
        //noRecPreOrder
        binaryTree.noRecPreOrder(binaryTree.root);
    }

}
