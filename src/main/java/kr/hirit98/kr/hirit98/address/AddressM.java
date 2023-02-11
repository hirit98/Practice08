package kr.hirit98.kr.hirit98.address;

import java.util.ArrayList;
import java.util.List;

public class AddressM {

    // public AddressM() {} -> 다른 생성자가 생기면 사라짐.
    private static AddressM instance; // instance = null;

    public static AddressM getInstance() {
        if(instance == null)
            instance = new AddressM();

        return instance;
    }

    private List<Address> addressList;


    private AddressM() {
        addressList = new ArrayList<>();
    }

    // 오버로딩
    public void addAdress(Address address) {
        // 이름 중복확인
        // 중복 없으면,
        addressList.add(address);
        // 중복 있으면,
        // 추가 불가
    }
    public void addAdress(String name, String phone, int age) {
        addAdress(new Address(name,phone,age));
    }

    public void printList(){
        System.out.println("====================================================");
        for(Address address : addressList){
            address.printInfo();
        }
    }

    public Address searchByName(String name){
        for(Address address : addressList){
            if(address.getName().equals(name))
                return address;

        }

        // 데이터 이름이 없다.
        return null;
    }
}
