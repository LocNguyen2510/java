package Day10;

public class Practice2 {
	private String name;
	private int id;

	public Practice2() {

	}

	public Practice2(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Practice2 tim(String name, int id) {
		Practice2 pr = new Practice2(name, id);
		return pr;

	}

	public static void main(String[] args) {

	}
}
