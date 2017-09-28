package cn.bidlink.codegen.core;

/**
 * 代码生成器配置类
 */
public class Configeration {

    /**
     * 需要生成的表名称
     */
    private String tableName;
    /**
     * 作者信息
     */
    private String author;

    /**
     * DAO名称
     */
    private String daoName;

    /**
     * 实体类名称
     */
    private String modelName;

    /**
     * 包名称
     */
    private String packageName;

    /**
     * 小模块名称
     */
    private String modeName;

    /**
     * DAO实例名称
     */
    private String xdaoName;

    private String dubboServiceName;

    private String dubboServiceImplName;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getDubboServiceImplName() {
        return dubboServiceImplName;
    }

    public void setDubboServiceImplName(String dubboServiceImplName) {
        this.dubboServiceImplName = dubboServiceImplName;
    }

    public String getDubboServiceName() {
        return dubboServiceName;
    }

    public void setDubboServiceName(String dubboServiceName) {
        this.dubboServiceName = dubboServiceName;
    }

    public String getXdaoName() {
        return xdaoName;
    }

    public void setXdaoName(String xdaoName) {
        this.xdaoName = xdaoName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDaoName() {
        return daoName;
    }

    public void setDaoName(String daoName) {
        this.daoName = daoName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
