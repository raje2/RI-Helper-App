package com.masai.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="User_dtls")
@Entity
public class UserDtl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String village;
	private Date date;
	private Integer rr_no;
	private Integer h_no;
	private String name;
	private Integer lr_arr;
	private Integer lr_cur;
	private Integer cess_arr;
	private Integer cess_cur;
	private Integer n_cess_arr;
	private Integer n_cess_cur;
	private Integer mra;
	private Integer mrc;
	private Integer interest;
	private Integer mri;
	private Integer oth;
	private Integer total;
	
	

}
