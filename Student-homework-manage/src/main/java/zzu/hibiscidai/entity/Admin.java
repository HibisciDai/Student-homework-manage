package zzu.hibiscidai.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Admin 实体类
 * @author Hibiscidai
 * @version 1.0.0
 */

@Table(name="t_admin")
public class Admin implements Serializable {
    @Id
    @GeneratedValue
    private Integer a_id;

    @NotEmpty
    private String a_usename;

    @NotEmpty
    private String a_password;

    private static final long serialVersionUID = 1L;

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_usename() {
        return a_usename;
    }

    public void setA_usename(String a_usename) {
        this.a_usename = a_usename;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
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
        Admin other = (Admin) that;
        return (this.getA_id() == null ? other.getA_id() == null : this.getA_id().equals(other.getA_id()))
            && (this.getA_usename() == null ? other.getA_usename() == null : this.getA_usename().equals(other.getA_usename()))
            && (this.getA_password() == null ? other.getA_password() == null : this.getA_password().equals(other.getA_password()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getA_id() == null) ? 0 : getA_id().hashCode());
        result = prime * result + ((getA_usename() == null) ? 0 : getA_usename().hashCode());
        result = prime * result + ((getA_password() == null) ? 0 : getA_password().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a_id=").append(a_id);
        sb.append(", a_usename=").append(a_usename);
        sb.append(", a_password=").append(a_password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}