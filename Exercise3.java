class Exercise3 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int num = 0;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d", num, factorial);
    }
}