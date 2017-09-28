package cn.bidlink.codegen;

import cn.bidlink.codegen.core.Configeration;
import cn.bidlink.codegen.core.GenService;

/**
 * 代码生成器初始化类
 */
public class Application {

    public static void main(String[] args) throws Exception {
//        codeGen("Product", "product");
//        codeGen("ProductAttribute", "product_attribute");
//        codeGen("ProductType", "product_type");
//        codeGen("ProductTypeTemplate", "product_type_template");
        codeGen("EcmsFlash", "www_92game_net_ecms_flash");

    }

    /**
     * 生成器
     *
     * @param objName   实体名称例如（Faq）
     * @param tableName 生成的表名称（bmpfjz_faq）
     */
    public static void codeGen(String objName, String tableName) {
        String rootPath = "F:\\gen\\92\\";


        String interfacePath = rootPath + "";
        String mapperPath = rootPath + "";

        String testPath = rootPath + "";

        String entityPath = rootPath + "";

        String implPath = rootPath + "";

        Configeration configeration = new Configeration();
        GenService genService = new GenService();
        configeration.setTableName(tableName);/*表名称*/
        configeration.setDaoName(objName + "Dao");/*DAO名称*/
        configeration.setModelName(objName);/*实体类名称*/
        configeration.setDubboServiceImplName(objName + "ServiceImpl");/*Dubbo服务的实现类名称*/
        configeration.setDubboServiceName(objName + "Service");/*Dubbo接口名称*/
        configeration.setPackageName("cn.zpro.app");/*默认包名称*/
        configeration.setAuthor("<a href=\"mailto:742819432@qq.com\">zhanggl</a>");/*作者*/
        genService.setConfigeration(configeration);

        /*生成Mybatis代码*/
        genService.genXml(mapperPath + "\\sql-mapper\\" + objName + "Mapper.xml");
        genService.genDao(implPath + "dao\\" + objName + "Dao.java");
        genService.genModel(entityPath + "model\\" + objName + ".java");
        /*生成配置Mybatis-config文件*/
        genService.genSpringConfig(rootPath + "spring-config.xml");
        /*生成Dubbo代码和单元测试代码*/
        genService.genDubboService(interfacePath + "service\\" + objName + "Service.java");
        genService.genDubboServiceImpl(implPath + "service\\" + objName + "ServiceImpl.java");
        genService.genTestDubboService(testPath + "test\\" + objName + "ServiceTest.java");
    }

}
