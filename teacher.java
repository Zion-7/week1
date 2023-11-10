public class teacher extends person{
    public teacher(int id, String name, boolean parent_permission, int age, String specialization) {
        super(id, name, parent_permission, age);
        this.specialization = specialization;
    }
    String specialization;
    public boolean canUseServices() {
        return true;
    }
}