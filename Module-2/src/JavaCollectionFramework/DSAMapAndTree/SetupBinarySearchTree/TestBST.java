package JavaCollectionFramework.DSAMapAndTree.SetupBinarySearchTree;

import javax.sound.midi.Soundbank;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Phuoc");
        tree.insert("Dat");
        tree.insert("Chuong");
        tree.insert("Loc");
        tree.insert("Nhi");
        tree.insert("Binh");
        tree.insert("Ouang");
        tree.insert("Son");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: "+tree.getSize());
    }
}
