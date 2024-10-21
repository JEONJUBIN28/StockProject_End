package org.seongsu.stockproject.Mapper;

import org.seongsu.stockproject.VO.UserTourVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserTourMapper {
    List<UserTourVO> getUserTourList();
    int getTotalCount();
    UserTourVO getUserTourDetail(String tour_Code);
    List<UserTourVO> searchUserTour(String keyword);
}
