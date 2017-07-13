package Static;



	//import bsh.This;

	public class ThisConcept {
		public void show() {
			System.out.println(this);
		}

		public void display(ThisConcept concept) {
			System.out.println("concept:" + concept);
			ThisConcept concept2 = new ThisConcept();
			System.out.println("this:" + this);
			System.out.println(concept2);
			concept2.show();
			System.out.println("this after call:" + this);

		}

		public static void main(String[] args) {
			ThisConcept concept = new ThisConcept();

			System.out.println(concept);
			concept.display(concept);

			/*
			 * ThisConcept concept2 = new ThisConcept();
			 * System.out.println(concept2); concept.show();
			 */
		}
	
}
