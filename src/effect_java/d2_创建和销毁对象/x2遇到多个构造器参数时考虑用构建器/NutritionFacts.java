package effect_java.d2_创建和销毁对象.x2遇到多个构造器参数时考虑用构建器;

public class NutritionFacts {

	private final int servingSize; 		//(ml)					required
	private final int servings;			//(per container)		required
	private final int colories;			//						optional
	private final int fat;				//(g)					optional
	private final int sodium;			//(mg)					optional
	private final int carbohydrate;		//(g)					optional
	
	public static class Builder{
		//required parameters
		private final int servingSize;
		private final int servings;
		
		//optional parameters ------initialized to default values
		private int colories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder setColories(int val){
			this.colories = val;
			return this;
		}
		
		public Builder setFat(int val){
			this.fat = val;
			return this;
		}
		
		public Builder setSodium(int val){
			this.sodium = val;
			return this;
		}
		
		public Builder setCarbohydrate(int val){
			this.carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder){
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.colories = builder.colories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
}