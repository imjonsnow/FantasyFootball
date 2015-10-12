public abstract class Player {
	//initialize statline
	public double passingYards;
	public double passAttempts;
	public double completions;
	public double completionRate;
	public double passTDs;
	public double interceptions;
	public double rushYards;
	public double rushTDs;
	public double fumbles;
	public double catchYards;
	public double catchTDs;
	public double rushAttempts;
	public double targets;
	public double catchRate;
	
	//initialize weights
	public double w1;
	public double w2;
	public double w3;
	public double w4;
	public double w5;
	
	//initialize error
	public static double error1;
	public static double error2;
	public static double error3;
	public static double error4;
	public static double error5;
	
	//initialize weight array
	double weights[] = new double[]{w1, w2, w3, w4, w5};
	
	//initialize error array
	public static double error[] = new double[]{error1, error2, error3, error4, error5};
		
	//initialize ratings
	public static double playerRating;
	
	//initialize draft kings values
	public int dkValue;
	
	/*
	 * In this method we will be taking stats (labeled s1... s2... sn) 
	 * and running an algorithm analysis to produce a playerRating. 
	 */
	public double calcRating(double s1, double s2, double s3, double s4, double s5, double s6, double s7, double s8, double s9, double s10, double s11, double s12, double s13, double s14){
		//run algorithm analysis
		
		return playerRating;
	}
	
	/*
	 * In this method we will be taking the weightArray of the
	 * player and calculating and return an errorArray
	 */
	public double[] calcError(double weightArray[]){
		
		return error;
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
	
	//generate getters and setters for all variables
	public double getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(double passingYards) {
		this.passingYards = passingYards;
	}

	public double getPassAttempts() {
		return passAttempts;
	}

	public void setPassAttempts(double passAttempts) {
		this.passAttempts = passAttempts;
	}

	public double getCompletions() {
		return completions;
	}

	public void setCompletions(double completions) {
		this.completions = completions;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	public double getPassTDs() {
		return passTDs;
	}

	public void setPassTDs(double passTDs) {
		this.passTDs = passTDs;
	}

	public double getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(double interceptions) {
		this.interceptions = interceptions;
	}

	public double getRushYards() {
		return rushYards;
	}

	public void setRushYards(double rushYards) {
		this.rushYards = rushYards;
	}

	public double getRushTDs() {
		return rushTDs;
	}

	public void setRushTDs(double rushTDs) {
		this.rushTDs = rushTDs;
	}

	public double getFumbles() {
		return fumbles;
	}

	public void setFumbles(double fumbles) {
		this.fumbles = fumbles;
	}

	public double getCatchYards() {
		return catchYards;
	}

	public void setCatchYards(double catchYards) {
		this.catchYards = catchYards;
	}

	public double getCatchTDs() {
		return catchTDs;
	}

	public void setCatchTDs(double catchTDs) {
		this.catchTDs = catchTDs;
	}

	public double getRushAttempts() {
		return rushAttempts;
	}

	public void setRushAttempts(double rushAttempts) {
		this.rushAttempts = rushAttempts;
	}

	public double getTargets() {
		return targets;
	}

	public void setTargets(double targets) {
		this.targets = targets;
	}

	public double getCatchRate() {
		return catchRate;
	}

	public void setCatchRate(double catchRate) {
		this.catchRate = catchRate;
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

	public double getPlayerRating() {
		return playerRating;
	}

	public void setPlayerRating(double playerRating) {
		this.playerRating = playerRating;
	}

	public int getDkValue() {
		return dkValue;
	}

	public void setDkValue(int dkValue) {
		this.dkValue = dkValue;
	}
	
}
