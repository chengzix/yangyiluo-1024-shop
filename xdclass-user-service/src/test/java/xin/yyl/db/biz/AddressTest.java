package xin.yyl.db.biz;

import net.xdclass.UserApplication;
import net.xdclass.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class AddressTest {
    @Autowired
    private AddressService addressService;


    @Test
    public  void testAddress(){
        addressService.getById(1);



    }


}
