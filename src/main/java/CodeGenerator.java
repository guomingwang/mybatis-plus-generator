import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * CodeGenerator
 *
 * @author WangGuoMing
 * @since 2019-08-06
 */
public class CodeGenerator {

    public static void main(String[] args) {

        // 1.数据源 dataSourceConfig 配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig
                // 数据库类型，该类内置了常用的数据库类型【必须】
                .setDbType(DbType.MYSQL)
                // 驱动连接的URL
                .setUrl("jdbc:mysql://10.10.10.138:3306/stcloudv3?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8")
                // 驱动名称
                .setDriverName("com.mysql.jdbc.Driver")
                // 数据库连接用户名
                .setUsername("root")
                // 数据库连接密码
                .setPassword("666666");

        // 2.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                // 是否大写命名
                .setCapitalMode(true)
                // 数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                // 生成的表
                .setInclude("bzy_standard")
                // 【实体】是否为lombok模型（默认 false）
                .setEntityLombokModel(true)
                // Boolean类型字段是否移除is前缀（默认 false）
                .setEntityBooleanColumnRemoveIsPrefix(true)
                // 生成 @RestController 控制器
                .setRestControllerStyle(true);

        // 3.包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig
                // 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
                .setParent("org.gdjz")
                // 父包模块名
                .setModuleName("bzy.standard");

        // 4.全局策略 globalConfig 配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig
                // 开启 ActiveRecord 模式，默认值：false
                .setActiveRecord(true)
                // 开发人员，默认值：null
                .setAuthor("WangGuoMing")
                // 开启 baseColumnList，默认值：false
                .setBaseColumnList(false)
                // 开启 BaseResultMap，默认值：false
                .setBaseResultMap(false)
                // 时间类型对应策略，默认值：TIME_PACK
                .setDateType(DateType.ONLY_DATE)
                // 是否在xml中添加二级缓存配置，默认值：false
                .setEnableCache(false)
                // 是否覆盖已有文件，默认值：false
                .setFileOverride(true)
                // 指定生成的主键的ID类型，默认值：null
                .setIdType(IdType.AUTO)
                // 开启 Kotlin 模式，默认值：false
                .setKotlin(false)
                // 是否打开输出目录，默认值：true
                .setOpen(false)
                // 生成文件的输出目录，默认值：D 盘根目录
                .setOutputDir("D:\\IDEAProject2020\\mybatis-plus-generator\\src\\main\\java")
                // 开启 swagger2 模式，默认值：false
                .setSwagger2(true)
                // service 命名方式，默认值：null 例如：%sBusiness 生成 UserBusiness
                .setServiceName("%sService");

        // 5.代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .setGlobalConfig(globalConfig);

        // 6.执行
        autoGenerator.execute();
    }
}
