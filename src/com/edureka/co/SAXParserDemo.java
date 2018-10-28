package com.edureka.co;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class SAXHandler extends DefaultHandler{

    public void startDocument() throws SAXException {
        System.out.println("== Document Parsing Started ==");

    }


    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.print("<"+qName+">");
    }


    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch,start,length);
        System.out.print(str);
    }


    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("</"+qName+">");
    }

    public void endDocument() throws SAXException {
        System.out.println("==Document Parsing Finished==");
    }


}

public class SAXParserDemo {
    public static void main(String[] args){
        try{
            File file = new File("C:\\Users\\w.gjamia\\Documents\\xml","MyStudent.xml");
            FileInputStream fis = new FileInputStream(file);

            SAXHandler handler = new SAXHandler();
            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
            parser.parse(fis,handler);



        }catch (Exception e){
            System.out.println("Some Exception: "+e );
        }

    }

}
