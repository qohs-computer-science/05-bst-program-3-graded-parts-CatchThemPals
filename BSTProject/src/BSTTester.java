/*
 * TODO: Sebastian Xu
 * TODO: 2/24/2025
 * TODO: 6
 * TODO: Makes a tree
 */

 import java.lang.Comparable;

 public class BSTTester {
   public static void main(String[] args) {
    BST Tree = new BST();
    
    System.out.println(Tree.isEmpty());
    Tree.add("O");
    Tree.add("R");
    Tree.add("C");
    Tree.add("H");
    Tree.add("A");
    Tree.add("R");
    Tree.add("D");
    Tree.add("Q");
    Tree.add("U");
    Tree.add("I");
    Tree.add("N");
    Tree.add("C");
    Tree.add("E");
    System.out.println(Tree.isEmpty());
    Tree.printInOrder();
    System.out.println("Inorder after deleting D");
    Tree.delete("D");
    Tree.printInOrder();
    System.out.println(Tree.find("Q"));
    System.out.println(Tree.size());

 }
 }
