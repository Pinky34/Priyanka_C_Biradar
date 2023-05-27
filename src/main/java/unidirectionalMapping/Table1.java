package unidirectionalMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="sim")
public class Table1 {
	@Id
	private long phone;
	private String name;
	private String adds;
	@OneToOne
	Table2 t2;
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String t2) {
		this.name = t2;
	}
	public String getAdds() {
		return adds;
	}
	public void setAdds(String adds) {
		this.adds = adds;
	}
	public Table2 getT2() {
		return  t2;
	}
	public void setT2(Table2 t2) {
		this.t2 =  t2;
	}
    
	

}
