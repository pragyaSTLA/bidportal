package com.portal.bid.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "opportunity")
public class Form{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "ob_fy")
    private Integer obFy;

//    @Column(name = "ob_qtr")
    private String obQtr;

//    @Column(name = "ob_mmm")
    private String obMmm;

//    @Column(name = "priority")
    private Integer priority;

//    @Column(name = "opportunity")
    private String opportunity;

//    @Column(name = "opportunity_type")
    private String opportunityType;

//    @Column(name = "amount_inr_cr_max")
    private BigDecimal amountInrCrMax;

//    @Column(name = "amount_inr_cr_min")
    private BigDecimal amountInrCrMin;

//    @Column(name = "business_unit")
    private String businessUnit;

//    @Column(name = "industry_segment")
    private String industrySegment;

//    @Column(name = "est_capex_inr_cr")
    private BigDecimal estCapexInrCr;

//    @Column(name = "est_opex_inr_cr")
    private BigDecimal estOpexInrCr;

//    @Column(name = "deal_status")
    private String dealStatus;

//    @Column(name = "go_no_go_status")
    private String goNoGoStatus;

//    @Column(name = "go_no_go_date")
    private LocalDate goNoGoDate;

//    @Column(name = "gm_percentage")
    private BigDecimal gmPercentage;

//    @Column(name = "probability")
    private BigDecimal probability;

//    @Column(name = "sales_role")
    private String salesRole;

//    @Column(name = "primary_owner")
    private String primaryOwner;

//    @Column(name = "source")
    private String source;

//    @Column(name = "source_person")
    private String sourcePerson;

//    @Column(name = "lead_received_date")
    private LocalDate leadReceivedDate;

//    @Column(name = "release_date")
    private LocalDate releaseDate;

//    @Column(name = "submission_date")
    private LocalDate submissionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getObFy() {
        return obFy;
    }

    public void setObFy(Integer obFy) {
        this.obFy = obFy;
    }

    public String getObQtr() {
        return obQtr;
    }

    public void setObQtr(String obQtr) {
        this.obQtr = obQtr;
    }

    public String getObMmm() {
        return obMmm;
    }

    public void setObMmm(String obMmm) {
        this.obMmm = obMmm;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public String getOpportunityType() {
        return opportunityType;
    }

    public void setOpportunityType(String opportunityType) {
        this.opportunityType = opportunityType;
    }

    public BigDecimal getAmountInrCrMax() {
        return amountInrCrMax;
    }

    public void setAmountInrCrMax(BigDecimal amountInrCrMax) {
        this.amountInrCrMax = amountInrCrMax;
    }

    public BigDecimal getAmountInrCrMin() {
        return amountInrCrMin;
    }

    public void setAmountInrCrMin(BigDecimal amountInrCrMin) {
        this.amountInrCrMin = amountInrCrMin;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getIndustrySegment() {
        return industrySegment;
    }

    public void setIndustrySegment(String industrySegment) {
        this.industrySegment = industrySegment;
    }

    public BigDecimal getEstCapexInrCr() {
        return estCapexInrCr;
    }

    public void setEstCapexInrCr(BigDecimal estCapexInrCr) {
        this.estCapexInrCr = estCapexInrCr;
    }

    public BigDecimal getEstOpexInrCr() {
        return estOpexInrCr;
    }

    public void setEstOpexInrCr(BigDecimal estOpexInrCr) {
        this.estOpexInrCr = estOpexInrCr;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getGoNoGoStatus() {
        return goNoGoStatus;
    }

    public void setGoNoGoStatus(String goNoGoStatus) {
        this.goNoGoStatus = goNoGoStatus;
    }

    public LocalDate getGoNoGoDate() {
        return goNoGoDate;
    }

    public void setGoNoGoDate(LocalDate goNoGoDate) {
        this.goNoGoDate = goNoGoDate;
    }

    public BigDecimal getGmPercentage() {
        return gmPercentage;
    }

    public void setGmPercentage(BigDecimal gmPercentage) {
        this.gmPercentage = gmPercentage;
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public String getSalesRole() {
        return salesRole;
    }

    public void setSalesRole(String salesRole) {
        this.salesRole = salesRole;
    }

    public String getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourcePerson() {
        return sourcePerson;
    }

    public void setSourcePerson(String sourcePerson) {
        this.sourcePerson = sourcePerson;
    }

    public LocalDate getLeadReceivedDate() {
        return leadReceivedDate;
    }

    public void setLeadReceivedDate(LocalDate leadReceivedDate) {
        this.leadReceivedDate = leadReceivedDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getAdditionalRemarks() {
        return additionalRemarks;
    }

    public void setAdditionalRemarks(String additionalRemarks) {
        this.additionalRemarks = additionalRemarks;
    }

    @Column(name = "decision_date")
    private LocalDate decisionDate;

    @Column(name = "additional_remarks")
    private String additionalRemarks;

    // Getters and setters omitted for brevity
}
