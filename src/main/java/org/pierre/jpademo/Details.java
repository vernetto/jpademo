package org.pierre.jpademo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Details {
    @Id
    Long id;

    String detailName;

    @ManyToOne
    Master master;

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", detailName='" + detailName + '\'' +
                ", master=" + master +
                '}';
    }
}
