import java.time.LocalDate;

public class Customer {
	String cuname;
	int times=1;
	LocalDate newtime;
	
	public void setCuname(String cuname) {
		this.cuname=cuname;
	}
	public void setTimes(int times) {
		this.times=times;
	}
	public int getTimes() {
		return times;
	}
	public String getCuname() {
		return cuname;
	}
	public void setNewtime(LocalDate newtime) {
		this.newtime=newtime;
	}
	
	public String toString() {
		String info="�˿�������"+cuname+"; ���������"+times+"; ���µ���ʱ�䣺"+newtime;
		return info;
	}

}
