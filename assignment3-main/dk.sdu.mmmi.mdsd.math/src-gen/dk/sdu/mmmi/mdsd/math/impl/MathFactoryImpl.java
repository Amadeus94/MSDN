/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math.impl;

import dk.sdu.mmmi.mdsd.math.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathFactoryImpl extends EFactoryImpl implements MathFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathFactory init()
  {
    try
    {
      MathFactory theMathFactory = (MathFactory)EPackage.Registry.INSTANCE.getEFactory(MathPackage.eNS_URI);
      if (theMathFactory != null)
      {
        return theMathFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathPackage.MATH_EXP: return createMathExp();
      case MathPackage.VAR_BINDING: return createVarBinding();
      case MathPackage.EXPRESSION: return createExpression();
      case MathPackage.LET_BINDING: return createLetBinding();
      case MathPackage.BINDING: return createBinding();
      case MathPackage.VARIABLE_USE: return createVariableUse();
      case MathPackage.PLUS: return createPlus();
      case MathPackage.MINUS: return createMinus();
      case MathPackage.MULT: return createMult();
      case MathPackage.DIV: return createDiv();
      case MathPackage.MATH_NUMBER: return createMathNumber();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp createMathExp()
  {
    MathExpImpl mathExp = new MathExpImpl();
    return mathExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBinding createVarBinding()
  {
    VarBindingImpl varBinding = new VarBindingImpl();
    return varBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetBinding createLetBinding()
  {
    LetBindingImpl letBinding = new LetBindingImpl();
    return letBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableUse createVariableUse()
  {
    VariableUseImpl variableUse = new VariableUseImpl();
    return variableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathNumber createMathNumber()
  {
    MathNumberImpl mathNumber = new MathNumberImpl();
    return mathNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathPackage getMathPackage()
  {
    return (MathPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathPackage getPackage()
  {
    return MathPackage.eINSTANCE;
  }

} //MathFactoryImpl
