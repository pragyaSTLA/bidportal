package com.portal.bid.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "opportunity")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ob_fy;
    private String ob_qtr;
    private String ob_Mmm;
    private Integer priority;
    private String opportunity;
    private BigDecimal amount_inr_cr_max;
    private BigDecimal amount_inr_cr_min;
    private String business_unit;
    private String industry_segment;
    private BigDecimal est_capex_inr_cr;
    private BigDecimal est_opex_inr_cr;
    private String deal_status;
    private String go_no_go_status;
    private LocalDate go_no_go_date;
    private BigDecimal gm_percentage;
    private BigDecimal probability;
    private String sales_role;
    private String primary_owner;
    private String source;
    private String source_person;
    private LocalDate lead_received_date;
    private LocalDate release_date;
    private LocalDate submission_date;
    private LocalDate decision_date;
    private String additional_remarks;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOb_fy() {
        return ob_fy;
    }

    public void setOb_fy(Integer ob_fy) {
        this.ob_fy = ob_fy;
    }

    public String getOb_qtr() {
        return ob_qtr;
    }

    public void setOb_qtr(String ob_qtr) {
        this.ob_qtr = ob_qtr;
    }

    public String getOb_Mmm() {
        return ob_Mmm;
    }

    public void setOb_Mmm(String ob_Mmm) {
        this.ob_Mmm = ob_Mmm;
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

    public BigDecimal getAmount_inr_cr_max() {
        return amount_inr_cr_max;
    }

    public void setAmount_inr_cr_max(BigDecimal amount_inr_cr_max) {
        this.amount_inr_cr_max = amount_inr_cr_max;
    }

    public BigDecimal getAmount_inr_cr_min() {
        return amount_inr_cr_min;
    }

    public void setAmount_inr_cr_min(BigDecimal amount_inr_cr_min) {
        this.amount_inr_cr_min = amount_inr_cr_min;
    }

    public String getBusiness_unit() {
        return business_unit;
    }

    public void setBusiness_unit(String business_unit) {
        this.business_unit = business_unit;
    }

    public String getIndustry_segment() {
        return industry_segment;
    }

    public void setIndustry_segment(String industry_segment) {
        this.industry_segment = industry_segment;
    }

    public BigDecimal getEst_capex_inr_cr() {
        return est_capex_inr_cr;
    }

    public void setEst_capex_inr_cr(BigDecimal est_capex_inr_cr) {
        this.est_capex_inr_cr = est_capex_inr_cr;
    }

    public BigDecimal getEst_opex_inr_cr() {
        return est_opex_inr_cr;
    }

    public void setEst_opex_inr_cr(BigDecimal est_opex_inr_cr) {
        this.est_opex_inr_cr = est_opex_inr_cr;
    }

    public String getDeal_status() {
        return deal_status;
    }

    public void setDeal_status(String deal_status) {
        this.deal_status = deal_status;
    }

    public String getGo_no_go_status() {
        return go_no_go_status;
    }

    public void setGo_no_go_status(String go_no_go_status) {
        this.go_no_go_status = go_no_go_status;
    }

    public LocalDate getGo_no_go_date() {
        return go_no_go_date;
    }

    public void setGo_no_go_date(LocalDate go_no_go_date) {
        this.go_no_go_date = go_no_go_date;
    }

    public BigDecimal getGm_percentage() {
        return gm_percentage;
    }

    public void setGm_percentage(BigDecimal gm_percentage) {
        this.gm_percentage = gm_percentage;
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public String getSales_role() {
        return sales_role;
    }

    public void setSales_role(String sales_role) {
        this.sales_role = sales_role;
    }

    public String getPrimary_owner() {
        return primary_owner;
    }

    public void setPrimary_owner(String primary_owner) {
        this.primary_owner = primary_owner;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource_person() {
        return source_person;
    }

    public void setSource_person(String source_person) {
        this.source_person = source_person;
    }

    public LocalDate getLead_received_date() {
        return lead_received_date;
    }

    public void setLead_received_date(LocalDate lead_received_date) {
        this.lead_received_date = lead_received_date;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public LocalDate getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(LocalDate submission_date) {
        this.submission_date = submission_date;
    }

    public LocalDate getDecision_date() {
        return decision_date;
    }

    public void setDecision_date(LocalDate decision_date) {
        this.decision_date = decision_date;
    }

    public String getAdditional_remarks() {
        return additional_remarks;
    }

    public void setAdditional_remarks(String additional_remarks) {
        this.additional_remarks = additional_remarks;
    }
}
