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
      if(root != null)
  {
  if(old.compareTo(root.getValue()) == 0)
  {
    // 4 cases:
    // root no kids
    if(root.getLeft() == null) // Checks for left is null, then see if right is null, then if first is false and second is true, then make root right, else make root null and return true
    {
      if(root.getRight() == null) // no kids
      {
        root = null;
        return true;
      }
      else // right kid only
      {
        root = root.getRight();
        return true;
      }
    }
    else if(root.getLeft() != null)// Checks for right is null, then see if left is null, then if first is false and second is true, then make root left, else make root null and return true
    {
      if(root.getRight() == null) // left kid only
      {
        root = root.getLeft();
        return true;
      }
      else // two kids
      {
        root = root.getLeft();
        return true;
      }  
    }


    // root left kid only - root = left
    // root right kid only = root = right
    // root both kids -- replaced with left kid, and the right kid becomes the right-most kid of the new root -- while loop
  }
  // delete this one - 4 cases - left only, right only, 2 kids, no kids
    else if (old.compareTo(root.getValue() < 0)
  deleteHelper(old, root, root.getLeft())
   //          (value, parent, child)
  else
  deleteHelper(old, root, root.right())
   //          (value, parent, child)
  }
  else
  {
    return false;
  }
  }
private boolean deleteHelper(Object old, TN parent, TN child)
 // determine if child is the thing to delete
  if(child != null)
  {
  if(old.compareTo(child.getValue) == 0)
  {
    if(child.getRight() == null)
    {
      if(child.getLeft() == null)
      {
        child = null;
        return true;
      }
      else
      {
       child = child.getLeft();
      }
    }
    else if(child.getLeft() == null)
    {
      if(child.getRight() == null)
      {
        child = null;
        return true;
      }
      else
      {


      }
    }
    else
    {
     
    }
  }
  // delete this one - 8 cases
Child is a LC of parent  - left only, right only, 2 kids, no kids
  // check no kids would be
if(child.getLeft() == null && child.getRight() == null)
  // parent.setLeft(null);
  //parent.setLeft(child.getLeft());
  //parent.setLeft(child.getRight());
  //parent.setLeft
Child is a RC of parent - left only, right only, 2 kids, no kids
  // check no kids would be
if(child.getLeft() == null && child.getRight() == null)
  // parent.setRight(null);
  // parent.setRight(child.getLeft());
  // parent.setRight(child.getRight());
 
  else if object is < root
deleteHelper(old, root, root.getLeft())
   //          (value, parent, child)
    Else
deleteHelper(old, root, root.right())
   //          (value, parent, child)
  }
  else
    Return false; // not in the tree to delete
  if subroot =  value
{
  if(subroot.getLeft(subroot) != null & subroot.getRight(subroot) != null)
  {
  parent.setLeft(subroot.getleft(subroot))
 
  }
  Else if(subroot.getLeft
}
Else if subroot value is less than or equal to object
{
  printInAdder(subroot.getLeft())
}
Else if subroot value is greater than object
{
  printInAdder(subroot.getRight())
  Else
  Return false




 
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
if (subroot != null){
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
  { // Prints it in preOrder root,left,right
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
  { // print in Inorder left,root,right
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
  { // Print in Post order left,right,root
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


