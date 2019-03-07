public class TowerOfHanoi {
    public static void main(String[] args) {
        solveHanoi(5, "Tower A","Tower B", "Tower C");
    }

    public static void solveHanoi(int numDisc, String A, String B, String C){
        if(numDisc==1){
            System.out.println("Move "+numDisc+" from "+ A+ " to "+ C);
        }

        else {
            solveHanoi(numDisc-1, A, C, B);
            System.out.println("Move "+numDisc+" from "+A+" to "+C);
            solveHanoi(numDisc-1, B, A, C);
        }
    }
}
