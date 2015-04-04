package pocztatek.domain;

import java.math.BigDecimal;
import java.math.BigInteger;


import javax.persistence.Id;
import javax.persistence.Transient;

//@Entity
public class PossibleTypes {
	
	@Id
	private long id;
	
	private int someInt;
	private short someShort;
	private float someFloat;
	private double someDouble;
	private boolean someBoolean;

	private Integer someIntiger;
	private BigDecimal someBigDecimal;
	private BigInteger someBigInteger;
	
	private int[] integerArray;
	private double[] doubleArray;
	
	private MyEnum myEnum;
	
	
	@Transient
	private int ignoreField;
	

	/**
	 * @return the ignoreField
	 */
	public int getIgnoreField() {
		return ignoreField;
	}

	/**
	 * @param ignoreField the ignoreField to set
	 */
	public void setIgnoreField(int ignoreField) {
		this.ignoreField = ignoreField;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the someInt
	 */
	public int getSomeInt() {
		return someInt;
	}

	/**
	 * @param someInt the someInt to set
	 */
	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}

	/**
	 * @return the someShort
	 */
	public short getSomeShort() {
		return someShort;
	}

	/**
	 * @param someShort the someShort to set
	 */
	public void setSomeShort(short someShort) {
		this.someShort = someShort;
	}

	/**
	 * @return the someFloat
	 */
	public float getSomeFloat() {
		return someFloat;
	}

	/**
	 * @param someFloat the someFloat to set
	 */
	public void setSomeFloat(float someFloat) {
		this.someFloat = someFloat;
	}

	/**
	 * @return the someDouble
	 */
	public double getSomeDouble() {
		return someDouble;
	}

	/**
	 * @param someDouble the someDouble to set
	 */
	public void setSomeDouble(double someDouble) {
		this.someDouble = someDouble;
	}

	/**
	 * @return the someBoolean
	 */
	public boolean isSomeBoolean() {
		return someBoolean;
	}

	/**
	 * @param someBoolean the someBoolean to set
	 */
	public void setSomeBoolean(boolean someBoolean) {
		this.someBoolean = someBoolean;
	}

	/**
	 * @return the someIntiger
	 */
	public Integer getSomeIntiger() {
		return someIntiger;
	}

	/**
	 * @param someIntiger the someIntiger to set
	 */
	public void setSomeIntiger(Integer someIntiger) {
		this.someIntiger = someIntiger;
	}

	/**
	 * @return the someBigDecimal
	 */
	public BigDecimal getSomeBigDecimal() {
		return someBigDecimal;
	}

	/**
	 * @param someBigDecimal the someBigDecimal to set
	 */
	public void setSomeBigDecimal(BigDecimal someBigDecimal) {
		this.someBigDecimal = someBigDecimal;
	}

	/**
	 * @return the someBigInteger
	 */
	public BigInteger getSomeBigInteger() {
		return someBigInteger;
	}

	/**
	 * @param someBigInteger the someBigInteger to set
	 */
	public void setSomeBigInteger(BigInteger someBigInteger) {
		this.someBigInteger = someBigInteger;
	}

	/**
	 * @return the integerArray
	 */
	public int[] getIntegerArray() {
		return integerArray;
	}

	/**
	 * @param integerArray the integerArray to set
	 */
	public void setIntegerArray(int[] integerArray) {
		this.integerArray = integerArray;
	}

	/**
	 * @return the doubleArray
	 */
	public double[] getDoubleArray() {
		return doubleArray;
	}

	/**
	 * @param doubleArray the doubleArray to set
	 */
	public void setDoubleArray(double[] doubleArray) {
		this.doubleArray = doubleArray;
	}

	/**
	 * @return the myEnum
	 */
	public MyEnum getMyEnum() {
		return myEnum;
	}

	/**
	 * @param myEnum the myEnum to set
	 */
	public void setMyEnum(MyEnum myEnum) {
		this.myEnum = myEnum;
	}
	
	
}
