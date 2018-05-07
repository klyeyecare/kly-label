/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klyeyecare.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "frameinventory")
@XmlRootElement
@NamedQueries({
    //Frame
    @NamedQuery(name = "findFrame", query = "SELECT f FROM Frame f ORDER BY f.manufacturername, f.collectionname, f.framename")
    , @NamedQuery(name = "findFrameById", query = "SELECT f FROM Frame f WHERE f.frameid = :frameid ORDER BY f.manufacturername, f.collectionname, f.framename")
})
public class Frame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "frameid")
    private Integer frameid;
    @Column(name = "detailed_domain_id")
    private Integer detailedDomainId;
    @Column(name = "manufacturerid")
    private Integer manufacturerid;
    @Column(name = "framenumber")
    private String framenumber;
    @Column(name = "framename")
    private String framename;
    @Column(name = "frametypeid")
    private Integer frametypeid;
    @Column(name = "colorid")
    private Integer colorid;
    @Column(name = "colornumber")
    private String colornumber;
    @Column(name = "materialid")
    private Integer materialid;
    @Column(name = "a")
    private BigDecimal a;
    @Column(name = "dbl")
    private BigDecimal dbl;
    @Column(name = "templelength")
    private BigDecimal templelength;
    @Column(name = "templestyleid")
    private Integer templestyleid;
    @Column(name = "b")
    private BigDecimal b;
    @Column(name = "ed")
    private BigDecimal ed;
    @Column(name = "safety")
    private String safety;
    @Column(name = "quantitysold")
    private Integer quantitysold;
    @Column(name = "quantitypurchased")
    private Integer quantitypurchased;
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "retailprice")
    private BigDecimal retailprice;
    @Column(name = "taxable")
    private String taxable;
    @Column(name = "notes")
    private String notes;
    @Column(name = "lastupdateduser")
    private String lastupdateduser;
    @Column(name = "lastupdateddt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdateddt;
    @Column(name = "upccode")
    private String upccode;
    @Column(name = "structure_id")
    private Integer structureId;
    @Column(name = "structure_type")
    private String structureType;
    @Column(name = "gross_percentage")
    private BigDecimal grossPercentage;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "spiff")
    private BigDecimal spiff;
    @Column(name = "deleted")
    private String deleted;
    @Column(name = "inventory")
    private String inventory;
    @Column(name = "collectionid")
    private Integer collectionid;
    @Column(name = "taxid")
    private Integer taxid;
    @Column(name = "taxid2")
    private Integer taxid2;
    @Column(name = "eyesize")
    private Short eyesize;
    @Column(name = "bridgesize")
    private Short bridgesize;
    @Column(name = "locationid")
    private Integer locationid;
    @Column(name = "groupcost")
    private BigDecimal groupcost;
    @Column(name = "lastLocation")
    private String lastLocation;
    @Column(name = "lastVersionNum")
    private Integer lastVersionNum;
    @Column(name = "lastProgramName")
    private String lastProgramName;
    @Column(name = "styleid")
    private String styleid;
    @Column(name = "colordescription")
    private String colordescription;
    @Column(name = "lenscolor")
    private String lenscolor;
    @Column(name = "lenscolorcode")
    private BigDecimal lenscolorcode;
    @Column(name = "circumference")
    private BigDecimal circumference;
    @Column(name = "edangle")
    private BigDecimal edangle;
    @Column(name = "frontprice")
    private BigDecimal frontprice;
    @Column(name = "halftemplesprice")
    private BigDecimal halftemplesprice;
    @Column(name = "templesprice")
    private BigDecimal templesprice;
    @Column(name = "manufacturername")
    private String manufacturername;
    @Column(name = "brandname")
    private String brandname;
    @Column(name = "collectionname")
    private String collectionname;
    @Column(name = "gendertype")
    private String gendertype;
    @Column(name = "agegroup")
    private String agegroup;
    @Column(name = "activestatus")
    private String activestatus;
    @Column(name = "productgroupname")
    private String productgroupname;
    @Column(name = "rimtype")
    private String rimtype;
    @Column(name = "material")
    private String material;
    @Column(name = "frameshape")
    private String frameshape;
    @Column(name = "country")
    private String country;
    @Column(name = "sku")
    private String sku;
    @Column(name = "yearintroduced")
    private String yearintroduced;
    @Column(name = "upccode_type")
    private String upccodeType;
    @Column(name = "default_supplierid")
    private Integer defaultSupplierid;
    @Column(name = "price_group_id")
    private Integer priceGroupId;
    @Column(name = "discontinue_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discontinueDt;
    @Column(name = "created_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDt;
    @Column(name = "commission_flag")
    private String commissionFlag;
    @Column(name = "frame_usage")
    private String frameUsage;
    @Column(name = "user_defined")
    private String userDefined;
    @Column(name = "user_defined_2")
    private String userDefined2;
    @Column(name = "bridge")
    private String bridge;
    @Column(name = "dbm")
    private BigDecimal dbm;
    @Column(name = "frame_lens_range_id")
    private Integer frameLensRangeId;
    @Column(name = "trace_file")
    private String traceFile;
    @Column(name = "msrp")
    private BigDecimal msrp;
    @Column(name = "rimless_flag")
    private String rimlessFlag;
    @Column(name = "placeofservice")
    private String placeofservice;
    @Column(name = "source")
    private String source;
    @Column(name = "externalid")
    private String externalid;
    @Column(name = "upcsystem")
    private String upcsystem;
    @Column(name = "third_party_transferred")
    private String thirdPartyTransferred;

    public Frame() {
    }

    public Frame(Integer frameid) {
        this.frameid = frameid;
    }

    public Integer getFrameid() {
        return frameid;
    }

    public void setFrameid(Integer frameid) {
        this.frameid = frameid;
    }

    public Integer getDetailedDomainId() {
        return detailedDomainId;
    }

    public void setDetailedDomainId(Integer detailedDomainId) {
        this.detailedDomainId = detailedDomainId;
    }

    public Integer getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Integer manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public String getFramenumber() {
        return framenumber;
    }

    public void setFramenumber(String framenumber) {
        this.framenumber = framenumber;
    }

    public String getFramename() {
        return framename;
    }

    public void setFramename(String framename) {
        this.framename = framename;
    }

    public Integer getFrametypeid() {
        return frametypeid;
    }

    public void setFrametypeid(Integer frametypeid) {
        this.frametypeid = frametypeid;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColornumber() {
        return colornumber;
    }

    public void setColornumber(String colornumber) {
        this.colornumber = colornumber;
    }

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getDbl() {
        return dbl;
    }

    public void setDbl(BigDecimal dbl) {
        this.dbl = dbl;
    }

    public BigDecimal getTemplelength() {
        return templelength;
    }

    public void setTemplelength(BigDecimal templelength) {
        this.templelength = templelength;
    }

    public Integer getTemplestyleid() {
        return templestyleid;
    }

    public void setTemplestyleid(Integer templestyleid) {
        this.templestyleid = templestyleid;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getEd() {
        return ed;
    }

    public void setEd(BigDecimal ed) {
        this.ed = ed;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public Integer getQuantitysold() {
        return quantitysold;
    }

    public void setQuantitysold(Integer quantitysold) {
        this.quantitysold = quantitysold;
    }

    public Integer getQuantitypurchased() {
        return quantitypurchased;
    }

    public void setQuantitypurchased(Integer quantitypurchased) {
        this.quantitypurchased = quantitypurchased;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getRetailprice() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(retailprice);
    }

    public void setRetailprice(BigDecimal retailprice) {
        this.retailprice = retailprice;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getLastupdateddt() {
        return lastupdateddt;
    }

    public void setLastupdateddt(Date lastupdateddt) {
        this.lastupdateddt = lastupdateddt;
    }

    public String getUpccode() {
        return upccode;
    }

    public void setUpccode(String upccode) {
        this.upccode = upccode;
    }

    public Integer getStructureId() {
        return structureId;
    }

    public void setStructureId(Integer structureId) {
        this.structureId = structureId;
    }

    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public BigDecimal getGrossPercentage() {
        return grossPercentage;
    }

    public void setGrossPercentage(BigDecimal grossPercentage) {
        this.grossPercentage = grossPercentage;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSpiff() {
        return spiff;
    }

    public void setSpiff(BigDecimal spiff) {
        this.spiff = spiff;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public Integer getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(Integer collectionid) {
        this.collectionid = collectionid;
    }

    public Integer getTaxid() {
        return taxid;
    }

    public void setTaxid(Integer taxid) {
        this.taxid = taxid;
    }

    public Integer getTaxid2() {
        return taxid2;
    }

    public void setTaxid2(Integer taxid2) {
        this.taxid2 = taxid2;
    }

    public Short getEyesize() {
        return eyesize;
    }

    public void setEyesize(Short eyesize) {
        this.eyesize = eyesize;
    }

    public Short getBridgesize() {
        return bridgesize;
    }

    public void setBridgesize(Short bridgesize) {
        this.bridgesize = bridgesize;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public BigDecimal getGroupcost() {
        return groupcost;
    }

    public void setGroupcost(BigDecimal groupcost) {
        this.groupcost = groupcost;
    }

    public String getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

    public Integer getLastVersionNum() {
        return lastVersionNum;
    }

    public void setLastVersionNum(Integer lastVersionNum) {
        this.lastVersionNum = lastVersionNum;
    }

    public String getLastProgramName() {
        return lastProgramName;
    }

    public void setLastProgramName(String lastProgramName) {
        this.lastProgramName = lastProgramName;
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid;
    }

    public String getColordescription() {
        return colordescription;
    }

    public void setColordescription(String colordescription) {
        this.colordescription = colordescription;
    }

    public String getLenscolor() {
        return lenscolor;
    }

    public void setLenscolor(String lenscolor) {
        this.lenscolor = lenscolor;
    }

    public BigDecimal getLenscolorcode() {
        return lenscolorcode;
    }

    public void setLenscolorcode(BigDecimal lenscolorcode) {
        this.lenscolorcode = lenscolorcode;
    }

    public BigDecimal getCircumference() {
        return circumference;
    }

    public void setCircumference(BigDecimal circumference) {
        this.circumference = circumference;
    }

    public BigDecimal getEdangle() {
        return edangle;
    }

    public void setEdangle(BigDecimal edangle) {
        this.edangle = edangle;
    }

    public BigDecimal getFrontprice() {
        return frontprice;
    }

    public void setFrontprice(BigDecimal frontprice) {
        this.frontprice = frontprice;
    }

    public BigDecimal getHalftemplesprice() {
        return halftemplesprice;
    }

    public void setHalftemplesprice(BigDecimal halftemplesprice) {
        this.halftemplesprice = halftemplesprice;
    }

    public BigDecimal getTemplesprice() {
        return templesprice;
    }

    public void setTemplesprice(BigDecimal templesprice) {
        this.templesprice = templesprice;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getCollectionname() {
        return collectionname;
    }

    public void setCollectionname(String collectionname) {
        this.collectionname = collectionname;
    }

    public String getGendertype() {
        return gendertype;
    }

    public void setGendertype(String gendertype) {
        this.gendertype = gendertype;
    }

    public String getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(String agegroup) {
        this.agegroup = agegroup;
    }

    public String getActivestatus() {
        return activestatus;
    }

    public void setActivestatus(String activestatus) {
        this.activestatus = activestatus;
    }

    public String getProductgroupname() {
        return productgroupname;
    }

    public void setProductgroupname(String productgroupname) {
        this.productgroupname = productgroupname;
    }

    public String getRimtype() {
        return rimtype;
    }

    public void setRimtype(String rimtype) {
        this.rimtype = rimtype;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFrameshape() {
        return frameshape;
    }

    public void setFrameshape(String frameshape) {
        this.frameshape = frameshape;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getYearintroduced() {
        return yearintroduced;
    }

    public void setYearintroduced(String yearintroduced) {
        this.yearintroduced = yearintroduced;
    }

    public String getUpccodeType() {
        return upccodeType;
    }

    public void setUpccodeType(String upccodeType) {
        this.upccodeType = upccodeType;
    }

    public Integer getDefaultSupplierid() {
        return defaultSupplierid;
    }

    public void setDefaultSupplierid(Integer defaultSupplierid) {
        this.defaultSupplierid = defaultSupplierid;
    }

    public Integer getPriceGroupId() {
        return priceGroupId;
    }

    public void setPriceGroupId(Integer priceGroupId) {
        this.priceGroupId = priceGroupId;
    }

    public Date getDiscontinueDt() {
        return discontinueDt;
    }

    public void setDiscontinueDt(Date discontinueDt) {
        this.discontinueDt = discontinueDt;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCommissionFlag() {
        return commissionFlag;
    }

    public void setCommissionFlag(String commissionFlag) {
        this.commissionFlag = commissionFlag;
    }

    public String getFrameUsage() {
        return frameUsage;
    }

    public void setFrameUsage(String frameUsage) {
        this.frameUsage = frameUsage;
    }

    public String getUserDefined() {
        return userDefined;
    }

    public void setUserDefined(String userDefined) {
        this.userDefined = userDefined;
    }

    public String getUserDefined2() {
        return userDefined2;
    }

    public void setUserDefined2(String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    public BigDecimal getDbm() {
        return dbm;
    }

    public void setDbm(BigDecimal dbm) {
        this.dbm = dbm;
    }

    public Integer getFrameLensRangeId() {
        return frameLensRangeId;
    }

    public void setFrameLensRangeId(Integer frameLensRangeId) {
        this.frameLensRangeId = frameLensRangeId;
    }

    public String getTraceFile() {
        return traceFile;
    }

    public void setTraceFile(String traceFile) {
        this.traceFile = traceFile;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public String getRimlessFlag() {
        return rimlessFlag;
    }

    public void setRimlessFlag(String rimlessFlag) {
        this.rimlessFlag = rimlessFlag;
    }

    public String getPlaceofservice() {
        return placeofservice;
    }

    public void setPlaceofservice(String placeofservice) {
        this.placeofservice = placeofservice;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getExternalid() {
        return externalid;
    }

    public void setExternalid(String externalid) {
        this.externalid = externalid;
    }

    public String getUpcsystem() {
        return upcsystem;
    }

    public void setUpcsystem(String upcsystem) {
        this.upcsystem = upcsystem;
    }

    public String getThirdPartyTransferred() {
        return thirdPartyTransferred;
    }

    public void setThirdPartyTransferred(String thirdPartyTransferred) {
        this.thirdPartyTransferred = thirdPartyTransferred;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frameid != null ? frameid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Frame)) {
            return false;
        }
        Frame other = (Frame) object;
        if ((this.frameid == null && other.frameid != null) || (this.frameid != null && !this.frameid.equals(other.frameid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "klyeyecare.entities.Frame[ frameid=" + frameid + " ]";
    }

}
