public class ConversionRules {
    public static void main(String[] args) {
        int n1 = 100000, n2 = 200000;
        long p;
        p = n1 * n2;
        System.out.println("p float affectation de int n1*n2 =" + p);

        float f = 1,q,n3;
        n3=n2*f;
        q = n1 * n3 ;
System.out.println("q après conversion = produit de n1 et n2 = " +q);
    }
}