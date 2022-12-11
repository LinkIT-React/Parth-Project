import javax.naming.InvalidNameException;
public class tae_1_3 {
    public static String[] List = {"Prasad", "Prajesh", "Prajwal", "Lavesh"};

    public static void main(String[] args) {
        String name = "Prasad";
        try {
            Present(name);
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
    }

    public static void Present(String Name) throws InvalidNameException {
        for (int i = 0; i < List.length; i++) {
            if (List[i] == Name) {
                throw new InvalidNameException("Present");
            } else {
                System.out.println("Not Present");
            }
        }

    }
}