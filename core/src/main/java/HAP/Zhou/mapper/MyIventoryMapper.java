package HAP.Zhou.mapper;

import HAP.Zhou.dto.Inventory;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

/**
 * Created by 周浩然 on 2017/1/14.
 */
public interface MyIventoryMapper extends Mapper<Inventory> {
    List<Inventory> selectInventory(Inventory inventory);
}
