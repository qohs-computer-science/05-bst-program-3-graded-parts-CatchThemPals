import java.lang.Comparable;

public class BST implements BSTInterface
{

  private TreeNode root;
  public BST()
  {
    root = null;
  }
  public int size()
  {
    return 0;
  }
  public boolean isEmpty()
  {
    if(root != null)
    {
      return false;
    }
    else
    {
      return true;
    }  
  }
  public boolean find(Comparable toFind)
  {
    return false;
  }
  public boolean replace(Comparable old, Comparable toAdd)
  {
    return false;
  }
  public boolean delete(Comparable old)
  {
    return false;
  }

  
  public void add(Comparable newVal)
  {
  	if(root != null)
	  {
		  if(newVal.compareTo(root.getValue()) <= 0)
      {
        addHelper(newVal, root.getLeft(),root);
      }
		  else
        {
		    addHelper(newVal, root.getRight(),root);
        }
    }
    else
    {
      
      root = new TreeNode(newVal,null,null);
      
    }
  }
	private void addHelper(Comparable newVal,TreeNode subroot,TreeNode parent){
	if (subroot != null)
	{
		if(newVal.compareTo(subroot.getValue()) <= 0)
		{
			addHelper(newVal, subroot.getLeft(),subroot);
		}
		else
		{
			addHelper(newVal, subroot.getRight(),subroot);
		}
		
  }
  else
  {
  if(newVal.compareTo(parent.getValue()) <= 0)
  {
  parent.setLeft(new TreeNode(newVal,null,null));
  
  }
  else
  {
  parent.setRight(new TreeNode(newVal,null,null));
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

private void printPostHelper(TreeNode subroot)
  {
    if(subroot != null)
    {
      printPostHelper(subroot.getLeft());
      printPostHelper(subroot.getRight());
      System.out.println(subroot.getValue());
    }
  }
}
