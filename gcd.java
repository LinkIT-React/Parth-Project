
public class gcd {

    static void cal(int a, int b ){

        int count =0;
        int z = Math.min(a,b);

        for(int i=1; i<z; i++){

            if(a%i==0 && b%i==0){
                count =i;
            }
        }

        System.out.println("HCF is: " +count);

    }

//    by using euclidean alog
    static int euclidean_algo(int a, int b){

        if(a==b){
            return a;
        }
        if(a==0 ){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>b){
            return euclidean_algo(a-b, b);
        }
        else{
            return euclidean_algo(a,b-a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Java");

        cal(98,56);
        System.out.println("Euicdiean algo");

        System.out.println(euclidean_algo(98,56));
    }

}
