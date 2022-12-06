package com.hetery.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "Username")
    private String username;
    
    @Column(name = "Password")
    private String password;
    
    @Column(name = "Datecreate")
    private String datecreate;
    
    @Column(name = "IDMT4")
    private String idMT4;
    
    @Column(name = "SERVERMT4")
    private String serverMT4;
}
