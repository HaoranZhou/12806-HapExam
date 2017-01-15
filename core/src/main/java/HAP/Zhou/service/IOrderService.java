package HAP.Zhou.service;

import HAP.Zhou.dto.OrderHeader;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/15.
 */
public interface IOrderService extends IBaseService<OrderHeader>{
    List<OrderHeader> FindOrderInf(IRequest request, OrderHeader order, int page, int pageSize);
}
