package com.learn_javaweb;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class TestDom4J {
    @Test
    public void test1() throws DocumentException {
        //读取jdbc.xml配置文件，获得document对象
        SAXReader saxReader = new SAXReader();

        //通过类加载器获得指向字节码根路径下的指定文件的输入流
        InputStream resourceAsStream = TestDom4J.class.getClassLoader().getResourceAsStream("jdbc.xml");
        //通过输入流获得配置文件，解析成一个dom对象
        Document document = saxReader.read(resourceAsStream);
        //从document对象获取配置文件中的信息
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        //获取元素下的子元素
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("  " + element.getName());
            //从元素上获取属性
            List<Attribute> attributes = element.attributes();
            for (Attribute attribute : attributes) {
                System.out.println("    " + attribute.getName());
            }
            //继续读取子元素
            List<Element> eles = element.elements();
            for (Element ele : eles) {
                System.out.println("      " + ele.getName() + ":" + ele.getText());
            }

        }

    }
}
