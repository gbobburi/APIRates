package com.exchange;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="API_Exchangerates")
public class Bean {

	
	private long id;
	private String baseName;
	private String ratesOfyear;
	private String january;
	private String february;
	private String march;
	private String april;
	private String may;
	private String june;
	private String july;
	private String august;
	private String september;
	private String october;
	private String november;
	private String decmber;
	
	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	public String getRatesOfyear() {
		return ratesOfyear;
	}

	public void setRatesOfyear(String ratesOfyear) {
		this.ratesOfyear = ratesOfyear;
	}

	public String getJanuary() {
		return january;
	}

	public void setJanuary(String january) {
		this.january = january;
	}

	public String getFebruary() {
		return february;
	}

	public void setFebruary(String february) {
		this.february = february;
	}

	public String getMarch() {
		return march;
	}

	public void setMarch(String march) {
		this.march = march;
	}

	public String getApril() {
		return april;
	}

	public void setApril(String april) {
		this.april = april;
	}

	public String getMay() {
		return may;
	}

	public void setMay(String may) {
		this.may = may;
	}

	public String getJune() {
		return june;
	}

	public void setJune(String june) {
		this.june = june;
	}

	public String getJuly() {
		return july;
	}

	public void setJuly(String july) {
		this.july = july;
	}

	public String getAugust() {
		return august;
	}

	public void setAugust(String august) {
		this.august = august;
	}

	public String getSeptember() {
		return september;
	}

	public void setSeptember(String september) {
		this.september = september;
	}

	public String getOctober() {
		return october;
	}

	public void setOctober(String october) {
		this.october = october;
	}

	public String getNovember() {
		return november;
	}

	public void setNovember(String november) {
		this.november = november;
	}

	public String getDecmber() {
		return decmber;
	}

	public void setDecmber(String decmber) {
		this.decmber = decmber;
	}

	public Bean(String baseName, String ratesOfyear, String january, String february, String march, String april,
			String may, String june, String july, String august, String september, String october, String november,
			String decmber) {
		super();
		this.baseName = baseName;
		this.ratesOfyear = ratesOfyear;
		this.january = january;
		this.february = february;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.august = august;
		this.september = september;
		this.october = october;
		this.november = november;
		this.decmber = decmber;
	}

	@Override
	public String toString() {
		return "Bean [baseName=" + baseName + ", ratesOfyear=" + ratesOfyear + ", january=" + january + ", february="
				+ february + ", march=" + march + ", april=" + april + ", may=" + may + ", june=" + june + ", july="
				+ july + ", august=" + august + ", september=" + september + ", october=" + october + ", november="
				+ november + ", decmber=" + decmber + "]";
	}
	
	
	
	
}
