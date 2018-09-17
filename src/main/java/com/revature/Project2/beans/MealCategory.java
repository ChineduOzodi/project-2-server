package com.revature.Project2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MEAL_CATEGORY")
@SequenceGenerator(name = "new_meal_category", sequenceName = "NEW_MEAL_SEQ", initialValue = 1, allocationSize = 1)
public class MealCategory {

	// Primary Key for Meal Category Table in Oracle DB
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "new_meal_category")
	@Column(name = "MEAL_CAT_ID")
	private int mealCatId;

	@Column(name = "MEAL_CAT_NAME")
	private String mealCatName;

	public MealCategory() {
	}

	public MealCategory(int mealCatId, String mealCatName) {
		super();
		this.mealCatId = mealCatId;
		this.mealCatName = mealCatName;
	}

	// Getter and Setter methods for states of Meal Category
	public int getMealCatId() {
		return mealCatId;
	}

	public void setMealCatId(int mealCatId) {
		this.mealCatId = mealCatId;
	}

	public String getMealCatName() {
		return mealCatName;
	}

	public void setMealCatName(String mealCatName) {
		this.mealCatName = mealCatName;
	}

	// Custom toString to display Meal Category information
	@Override
	public String toString() {
		return "MealCategory [mealCatId=" + mealCatId + ", mealCatName=" + mealCatName + "]";
	}
}
