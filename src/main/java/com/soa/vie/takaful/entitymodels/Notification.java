package com.soa.vie.takaful.entitymodels;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notification extends AbstractBaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String message;

    private boolean isRead = false;

    @JsonIgnore
    @ManyToOne
    private TakafulUser user;

    public Notification() {
    }

    public Notification(String message, TakafulUser user) {
        this.message = message;
        this.user = user;
        this.isRead = false;
    }

}
