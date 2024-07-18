package com.portal.bid.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "opportunity")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JsonProperty("priorityBid")
    @Column(name = "priority_bid")
    private String priorityBid;

//    @JsonProperty("obFy")
    @Column(name = "ob_fy")
    private String obFy;

//    @JsonProperty("obQtr")
    @Column(name = "ob_qtr")
    private String obQtr;

//    @JsonProperty("obMmm")
    @Column(name = "ob_mmm")
    private String obMmm;

//    @JsonProperty("priority")
    @Column(name = "priority")
    private String priority;

//    @JsonProperty("opportunity")
    @Column(name = "opportunity")
    private String opportunity;

//    @JsonProperty("opportunityType")
    @Column(name = "opportunity_type")
    private String opportunityType;

//    @JsonProperty("amountInrCrMax")
    @Column(name = "amount_inr_cr_max")
    private BigDecimal amountInrCrMax;

//    @JsonProperty("amountInrCrMin")
    @Column(name = "amount_inr_cr_min")
    private BigDecimal amountInrCrMin;

    @JsonProperty("revInObQtr")
    @Column(name = "rev_in_ob_qtr")
    private BigDecimal revInObQtr;

    @JsonProperty("revInObQtrPlus1")
    @Column(name = "rev_in_ob_qtr_plus_1")
    private BigDecimal revInObQtrPlus1;

    @JsonProperty("businessUnit")
    @Column(name = "business_unit")
    private String businessUnit;

    @JsonProperty("industrySegment")
    @Column(name = "industry_segment")
    private String industrySegment;

    @JsonProperty("primaryOfferingSegment")
    @Column(name = "primary_offering_segment")
    private String primaryOfferingSegment;

    @JsonProperty("secondaryOfferingSegment")
    @Column(name = "secondary_offering_segment")
    private String secondaryOfferingSegment;

    @JsonProperty("partQuarter")
    @Column(name = "part_quarter")
    private String partQuarter;

    @JsonProperty("partMonth")
    @Column(name = "part_month")
    private String partMonth;

    @JsonProperty("projectTenureMonths")
    @Column(name = "project_tenure_months")
    private Integer projectTenureMonths;

    @JsonProperty("estCapexInrCr")
    @Column(name = "est_capex_inr_cr")
    private BigDecimal estCapexInrCr;

    @JsonProperty("estOpexInrCr")
    @Column(name = "est_opex_inr_cr")
    private BigDecimal estOpexInrCr;

    @JsonProperty("opexTenureMonths")
    @Column(name = "opex_tenure_months")
    private Integer opexTenureMonths;

    @JsonProperty("dealStatus")
    @Column(name = "deal_status")
    private  String dealStatus;

    @JsonProperty("goNoGoStatus")
    @Column(name = "go_no_go_status")
    private String goNoGoStatus;

    @JsonProperty("goNoGoDate")
    @Column(name = "go_no_go_date")
    private LocalDate goNoGoDate;

    @JsonProperty("solutionReadiness")
    @Column(name = "solution_readiness")
    private String solutionReadiness;

    @JsonProperty("customerAlignment")
    @Column(name = "customer_alignment")
    private String customerAlignment;

    @JsonProperty("stlPreparedness")
    @Column(name = "stl_preparedness")
    private String stlPreparedness;

    @JsonProperty("readinessAsPerTimeline")
    @Column(name = "readiness_as_per_timeline")
    private String readinessAsPerTimeline;

    @JsonProperty("gmPercentage")
    @Column(name = "gm_percentage")
//    @Pattern(regexp = "^\\d+(\\.\\d+)?%?$", message = "gmPercentage must be a number or percentage (e.g., 50 or 50.5%)")
    private String gmPercentage;



    @JsonProperty("probability")
    @Column(name = "probability")
