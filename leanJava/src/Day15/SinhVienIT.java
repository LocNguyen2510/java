package Day15;

public class SinhVienIT extends SinhVien {

	public SinhVienIT(int id, String name, String language, double scoreJava, double scoreHTML) {
		super(id, name);
		this.language = language;
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	private String language;
	private double scoreJava;
	private double scoreHTML;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;

	}

}
