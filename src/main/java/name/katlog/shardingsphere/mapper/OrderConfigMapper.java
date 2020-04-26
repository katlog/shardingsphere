package name.katlog.shardingsphere.mapper;

import name.katlog.shardingsphere.domain.OrderConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by fw on 2020/4/26
 */
@Repository
public interface OrderConfigMapper {

    OrderConfig selectById(@Param("id") Integer id);

}