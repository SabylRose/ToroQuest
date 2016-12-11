package net.torocraft.toroquest.civilization;

public enum ReputationLevel {
	HERO(0.7), ALLY(0.9), FRIEND(1.0), DRIFTER(1.0), OUTCAST(1.0), ENEMY(1.0), VILLAIN(1.0);
	
	private ReputationLevel(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}
	
	private double priceMultiplier;
	
	public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public int adjustPrice(int price) {
		return (int)(price * priceMultiplier);
	}
	
	public static ReputationLevel fromReputation(int rep) {

		if (rep <= -1000) {
			return ReputationLevel.VILLAIN;
		}

		if (rep <= -100) {
			return ReputationLevel.ENEMY;
		}

		if (rep <= -10) {
			return ReputationLevel.OUTCAST;
		}

		if (rep < 10) {
			return ReputationLevel.DRIFTER;
		}

		if (rep < 100) {
			return ReputationLevel.FRIEND;
		}

		if (rep < 1000) {
			return ReputationLevel.ALLY;
		}

		return HERO;
	}
}