//    @Pattern(regexp = "^\\d+(\\.\\d+)?%?$", message = "Probability must be a number or percentage (e.g., 50 or 50.5%)")
    private String probability;


    @JsonProperty("salesRole")
    @Column(name = "sales_role")
    private String salesRole;

    @JsonProperty("primaryOwner")
    @Column(name = "primary_owner")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "primary Owner must contain only alphabetic characters")
    private String primaryOwner;

    @JsonProperty("leaderForAircover")
    @Column(name = "leader_for_aircover")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Leader for aircover must contain only alphabetic characters")
    private String leaderForAircover;

    @JsonProperty("source")
    @Column(name = "source")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Source must contain only alphabetic characters")
    private String source;

    @JsonProperty("sourcePerson")
    @Column(name = "source_person")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "Source person must contain only alphabetic characters")
    private String sourcePerson;


    @JsonProperty("leadReceivedDate")
    @Column(name = "lead_received_date")
    private LocalDate leadReceivedDate;

    @JsonProperty("releaseDate")
    @Column(name = "release_date")
    private LocalDate releaseDate;

    @JsonProperty("submissionDate")
    @Column(name = "submission_date")
    private LocalDate submissionDate;

    @JsonProperty("decisionDate")
    @Column(name = "decision_date")
    private LocalDate decisionDate;

    @JsonProperty("additionalRemarks")
    @Column(name = "additional_remarks")
    private String additionalRemarks;

    @JsonProperty("tenderNo")
    @Column(name = "tender_no")
    private String tenderNo;

    @JsonProperty("scopeOfWork")
    @Column(name = "scope_of_work", columnDefinition = "TEXT")
    private String scopeOfWork;

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriorityBid() {
        return priorityBid;
    }

    public void setPriorityBid(String priorityBid) {
        this.priorityBid = priorityBid;
    }

    public String getObFy() {
        return obFy;
    }

    public void setObFy(String obFy) {
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
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

    public BigDecimal getRevInObQtr() {
        return revInObQtr;
    }

    public void setRevInObQtr(BigDecimal revInObQtr) {
        this.revInObQtr = revInObQtr;
    }

    public BigDecimal getRevInObQtrPlus1() {
        return revInObQtrPlus1;
    }

    public void setRevInObQtrPlus1(BigDecimal revInObQtrPlus1) {
        this.revInObQtrPlus1 = revInObQtrPlus1;
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

    public String getPrimaryOfferingSegment() {
        return primaryOfferingSegment;
    }

    public void setPrimaryOfferingSegment(String primaryOfferingSegment) {
        this.primaryOfferingSegment = primaryOfferingSegment;
    }

    public String getSecondaryOfferingSegment() {
        return secondaryOfferingSegment;
    }

    public void setSecondaryOfferingSegment(String secondaryOfferingSegment) {
        this.secondaryOfferingSegment = secondaryOfferingSegment;
    }

    public String getPartQuarter() {
        return partQuarter;
    }

    public void setPartQuarter(String partQuarter) {
        this.partQuarter = partQuarter;
    }

    public String getPartMonth() {
        return partMonth;
    }

    public void setPartMonth(String partMonth) {
        this.partMonth = partMonth;
    }

    public Integer getProjectTenureMonths() {
        return projectTenureMonths;
    }

    public void setProjectTenureMonths(Integer projectTenureMonths) {
        this.projectTenureMonths = projectTenureMonths;
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

    public Integer getOpexTenureMonths() {
        return opexTenureMonths;
    }

    public void setOpexTenureMonths(Integer opexTenureMonths) {
        this.opexTenureMonths = opexTenureMonths;
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

    public String getSolutionReadiness() {
        return solutionReadiness;
    }

    public void setSolutionReadiness(String solutionReadiness) {
        this.solutionReadiness = solutionReadiness;
    }

    public String getCustomerAlignment() {
        return customerAlignment;
    }

    public void setCustomerAlignment(String customerAlignment) {
        this.customerAlignment = customerAlignment;
    }

    public String getStlPreparedness() {
        return stlPreparedness;
    }

    public void setStlPreparedness(String stlPreparedness) {
        this.stlPreparedness = stlPreparedness;
    }

    public String getReadinessAsPerTimeline() {
        return readinessAsPerTimeline;
    }

    public void setReadinessAsPerTimeline(String readinessAsPerTimeline) {
        this.readinessAsPerTimeline = readinessAsPerTimeline;
    }

    public String getGmPercentage() {
        return gmPercentage;
    }

    public void setGmPercentage(String gmPercentage) {
        this.gmPercentage = gmPercentage;
    }

    public @Pattern(regexp = "^\\d+(\\.\\d+)?%?$", message = "Probability must be a number or percentage (e.g., 50 or 50.5%)") String getProbability() {
        return probability;
    }

    public void setProbability(@Pattern(regexp = "^\\d+(\\.\\d+)?%?$", message = "Probability must be a number or percentage (e.g., 50 or 50.5%)") String probability) {
        this.probability = probability;
    }

    public String getSalesRole() {
        return salesRole;
    }

    public void setSalesRole(String salesRole) {
        this.salesRole = salesRole;
    }

    public @Pattern(regexp = "^[A-Za-z]+$", message = "primary Owner must contain only alphabetic characters") String getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(@Pattern(regexp = "^[A-Za-z]+$", message = "primary Owner must contain only alphabetic characters") String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public @Pattern(regexp = "^[A-Za-z]+$", message = "Leader for aircover must contain only alphabetic characters") String getLeaderForAircover() {
        return leaderForAircover;
    }

    public void setLeaderForAircover(@Pattern(regexp = "^[A-Za-z]+$", message = "Leader for aircover must contain only alphabetic characters") String leaderForAircover) {
        this.leaderForAircover = leaderForAircover;
    }

    public @Pattern(regexp = "^[A-Za-z]+$", message = "Source must contain only alphabetic characters") String getSource() {
        return source;
    }

    public void setSource(@Pattern(regexp = "^[A-Za-z]+$", message = "Source must contain only alphabetic characters") String source) {
        this.source = source;
    }

    public @Pattern(regexp = "^[A-Za-z]+$", message = "Source person must contain only alphabetic characters") String getSourcePerson() {
        return sourcePerson;
    }

    public void setSourcePerson(@Pattern(regexp = "^[A-Za-z]+$", message = "Source person must contain only alphabetic characters") String sourcePerson) {
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

    public String getTenderNo() {
        return tenderNo;
    }

    public void setTenderNo(String tenderNo) {
        this.tenderNo = tenderNo;
    }

    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public void setScopeOfWork(String scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }
}
