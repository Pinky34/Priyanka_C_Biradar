package unidirectionalMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="whatsapp")
public class Table2 {
	private String name;
	@Id
	private long phone;
	private String profile_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getProfile_name() {
		return profile_name;
	}
	public void setProfile_name(String profile_name) {
		this.profile_name = profile_name;
	}
	

	

}
