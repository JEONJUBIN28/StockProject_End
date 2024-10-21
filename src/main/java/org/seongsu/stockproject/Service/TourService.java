package org.seongsu.stockproject.Service;

import org.seongsu.stockproject.VO.TourVO;

import java.util.List;

public interface TourService {
    List<TourVO> getTourList();
    int getTotalCount();
    List<TourVO> searchTour(String keyword);
    int getSearchTotalCount(String keyword);
    TourVO getTourDetail(String tour_Code);
    void createTour(TourVO tour);
    void updateTour(TourVO tour);
    void deleteTour(String tour_Code);
	
}
