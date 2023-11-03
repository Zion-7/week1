public class Person {
        private int id;
        private String name;
        private int age;
        private boolean parent_permission = true;
        public Person(int id, String name, boolean parent_permission, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.parent_permission = parent_permission;
        }
        public Person(int age) {
            this(age, "unknown", true, 0);
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        private boolean of_age(int age) {
            if (age >= 18)
            {
                return true;
            }
            else{
                return false;
            }
        }
        public boolean canUseServices() {
            if (age > 18 || parent_permission);
            {
                return true;
            }
        }
    }

