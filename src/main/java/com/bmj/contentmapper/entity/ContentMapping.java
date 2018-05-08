package com.bmj.contentmapper.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author SSHABBIR
 *
 */
@Entity
@Table(name = "ELUCIDAT_CONTENT_MAPPING")
public class ContentMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "MODULE_ID", nullable = false)
    private int moduleId;

    @Column(name = "ELUCIDAT_ID", nullable = false)
    private String elucidatId;

    @Column(name = "LOCALE", nullable = false)
    private String locale;

    public ContentMapping() {
    }

    public ContentMapping(int moduleId, String elucidatId, String locale) {
	this.elucidatId = elucidatId;
	this.moduleId = moduleId;
	this.locale = locale;
    }

    public Integer getId() {
	return id;
    }

    public long getModuleId() {
	return moduleId;
    }

    public void setModuleId(int moduleId) {
	this.moduleId = moduleId;
    }

    public String getElucidatId() {
	return elucidatId;
    }

    public void setElucidatId(String elucidatId) {
	this.elucidatId = elucidatId;
    }

    public String getLocale() {
	return locale;
    }

    public void setLocale(String locale) {
	this.locale = locale;
    }

    @Override
    public String toString() {
	return getModuleId() + "," + getElucidatId() + "," + getLocale();
    }
}
