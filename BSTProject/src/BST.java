import java.lang.Comparable;

public class BST implements BSTInterface
{
public BST()
  {
    TreeNode(null)
  }
  public void printPreOrder()
  {
    if(root != null)
    {
      system.out.println(root.getValue());
      printPreHelper(root.getLeft())
      printPreHelper(root.getRight())
    }
  }

Private void printPreHelper(TN parent)
  {
    if(subroot != null)
    {
      printPreHelper(parent.getLeft())
      system.out.println(parent.getValue());
      printPreHelper(parent.getRight()
    }
  }
public void printInOrder()
  {
    if(root != null)
    {
      printInHelper(root.getLeft())
      system.out.println(root.getValue());
      printInHelper(root.getRight())
    }
  }

Private void printInHelper(TN parent)
  {
    if(subroot != null)
    {
      printInHelper(parent.getLeft())
      system.out.println(parent.getValue());
      printInHelper(parent.getRight()
    }
  }

public void printInOrder()
  {
    if(root != null)
    {
      printInHelper(root.getLeft())
      system.out.println(root.getValue());
      printInHelper(root.getRight())
    }
  }

Private void printInHelper(TN parent)
  {
    if(subroot != null)
    {
      printInHelper(parent.getLeft())
      system.out.println(parent.getValue());
      printInHelper(parent.getRight()
    }
  }
}
