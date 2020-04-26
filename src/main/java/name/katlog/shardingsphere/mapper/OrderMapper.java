package name.katlog.shardingsphere.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import name.katlog.shardingsphere.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fw on 2020/4/26
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {

    Order selectById(@Param("id") Integer id);

    List<Order> selectListByUserId(@Param("userId") Integer userId);


}