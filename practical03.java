class practical03
{
    public static void sortStrings(String[] arr, int n)
    {
        String temp;

        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        String[] arr = { "my", "name", "is", "java"};

        int n = arr.length;

        sortStrings(arr, n);

        System.out.println("Strings in sorted order are : ");

        for (int i = 0; i < n; i++)

            System.out.print(arr[i] + " ");
    }
}











//
//class Bank{
//    void simpleIntrest(){
//        float p=2;
//        float r=4;
//        float t=6;
//        float result = p*r*t;
//        System.out.println("Simple Intrest of common Bank: " + result);
//    }
//}
//class SBI extends Bank{
//    void simpleIntrest(int profit, int rate, int time){
//        int result = profit*rate* time;
//        System.out.println("Your SBI bank Intrest is: " +result);
//        super.simpleIntrest();
//    }
//
//}
//
//public class practical03
//{
//    public static void main(String[] args) {
//        SBI person = new SBI();
//        person.simpleIntrest(10,10,10);
//    }
//}
//



