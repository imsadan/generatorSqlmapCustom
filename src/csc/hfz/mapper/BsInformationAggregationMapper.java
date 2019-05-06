package csc.hfz.mapper;

import csc.hfz.domain.BsInformationAggregation;
import java.util.List;

public interface BsInformationAggregationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BsInformationAggregation record);

    BsInformationAggregation selectByPrimaryKey(Long id);

    List<BsInformationAggregation> selectAll();

    int updateByPrimaryKey(BsInformationAggregation record);
}