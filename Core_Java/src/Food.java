
public class Food {

	
		public class Parent {
			  public void fooMethod() {
			    System.out.println("foo");
			  }

			  public void fooMethod(String str) {  // overloading Parent.fooMethod()
			    System.out.println("foo " + str);
			  }
			}


			public class Child extends Parent {
			  public void fooMethod() {
			    System.out.println("bar");  // overriding Parent.fooMethod()
			  }
			}
}


