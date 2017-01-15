package HAP.Zhou.controllers;

import HAP.Zhou.dto.Company;
import HAP.Zhou.service.ICompanyService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sale/company")
public class SaleCompanyController extends BaseController {

    @Qualifier("companyService")
    @Autowired
    ICompanyService companyService;

    @RequestMapping(path = "/query" , method = RequestMethod.GET)
    public ResponseData query(HttpServletRequest request, Company company,
                              @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "100") int pageSize) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(companyService.select(requestContext,company, page, pageSize));
    }



}
