package name.katlog.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by fw on 2020/4/26
 */
@Data
@TableName(value = "order_config")
public class OrderConfig {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     *
     * 单位：分钟
     */
    private Integer payTimeout;

}
