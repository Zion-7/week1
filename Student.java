public class Student extends Person{
         String classroom;
            public Student(boolean parent_permission, int age, String name, int id,String classroom) {
            super(id, name, parent_permission, age);
        }
            this.classroom = classroom;
        }
  
}
