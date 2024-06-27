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
    private Integer ob_fy;

//    @Column(name = "ob_qtr")
    private String ob_qtr;

//    @Column(name = "ob_mmm")
    private String ob_Mmm;

//    @Column(name = "priority")
    private Integer priority;

//    @Column(name = "opportunity")
    private String opportunity;

//    @Column(name = "opportunity_type")
//    private String opportunityType;

//    @Column(name = "amount_inr_cr_max")
    private BigDecimal amount_inr_cr_max;

//    @Column(name = "amount_inr_cr_min")
    private BigDecimal amount_inr_cr_min;

//    @Column(name = "business_unit")
    private String business_unit;

//    @Column(name = "industry_segment")
    private String industry_segment;

//    @Column(name = "est_capex_inr_cr")
    private BigDecimal est_capex_inr_cr;

//    @Column(name = "est_opex_inr_cr")
    private BigDecimal est_opex_inr_cr;

//    @Column(name = "deal_status")
    private String deal_status;

//    @Column(name = "go_no_go_status")
    private String go_no_go_status;

//    @Column(name = "go_no_go_date")
    private LocalDate go_no_go_date;

//    @Column(name = "gm_percentage")
    private BigDecimal gm_percentage;

//    @Column(name = "probability")
    private BigDecimal probability;

//    @Column(name = "sales_role")
    private String sales_role;

//    @Column(name = "primary_owner")
    private String primary_owner;

//    @Column(name = "source")
    private String source;

//    @Column(name = "source_person")
    private String source_person;

//    @Column(name = "lead_received_date")
    private LocalDate lead_received_date;

//    @Column(name = "release_date")
    private LocalDate release_date;

//    @Column(name = "submission_date")
    private LocalDate submission_date;


//    @Column(name = "decision_date")
    private LocalDate decision_date;

//    @Column(name = "additional_remarks")
    private String additional_remarks;

    // Getters and setters omitted for brevity
}
