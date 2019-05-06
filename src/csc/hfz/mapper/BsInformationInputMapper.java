package csc.hfz.mapper;

import csc.hfz.domain.BsInformationInput;
import java.util.List;

public interface BsInformationInputMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BsInformationInput record);

    BsInformationInput selectByPrimaryKey(Long id);

    List<BsInformationInput> selectAll();

    int updateByPrimaryKey(BsInformationInput record);
}