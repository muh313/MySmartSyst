
public class ListofQuestions {
	private String Ques1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b>How is the temperature (past 6 months)?</b>  </html>";
	
	private String Ques2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b>How are sea levels (past 6 months / flooding/hurracanes)?</b>    </html>";
	
	private String Ques3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"https://www.co2.earth/daily-co2\"</i></b> "
			+ "<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;Using the link above <i><b>\'CO2\'</b></i> is at which level?";
	
	private String Ques4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"And as the forests burn, they release carbon dioxide and other global warming gases, worsening climate change.\"</i></b> "
			+ "<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;Based on your knowledge <i><b>\'wildfires\'</b></i> are?";
	
	private String Ques5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;<b><i>\"Research concludes that in most places electric vehicles (EV) produce fewer carbon emissions.\"</i>"
			+ "</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;Based on your knowledge <i><b>\'EV's\'</b></i> are leading to?";
	
	private String Opt1 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>38C or above</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Around 12C</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;C. <b>Below 5C</b>"
			+ 				" <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>20C-35C</b></html>";
	private String Opt2 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>Increasing</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Decreasing</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>Don't know</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>No change</b></html>";
	private String Opt3 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>over 1200PPM</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Under 500PPM</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;C. "
						+ "<b>350PPM-500PPM</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>Under 350PPM</b> </html>";
	private String Opt4 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>Increasing</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Decreasing</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>Standstill</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>No change</b> </html>";
	private String Opt5 = "<html>&nbsp;&nbsp;&nbsp;&nbsp;A. <b>No decrease in motor vehicles</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;B. <b>Less motor vehicles/emissions</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ "C. <b>Standstill</b> <br/>&nbsp;&nbsp;&nbsp;&nbsp;D. <b>No change</b> </html>";
	
	private String[] Answer = {"A", "A", "A", "A", "A"};
	
	public String getQuestion(int i) {
		if(i == 0)
			return Ques1;
		else if(i == 1)
			return Ques2;
		else if(i == 2)
			return Ques3;
		else if(i == 3)
			return Ques4;
		else if(i == 4)
			return Ques5;
		
		return "";
	}
	public String getOptions(int i) {
		if(i == 0)
			return Opt1;
		else if(i == 1)
			return Opt2;
		else if(i == 2)
			return Opt3;
		else if(i == 3)
			return Opt4;
		else if(i == 4)
			return Opt5;
		
		return "";
	}
	public String[] getAnswer() {
		return Answer;
	}
}
