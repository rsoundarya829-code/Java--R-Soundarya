class swap11 {
    public static <T> int swap(T a,T b){
        T t;
        t=a;
        a=b;
        b=t;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        return 10;
    }
    public static void main(String args[]){
        
      int z = swap(1,2);
      swap("Hello","World");
      swap(1.5,2.5);
      System.out.println("Return value: " + z);

    }
    
}
