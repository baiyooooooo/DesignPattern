package design.pattern.builder;

public class ObjectBuilder {

	private int size;
	private int length;
	private int height;
	private int width;
	private int border;
	private int age;
	private int number;

	// Because ObjectBuilder has too many parameters
	// so we use builder to control initialization
	// this will help us to have more readable code
	// sample:
	// ObjectBuilder ob = ObjectBuilder.Builder(2, 3).height(4).
	// width(8)....
	private ObjectBuilder(Builder builder) {
		this.size = builder.size;
		this.length = builder.length;
		this.height = builder.height;
		this.width = builder.width;
		this.border = builder.border;
		this.age = builder.age;
		this.number = builder.number;
	}
	
	public static class Builder{
		// Required parameters
		private int size;
		private int length;
		
		// Optional parameters
		private int height;
		private int width;
		private int border;
		private int age;
		private int number;
		
		public Builder(int size, int length){
			this.size = size;
			this.length = length;
		}
		
		public Builder height(int height){
			this.height = height;
			return this;
		}

		public Builder width(int width){
			this.width = width;
			return this;
		}

		public Builder border(int border){
			this.border = border;
			return this;
		}

		public Builder age(int age){
			this.age = age;
			return this;
		}

		public Builder number(int number){
			this.number = number;
			return this;
		}
		
		public ObjectBuilder build(){
			return new ObjectBuilder(this);
		}
	}

}
