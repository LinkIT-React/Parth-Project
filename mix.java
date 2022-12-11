/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
public class mix
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        // int arr[] = {10, 324, 45, 90, 98};
        System.out.println(samallest());

        int a[]={33,3,4,5};//declaration, instantiation and initialization

        System.out.println(a.length);
        for(int i = a.length; i>0; i--){
            System.out.println(a[i]);
        }



    }

    static int samallest(){
        int arr[] = {100, 324, 45, 90, 98};

        int small = arr[0];

        for(int i=0; i<arr.length; i++)

            if(small>arr[i]) small= arr[i];

        return small;


    }
}
