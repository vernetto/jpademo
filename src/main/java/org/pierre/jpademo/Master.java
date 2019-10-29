package org.pierre.jpademo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Master {
    @Id
    Long id;
    String masterName;

    @OneToMany(fetch = FetchType.EAGER)
    List<Details> details = new ArrayList<>();

    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", masterName='" + masterName + '\'' +
                ", details=" + details +
                '}';
    }
}
