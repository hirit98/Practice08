package kr.hirit98.enums;

public enum Menu {

    ADD(1),
    LIST(2),
    SEARCH(3),
    REMOVE(4);

    // enum 의 생성자는 절대 public 으로 생성 할 수 없다.

    private final int number;

    Menu(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }


    public static Menu findMenu(int number){
        switch (number){
            case 1:
                return ADD;
            case 2:
                return LIST;
            case 3:
                return SEARCH;
            case 4:
                return REMOVE;
            default:
                return null;
        }
    }

}
