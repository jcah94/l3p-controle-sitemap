package fr.l3p.upec.l3pcontrolesitemap;

import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Component
public class SitemapService {


    public void generateSitemapJavaToXML(){

    }

    public generateXMLToJava() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(main.java.ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<main.java.Url> unmarshalledObject =
                (JAXBElement<main.java.Url>)unmarshaller.unmarshal(
                        ClassLoader.getSystemResourceAsStream("/sitemap.xml"));
        main.java.Url urlsetObj = unmarshalledObject.getValue();
        List user = expenseObj.getUser();
        ItemListT items = expenseObj.getItems();

        System.out.println("Printing the Expense for: "+user.getUserName());
        for (  item : .get()){
            System.out.println("Name: "+item.getItemName());
            System.out.println("Value: "+item.getAmount());
            System.out.println("Date of Purchase: "+item.getPurchasedOn());
        }
    }



}
