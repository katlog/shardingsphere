package name.katlog.shardingsphere.mapper;

import name.katlog.shardingsphere.ShardingsphereApplication;
import name.katlog.shardingsphere.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingsphereApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        Order order = orderMapper.selectById(1);
        System.out.println(order);
    }

    @Test
    public void testSelectListByUserId() {
        List<Order> orders = orderMapper.selectListByUserId(1);
        System.out.println(orders.size());
        orders = orderMapper.selectListByUserId(3);
        System.out.println(orders.size());
    }

    @Test
    public void testInsert() {
        Order order = new Order();
        order.setUserId(1);
        orderMapper.insert(order);
    }

}