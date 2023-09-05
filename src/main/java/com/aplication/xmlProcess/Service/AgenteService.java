package com.aplication.xmlProcess.Service;

import java.io.StringReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class AgenteService {

	//Neste método será a leitura de forma incremental aliviando a memória, em casos de grandes quantidades de dados
	public void processarXml(String xml) throws Exception {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new StringReader(xml));

        while (xmlStreamReader.hasNext()) {
            int event = xmlStreamReader.next();

            if (event == XMLStreamReader.START_ELEMENT && "agente".equals(xmlStreamReader.getLocalName())) {
                // Começa o processamento de um agente
                processarAgente(xmlStreamReader);
            }
        }

        xmlStreamReader.close();
    }
	
	
	 private void processarAgente(XMLStreamReader xmlStreamReader) throws Exception {
	      
		 
		 
	    }
}
