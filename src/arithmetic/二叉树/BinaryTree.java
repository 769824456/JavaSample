package arithmetic.二叉树;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
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

    private TreeNode root = null;

    public BinaryTree() {
        root = new TreeNode(1, "rootNode(A)");
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

    /**
     * 返回节点个数
     */
    public int size(TreeNode subTree) {
        if (subTree == null) {
            return 0;
        } else {
            return 1 + size(subTree.leftChild) + size(subTree.rightChild);
        }
    }


    /**
     * 先序遍历 递归实现
     */
    public void preOrder(TreeNode subTree) {
        if (subTree != null) {
            System.out.print(subTree.data.toString() + "\t");
            preOrder(subTree.leftChild);//递归遍历左子树
            preOrder(subTree.rightChild);//递归遍历右子树
        }
    }

    @Test
    public void testPreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        binaryTree.preOrder(binaryTree.root);
    }

    /**
     * 先序遍历 非递归实现
     */
    public void noRecPreOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();//栈的作用就是记住父节点
        TreeNode node = p;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                visited(node);//标记左子树为被访问过
                stack.push(node);
                node = node.leftChild;
            }
            while (stack.size() > 0) {
                node = stack.pop();
                node = node.rightChild;
                visited(node);//标记右子树为被访问过
            }
        }
    }

    @Test
    public void testNoRecPreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        binaryTree.noRecPreOrder(binaryTree.root);
    }


    public void visited(TreeNode subTree) {
        if (subTree != null && !subTree.isVisited) {
            subTree.isVisited = true;
            System.out.print(subTree.data.toString() + "\t");
        }
    }


    /////////////////////////////////////////////////////////////////////////////////////

    /**
     * 中序遍历 递归实现
     */
    public void inOrder(TreeNode subTree) {
        if (subTree != null) {
            inOrder(subTree.leftChild);
            System.out.print(subTree.data.toString() + "\t");
            inOrder(subTree.rightChild);
        }
    }

    @Test
    public void testInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        //inOrder
        binaryTree.inOrder(binaryTree.root);

    }

    /**
     * 中序遍历 非递归实现
     */
    public void noRecInOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = p;
        while (node != null || stack.size() > 1) {
            while (node != null) {//存在左子树
                stack.push(node);
                node = node.leftChild;
            }
            while (stack.size() > 0) {
                node = stack.pop();
                visited(node);//访问左节点和父节点
                node = node.rightChild;
                visited(node);//访问右节点
            }
        }
    }

    @Test
    public void testNoRecInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        //inOrder
        binaryTree.noRecInOrder(binaryTree.root);
    }


    /////////////////////////////////////////////////////////////////////////////////////


    /**
     * 后序遍历 递归实现
     */
    public void postOrder(TreeNode subTree) {
        if (subTree != null) {
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            System.out.print(subTree.data.toString() + "\t");
        }
    }

    /**
     * 后序遍历 非递归实现
     */
    public void noRecPostOrder(TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode lastNode = p;
        while (p != null) {
            //左子树入栈
            for (; p.leftChild != null; p = p.leftChild) {
                stack.push(p);
            }
            while (p != null && (p.rightChild == null || p.rightChild == lastNode)) {
                visited(p);
                lastNode = p;
                if (stack.empty())
                    return;
                p = stack.pop();
            }
            //处理右子树
            stack.push(p);
            p = p.rightChild;
        }
    }

    @Test
    public void testNoRecPostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
        binaryTree.noRecPostOrder(binaryTree.root);
    }


    /////////////////////////////////////////////////////////////////////////////////////


    /**
     * 层次遍历
     * 结果：A->B->C->D->E->F
     */
    public void bfs() {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        while ((node != null) || (!queue.isEmpty())) {
            if (node != null) {
                visited(node);
                queue.add(node.leftChild);
                queue.add(node.rightChild);
                node = queue.poll();
            } else {
                node = queue.poll();
            }
        }
        // A ==> A 第一层
        // C ==> B 第二层
        // D | E ==> C B 第三层
        // E | F | null ==> D
        // F | null| ==> E
        // null ==> F

    }

    /**
     * 层次遍历 并换行
     * <p>
     * 1.初始化时，last=1，把1放入队列；
     * 2.将1出队，把1的子孩子2,3放入队列，更新nlast=3；
     * 3.nlast更新完之后，打印上一次出队的1，并和last比较，如果相同就打印换行，并更新last=nlast=3;
     * 4.将2出队，把2的子孩子4放入队列，更新nlast=4;
     * 5,nlast更新完以后，打印上一次出队的2，并和last（3）比较，不相同，continue；
     * 6.将3出队，将3的子孩子5，6放入队列，更新nlast=6;
     * 7.nlast更新完以后，打印上一次出队的3，并和last（3）比较， 相同就打印换行，并更新last=nlast=6;
     * …………
     * 总结就是如下循环：（初始化last=根节点）
     * 1.将A出队，并将A的子孩子入队，更新nlast=A最后入队的子孩子；
     * 2.打印上次出队的家伙A，并和last比较， 如果相同就打印换行，并更新last=nlast，如果 不相同，则continue
     */
    public void bfsPro() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int last = root.key;
        int nlast = root.key;
        TreeNode tmp = root;
        while (tmp != null && !queue.isEmpty()) {
            visited(tmp);//标记为访问,打印输出
            //将左右孩子放入队列
            if (tmp.leftChild != null) {
                queue.add(tmp.leftChild);
            }
            if (tmp.rightChild != null) {
                queue.add(tmp.rightChild);
            }
            //更新nlast为最右边的孩子的值
            if (tmp.rightChild != null) {
                nlast = tmp.rightChild.key;
            } else if (tmp.leftChild != null) {
                nlast = tmp.leftChild.key;
            }
            //如果弹出的值和last值相同，更新last的值为nlast
            if (tmp.key == last) {
                System.out.println("");
                last = nlast;
            }
            //弹出下一个nlast
            tmp = queue.poll();
        }
    }


    @Test
    public void testBfs() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinTree(binaryTree.root);
//        binaryTree.bfs();
        binaryTree.bfsPro();
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
        TreeNode G = new TreeNode(7, "G");
        root.leftChild = B;
        root.rightChild = C;
        B.leftChild = D;
        B.rightChild = E;
        C.rightChild = F;
        F.rightChild = G;
    }
}
