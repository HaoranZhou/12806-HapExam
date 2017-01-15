package HAP.Zhou.service.imp;

import HAP.Zhou.dto.Company;
import HAP.Zhou.mapper.MyCompanyMapper;
import HAP.Zhou.service.ICompanyService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/15.
 */
@Service("companyService")
public class CompanyServiceImp extends BaseServiceImpl<Company> implements ICompanyService{

    @Autowired
    private MyCompanyMapper companyMapper;

    public List<Company> query(IRequest request, Company company, int page, int pageSize){
        return companyMapper.select(company);

    }

}
