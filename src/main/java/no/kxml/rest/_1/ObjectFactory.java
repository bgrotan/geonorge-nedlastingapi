//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.05 at 08:37:03 AM CEST 
//


package no.kxml.rest._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kxml.rest._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Link_QNAME = new QName("http://www.kxml.no/rest/1.0", "Link");
    private final static QName _LinkListe_QNAME = new QName("http://www.kxml.no/rest/1.0", "LinkListe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kxml.rest._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link LinkListeType }
     * 
     */
    public LinkListeType createLinkListeType() {
        return new LinkListeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kxml.no/rest/1.0", name = "Link")
    public JAXBElement<LinkType> createLink(LinkType value) {
        return new JAXBElement<LinkType>(_Link_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkListeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kxml.no/rest/1.0", name = "LinkListe")
    public JAXBElement<LinkListeType> createLinkListe(LinkListeType value) {
        return new JAXBElement<LinkListeType>(_LinkListe_QNAME, LinkListeType.class, null, value);
    }

}