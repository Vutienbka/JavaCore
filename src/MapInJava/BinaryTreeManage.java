package MapInJava;

public class BinaryTreeManage {
    TreeNode<Integer> root;
    public void initialTree(){
        //BinaryTree<Integer> root = new BinaryTree(60);
        root = new TreeNode<>(60);
        root.right = new TreeNode<>(70);
        root.left = new TreeNode<>(55);
        root.left.right = new TreeNode<>(57);
    }

    public void addTree(Integer element) {
        TreeNode<Integer> current;
        current = root;
        if (current == null) {
            root = new TreeNode(element);
        } else {
            while (current != null) {
                if (current.getElement() < element) {
                    if (current.right == null) {
                        current.right = new TreeNode<>(element);
                        System.out.println("ADD thanh cong");
                        break;
                    } else current = current.right;

                } else if (current.getElement() > element) {
                    if (current.left == null) {
                        current.left = new TreeNode<>(element);
                        System.out.println("ADD thanh cong");
                        break;
                    } else current = current.left;
                }
            }
        }
    }

    public boolean searchTree(Integer element) {
        TreeNode<Integer> current;
        current=root;
        boolean flag = true;
        System.out.println("Root");
        while (current != null) {
            if (element < current.getElement()) {
                System.out.println("nut trai-->");
                current = current.left;
                flag = false;
            }
            else if (element > current.getElement()) {
                System.out.println("nut phai-->");
                current = current.right;
                flag=true;
            } else {
                if(current.left!=null || current.right!=null)
                    System.out.println("normal node");
                else if((current.left==null) && (current.right==null)&&flag==true)
                    System.out.println("Nut phai la");
                else if((current.left==null) && (current.right==null)&&flag==false)
                    System.out.println("nut trai la");
                return true;
            }
        }
        return false;
    }

}
