import org.apache.log4j.Logger;

/**
 * create: qiyun
 * date: 2019/12/3
 * desc:源码运行示例
 */
public class HelloWorld {

    //这行关联此类并加载了日志所有的配置，代码实现在LogManager的static {}中
    private static Logger logger =Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        try {
            int a=10/0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.toString());
            logger.info(e.getCause());
            logger.info(e.getMessage());
            logger.error(e.getMessage(),e);

        }
    }

}












