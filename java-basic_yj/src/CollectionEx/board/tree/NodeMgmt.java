package CollectionEx.board.tree;
public class NodeMgmt {
  Node head = null;

  public class Node{
    Node left;
    Node right;
    int value;

    //constructor
    public Node(int data){
      this.value = data;
      this.left = null;
      this.right = null;
    }
  }

  public boolean insertNode(int data) {
    //case1: Node가 하나도 없을때
    if (this.head == null) {
      this.head = new Node(data);
    } else {
      //case2: node 1개 이상 들어가 있을 때
      Node findNode = this.head;
      while (true) {
        //case2-1: node의 왼쪽 node가 들어가야 할 때
        if (data < findNode.value) {
          if (findNode.left != null) {
            findNode = findNode.left;
          } else {
            findNode.left = new Node(data);
            break;
          }
        } else {//case2-2: node의 오른쪽에 noder가 들어가야 할 때
          if (findNode.right != null) {
            findNode = findNode.right;
          } else {
            findNode.right = new Node(data);
            break;
          }
        }
      }
    }
    return true;
  }
  }

