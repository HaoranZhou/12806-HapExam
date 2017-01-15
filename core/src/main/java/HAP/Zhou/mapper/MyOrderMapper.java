package HAP.Zhou.mapper;

import HAP.Zhou.dto.OrderHeader;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/15.
 */
public interface MyOrderMapper extends Mapper<OrderHeader>{
    List<OrderHeader> FindOrderInf (OrderHeader order);
}
