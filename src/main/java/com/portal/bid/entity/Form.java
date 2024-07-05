package com.portal.bid.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "opportunity")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("priorityBid")
    @Column(name = "priority_bid")
    private String priorityBid;

    @JsonProperty("obFy")
    @Column(name = "ob_fy")
    private String obFy;

    @JsonProperty("obQtr")
    @Column(name = "ob_qtr")
    private String obQtr;

    @JsonProperty("obMmm")
    @Column(name = "ob_mmm")
    private String obMmm;

    @JsonProperty("priority")
    @Column(name = "priority")
    private String priority;

    @JsonProperty("opportunity")
    @Column(name = "opportunity")
    private String opportunity;

    @JsonProperty("opportunityType")
    @Column(name = "opportunity_type")
    private String opportunityType;

    @JsonProperty("amountInrCrMax")
    @Column(name = "amount_inr_cr_max")
    private BigDecimal amountInrCrMax;

    @JsonProperty("amountInrCrMin")
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
    private String dealStatus;

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
    private String gmPercentage;

    @JsonProperty("probability")
    @Column(name = "probability")
    private String probability;

    @JsonProperty("salesRole")
    @Column(name = "sales_role")
    private String salesRole;

    @JsonProperty("primaryOwner")
    @Column(name = "primary_owner")
    private String primaryOwner;

    @JsonProperty("leaderForAircover")
    @Column(name = "leader_for_aircover")
    private String leaderForAircover;

    @JsonProperty("source")
    @Column(name = "source")
    private String source;

    @JsonProperty("sourcePerson")
    @Column(name = "source_person")
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
}
