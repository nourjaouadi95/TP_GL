/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl2.mML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traitement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.mML.Traitement#getChemin <em>Chemin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.mML.Traitement#getEval <em>Eval</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.mML.Traitement#getAlgo <em>Algo</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.mML.Traitement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.mML.Traitement#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement()
 * @model
 * @generated
 */
public interface Traitement extends EObject
{
  /**
   * Returns the value of the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chemin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chemin</em>' attribute.
   * @see #setChemin(String)
   * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement_Chemin()
   * @model
   * @generated
   */
  String getChemin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.mML.Traitement#getChemin <em>Chemin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chemin</em>' attribute.
   * @see #getChemin()
   * @generated
   */
  void setChemin(String value);

  /**
   * Returns the value of the '<em><b>Eval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eval</em>' containment reference.
   * @see #setEval(StratEval)
   * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement_Eval()
   * @model containment="true"
   * @generated
   */
  StratEval getEval();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.mML.Traitement#getEval <em>Eval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eval</em>' containment reference.
   * @see #getEval()
   * @generated
   */
  void setEval(StratEval value);

  /**
   * Returns the value of the '<em><b>Algo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algo</em>' containment reference.
   * @see #setAlgo(Algorithm)
   * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement_Algo()
   * @model containment="true"
   * @generated
   */
  Algorithm getAlgo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.mML.Traitement#getAlgo <em>Algo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algo</em>' containment reference.
   * @see #getAlgo()
   * @generated
   */
  void setAlgo(Algorithm value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Variable)
   * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement_Name()
   * @model containment="true"
   * @generated
   */
  Variable getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.mML.Traitement#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.mML.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' containment reference list.
   * @see org.xtext.example.mydsl2.mML.MMLPackage#getTraitement_Names()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getNames();

} // Traitement
