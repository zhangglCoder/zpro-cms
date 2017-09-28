package cn.bidlink.codegen.core;

import cn.bidlink.codegen.dto.ColumnModelDTO;
import cn.bidlink.codegen.util.Utlis;
import org.apache.velocity.VelocityContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * The type Gen service.
 *
 * @author :<a href="mailto:guolongzhang@ebnew.com">张国龙</a>
 * @date :2017-05-25 13:33:31
 */
public class GenService {

    /**
     * 配置对象
     */
    private Configeration configeration;

    /**
     * Gen xml.
     *
     * @param outPathName the out path name
     */
    public void genXml(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/MapperXml.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genXml()生成完毕");
    }
    public void genDubboService(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/DubboService.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genDubboService()生成完毕");
    }
    public void genDubboServiceImpl(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/DubboServiceImpl.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genDubboServiceImpl()生成完毕");
    }

    /**
     * Gen dao.
     *
     * @param outPathName the out path name
     */
    public void genDao(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/Dao.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genDao()生成完毕");
    }

    /**
     * Gen model.
     *
     * @param outPathName the out path name
     */
    public void genModel(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/Model.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genModel()生成完毕");
    }
    public void genSpringConfig(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/spring-config.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genSpringConfig()生成完毕");
    }
    public void genTestDubboService(String outPathName) {
        try {
            VelocityHelper.generate(
                    "/template/TestDubboService.vm",
                    outPathName,
                    getCtx());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("genTestDubboService()生成完毕");
    }

    /**
     * Gets ctx.
     *
     * @return the ctx
     */
    public VelocityContext getCtx() {
        VelocityContext ctx = new VelocityContext();
        List<ColumnModelDTO> listColumnMode = DataSourceHeper.getTableStructure(configeration.getTableName());
        String tableComment = DataSourceHeper.getTableRemarks(configeration.getTableName());
        String testEntityCode = Utlis.getTestEntityCode(listColumnMode,configeration.getModelName(),"entity");
        String testEntityCodeBatch = Utlis.getTestEntityCodeBatch(listColumnMode,configeration.getModelName());
        ctx.put("tableName", configeration.getTableName());
        ctx.put("daoName", configeration.getDaoName());
        ctx.put("xdaoName", Utlis.getLowercaseChar(configeration.getDaoName()));
        ctx.put("xmodelName", Utlis.getLowercaseChar(configeration.getModelName()));
        ctx.put("packageName", configeration.getPackageName());
        ctx.put("DubboServiceImplName", configeration.getDubboServiceImplName());
        ctx.put("DubboServiceName", configeration.getDubboServiceName());
        ctx.put("modelName", configeration.getModelName());
        ctx.put("date", getDate());
        ctx.put("author",configeration.getAuthor());
        ctx.put("listColumnMode", listColumnMode);
        ctx.put("testEntityCode", testEntityCode);
        ctx.put("testEntityCodeBatch", testEntityCodeBatch);
        ctx.put("tableComment", tableComment);


        return ctx;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public static String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    public Configeration getConfigeration() {
        return configeration;
    }

    public void setConfigeration(Configeration configeration) {
        this.configeration = configeration;
    }

}
