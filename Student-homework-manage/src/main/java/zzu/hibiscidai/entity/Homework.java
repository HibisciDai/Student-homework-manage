package zzu.hibiscidai.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Homework 实体类
 * @author Hibiscidai
 * @version 1.0.0
 */

@Table(name = "t_homework")
public class Homework implements Serializable {
	@Id
	@GeneratedValue
	private Integer h_id;

	private Integer h_teacher_id;

	@NotEmpty
	private Date h_update;

	@NotEmpty
	private Date h_donedate;

	@NotEmpty
	private String h_context;

	private static final long serialVersionUID = 1L;

	public Integer getH_id() {
		return h_id;
	}

	public void setH_id(Integer h_id) {
		this.h_id = h_id;
	}

	public Integer getH_teacher_id() {
		return h_teacher_id;
	}

	public void setH_teacher_id(Integer h_teacher_id) {
		this.h_teacher_id = h_teacher_id;
	}

	public Date getH_update() {
		return h_update;
	}

	public void setH_update(Date h_update) {
		this.h_update = h_update;
	}

	public Date getH_donedate() {
		return h_donedate;
	}

	public void setH_donedate(Date h_donedate) {
		this.h_donedate = h_donedate;
	}

	public String getH_context() {
		return h_context;
	}

	public void setH_context(String h_context) {
		this.h_context = h_context;
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
		Homework other = (Homework) that;
		return (this.getH_id() == null ? other.getH_id() == null : this.getH_id().equals(other.getH_id()))
				&& (this.getH_teacher_id() == null ? other.getH_teacher_id() == null : this.getH_teacher_id().equals(
						other.getH_teacher_id()))
				&& (this.getH_update() == null ? other.getH_update() == null : this.getH_update().equals(other.getH_update()))
				&& (this.getH_donedate() == null ? other.getH_donedate() == null : this.getH_donedate().equals(other.getH_donedate()))
				&& (this.getH_context() == null ? other.getH_context() == null : this.getH_context().equals(other.getH_context()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getH_id() == null) ? 0 : getH_id().hashCode());
		result = prime * result + ((getH_teacher_id() == null) ? 0 : getH_teacher_id().hashCode());
		result = prime * result + ((getH_update() == null) ? 0 : getH_update().hashCode());
		result = prime * result + ((getH_donedate() == null) ? 0 : getH_donedate().hashCode());
		result = prime * result + ((getH_context() == null) ? 0 : getH_context().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", h_id=").append(h_id);
		sb.append(", h_teacher_id=").append(h_teacher_id);
		sb.append(", h_update=").append(h_update);
		sb.append(", h_donedate=").append(h_donedate);
		sb.append(", h_context=").append(h_context);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}