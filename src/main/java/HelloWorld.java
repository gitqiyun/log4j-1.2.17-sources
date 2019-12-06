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
        logger.info("你好");
    }

}












