package cn.bidlink.codegen.core;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.File;
import java.io.FileWriter;

public class VelocityHelper {
    /**
     * 根据给定的vm模板和上下文生成html页面
     *
     * @param inputVmFilePath    vm模板
     * @param outputHtmlFilePath 输出html页面
     * @param context            上下文
     * @throws Exception
     */
    public static void generate(String inputVmFilePath, String outputHtmlFilePath,
                                    VelocityContext context) throws Exception {
        FileWriter writer = null;
        try {
            VelocityEngine ve = new VelocityEngine();
            ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
            ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
            ve.init();
            Template template = ve.getTemplate(inputVmFilePath, "utf-8");
            File outputFile = new File(outputHtmlFilePath);
            writer = new FileWriter(outputFile);
            template.merge(context, writer);
        } catch (Exception ex) {
            throw ex;
        }finally {
            if(writer!=null){
                writer.close();
            }
        }
    }
}
