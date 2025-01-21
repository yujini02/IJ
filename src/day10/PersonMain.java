package day10;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person 김선민 = new Person();
        김선민.setName("김선민");
        김선민.setAge(24);
        김선민.setPhone("000000");

        Person 김석진 = new Person("김석진",27,"010-9876-5432");

        System.out.println(김석진.getName() + 김석진.eat());

        Person 정유진 = new Person("정유진",00,"000-0000-0000");
        //정유진 운동한다.
        System.out.println(정유진.getName() + " "+정유진.play());
        //정유진 점심시간에 우동을 먹다
        System.out.println(정유진.getName() + " 점심시간에 우동을 " +정유진.eat());
        //정유진 점심시간에 걷다
        System.out.println(정유진.getName() + " 점심시간에 " + 정유진.walk());
    }
}
