package zzu.hibiscidai.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Student 实体类
 * @author Hibiscidai
 * @version 1.0.0
 */

@Table(name = "t_student")
public class Student implements Serializable {
	@Id
	@GeneratedValue
	private Integer s_id;

	@NotEmpty
	private String s_username;

	@NotEmpty
	private String s_password;

	private static final long serialVersionUID = 1L;

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getS_username() {
		return s_username;
	}

	public void setS_username(String s_username) {
		this.s_username = s_username;
	}

	public String getS_password() {
		return s_password;
	}

	public void setS_password(String s_password) {
		this.s_password = s_password;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Student other = (Student) that;
		return (this.getS_id() == null ? other.getS_id() == null : this.getS_id().equals(other.getS_id()))
				&& (this.getS_username() == null ? other.getS_username() == null : this.getS_username().equals(other.getS_username()))
				&& (this.getS_password() == null ? other.getS_password() == null : this.getS_password().equals(other.getS_password()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getS_id() == null) ? 0 : getS_id().hashCode());
		result = prime * result + ((getS_username() == null) ? 0 : getS_username().hashCode());
		result = prime * result + ((getS_password() == null) ? 0 : getS_password().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", s_id=").append(s_id);
		sb.append(", s_username=").append(s_username);
		sb.append(", s_password=").append(s_password);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}