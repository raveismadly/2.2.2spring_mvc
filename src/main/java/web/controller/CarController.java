package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping
public class CarController {

    private CarService service = new CarServiceImp();

    @Autowired
    public void setService(CarService carService) {
        this.service = carService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> printCarTable(ModelMap model) {
        List<Car> cars = service.getCars();
        model.addAttribute("cars", cars);
        return cars;
    }

//    Задание:
//1. Создайте еще один контроллер, замаппленный на /cars.
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте сервис с методом, который будет возвращать список из любых машин (на ваше усмотрение, но не менее трех).
//4. Создайте страницу cars.jsp. Реализуйте создание таблицы с машинами из сервиса с помощью jstl.
// 5. На страницу /cars можно обратиться с разных локалей. При запросе /cars?locale=en заголовок
// таблицы должен содержать слово “CARS”, при /cars?locale=ru - “МАШИНЫ”.


}
