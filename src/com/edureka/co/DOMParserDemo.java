package com.edureka.co;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParserDemo {
    public static void main(String[] args){
        try{
            File file = new File("/home/wgjamia/Documents/","MyStudent.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            System.out.println("Root Element:"+document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("student");
            System.out.println("NodeList for tag student is having a Length of:"+nodeList.getLength());

            for(int i=0;i<nodeList.getLength();i++){
                Node node = nodeList.item(i);
                System.out.println("Node Name:"+node.getNodeName());
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Roll : "+element.getElementsByTagName("roll").item(0).getTextContent());
                    System.out.println("Name : "+element.getElementsByTagName("Sname").item(0).getTextContent());
                    System.out.println("Email : "+element.getElementsByTagName("Email").item(0).getTextContent());
                    System.out.println("Age : "+element.getElementsByTagName("Age").item(0).getTextContent());
                    System.out.println("Address : "+element.getElementsByTagName("Address").item(0).getTextContent());

                    System.out.println("*********************************************************");
                }
            }



        }catch (Exception e){
            System.out.println("Some Exception:"+e);
        }
    }
}
