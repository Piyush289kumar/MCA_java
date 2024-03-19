package classes;

class addition {
    addition(int val1, int val2) {
        int res = val1 + val2;
        System.out.println("Result : " + res);
    }

    public static void main(String[] args) {
        addition obj = new addition(5, 2);
    }
}