package com.revature.Project2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FOOD_PLAN")
@SequenceGenerator(name="new_food_plan", sequenceName="NEW_FOOD_SEQ", initialValue=1, allocationSize=1)
public class FoodPlan {
	
	//Primary Key for Food Plan Table in Oracle DB
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="new_food_plan")
	@Column(name="FOOD_ID")
	private int foodId;
	
	@Column(name="U_ID")
	private int uId;
	
	@Column(name="NDBNO")
	private String ndbno;
	
	@Column(name="MEAL_CAT_ID")
	private int mealCatId;
	
	@Column(name="SERVING_AMOUNT")
	private int servingAmount;
	
	@Column(name="MEASURE_INDEX")
	private int measureIndex;
	
	@Column(name="TIMESTAMP")
	private String timestamp;

	public FoodPlan() {}

	public FoodPlan(int foodId, int uId, String ndbno, int mealCatId, int servingAmount, int measureIndex,
			String timestamp) {
		super();
		this.foodId = foodId;
		this.uId = uId;
		this.ndbno = ndbno;
		this.mealCatId = mealCatId;
		this.servingAmount = servingAmount;
		this.measureIndex = measureIndex;
		this.timestamp = timestamp;
	}

	//Getter and Setter methods for states of Food Plan
	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getNdbno() {
		return ndbno;
	}

	public void setNdbno(String ndbno) {
		this.ndbno = ndbno;
	}

	public int getMealCatId() {
		return mealCatId;
	}

	public void setMealCatId(int mealCatId) {
		this.mealCatId = mealCatId;
	}

	public int getServingAmount() {
		return servingAmount;
	}

	public void setServingAmount(int servingAmount) {
		this.servingAmount = servingAmount;
	}

	public int getMeasureIndex() {
		return measureIndex;
	}

	public void setMeasureIndex(int measureIndex) {
		this.measureIndex = measureIndex;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	//Custom toString to display Food Plan information
	@Override
	public String toString() {
		return "FoodPlan [foodId=" + foodId + ", uId=" + uId + ", ndbno=" + ndbno + ", mealCatId=" + mealCatId
				+ ", servingAmount=" + servingAmount + ", measureIndex=" + measureIndex + ", timestamp=" + timestamp
				+ "]";
	}
}
