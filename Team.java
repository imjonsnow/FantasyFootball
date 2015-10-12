public class Team {
	public Team(QuarterBack qb, RunningBack rb1, RunningBack rb2, WideReceiver wr1, WideReceiver wr2, WideReceiver wr3,
			Player flex, TightEnd te, Defense d) {
	}
	
	//initialize team
	public Player[] team = new Player[9];
	
	//initialize team rating
	public double teamRating;
	
	//initialize team value
	public int teamValue;
	
	//initialize positions
	public QuarterBack quarterBack;
	public RunningBack runningBack1;
	public RunningBack runningBack2;
	public WideReceiver wideReceiver1;
	public WideReceiver wideReceiver2;
	public WideReceiver wideReceiver3;
	public TightEnd tightEnd;
	public Player flex;
	public Defense defense;

	public Player selectPlayer(Player[] playerArray){
		//algorithm analysis
		
		//set selected player
		Player selectedPlayer = null;
		return selectedPlayer;
	}
	
	public Player selectFlex(Player[] rbArray, Player[] wrArray, Player[] teArray){
		//select player with highest rating/value ratio
		
		//set selected player
		Player selectedFlex = null;
		return selectedFlex;
	}
	
	public Defense selectDefense(Defense[] defenses){
		//algorithm analysis
		
		Defense selectedDefense = null;
		return selectedDefense;
	}
	
	public Team generateTeam(QuarterBack qb, RunningBack rb1, RunningBack rb2, WideReceiver wr1, WideReceiver wr2, WideReceiver wr3, Player flex, TightEnd te, Defense d){
		//we use the selectPlayer algorithm to select players from an array of available players
		qb = (QuarterBack) selectPlayer(QuarterBack.quarterBacks);
		rb1 = (RunningBack) selectPlayer(RunningBack.runningBacks);
		rb2 = (RunningBack) selectPlayer(RunningBack.runningBacks);
		wr1 = (WideReceiver) selectPlayer(WideReceiver.wideReceivers);
		wr2 = (WideReceiver) selectPlayer(WideReceiver.wideReceivers);
		wr3 = (WideReceiver) selectPlayer(WideReceiver.wideReceivers);
		flex = selectFlex(RunningBack.runningBacks, WideReceiver.wideReceivers, TightEnd.tightEnds);
		te = (TightEnd) selectPlayer(TightEnd.tightEnds);
		d = selectDefense(Defense.defenses);
		
		Team generatedTeam = new Team(qb, rb1, rb2, wr1, wr2, wr3, flex, te, d);
		return generatedTeam;
	}
}
