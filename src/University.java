import java.util.ArrayList;
import java.util.List;

// Ana sınıf: Üniversite
class University {
    private String name;
    private List<Student> students;
    private List<Faculty> faculties;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.faculties = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Diğer yönetim fonksiyonları, getter'lar ve setter'lar...
}

// Öğrenci sınıfı
class Student {
    private String name;
    private int id;
    private String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Diğer öğrenci özellikleri, getter'lar ve setter'lar...
}

// Öğretim elemanı sınıfı
class Faculty {
    private String name;
    private String department;
    private String position;

    public Faculty(String name, String department, String position) {
        this.name = name;
        this.department = department;
        this.position = position;
    }

    // Diğer öğretim elemanı özellikleri, getter'lar ve setter'lar...
}

// Ders sınıfı
class Course {
    private String code;
    private String name;
    private Faculty instructor;
    private List<Student> students;

    public Course(String code, String name, Faculty instructor) {
        this.code = code;
        this.name = name;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Diğer ders özellikleri, getter'lar ve setter'lar...
}

 class UniversityManagementSystem {
    public static void main(String[] args) {
        // Üniversite örneği oluşturma
        University university = new University("My University");

        // Öğrenci oluşturma
        Student student1 = new Student("John Doe", 1001, "Computer Science");
        Student student2 = new Student("Jane Smith", 1002, "Electrical Engineering");

        // Öğretim elemanı oluşturma
        Faculty faculty1 = new Faculty("Prof. Smith", "Computer Science", "Professor");
        Faculty faculty2 = new Faculty("Dr. Johnson", "Electrical Engineering", "Associate Professor");

        // Ders oluşturma
        Course course1 = new Course("CS101", "Introduction to Computer Science", faculty1);
        Course course2 = new Course("EE201", "Electrical Circuits", faculty2);

        // Öğrencileri ve dersleri üniversiteye ekleme
        university.addStudent(student1);
        university.addStudent(student2);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addCourse(course1);
        university.addCourse(course2);

        // Derslere öğrenci ekleme
        course1.addStudent(student1);
        course2.addStudent(student2);

        // Derslerden öğrenci çıkarma
        course1.removeStudent(student1);

        // Öğrenciyi üniversiteden ve derslerden çıkarma
        university.removeStudent(student2);

        // Diğer yönetim işlemleri...
    }
}
