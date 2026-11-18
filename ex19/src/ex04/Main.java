package ex04;
class Document{
  protected String title;
  public Document (String title){
    this.title = title;
  }
  public void showTitle(){
    System.out.println("제목 : " + title);
  }
}
class Report extends Document{
  public Report(String title){
    super(title);
  }
  public void printSummary(){
    System.out.println("보고서 요약");
  }
}
class Editor{
  private Report report;
  public Editor(Report report){
    this.report = report;
  }
  public void review(){
    System.out.println("보고서 검토 : "+report.title);
  }
}
class ArchiveDesk{
  public void register(Report report){
    System.out.println("보고서 등록 : " + report.title);
  }
}
public class Main {
  public static void main(String[] args) {
    // 상속관계
    Report report = new Report("2024년 사업계획서");
    report.showTitle();
    // 연관관계
    Editor editor = new Editor(report);
    editor.review();
    // 의존관계
    ArchiveDesk archiveDesk = new ArchiveDesk();
    archiveDesk.register(report);
  }
}