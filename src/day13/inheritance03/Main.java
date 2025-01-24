package day13.inheritance03;

public class Main {
    public static void main(String[] args) {
        //Phone 타입으로 유선전화를 생성하여
        //1. 전화를 건다.
        //2. 전화를 받는다.
        //3. 메세지를 전송한다
        //4. 메세지를 수신한다.
        //5. 전화를 끊는다.

        //SmartPhone 을 생성하여
        //0. wifi를 연결하고 인터넷을 켠다.
        //1. 전화를 건다.
        //2. 전화를 받는다.
        //3. 메세지를 전송한다
        //4. 메세지를 수신한다.
        //5. 전화를 끊는다.

        //bander : 사과 model:사과11 color:퍼플 SmartPhone을 생성하여
        //0. wifi를 연결하고 인터넷을 켠다.
        //1. 전화를 건다.
        //2. 전화를 받는다.
        //3. 메세지를 전송한다
        //4. 메세지를 수신한다.
        //5. 전화를 끊는다.


        Phone phone1 = new Phone();
        Phone phone2 = new Phone("삼성","PLK000","화이트");
        phone1.bell();
        phone1.hangOn();
        phone1.sendVoice("안녕하세요");
        phone1.receiveVoice("수신");
        phone1.hangUp();

        SmartPhone smartPhone1 = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone();
        smartPhone1.setWifi(true);
        smartPhone1.bell();
        smartPhone1.hangOn();
        smartPhone1.sendVoice("승호");
        smartPhone1.receiveVoice("승호");
        smartPhone1.hangUp();

        SmartPhone2 phone3 = new SmartPhone2();
    }
}
