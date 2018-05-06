
import by.epam.task2.appliences.Appliances;
import by.epam.task2.homeAppliances.Blender;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class XMLReader {
    private static final String PATH = "G:\\!AT\\new.xml";
    public static void main(String[] args) {
        ArrayList<Blender> Blender = getBlenderFromXML();
        System.out.println("Blenders from xml: ");
        for (Blender bl: Blender) {
            System.out.println(bl.getName() + " " + bl.getPowerConsumption());
        }

    }

    private static ArrayList<Blender> getBlenderFromXML(){
        ArrayList<Blender> blender = new ArrayList<>();
        try {
            File xmlFile = new File(PATH);
            if (xmlFile.isFile() && xmlFile.canRead()) {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);

                NodeList nList = doc.getElementsByTagName("Blenders");
                System.out.println(nList.getLength());
                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        String name = eElement.getAttribute("Name");
                        double PowerConsumption = Double.parseDouble(eElement.getElementsByTagName("PowerConsumption").item(0).getTextContent());


                        blender.add(new Blender(name, PowerConsumption));
                    }
                }
            } else {
                System.out.println("File doesn't exist.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred when parsing file. ");
        }

        return blender;
    }
}
