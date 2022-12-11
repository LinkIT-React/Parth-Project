class daftar {
    int salary;
    String name;

    public int bhetliSalary(int x){
        salary =x;
        return  salary;
    }
    public String bhetliname(String y){
        name = y;
        return y;
    }

    public void display(){
        System.out.println(salary);
        System.out.println(name);
    }

}


public class emp {

    public static  void main(String[] args){
        daftar hf = new daftar();
        hf.bhetliSalary(4000);
        hf.bhetliname("Parth");
        hf.display();
    }

}
