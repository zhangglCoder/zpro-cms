package cn.bidlink.codegen.util;

import cn.bidlink.codegen.dto.ColumnModelDTO;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * The type Utlis.
 *
 * @author :<a href="mailto:guolongzhang@ebnew.com">张国龙</a>
 * @date :2017-05-25 13:28:21
 */
public class Utlis {

    public static String getLowercaseChar(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(getEntityFun("reserve"));
    }

    /**
     * 根据表的列名称获取生成的Entity列名称
     *
     * @param tableColumn
     * @return
     */
    public static String getEntityName(String tableColumn) {
        StringBuffer result = new StringBuffer();
        String[] split = tableColumn.split("_");
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                result.append(split[i].toLowerCase());
            } else {
                String str = split[i].toLowerCase();
                result.append(str.substring(0, 1).toUpperCase() + str.substring(1));
            }
        }
        return result.toString();
    }

    public static String getTestEntityCode(List<ColumnModelDTO> list, String modelName, String objName) {
        StringBuilder code = new StringBuilder();
        code.append(modelName + " " + objName + " =new " + modelName + "();\n");
        for (ColumnModelDTO dto : list) {
            //过滤生成单元测试中的isDel属性
            if (dto.getEntityName().equals("isDel")) {

            } else if (dto.getEntityName().equals("isTest")) {
                //生成单元测试中isTest属性设置 1
                code.append(objName + ".set" + dto.getEntityFunName() + "(1);\n");
            } else {
                code.append(objName + ".set" + dto.getEntityFunName() + "(" + randomValue2(dto.getEntityType()) + ");\n");
            }

        }
        code.append("\n");
        return code.toString();
    }

    public static String getTestEntityCodeBatch(List<ColumnModelDTO> list, String modelName) {
        String obj = getTestEntityCode(list, modelName, "entity");
        String obj1 = getTestEntityCode(list, modelName, "entity1");
        return obj + obj1;
    }

    public static String randomValue2(String entityType) {
        Random random = new Random();
        if ("Long".equals(entityType)) {
            return random.nextInt(10000) + "L";
        } else if ("Integer".equals(entityType)) {
            return random.nextInt(50) + "";
        } else if ("String".equals(entityType)) {
            int index = random.nextInt(stringRandoms.length);
            return stringRandoms[index];
        } else if ("Date".equals(entityType)) {
            return "new java.util.Date()";
        } else if ("Boolean".equals(entityType)) {
            return random.nextBoolean() + "";
        } else if ("Double".equals(entityType)) {
            return random.nextInt(10000) + "D";
        } else if ("BigDecimal".equals(entityType)) {
            return random.nextInt(10000) + "D";
        }

        return entityType;
    }

    private static final String[] stringRandoms = new String[]{"\"test\"", "\"testData\"", "\"测试数据\"", "\"测试\"",
            "\"123456\""};

    public static String getEntityFun(String entityName) {
        StringBuffer result = new StringBuffer();
        result.append(entityName.substring(0, 1).toUpperCase() + entityName.substring(1));
        return result.toString();
    }

    public static String getEntityNameType(String tableColumnType) {
        tableColumnType = tableColumnType.toLowerCase();
        StringBuffer result = new StringBuffer();
        if ("int unsigned".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("tinyint unsigned".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("smallint unsigned".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("bigint".equals(tableColumnType)) {
            result.append("Long");
        }
        if ("mediumint unsigned".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("int".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("varchar".equals(tableColumnType)) {
            result.append("String");
        }
        if ("tinyint".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("datetime".equals(tableColumnType)) {
            result.append("Date");
        }
        if ("date".equals(tableColumnType)) {
            result.append("Date");
        }
        if ("mediumtext".equals(tableColumnType)) {
            result.append("String");
        }
        if ("timestamp".equals(tableColumnType)) {
            result.append("Timestamp");
        }
        if ("decimal".equals(tableColumnType)) {
            result.append("Double");
        }
        if ("smallint".equals(tableColumnType)) {
            result.append("Integer");
        }
        if ("char".equals(tableColumnType)) {
            result.append("String");
        }
        if ("longtext".equals(tableColumnType)) {
            result.append("String");
        }

        return result.toString();
    }
}
