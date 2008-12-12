/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CSI Datatype Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatypeCodes()
 * @model
 * @generated
 */
public enum CSIDatatypeCodes implements Enumerator {
	/**
	 * The '<em><b>CSI Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_INTEGER(0, "CSIInteger", "CSIInteger"),

	/**
	 * The '<em><b>CSI String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_STRING(0, "CSIString", "CSIString"),

	/**
	 * The '<em><b>CSI Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_FLOAT(0, "CSIFloat", "CSIFloat"),

	/**
	 * The '<em><b>CSI Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_DOUBLE(0, "CSIDouble", "CSIDouble"),

	/**
	 * The '<em><b>CSI Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_BOOLEAN(0, "CSIBoolean", "CSIBoolean"),

	/**
	 * The '<em><b>CSI Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_DATE(0, "CSIDate", "CSIDate"),

	/**
	 * The '<em><b>CSI Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_BYTE(0, "CSIByte", "CSIByte"),

	/**
	 * The '<em><b>CSI Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSI_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	CSI_LONG(0, "CSILong", "CSILong");

	/**
	 * The '<em><b>CSI Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_INTEGER
	 * @model name="CSIInteger"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>CSI String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_STRING
	 * @model name="CSIString"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_STRING_VALUE = 0;

	/**
	 * The '<em><b>CSI Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_FLOAT
	 * @model name="CSIFloat"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_FLOAT_VALUE = 0;

	/**
	 * The '<em><b>CSI Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_DOUBLE
	 * @model name="CSIDouble"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_DOUBLE_VALUE = 0;

	/**
	 * The '<em><b>CSI Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_BOOLEAN
	 * @model name="CSIBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>CSI Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_DATE
	 * @model name="CSIDate"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_DATE_VALUE = 0;

	/**
	 * The '<em><b>CSI Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_BYTE
	 * @model name="CSIByte"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_BYTE_VALUE = 0;

	/**
	 * The '<em><b>CSI Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSI Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSI_LONG
	 * @model name="CSILong"
	 * @generated
	 * @ordered
	 */
	public static final int CSI_LONG_VALUE = 0;

	/**
	 * An array of all the '<em><b>CSI Datatype Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CSIDatatypeCodes[] VALUES_ARRAY =
		new CSIDatatypeCodes[] {
			CSI_INTEGER,
			CSI_STRING,
			CSI_FLOAT,
			CSI_DOUBLE,
			CSI_BOOLEAN,
			CSI_DATE,
			CSI_BYTE,
			CSI_LONG,
		};

	/**
	 * A public read-only list of all the '<em><b>CSI Datatype Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CSIDatatypeCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CSI Datatype Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSIDatatypeCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSIDatatypeCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CSI Datatype Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSIDatatypeCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CSIDatatypeCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CSI Datatype Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSIDatatypeCodes get(int value) {
		switch (value) {
			case CSI_INTEGER_VALUE: return CSI_INTEGER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CSIDatatypeCodes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CSIDatatypeCodes
