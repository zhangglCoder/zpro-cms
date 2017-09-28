package cn.bidlink.codegen.core;

import cn.bidlink.codegen.dto.ColumnModelDTO;
import cn.bidlink.codegen.util.Utlis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DataSourceHeper {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static  {
        Properties prop =  new  Properties();
        InputStream in = Object. class .getResourceAsStream( "/jdbc.properties" );
        try  {
            prop.load(in);
            driver = prop.getProperty( "jdbc.driver" ).trim();
            url = prop.getProperty( "jdbc.url" ).trim();
            user = prop.getProperty( "jdbc.username" ).trim();
            password = prop.getProperty( "jdbc.password" ).trim();
        }  catch  (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
    /**
     * 获取连接
     * @return
     */
    public static Connection getConnection(){
        try {
            Class.forName(driver);
            Properties properties = new Properties();
            properties.put("user", user);
            properties.put("password", password);
            properties.put("remarksReporting","true");//想要获取数据库结构中的注释，这个值是重点
            properties.setProperty("useInformationSchema", "true");//设置可以获取tables remarks信息

            return DriverManager.getConnection(url,properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取表注释
     * @param tableName
     */
    public static String getTableRemarks(String tableName){
        String remarkes = "";
        try {
            Statement stmt = getConnection().createStatement();
            stmt.executeQuery("show table status WHERE NAME = '"+tableName+"'");
            ResultSet rs = stmt.getResultSet();
            while(rs.next()) {
                remarkes = rs.getString("Comment");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return remarkes;

    }
    /**
     * 获取表结构
     * @param tableName
     * @return
     */
    public static List<ColumnModelDTO> getTableStructure(String tableName){
        List<ColumnModelDTO> columnModelDTOList =new ArrayList<ColumnModelDTO>();
        try {
            //TODO 字段相关
            ResultSet columnSet = getConnection().getMetaData().getColumns(null,"%",tableName,"%");

            while(columnSet.next()) {
                ColumnModelDTO columnModelDTO = new ColumnModelDTO();
                columnModelDTO.setColumnName(columnSet.getString("COLUMN_NAME"));
                columnModelDTO.setColumnType(columnSet.getString("TYPE_NAME"));
                columnModelDTO.setDatasize(columnSet.getInt("COLUMN_SIZE"));
                columnModelDTO.setDigits(columnSet.getInt("DECIMAL_DIGITS"));
                columnModelDTO.setNullable(columnSet.getInt("NULLABLE"));
                columnModelDTO.setEntityName(Utlis.getEntityName(columnSet.getString("COLUMN_NAME")));
                columnModelDTO.setEntityType(Utlis.getEntityNameType(columnSet.getString("TYPE_NAME")));
                columnModelDTO.setEntityFunName(Utlis.getEntityFun(columnModelDTO.getEntityName()));
                columnModelDTO.setColumnComment(columnSet.getString("REMARKS"));
                columnModelDTOList.add(columnModelDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnModelDTOList;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
