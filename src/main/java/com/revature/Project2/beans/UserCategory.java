package com.revature.Project2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_CATEGORY")
@SequenceGenerator(name = "new_user_category", sequenceName = "NEW_USER_CATEGORY_SEQ", initialValue = 1, allocationSize = 1)
public class UserCategory {

	// Primary Key for User Category Table in Oracle DB
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "new_user_category")
	@Column(name = "USER_CATEGORY_ID")
	private int userCategoryId;

	@Column(name = "U_ID")
	private int uId;

	@Column(name = "MEAL_CAT_ID")
	private int mealCatId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MEAL_CAT_ID", insertable = false, updatable = false)
	private MealCategory mealCategory;

	public UserCategory() {
	}

	public UserCategory(int userCategoryId, int uId, int mealCatId, MealCategory mealCategory) {
		super();
		this.userCategoryId = userCategoryId;
		this.uId = uId;
		this.mealCatId = mealCatId;
		this.mealCategory = mealCategory;
	}

	// Getter and Setter methods for states of User Category
	public int getUserCategoryId() {
		return userCategoryId;
	}

	public void setUserCategoryId(int userCategoryId) {
		this.userCategoryId = userCategoryId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getMealCatId() {
		return mealCatId;
	}

	public void setMealCatId(int mealCatId) {
		this.mealCatId = mealCatId;
	}

	public MealCategory getMealCategory() {
		return mealCategory;
	}

	public void setMealCategory(MealCategory mealCategory) {
		this.mealCategory = mealCategory;
	}

	// Custom toString to display User Category information
	@Override
	public String toString() {
		return "UserCategory [userCategoryId=" + userCategoryId + ", uId=" + uId + ", mealCatId=" + mealCatId
				+ ", mealCategory=" + mealCategory + "]";
	}
}
