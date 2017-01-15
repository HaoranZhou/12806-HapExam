package HAP.Zhou.mapper;

import HAP.Zhou.dto.Customer;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/13.
 */
public interface MyCustomerMapper extends Mapper<Customer> {
    List<Customer> selectCustomer(Customer customer);
}
