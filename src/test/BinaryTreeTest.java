package test;


import main.java.binary.BinaryTree;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BinaryTreeTest {

    BinaryTree binaryTree;

    @Before
    public void setUp() {
        binaryTree= new BinaryTree();
    }

    @Test
    public void testNode(){
        var node =new BinaryTree.Node(2);
        var node1 =new BinaryTree.Node(3);
        var node2 =new BinaryTree.Node(4);

        node.right = node1;
        node.left = node2;

        binaryTree.depFirstValues(node);

        Assert.assertEquals(node1, node.right);
    }

    @After
    public void tearDown() {
        binaryTree =null;
    }
}