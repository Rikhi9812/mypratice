class main1 {
    public static void main(String[] args) {
        
        System.loadLibrary("c");

        System.out.println(sqr(6));

        System.out.println(cub(6));
    }

    public static native int sqr(int i); 

    public static native int cub(int i);

}