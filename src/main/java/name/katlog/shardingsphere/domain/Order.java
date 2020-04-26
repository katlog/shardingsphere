package name.katlog.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by fw on 2020/4/26
 */
@Data
@TableName(value = "orders")
public class Order {
    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;
}
