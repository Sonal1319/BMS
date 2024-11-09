package in.sonalp.bookmyshow.service;

import in.sonalp.bookmyshow.model.ShowSeat;
import in.sonalp.bookmyshow.repository.ShowRepository;
import in.sonalp.bookmyshow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId) {
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat seat) {
        return showSeatRepository.save(seat);
    }
}
