package com.example.spring_final.model;

import jakarta.persistence.*;


@Entity

@Table(name = "users")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_no", updatable = false)
    private Long serialNo;

    @Column(nullable = false, unique = true)
    private String id;  
    

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String date;

    private String bust;
    private String waist;
    private String hips;
    private String shoulder;
    private String sleeve;
    private String neck;
    private String backLength;
    private String frontLength;
    private String inseam;
    private String thigh;
    private String notes;

    public Users() {}

    public Users(String id, String customerName, String date, String bust, String waist, String hips, String shoulder,
                 String sleeve, String neck, String backLength, String frontLength, String inseam, String thigh, String notes) {
        this.id = id;
        this.customerName = customerName;
        this.date = date;
        this.bust = bust;
        this.waist = waist;
        this.hips = hips;
        this.shoulder = shoulder;
        this.sleeve = sleeve;
        this.neck = neck;
        this.backLength = backLength;
        this.frontLength = frontLength;
        this.inseam = inseam;
        this.thigh = thigh;
        this.notes = notes;
    }

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBust() {
        return bust;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getHips() {
        return hips;
    }

    public void setHips(String hips) {
        this.hips = hips;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public String getBackLength() {
        return backLength;
    }

    public void setBackLength(String backLength) {
        this.backLength = backLength;
    }

    public String getFrontLength() {
        return frontLength;
    }

    public void setFrontLength(String frontLength) {
        this.frontLength = frontLength;
    }

    public String getInseam() {
        return inseam;
    }

    public void setInseam(String inseam) {
        this.inseam = inseam;
    }

    public String getThigh() {
        return thigh;
    }

    public void setThigh(String thigh) {
        this.thigh = thigh;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
