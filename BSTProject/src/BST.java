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
    if(root != null)
    { if(toFind.compareTo(root.getValue()) == 0)
      {
        return true;
      }
      findHelper(root.getLeft());
      findHelper(root.getRight());
      
    }
    else
    {
      return false;
    }
  }
  private boolean findHelper(TreeNode subroot)
  {
    if(subroot != null)
    {
      printInHelper(subroot.getLeft());
      printInHelper(subroot.getRight());
    }
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
          if(root.getLeft() == null)
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
          else if(root.getLeft() != null)
          {
            if(root.getRight() == null) // left kid only
            {
              root = root.getLeft();
              return true;
            }
            else // two kids
            {
              TreeNode temp =  root.getLeft();
              while(temp.getRight() != null)
              {
                temp = temp.getRight();
              }
              temp.setRight(root.getRight());
              root = temp;
              return true;
            }  
          }
        }
      // delete this one - 4 cases - left only, right only, 2 kids, no kids
      else if (old.compareTo(root.getValue()) < 0){
        return deleteHelper(old, root, root.getLeft());}
      //          value, parent, child
      else{
        return deleteHelper(old, root, root.getRight());
      //          (value, parent, child)
      }
    } // end of root != null
    else
      {
        return false;
      }
  } // end of  delete
private boolean deleteHelper(Comparable old, TreeNode parent, TreeNode child)
{
  // determine if child is the thing to delete
    if(child != null)
    {
      if(old.compareTo(child.getValue()) == 0)
      {
        if(child.getRight() == null)
        {
          if(child.getLeft() == null) // no kid
          {
            if (parent.getLeft() == child)
              parent.setLeft(null);
            else
              parent.setRight(null);
            return true;
          }
          else // left kid
          {
            if (parent.getLeft() == child)
              parent.setLeft(child.getLeft());
            else
              parent.setRight(child.getLeft());
            return true;
          }
        }
        else 
        {
          if(child.getRight() != null && child.getLeft() == null) // only right kid 
            {
              if (parent.getLeft() == child)
                parent.setLeft(child.getRight());
              else
                parent.setRight(child.getRight());
              return true;
            }
          else // two kids
            {
              TreeNode temp= child.getLeft(); // pput the right child on the bottom of the left child
              while(temp.getRight() != null)
              {
                temp = temp.getRight();
              }
              temp.setRight(child.getRight());
              child = temp;
              return true;
            }
           }
        }
      }
      else if (old.compareTo(child.getValue()) < 0){
        return deleteHelper(old, parent, child.getLeft());
      }//          (value, parent, child)
      else{
        return deleteHelper(old, parent, child.getRight());
      } // end else
    } // end child != null
    else{
      return false;
    }
  } // end of deleteHelper
 
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


