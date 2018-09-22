package zzu.hibiscidai.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Uploadwork 实体类
 * @author Hibiscidai
 * @version 1.0.0
 */

@Table(name = "t_uploadwork")
public class Uploadwork implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer u_sutdent_id;

	private Integer u_homeword_id;

	private Integer u_grade;

	@NotEmpty
	private Date u_update;

	@NotEmpty
	private String u_context;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getU_sutdent_id() {
		return u_sutdent_id;
	}

	public void setU_sutdent_id(Integer u_sutdent_id) {
		this.u_sutdent_id = u_sutdent_id;
	}

	public Integer getU_homeword_id() {
		return u_homeword_id;
	}

	public void setU_homeword_id(Integer u_homeword_id) {
		this.u_homeword_id = u_homeword_id;
	}

	public Integer getU_grade() {
		return u_grade;
	}

	public void setU_grade(Integer u_grade) {
		this.u_grade = u_grade;
	}

	public Date getU_update() {
		return u_update;
	}

	public void setU_update(Date u_update) {
		this.u_update = u_update;
	}

	public String getU_context() {
		return u_context;
	}

	public void setU_context(String u_context) {
		this.u_context = u_context;
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
		Uploadwork other = (Uploadwork) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getU_sutdent_id() == null ? other.getU_sutdent_id() == null : this.getU_sutdent_id().equals(
						other.getU_sutdent_id()))
				&& (this.getU_homeword_id() == null ? other.getU_homeword_id() == null : this.getU_homeword_id().equals(
						other.getU_homeword_id()))
				&& (this.getU_grade() == null ? other.getU_grade() == null : this.getU_grade().equals(other.getU_grade()))
				&& (this.getU_update() == null ? other.getU_update() == null : this.getU_update().equals(other.getU_update()))
				&& (this.getU_context() == null ? other.getU_context() == null : this.getU_context().equals(other.getU_context()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getU_sutdent_id() == null) ? 0 : getU_sutdent_id().hashCode());
		result = prime * result + ((getU_homeword_id() == null) ? 0 : getU_homeword_id().hashCode());
		result = prime * result + ((getU_grade() == null) ? 0 : getU_grade().hashCode());
		result = prime * result + ((getU_update() == null) ? 0 : getU_update().hashCode());
		result = prime * result + ((getU_context() == null) ? 0 : getU_context().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", u_sutdent_id=").append(u_sutdent_id);
		sb.append(", u_homeword_id=").append(u_homeword_id);
		sb.append(", u_grade=").append(u_grade);
		sb.append(", u_update=").append(u_update);
		sb.append(", u_context=").append(u_context);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}