package day10.dao;

import day10.dto.CarDTO;

public class CarDAO {
    private CarDTO car;

    public CarDAO(CarDTO car) {
        this.car = car;
    }
    public void insert(){
        System.out.println(car.getModel()+"데이터베이스에 car 1대 정보 입력"+ car.getTire().toString());
    }
    public void delete(){
        System.out.println(car.getModel()+"데이터베이스에 car 1대 정보 삭제");
    }
    public void select(){
        System.out.println(car.getModel()+"데이터베이스에 car 1대 정보 조회");
    }
    public void update(){
        System.out.println(car.getModel()+"데이터베이스에 car 1대 정보 갱신");
    }

}
