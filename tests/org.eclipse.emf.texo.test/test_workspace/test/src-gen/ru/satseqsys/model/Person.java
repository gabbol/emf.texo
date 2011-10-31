package ru.satseqsys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/** 
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Person {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Фамилия
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String surname = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Имя
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отчество
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String patronimic = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата рождения
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Date birthday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес регистрации
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Address registrationAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес фактического проживания
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Address factAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Паспортные данные
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Passport passport = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DrivingLicense drivingLicense = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Телефоны
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<Phone> phones = new ArrayList<Phone>();

	/**
	 * Returns the value of '<em><b>surname</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Фамилия
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>surname</b></em>' feature
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the '{@link Person#getSurname() <em>surname</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Фамилия
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getSurname() surname}' feature.
	 * @generated
	 */
	public void setSurname(String newSurname) {
		surname = newSurname;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Имя
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Person#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Имя
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>patronimic</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отчество
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>patronimic</b></em>' feature
	 * @generated
	 */
	public String getPatronimic() {
		return patronimic;
	}

	/**
	 * Sets the '{@link Person#getPatronimic() <em>patronimic</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Отчество
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getPatronimic() patronimic}' feature.
	 * @generated
	 */
	public void setPatronimic(String newPatronimic) {
		patronimic = newPatronimic;
	}

	/**
	 * Returns the value of '<em><b>birthday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата рождения
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>birthday</b></em>' feature
	 * @generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * Sets the '{@link Person#getBirthday() <em>birthday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата рождения
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getBirthday() birthday}' feature.
	 * @generated
	 */
	public void setBirthday(Date newBirthday) {
		birthday = newBirthday;
	}

	/**
	 * Returns the value of '<em><b>registrationAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес регистрации
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>registrationAddress</b></em>' feature
	 * @generated
	 */
	public Address getRegistrationAddress() {
		return registrationAddress;
	}

	/**
	 * Sets the '{@link Person#getRegistrationAddress() <em>registrationAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес регистрации
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getRegistrationAddress() registrationAddress}' feature.
	 * @generated
	 */
	public void setRegistrationAddress(Address newRegistrationAddress) {
		registrationAddress = newRegistrationAddress;
	}

	/**
	 * Returns the value of '<em><b>factAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес фактического проживания
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>factAddress</b></em>' feature
	 * @generated
	 */
	public Address getFactAddress() {
		return factAddress;
	}

	/**
	 * Sets the '{@link Person#getFactAddress() <em>factAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Адрес фактического проживания
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getFactAddress() factAddress}' feature.
	 * @generated
	 */
	public void setFactAddress(Address newFactAddress) {
		factAddress = newFactAddress;
	}

	/**
	 * Returns the value of '<em><b>passport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Паспортные данные
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>passport</b></em>' feature
	 * @generated
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * Sets the '{@link Person#getPassport() <em>passport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Паспортные данные
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Person#getPassport() passport}' feature.
	 * @generated
	 */
	public void setPassport(Passport newPassport) {
		passport = newPassport;
	}

	/**
	 * Returns the value of '<em><b>drivingLicense</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>drivingLicense</b></em>' feature
	 * @generated
	 */
	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	/**
	 * Sets the '{@link Person#getDrivingLicense() <em>drivingLicense</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Person#getDrivingLicense() drivingLicense}' feature.
	 * @generated
	 */
	public void setDrivingLicense(DrivingLicense newDrivingLicense) {
		drivingLicense = newDrivingLicense;
	}

	/**
	 * Returns the value of '<em><b>phones</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToPhones(ru.satseqsys.model.Phone value)}
	 * and {@link #removeFromPhones(Phone value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Телефоны
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>phones</b></em>' feature
	 * @generated
	 */
	public List<Phone> getPhones() {
		return Collections.unmodifiableList(phones);
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Person " + " [surname: " + getSurname() + "]" + " [name: "
				+ getName() + "]" + " [patronimic: " + getPatronimic() + "]"
				+ " [birthday: " + getBirthday() + "]";
	}
}