package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	 @Id
String Id;
String firstName;
String lastName;
String email;
String address;

public String getId() {
	  return Id;
	 }
public void setId(String Id) {
	  this.Id = Id;
	 }

public String getfirstName() {
	  return firstName;
	 }
public void setfirstName(String firstName) {
	  this.firstName = firstName;
	 }

public String getlastName() {
	  return lastName;
	 }
public void setlastName(String lastName) {
	  this.lastName = lastName;
	 }

public String getemail() {
	  return email;
	 }
public void setemail(String email) {
	  this.email = email;
	 }

public String getaddress() {
	  return address;
	 }
public void setaddress(String address) {
	  this.address = address;
	 }

}



 

    
 
   
