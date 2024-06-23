class consInput{
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String s=System.console().readLine();
        System.out.println(s);

        System.out.println("Enter a Number:");
        int a=Integer.parseInt(System.console().readLine());
        System.out.println(a);
    }
}