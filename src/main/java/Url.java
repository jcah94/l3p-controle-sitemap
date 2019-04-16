//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.04.16 à 06:12:02 PM CEST 
//


package main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="loc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastmod" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changefreq" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "url")
public class Url {

    @XmlAttribute(name = "loc", required = true)
    protected String loc;
    @XmlAttribute(name = "lastmod", required = true)
    protected String lastmod;
    @XmlAttribute(name = "changefreq", required = true)
    protected String changefreq;
    @XmlAttribute(name = "priority", required = true)
    protected String priority;

    /**
     * Obtient la valeur de la propriété loc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Définit la valeur de la propriété loc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc(String value) {
        this.loc = value;
    }

    /**
     * Obtient la valeur de la propriété lastmod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmod() {
        return lastmod;
    }

    /**
     * Définit la valeur de la propriété lastmod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmod(String value) {
        this.lastmod = value;
    }

    /**
     * Obtient la valeur de la propriété changefreq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangefreq() {
        return changefreq;
    }

    /**
     * Définit la valeur de la propriété changefreq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangefreq(String value) {
        this.changefreq = value;
    }

    /**
     * Obtient la valeur de la propriété priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Définit la valeur de la propriété priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

}
