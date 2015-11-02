public class Defense {
	//this is where we will store the defenses
	public static Defense[] defenses;
	
	//initialize statline
	public double sacks;
	public double fumbleRecoveries;
	public double interceptions;
	public double defensiveTDs;
	public double pointsAllowed;
	public double passingYardsAllowed;
	public double rushingYardsAllowed;
	public double kickTDs;
	public double homefieldAdvantage;
	
	//initialize weights
	public double w1;
	public double w2;
	public double w3;
	public double w4;
	public double w5;
	
	//initialize error
	public double error1;
	public double error2;
	public double error3;
	public double error4;
	public double error5;
	
	//initialize weight array
	double weights[] = new double[]{w1, w2, w3, w4, w5};
	
	//initialize error array
	double error[] = new double[]{error1, error2, error3, error4, error5};
		
	//initialize ratings
	public static double defenseRating;
	
	//initialize draft kings values
	public int dkValue;
	
	/*
	 * In this method we will be taking stats (labeled s1... s2... sn) 
	 * and running an algorithm analysis to produce a playerRating. 
	 */
	public double calcRating(double s1, double s2, double s3, double s4, double s5, double s6, double s7, double s8, double s9, double s10, double s11, double s12, double s13, double s14){
		//run algorithm analysis
		
		return defenseRating;
	}
	
	/*
	 * In this method we will be taking the weightArray of the
	 * player and calculating and return an errorArray
	 */
	public double[] calcError(double weightArray[]){
		double errorArray[] = null;
		return errorArray;
	}
	
	/*
	 * In this method, we will take in the weights for the player and
	 * change them according to our previous results
	 */
	public double[] changeWeights(double weights[]){
		//get weights out of array
		double w1 = weights[0];
		double w2 = weights[1];
		double w3 = weights[2];
		double w4 = weights[3];
		double w5 = weights[4];
		
		//run algorithm analysis
		
		//stuff new weights into array
		double[] newWeights = new double[]{w1, w2, w3, w4, w5};
		return newWeights;
	}

	public double getSacks() {
		return sacks;
	}

	public void setSacks(double sacks) {
		this.sacks = sacks;
	}

	public double getFumbleRecoveries() {
		return fumbleRecoveries;
	}

	public void setFumbleRecoveries(double fumbleRecoveries) {
		this.fumbleRecoveries = fumbleRecoveries;
	}

	public double getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(double interceptions) {
		this.interceptions = interceptions;
	}

	public double getDefensiveTDs() {
		return defensiveTDs;
	}

	public void setDefensiveTDs(double defensiveTDs) {
		this.defensiveTDs = defensiveTDs;
	}

	public double getPointsAllowed() {
		return pointsAllowed;
	}

	public void setPointsAllowed(double pointsAllowed) {
		this.pointsAllowed = pointsAllowed;
	}

	public double getPassingYardsAllowed() {
		return passingYardsAllowed;
	}

	public void setPassingYardsAllowed(double passingYardsAllowed) {
		this.passingYardsAllowed = passingYardsAllowed;
	}

	public double getRushingYardsAllowed() {
		return rushingYardsAllowed;
	}

	public void setRushingYardsAllowed(double rushingYardsAllowed) {
		this.rushingYardsAllowed = rushingYardsAllowed;
	}

	public double getKickTDs() {
		return kickTDs;
	}

	public void setKickTDs(double kickTDs) {
		this.kickTDs = kickTDs;
	}

	public double getW1() {
		return w1;
	}

	public void setW1(double w1) {
		this.w1 = w1;
	}

	public double getW2() {
		return w2;
	}

	public void setW2(double w2) {
		this.w2 = w2;
	}

	public double getW3() {
		return w3;
	}

	public void setW3(double w3) {
		this.w3 = w3;
	}

	public double getW4() {
		return w4;
	}

	public void setW4(double w4) {
		this.w4 = w4;
	}

	public double getW5() {
		return w5;
	}

	public void setW5(double w5) {
		this.w5 = w5;
	}

	public double getError1() {
		return error1;
	}

	public void setError1(double error1) {
		this.error1 = error1;
	}

	public double getError2() {
		return error2;
	}

	public void setError2(double error2) {
		this.error2 = error2;
	}

	public double getError3() {
		return error3;
	}

	public void setError3(double error3) {
		this.error3 = error3;
	}

	public double getError4() {
		return error4;
	}

	public void setError4(double error4) {
		this.error4 = error4;
	}

	public double getError5() {
		return error5;
	}

	public void setError5(double error5) {
		this.error5 = error5;
	}

	public double[] getWeights() {
		return weights;
	}

	public void setWeights(double[] weights) {
		this.weights = weights;
	}

	public double[] getError() {
		return error;
	}

	public void setError(double[] error) {
		this.error = error;
	}

	public static double getPlayerRating() {
		return defenseRating;
	}

	public static void setPlayerRating(double defenseRating) {
		Defense.defenseRating = defenseRating;
	}

	public int getDkValue() {
		return dkValue;
	}

	public void setDkValue(int dkValue) {
		this.dkValue = dkValue;
	}
}
