
public static void main (String[] args){
    System.out.println("Hello world");
    System.out.println("Hello world again");
    findMax();
}


public  static void   findMax(){
    int max =0;

    int[] maxArray = {1,2,3,4,5};
    for (int i=0; i<4;i++){
        if (max<maxArray[i]){
            max = maxArray[i];
        }
    }
    System.out.println("Numarul maxim este: " + max);
}
