public class getter_setter {
    public static void main(String[] args) {
        check obj = new check();
        obj.setD();
        System.out.println(obj.getD());
    }
}

class check{
    private int Radius;
    private int D;

    void setRadius(){
        Radius = 12;
    }
    int getRadius(){
        return  Radius;
    }

    void setD() {
        D = 12;
    }
    int getD(){
        return  D;
    }

}
