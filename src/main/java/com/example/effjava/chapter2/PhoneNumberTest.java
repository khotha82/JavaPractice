package com.example.effjava.chapter2;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krishna_hotha on 6/29/15 2015.
 */
public class PhoneNumberTest implements  Cloneable{

	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
    private String string;


	public PhoneNumberTest(int areaCode, int prefix,
			int lineNumber) {
		System.out.println("Calling constructio");
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max,
			String name) {
		if (arg < 0 || arg > max)
			throw new IllegalArgumentException(name + ": " + arg);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumberTest))
			return false;
		PhoneNumberTest pn = (PhoneNumberTest) o;
		return pn.lineNumber == lineNumber
				&& pn.prefix == prefix
				&& pn.areaCode == areaCode;
	}

	@Override
	public String toString(){
	  return	ToStringBuilder.reflectionToString(this);
	}
    @Override
    public int hashCode() {


        return this.lineNumber+this.areaCode+this.prefix;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

       Map<PhoneNumberTest, String> m
               = new HashMap<PhoneNumberTest, String>();
        m.put(new PhoneNumberTest(707, 867, 5309), "Jenny");

        System.out.println(m.get(new PhoneNumberTest(707, 867, 5309)));

		int a=11;
		int b=10;
		int c=a^b;

		long f=10;

		int i=(int)(f^(f>>>32));
		System.out.println(Integer.toBinaryString(a<<2));
		System.out.println(i);

	}

}
