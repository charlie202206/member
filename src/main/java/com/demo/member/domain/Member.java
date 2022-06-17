package com.demo.member.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
public class Member implements Serializable {

	@Id @GeneratedValue
	Long id;

	String name;
	
	String email;
	String phone;

    // //주소는 embedded 형태로 적용
    // @Embedded
	// Address address;
    // public Address getAddress() {
    //     return address;
    // }
    // public void setAddress(Address address) {
    //     this.address = address;
    // }


    // List 형태로 embedable 셋팅
    @ElementCollection
    List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    //default People로 세팅
	SalesType salesType = SalesType.PEOPLE;

	String pwenc;
	
	public String getPwenc() {
		return pwenc;
	}
	public void setPwenc(String pwenc) {
		this.pwenc = pwenc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public SalesType getSalesType() {
		return salesType;
	}
	public void setSalesType(SalesType salesType) {
		this.salesType = salesType;
	}


}
