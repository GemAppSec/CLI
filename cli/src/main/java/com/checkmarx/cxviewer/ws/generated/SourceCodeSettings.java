
package com.checkmarx.cxviewer.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceCodeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceCodeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceOrigin" type="{http://Checkmarx.com/v7}SourceLocationType"/>
 *         &lt;element name="UserCredentials" type="{http://Checkmarx.com/v7}Credentials" minOccurs="0"/>
 *         &lt;element name="PathList" type="{http://Checkmarx.com/v7}ArrayOfScanPath" minOccurs="0"/>
 *         &lt;element name="SourceControlSetting" type="{http://Checkmarx.com/v7}SourceControlSettings" minOccurs="0"/>
 *         &lt;element name="PackagedCode" type="{http://Checkmarx.com/v7}LocalCodeContainer" minOccurs="0"/>
 *         &lt;element name="SourcePullingAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceCodeSettings", propOrder = {
    "sourceOrigin",
    "userCredentials",
    "pathList",
    "sourceControlSetting",
    "packagedCode",
    "sourcePullingAction"
})
public class SourceCodeSettings {

    @XmlElement(name = "SourceOrigin", required = true)
    protected SourceLocationType sourceOrigin;
    @XmlElement(name = "UserCredentials")
    protected Credentials userCredentials;
    @XmlElement(name = "PathList")
    protected ArrayOfScanPath pathList;
    @XmlElement(name = "SourceControlSetting")
    protected SourceControlSettings sourceControlSetting;
    @XmlElement(name = "PackagedCode")
    protected LocalCodeContainer packagedCode;
    @XmlElement(name = "SourcePullingAction")
    protected String sourcePullingAction;

    /**
     * Gets the value of the sourceOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocationType }
     *     
     */
    public SourceLocationType getSourceOrigin() {
        return sourceOrigin;
    }

    /**
     * Sets the value of the sourceOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocationType }
     *     
     */
    public void setSourceOrigin(SourceLocationType value) {
        this.sourceOrigin = value;
    }

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setUserCredentials(Credentials value) {
        this.userCredentials = value;
    }

    /**
     * Gets the value of the pathList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScanPath }
     *     
     */
    public ArrayOfScanPath getPathList() {
        return pathList;
    }

    /**
     * Sets the value of the pathList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScanPath }
     *     
     */
    public void setPathList(ArrayOfScanPath value) {
        this.pathList = value;
    }

    /**
     * Gets the value of the sourceControlSetting property.
     * 
     * @return
     *     possible object is
     *     {@link SourceControlSettings }
     *     
     */
    public SourceControlSettings getSourceControlSetting() {
        return sourceControlSetting;
    }

    /**
     * Sets the value of the sourceControlSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceControlSettings }
     *     
     */
    public void setSourceControlSetting(SourceControlSettings value) {
        this.sourceControlSetting = value;
    }

    /**
     * Gets the value of the packagedCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocalCodeContainer }
     *     
     */
    public LocalCodeContainer getPackagedCode() {
        return packagedCode;
    }

    /**
     * Sets the value of the packagedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalCodeContainer }
     *     
     */
    public void setPackagedCode(LocalCodeContainer value) {
        this.packagedCode = value;
    }

    /**
     * Gets the value of the sourcePullingAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePullingAction() {
        return sourcePullingAction;
    }

    /**
     * Sets the value of the sourcePullingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePullingAction(String value) {
        this.sourcePullingAction = value;
    }

}