package kr.hirit98.kr.hirit98.address;

public class Address {

    private String name;
    private String phone;
    private int age;

    // (매개변수) { 지역변수 } -> stack 메모리에 저장되었다가 해당 영역이 끝나면 해제
    public Address(String name,String phone, int age){
        this.name=name;
        this.phone=phone;
        this.age=age;
    } // -> name,phone,age 해제

    public void printInfo(){
        System.out.println("이름: " + name);
        System.out.println("번호: " + phone);
        System.out.println("나이: " + age);
        System.out.println("====================================================");
    }
    public String getName(){
        return name;
    }

}
