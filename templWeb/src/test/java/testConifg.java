import com.zhangbaowei.multidbtempl.db.DynamicDataSourceRegister;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({DynamicDataSourceRegister.class})
public class testConifg {
    @Test
    public void name() {

    }
}

