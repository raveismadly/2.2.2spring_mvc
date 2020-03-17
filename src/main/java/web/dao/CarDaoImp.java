package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {
//    private SessionFactory  sessionFactory;
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory){
//        this.sessionFactory = sessionFactory;
//    }
//    @Override
//    public List<Car> getCars() {
//     return sessionFactory.getCurrentSession().createQuery(" from Car").list();
//    }
    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mitsu", "d3", 123));
        cars.add(new Car("BMW", "m3", 1333));
        cars.add(new Car("Toyota", "Cruiser", 223));
        cars.add(new Car("Suzuki", "SU", 2223));
        return cars;
    }
}
