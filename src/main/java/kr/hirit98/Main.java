package kr.hirit98;

import kr.hirit98.enums.Menu;
import kr.hirit98.kr.hirit98.address.Address;
import kr.hirit98.kr.hirit98.address.AddressM;

import java.util.Scanner;

public class Main {

    // 주소록
    // 이름, 전화번호, 나이
    // 프로그램이 꺼져도 저장이 되어야함. ( 다시 켜졌을 때 원본 데이터를 불러옴 )

    // 1. 연락처 입력
    // 2. 연락처 목록
    // 3. 연락처 검색 ( 이름 )
    // 4. 연락처 삭제 ( 이름 )
    // -->
    public static void main(String[] args) {

       AddressM manager =  AddressM.getInstance();
       Scanner sc = new Scanner(System.in);



       while(true){
            printMenu();
           System.out.print("입력: ");

           // int --> Menu 로 변환

           Menu menu = Menu.findMenu(sc.nextInt());
           sc.nextLine();

           switch (menu){
               case ADD:
                   System.out.print("이름: ");
                   String name = sc.nextLine();
                   System.out.print("번호: ");
                   String phone = sc.nextLine();
                   System.out.print("나이: ");
                   int age = sc.nextInt();
                   manager.addAdress(name,phone,age);
                   break;
               case LIST:
                   System.out.println("목록");
                   manager.printList();
                   break;
               case SEARCH:
                   System.out.println("검색");
                   System.out.println("찾고싶은 정보의 이름을 입력: ");
                   Address address = manager.searchByName(sc.nextLine());

                   if(address==null)
                       System.out.println("찾을수 없습니다.");
                   else
                       address.printInfo(); // 주석
                   break;
               case REMOVE:
                   System.out.println("삭제");
                   break;
           }
       }




    }
    public static void printMenu() {
        System.out.println("1. 연락처 입력");
        System.out.println("2. 연락처 목록");
        System.out.println("3. 연락처 검색");
        System.out.println("4. 연락처 삭제");
    }
}