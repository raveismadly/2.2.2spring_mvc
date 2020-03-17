package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;

    @Autowired
    public void getCarDao(CarDao carDao){
        this.carDao=carDao;
    }
    @Transactional
    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
