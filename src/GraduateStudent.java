public class GraduateStudent extends Student{
    protected String studyLevel;
    protected String thesisAdviser;
    
    public void oralExamination(){
        System.out.println("oralExamination");
    }
    public void thesisExamination(){
        System.out.println("thesisExamination");
    }

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }
    
}
