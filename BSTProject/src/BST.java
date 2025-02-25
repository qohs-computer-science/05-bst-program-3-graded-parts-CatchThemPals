import java.lang.Comparable;

public class BST implements BSTInterface
{
  public BST()
  {
    root = null;
  }
  
  public void add(Object newVal)
  {
  	if(root != null)
	  {
		  if(newVal.Comparable(root.getValue() <= 0))
      {
        printInAdder(root.getLeft());
      }
		  else
        {
		    printInAdder(root.getRight());
        }
    }
  }
	private void printInAdder(Object newVal,TreeNode subroot){
	if (subroot != null)
	{
		if(newVal.CompareTo(subroot.getValue()) <= 0)
		{
			PrintInHelper(subroot.getLeft());
		}
		else
		{
			PrintInHelper(subroot.getRight());
		}
		
  }
  else
  {
  if(newVal.CompareTo(subroot.getValue()) <= 0)
  {
  subroot.setLeft(new TreeNode(newVal,null,null));
  )
  }
  else
  {
  TreeNode(newVal.getValue(), null, TreeNode );
  }
  }
}

  public void printPreOrder()
  {
    if(root != null)
    {
      System.out.println(root.getValue());
      printPreHelper(root.getLeft());
      printPreHelper(root.getRight());
    }
  }

private void printPreHelper(TreeNode subroot)
  {
    if(subroot != null)
    {
      System.out.println(subroot.getValue());
      printPreHelper(subroot.getLeft());
      printPreHelper(subroot.getRight());
    }
  }
public void printInOrder()
  {
    if(root != null)
    {
      printInHelper(root.getLeft());
      System.out.println(root.getValue());
      printInHelper(root.getRight());
    }
  }

private void printInHelper(TreeNode subroot)
  {
    if(subroot != null)
    {
      printInHelper(subroot.getLeft());
      System.out.println(subroot.getValue());
      printInHelper(subroot.getRight());
    }
  }

public void printPostOrder()
  {
    if(root != null)
    {
      printPostHelper(root.getLeft());
      printPostHelper(root.getRight());
      System.out.println(root.getValue());
    }
  }

private void printPostHelper(TN subroot)
  {
    if(subroot != null)
    {
      printPostHelper(subroot.getLeft());
      printPostHelper(subroot.getRight());
      System.out.println(subroot.getValue());
    }
  }
}
