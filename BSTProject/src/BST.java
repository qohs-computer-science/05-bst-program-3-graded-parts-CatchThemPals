import java.lang.Comparable;

public class BST implements BSTInterface
{
  public BST()
  {
    TreeNode = null
  }
  
public void add(newVal)
{
  	if(root != null)
	  {
		if(newVal.Comparable(root.getValue()))
		printInAdder(root.getLeft())
		Else object is more than root
		printInAdder(root.getRight())		
    } 
	
	Private void printInAdder(TN subroot)
	if (subroot! = null)
	{
		if object is less than the child
		{
			PrintInHelper(subroot.getLeft())
		}
		Else
		{
			PrintInHelper(subroot.getRight())
		}
		
  }
  Else
  {
  If object is less than child
  {
  TN(Object.getValue, Tn left, null)
  }
  Else
  {
  TN(Object.getValue, null, Tn right)
  }
  }

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

Private void printPreHelper(TreeNode subroot)
  {
    if(subroot != null)
    {
      system.out.println(subroot.getValue());
      printPreHelper(subroot.getLeft())
      printPreHelper(subroot.getRight())
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

Private void printInHelper(TreeNode subroot))
  {
    if(subroot != null)
    {
      printInHelper(subroot.getLeft())
      system.out.println(subroot.getValue());
      printInHelper(subroot.getRight()
    }
  }

public void printPostOrder()
  {
    if(root != null)
    {
      printPostHelper(root.getLeft())
      printPostHelper(root.getRight())
      system.out.println(root.getValue());
    }
  }

Private void printPostHelper(TN subroot)
  {
    if(subroot != null)
    {
      printPostHelper(subroot.getLeft())
      printPostHelper(subroot.getRight()
      system.out.println(subroot.getValue());
    }
  }
}
