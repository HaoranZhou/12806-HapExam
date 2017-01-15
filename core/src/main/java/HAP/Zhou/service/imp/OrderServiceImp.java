package HAP.Zhou.service.imp;

import HAP.Zhou.dto.OrderHeader;
import HAP.Zhou.mapper.MyOrderMapper;
import HAP.Zhou.service.IOrderService;
import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/15.
 */
@Service("orderService")
public class OrderServiceImp extends BaseServiceImpl<OrderHeader> implements IOrderService{
    @Autowired
    private MyOrderMapper orderMapper;
    @Override
    public List<OrderHeader> FindOrderInf(IRequest request, OrderHeader order, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return orderMapper.FindOrderInf(order);
    }
}
