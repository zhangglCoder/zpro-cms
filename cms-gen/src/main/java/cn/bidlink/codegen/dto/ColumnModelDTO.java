package cn.bidlink.codegen.dto;


public class ColumnModelDTO {

    //字段名称
    private String columnName;
    //字段类型
    private String columnType;
    //实体名称
    private String entityName;
    //实体类型
    private String entityType;
    //属性方法
    private String entityFunName;
    //字段注释
    private String columnComment;
    //字段大小
    private int datasize;
    //
    private int digits;
    //字段是否可空
    private int nullable;

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
    public String getEntityFunName() {
        return entityFunName;
    }

    public void setEntityFunName(String entityFunName) {
        this.entityFunName = entityFunName;
    }
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public int getDatasize() {
        return datasize;
    }

    public void setDatasize(int datasize) {
        this.datasize = datasize;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getNullable() {
        return nullable;
    }

    public void setNullable(int nullable) {
        this.nullable = nullable;
    }


}
