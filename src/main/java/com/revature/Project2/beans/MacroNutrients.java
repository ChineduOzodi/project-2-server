package com.revature.Project2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NUTRITIONAL_GOAL_TABLE")
public class MacroNutrients {

	// Primary Key for Nutritional Goal Table in Oracle DB
	@Id
	@Column(name = "NUTRIENT_ID")
	private int nutrientId;

	@Column(name = "MIN_AGE")
	private int minAge;

	@Column(name = "MAX_AGE")
	private int maxAge;

	@Column(name = "SEX")
	private int sex;

	@Column(name = "PROTEIN_GRAMS")
	private int proteinGrams;

	@Column(name = "PROTEIN_MIN_PERCENT")
	private int proteinMinPercent;

	@Column(name = "PROTEIN_MAX_PERCENT")
	private int proteinMaxPercent;

	@Column(name = "CARB_GRAMS")
	private int carbGrams;

	@Column(name = "CARB_MIN_PERCENT")
	private int carbMinPercent;

	@Column(name = "CARB_MAX_PERCENT")
	private int carbMaxPercent;

	@Column(name = "FIBER_GRAMS")
	private int fiberGrams;

	@Column(name = "SUGARS_MAX_PERCENT")
	private int sugarsMaxPercent;

	@Column(name = "FAT_MIN_PERCENT")
	private int fatMinPercent;

	@Column(name = "FAT_MAX_PERCENT")
	private int fatMaxPercent;

	@Column(name = "SAT_FAT_MAX_PERCENT")
	private int satFatMaxPercent;

	public MacroNutrients() {
	}

	public MacroNutrients(int nutrientId, int minAge, int maxAge, int sex, int proteinGrams, int proteinMinPercent,
			int proteinMaxPercent, int carbGrams, int carbMinPercent, int carbMaxPercent, int fiberGrams,
			int sugarsMaxPercent, int fatMinPercent, int fatMaxPercent, int satFatMaxPercent) {
		super();
		this.nutrientId = nutrientId;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.sex = sex;
		this.proteinGrams = proteinGrams;
		this.proteinMinPercent = proteinMinPercent;
		this.proteinMaxPercent = proteinMaxPercent;
		this.carbGrams = carbGrams;
		this.carbMinPercent = carbMinPercent;
		this.carbMaxPercent = carbMaxPercent;
		this.fiberGrams = fiberGrams;
		this.sugarsMaxPercent = sugarsMaxPercent;
		this.fatMinPercent = fatMinPercent;
		this.fatMaxPercent = fatMaxPercent;
		this.satFatMaxPercent = satFatMaxPercent;
	}

	// Getter and Setter methods for states of MacroNutrients
	public int getNutrientId() {
		return nutrientId;
	}

	public void setNutrientId(int nutrientId) {
		this.nutrientId = nutrientId;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getProteinGrams() {
		return proteinGrams;
	}

	public void setProteinGrams(int proteinGrams) {
		this.proteinGrams = proteinGrams;
	}

	public int getProteinMinPercent() {
		return proteinMinPercent;
	}

	public void setProteinMinPercent(int proteinMinPercent) {
		this.proteinMinPercent = proteinMinPercent;
	}

	public int getProteinMaxPercent() {
		return proteinMaxPercent;
	}

	public void setProteinMaxPercent(int proteinMaxPercent) {
		this.proteinMaxPercent = proteinMaxPercent;
	}

	public int getCarbGrams() {
		return carbGrams;
	}

	public void setCarbGrams(int carbGrams) {
		this.carbGrams = carbGrams;
	}

	public int getCarbMinPercent() {
		return carbMinPercent;
	}

	public void setCarbMinPercent(int carbMinPercent) {
		this.carbMinPercent = carbMinPercent;
	}

	public int getCarbMaxPercent() {
		return carbMaxPercent;
	}

	public void setCarbMaxPercent(int carbMaxPercent) {
		this.carbMaxPercent = carbMaxPercent;
	}

	public int getFiberGrams() {
		return fiberGrams;
	}

	public void setFiberGrams(int fiberGrams) {
		this.fiberGrams = fiberGrams;
	}

	public int getSugarsMaxPercent() {
		return sugarsMaxPercent;
	}

	public void setSugarsMaxPercent(int sugarsMaxPercent) {
		this.sugarsMaxPercent = sugarsMaxPercent;
	}

	public int getFatMinPercent() {
		return fatMinPercent;
	}

	public void setFatMinPercent(int fatMinPercent) {
		this.fatMinPercent = fatMinPercent;
	}

	public int getFatMaxPercent() {
		return fatMaxPercent;
	}

	public void setFatMaxPercent(int fatMaxPercent) {
		this.fatMaxPercent = fatMaxPercent;
	}

	public int getSatFatMaxPercent() {
		return satFatMaxPercent;
	}

	public void setSatFatMaxPercent(int satFatMaxPercent) {
		this.satFatMaxPercent = satFatMaxPercent;
	}

	// Custom toString to display MacroNutrient information
	@Override
	public String toString() {
		return "MacroNutrients [nutrientId=" + nutrientId + ", minAge=" + minAge + ", maxAge=" + maxAge + ", sex=" + sex
				+ ", proteinGrams=" + proteinGrams + ", proteinMinPercent=" + proteinMinPercent + ", proteinMaxPercent="
				+ proteinMaxPercent + ", carbGrams=" + carbGrams + ", carbMinPercent=" + carbMinPercent
				+ ", carbMaxPercent=" + carbMaxPercent + ", fiberGrams=" + fiberGrams + ", sugarsMaxPercent="
				+ sugarsMaxPercent + ", fatMinPercent=" + fatMinPercent + ", fatMaxPercent=" + fatMaxPercent
				+ ", satFatMaxPercent=" + satFatMaxPercent + "]";
	}
}
