public class Developer extends Human{
    public Developer(String name, String gender){
        super(name, gender,"DEV" );
    }
    @Override
    public void showRole(){
        System.out.println("개발자입니다");
        System.out.println("ID: "+super.id);
        System.out.println("이름: "+this.name);
        System.out.println("성별: "+this.gender);
    }
}