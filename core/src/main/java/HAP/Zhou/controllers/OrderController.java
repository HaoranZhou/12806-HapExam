package HAP.Zhou.controllers;

import HAP.Zhou.dto.OrderHeader;
import HAP.Zhou.service.IOrderService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/sale/order")
public class OrderController extends BaseController {
    @Autowired
    IOrderService orderService;


    @RequestMapping(path = "/submit", method = RequestMethod.POST)
    public ResponseData submit(@RequestBody List<OrderHeader> orders, BindingResult result, HttpServletRequest request) {
        this.getValidator().validate(orders, result);
        if(result.hasErrors()) {
            ResponseData ErrorRequestContext = new ResponseData(false);
            ErrorRequestContext.setMessage(this.getErrorMessage(result, request));
            return ErrorRequestContext;
        } else {
            IRequest requestContext = this.createRequestContext(request);
            return new ResponseData(orderService.batchUpdate(requestContext, orders));
        }
    }

    @RequestMapping(path = "/query" , method = RequestMethod.POST)
    public ResponseData query(HttpServletRequest request, OrderHeader order,
                              @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(orderService.FindOrderInf(requestContext, order, page, pageSize));
    }

}
