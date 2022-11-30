package ConsoleExamProject;

public class Questioning {
	private int QuestionId;

	private String Questions;

	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	
	public Questioning() {
		super();
	}

	public Questioning(int questionId, String questions, String option1, String option2, String option3, String option4,
			int answer) {
		//super();
		QuestionId = questionId;
		Questions = questions;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
		Answer = answer;
	}

	private int Answer;

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestions() {
		return Questions;
	}

	public void setQuestions(String questions) {
		Questions = questions;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	public int getAnswer() {
		return Answer;
	}

	public void setAnswer(int answer) {
		Answer = answer;
	}

}
