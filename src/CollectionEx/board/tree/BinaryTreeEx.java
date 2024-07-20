package CollectionEx.board.tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt myTree = new NodeMgmt();
    myTree.insertNode(2);
    myTree.insertNode(3);
    myTree.insertNode(4);
    myTree.insertNode(5);

    System.out.println("HEAD : " + myTree.head.value);
    System.out.println("HEAD : " + myTree.head.left.value);
    System.out.println("HEAD : " + myTree.head.right.right.value);
  }

}
