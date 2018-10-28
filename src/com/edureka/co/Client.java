package com.edureka.co;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Wesam", "wgjamia@gmail.com", 40, "HiAlndulos");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElm = document.createElement("students");
            Element studentElm = document.createElement("student");
            Element rollElm = document.createElement("roll");
            Element SnameElm = document.createElement("Sname");
            Element EmailElm = document.createElement("Email");
            Element AgeElm = document.createElement("Age");
            Element AddressElm = document.createElement("Address");

            Text txtRoll = document.createTextNode(String.valueOf(s1.getRoll()));
            Text txtSname = document.createTextNode(s1.getSName());
            Text txtEmail = document.createTextNode(s1.getEmal());
            Text txtAge = document.createTextNode(String.valueOf(s1.getAge()));
            Text txtAddress = document.createTextNode(s1.getAddress());

            rollElm.appendChild(txtRoll);
            SnameElm.appendChild(txtSname);
            EmailElm.appendChild(txtEmail);
            AgeElm.appendChild(txtAge);
            AddressElm.appendChild(txtAddress);

            studentElm.appendChild(rollElm);
            studentElm.appendChild(SnameElm);
            studentElm.appendChild(EmailElm);
            studentElm.appendChild(AgeElm);
            studentElm.appendChild(AddressElm);

            rootElm.appendChild(studentElm);
            document.appendChild(rootElm);

            File file = new File("C:\\Users\\w.gjamia\\Documents\\xml","MyStudent.xml");
            FileOutputStream fos = new FileOutputStream(file);
            StreamResult result = new StreamResult(fos);

            DOMSource source = new DOMSource(document);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source,result);

            System.out.println(file.getName()+" Generated....");


        } catch (Exception e){
            System.out.println("Some Exception:"+e);
        }
    }
}
