package dome3;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, double salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理喝着茶看着程序员敲代码");
    }
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
