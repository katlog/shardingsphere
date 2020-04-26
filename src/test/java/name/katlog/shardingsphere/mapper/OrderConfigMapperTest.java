package name.katlog.shardingsphere.mapper;

import name.katlog.shardingsphere.ShardingsphereApplication;
import name.katlog.shardingsphere.domain.OrderConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingsphereApplication.class)
class OrderConfigMapperTest {

    @Autowired
    private OrderConfigMapper orderConfigMapper;

    @Test
    public void testSelectById() {
        OrderConfig orderConfig = orderConfigMapper.selectById(1);
        System.out.println(orderConfig);
    }

}