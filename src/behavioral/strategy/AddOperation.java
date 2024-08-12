package behavioral.strategy;

public class AddOperation implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        int ans = n1 + n2;
        System.out.println("Add operation result =" + ans);
        return ans;
    }
}
