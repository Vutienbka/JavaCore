package MapInJava;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTreeManage binaryTreeManage = new BinaryTreeManage();
        binaryTreeManage.initialTree();
        binaryTreeManage.addTree(59);
        binaryTreeManage.addTree(58);
        binaryTreeManage.searchTree(58);
    }
}
