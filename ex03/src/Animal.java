/*
    class Animal{
        ismamal(){}
        introduce(){}
    }
    const aa = new Animal();
    const aa = {
        age:10,
        gender:20,
        ismammal: ()=> { console.log('포유류') },
        introduce: ()=> { console.log('내소개') }
    }
*/
public class Animal {
    private int age;
    private String gender;
    public void isMammal(){
        System.out.println("포유류");
    }
    public void introduce(){
        System.out.println("내소개");
    }
}
