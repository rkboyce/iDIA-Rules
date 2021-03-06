package edu.pitt.dbmi.ohdsiv5.db;
// Generated Aug 25, 2010 7:48:41 AM by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ConceptSynonym generated by hbm2java
 */
@Entity
@Table(name="CONCEPT_SYNONYM", uniqueConstraints = {  })

public class ConceptSynonym  implements java.io.Serializable {


    // Fields    

     private BigDecimal conceptSynonymId;
     private BigDecimal conceptId;
     private String descriptionName;


    // Constructors

    /** default constructor */
    public ConceptSynonym() {
    }

    
    /** full constructor */
    public ConceptSynonym(BigDecimal conceptSynonymId, BigDecimal conceptId, String descriptionName) {
        this.conceptSynonymId = conceptSynonymId;
        this.conceptId = conceptId;
        this.descriptionName = descriptionName;
    }
    

   
    // Property accessors
    @Id
    @Column(name="CONCEPT_SYNONYM_ID", unique=true, nullable=false, insertable=true, updatable=true, precision=22, scale=0)

    public BigDecimal getConceptSynonymId() {
        return this.conceptSynonymId;
    }
    
    public void setConceptSynonymId(BigDecimal conceptSynonymId) {
        this.conceptSynonymId = conceptSynonymId;
    }
    @Column(name="CONCEPT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=22, scale=0)

    public BigDecimal getConceptId() {
        return this.conceptId;
    }
    
    public void setConceptId(BigDecimal conceptId) {
        this.conceptId = conceptId;
    }
    @Column(name="DESCRIPTION_NAME", unique=false, nullable=false, insertable=true, updatable=true, length=1000)

    public String getDescriptionName() {
        return this.descriptionName;
    }
    
    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName;
    }
   








}
