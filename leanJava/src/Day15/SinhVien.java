package Day15;

public abstract class SinhVien {
	protected int id;
	protected String name;
	protected double scoreJava;
	protected double scoreHTML;

	public SinhVien(int id, String name) {
		this.id = id;
		this.name = name;

	}

	abstract double getDiem();

}
