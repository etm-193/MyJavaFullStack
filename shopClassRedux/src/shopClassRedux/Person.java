package shopClassRedux;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
	
		//properties
		private String name;
		private LocalDate dob;
		private String sexAtBirth;
		private double chashAvailable;
		
		//constructors
		public Person() {
			super();
		}
		
		
		public Person(String name, LocalDate dob, String sexAtBirth, double chashAvailable) {
			super();
			this.name = name;
			this.dob = setDob(LocalDate.of(0, 0, 0));
			this.sexAtBirth = sexAtBirth;
			this.chashAvailable = chashAvailable;
		}


		//getAndSet
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public LocalDate getDob() {
			return dob;
		}

		public LocalDate setDob(LocalDate dob) {
			this.dob = LocalDate.of(0, 0, 0);
			return this.dob;
		}

		public String getSexAtBirth() {
			return sexAtBirth;
		}

		public void setSexAtBirth(String sexAtBirth) {
			this.sexAtBirth = sexAtBirth;
		}

		public double getChashAvailable() {
			return chashAvailable;
		}

		public void setChashAvailable(double chashAvailable) {
			this.chashAvailable = chashAvailable;
		}


		@Override
		public int hashCode() {
			return Objects.hash(chashAvailable, dob, name, sexAtBirth);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Double.doubleToLongBits(chashAvailable) == Double.doubleToLongBits(other.chashAvailable)
					&& Objects.equals(dob, other.dob) && Objects.equals(name, other.name)
					&& Objects.equals(sexAtBirth, other.sexAtBirth);
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", dob=" + dob + ", sexAtBirth=" + sexAtBirth + ", chashAvailable="
					+ chashAvailable + "]";
		}

		
	
}
