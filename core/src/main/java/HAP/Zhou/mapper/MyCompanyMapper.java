package HAP.Zhou.mapper;

import HAP.Zhou.dto.Company;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/13.
 */
public interface MyCompanyMapper extends Mapper<Company> {
    List<Company> selectCompany();
}
