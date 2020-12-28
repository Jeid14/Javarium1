package Executor;

import com.company.ConvertStringToFormat.PersonConvertToXML;
import com.company.Person;
import com.company.ScanerFileName;
import com.company.utils.FileHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.*;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.*;
import javax.xml.transform.TransformerException;

public class XmlExecutor implements Executable {
    PersonConvertToXML personConvertToXML = new PersonConvertToXML();
    FileHelper fileHelper = new FileHelper();
    ScanerFileName scanerFileName = new ScanerFileName();

    @Override
    public void write(List<Person> personList) {

    }


    @Override
    public List<Person> read() throws IOException {
        return null;
    }

    @Override
    public boolean update(List<Person> person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
