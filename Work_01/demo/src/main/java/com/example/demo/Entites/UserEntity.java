package com.example.demo.Entites;

import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Users")
public class UserEntity implements Serializable {


	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long id;
	
	@Column(nullable=false)
//	@Column(name = "USER_ID")
	private String userId;
	
	@Column(nullable=false, length=50)
//	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(nullable=false, length=50)
//	@Column(name = "LAST_NAME")
	private String lastName;
	
//	@Column(nullable=false, length=120, unique=true) // unique=true is not give to enter dupllicate data of that column
	@Column(nullable=false, length=120)
	private String email;
	
//	@Column(nullable=false)
//	private String pasword;
	
	@Column(nullable=false)
//	@Column(name = "ENCRYPTED_PASSWORD")
    private String encryptedPassword;
    
//	@Column(name = "EMAIL_VERIFICATION_TOKEN")
    private String emailVerificationToken;
    
	@Column(nullable=true, columnDefinition = "boolean default false")
//	@Column(name = "EMAIL_VERIFICATION_STATUS")
    private Boolean emailVerificationStatus ;
	
	

//    private Boolean emailVerificationStatus = false;
	
//	@OneToMany(mappedBy="userDetails", cascadeType.All)
//	private List<AddressEntity> address;
    
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstNmae() {
		return firstName;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstName = firstNmae;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getPasword() {
//		return pasword;
//	}
//	public void setPasword(String pasword) {
//		this.pasword = pasword;
//	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
    
    
    
}
