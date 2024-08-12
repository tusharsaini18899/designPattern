package behavioral.strategy;

public class MultiplyOperation implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        int ans = n1 * n2;
        System.out.println("Multiply operation result =" + ans);
        return ans;
    }
}
