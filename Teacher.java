public class Teacher extends Person{
        public Teacher(int id, String name, boolean parent_permission, int age, String specialization) {
            super(id, name, parent_permission, age);
            this.specialization = specialization;
        }
        private String specialization;
        public Teacher(int id, String name, boolean parent_permission, int age) {
            super(id, name, parent_permission, age);
        }
        public boolean canUseServices() {
            return true;
        }
    }


