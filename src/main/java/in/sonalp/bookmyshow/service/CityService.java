package in.sonalp.bookmyshow.service;

import in.sonalp.bookmyshow.model.City;
import in.sonalp.bookmyshow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City getCityByName(String cityName) {
        City city = cityRepository.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId) {
        return cityRepository.findById(cityId).get();
    }

    public City saveCity(String cityName) {
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId) {
        cityRepository.deleteById(cityId);
        return true;
    }
}
