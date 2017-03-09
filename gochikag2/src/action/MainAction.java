package action;
import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {
	private String sample;
	
	public String execute(){
		System.out.println("check");
		System.out.println(sample);
		return SUCCESS;
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}
}
