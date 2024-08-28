package Day15;

public class SinhVienCoKhi extends SinhVien {

	private double scoreCNC;
	private double scorePCL;
	private String skill;

	public SinhVienCoKhi(int id, String name, String skill, double scoreCNC, double scorePCL) {
		super(id, name);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePCL = scorePCL;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePCL() {
		return scorePCL;
	}

	public void setScorePCL(double scorePCL) {
		this.scorePCL = scorePCL;
	}

	@Override
	double getDiem() {
		return (this.scoreCNC * 2 + this.scorePCL) / 3;
	}

}
