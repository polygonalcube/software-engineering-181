public abstract class Animal {

	double weight;

	Animal(double weight) {
		this.weight = weight;
	}

	void adjustWeight(double weightDelta) {
		weight += weightDelta;
	}

	double getWeight() {
		return weight;
	}

	abstract String speak();
}
