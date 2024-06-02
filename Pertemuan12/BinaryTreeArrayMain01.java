public class BinaryTreeArrayMain01 {
    public static void main(String[] args) {
        BinaryTreeArray01 bta = new BinaryTreeArray01();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.println("-------------------------");
        bta.add(90);
        bta.add(72);
        System.out.println("Method traverse PreOrder");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Method traverse PostOrder");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
