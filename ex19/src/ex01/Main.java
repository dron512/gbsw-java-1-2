package ex01;
class Document{
  protected String title;
  public Document(String title){
    this.title = title;
  }
  public void showTitle(){
    System.out.println("문서 제목 : "+title);
  }
}
class Report extends Document{
  public Report(String title){
    super(title);
  }
}
class Editor{
  private Report report; // 연관관계
  public Editor(Report report){
    this.report = report;
  }
  public void review(){
    System.out.println("리뷰 데이터 : "+report.title);
  }
}
class ArchiveDesk{
  public void register(Report report){
    System.out.println("저장 데이터 : "+report.title);
  }
}
public class Main {
  public static void main(String[] args) {
    // 상속관계...
    Report report = new Report("보고서");
    report.showTitle();

    // 연관은 객체 생성할때 report 보내는거
    Editor editor = new Editor(report);
    editor.review();

    // 의존 메서드 호출할때.. 메서드에서 보내는거
    ArchiveDesk archiveDesk = new ArchiveDesk();
    archiveDesk.register(report);
  }
}
