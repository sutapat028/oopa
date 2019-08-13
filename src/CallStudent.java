public class CallStudent {
      public static void main(String[] args) {
        System.out.println("Hello World");
        Student sutapat = new Student();
          System.out.println("Object sutapat = "+sutapat);
        sutapat.addCourse();
        sutapat.dropCourse();
        sutapat.payment();
        sutapat.enrollment();
        
        //crate object GraduateStudent
          GraduateStudent sutapa = new GraduateStudent();
          System.out.println("Object sutapa = "+sutapa);
          sutapa.oralExamination();
          sutapa.thesisExamination();
          sutapa.enrollment();
          sutapa.addCourse();
          sutapa.dropCourse();
          sutapa.payment();
    }   
}
