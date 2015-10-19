package com.example.designs.builder2;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class NutricionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	private NutricionFacts(Builder builder) {
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.carbohydrate = builder.carbohydrate;
		this.fat = builder.fat;
		this.servingSize = builder.servingSize;
		this.sodium = builder.sodium;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public static class Builder {

		private int servingSize;
		private int servings;
		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder setCalories(int calories) {
			this.calories = calories;
			return this;

		}

		public Builder setFat(int fat) {
			this.fat = fat;
			return this;

		}

		public Builder setSodium(int sodium) {
			this.sodium = sodium;
			return this;

		}

		public Builder setCarboHydrate(int carboHydrate) {
			this.sodium = carboHydrate;
			return this;

		}

		public NutricionFacts build() {

			return new NutricionFacts(this);
		}
	}
}
