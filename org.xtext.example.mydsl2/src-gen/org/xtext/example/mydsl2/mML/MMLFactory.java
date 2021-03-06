/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl2.mML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl2.mML.MMLPackage
 * @generated
 */
public interface MMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MMLFactory eINSTANCE = org.xtext.example.mydsl2.mML.impl.MMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Traitement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Traitement</em>'.
   * @generated
   */
  Traitement createTraitement();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Algorithm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm</em>'.
   * @generated
   */
  Algorithm createAlgorithm();

  /**
   * Returns a new object of class '<em>Strat Eval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strat Eval</em>'.
   * @generated
   */
  StratEval createStratEval();

  /**
   * Returns a new object of class '<em>Cross Validation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cross Validation</em>'.
   * @generated
   */
  CrossValidation createCrossValidation();

  /**
   * Returns a new object of class '<em>Training Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Training Test</em>'.
   * @generated
   */
  TrainingTest createTrainingTest();

  /**
   * Returns a new object of class '<em>SVM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SVM</em>'.
   * @generated
   */
  SVM createSVM();

  /**
   * Returns a new object of class '<em>Tree</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree</em>'.
   * @generated
   */
  Tree createTree();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MMLPackage getMMLPackage();

} //MMLFactory
