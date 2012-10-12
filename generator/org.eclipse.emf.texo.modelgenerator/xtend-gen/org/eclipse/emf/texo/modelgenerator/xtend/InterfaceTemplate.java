package org.eclipse.emf.texo.modelgenerator.xtend;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceTemplate extends BaseTemplate {
  private ModelController modelController;
  
  private EClassModelGenAnnotation eClassModelGenAnnotation;
  
  private EPackageModelGenAnnotation ePackageAnnotation;
  
  public void generate(final ModelController theModelController, final EClassModelGenAnnotation theEClassModelGenAnnotation) {
    this.modelController = theModelController;
    this.eClassModelGenAnnotation = theEClassModelGenAnnotation;
    EPackageModelGenAnnotation _ownerEPackageAnnotation = theEClassModelGenAnnotation.getOwnerEPackageAnnotation();
    this.ePackageAnnotation = _ownerEPackageAnnotation;
    boolean _isGenerateCode = this.eClassModelGenAnnotation.isGenerateCode();
    if (_isGenerateCode) {
      String fileName = TemplateUtil.classFileName(this.eClassModelGenAnnotation);
      String content = this.generateContent();
      this.addFile(fileName, content);
    }
  }
  
  public String generateContent() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = this.ePackageAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = this.ePackageAnnotation.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A representation of the model object \'<em><b>");
    String _name = this.eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    {
      String _documentation = this.eClassModelGenAnnotation.getDocumentation();
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        _builder.append("* <!-- begin-model-doc -->");
        _builder.newLine();
        _builder.append("* ");
        String _documentation_1 = this.eClassModelGenAnnotation.getDocumentation();
        _builder.append(_documentation_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("* <!-- end-model-doc -->");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* @generated ");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    EClass _eClass = this.eClassModelGenAnnotation.getEClass();
    String _javaAnnotations = this.modelController.getJavaAnnotations(_eClass, "type");
    _builder.append(_javaAnnotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public interface ");
    String _simpleClassName = this.eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _classExtends = this.eClassModelGenAnnotation.getClassExtends();
      int _size = _classExtends.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(" extends ");
        EList<String> _classExtends_1 = this.eClassModelGenAnnotation.getClassExtends();
        String _get = _classExtends_1.get(0);
        _builder.append(_get, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("{ ");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = this.eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eStructuralFeatureModelGenAnnotations) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Returns the value of \'<em><b>");
        EStructuralFeature _eStructuralFeature = featureAnnotation.getEStructuralFeature();
        String _name_1 = _eStructuralFeature.getName();
        _builder.append(_name_1, " ");
        _builder.append("</em></b>\' feature.");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @return the value of \'<em><b>");
        EStructuralFeature _eStructuralFeature_1 = featureAnnotation.getEStructuralFeature();
        String _name_2 = _eStructuralFeature_1.getName();
        _builder.append(_name_2, " ");
        _builder.append("</b></em>\' feature");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        EStructuralFeature _eStructuralFeature_2 = featureAnnotation.getEStructuralFeature();
        String _javaAnnotations_1 = this.modelController.getJavaAnnotations(_eStructuralFeature_2, "getter");
        _builder.append(_javaAnnotations_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public ");
        String _type = featureAnnotation.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        String _getter = featureAnnotation.getGetter();
        _builder.append(_getter, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          boolean _or = false;
          EStructuralFeature _eStructuralFeature_3 = featureAnnotation.getEStructuralFeature();
          boolean _isChangeable = _eStructuralFeature_3.isChangeable();
          if (_isChangeable) {
            _or = true;
          } else {
            boolean _and = false;
            boolean _isReference = featureAnnotation.isReference();
            if (!_isReference) {
              _and = false;
            } else {
              EReferenceModelGenAnnotation _oppositeModelGenAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation).getOppositeModelGenAnnotation();
              boolean _notEquals_1 = (!Objects.equal(_oppositeModelGenAnnotation, null));
              _and = (_isReference && _notEquals_1);
            }
            _or = (_isChangeable || _and);
          }
          if (_or) {
            {
              boolean _and_1 = false;
              boolean _and_2 = false;
              boolean _and_3 = false;
              EStructuralFeatureModelGenAnnotation _featureMapFeature = featureAnnotation.getFeatureMapFeature();
              boolean _equals = Objects.equal(_featureMapFeature, null);
              if (!_equals) {
                _and_3 = false;
              } else {
                boolean _isMany = featureAnnotation.isMany();
                _and_3 = (_equals && _isMany);
              }
              if (!_and_3) {
                _and_2 = false;
              } else {
                boolean _isReference_1 = featureAnnotation.isReference();
                _and_2 = (_and_3 && _isReference_1);
              }
              if (!_and_2) {
                _and_1 = false;
              } else {
                boolean _isGenerateSafeManyAccess = ((EReferenceModelGenAnnotation) featureAnnotation).isGenerateSafeManyAccess();
                _and_1 = (_and_2 && _isGenerateSafeManyAccess);
              }
              if (_and_1) {
                _builder.append("/**");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Adds to the <em>");
                EStructuralFeature _eStructuralFeature_4 = featureAnnotation.getEStructuralFeature();
                String _name_3 = _eStructuralFeature_4.getName();
                _builder.append(_name_3, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void addTo");
                String _validJavaMemberName = featureAnnotation.getValidJavaMemberName();
                String _firstUpper = TemplateUtil.toFirstUpper(_validJavaMemberName);
                _builder.append(_firstUpper, "");
                _builder.append("(");
                String _itemType = featureAnnotation.getItemType();
                _builder.append(_itemType, "");
                _builder.append(" value);");
                _builder.newLineIfNotEmpty();
                _builder.newLine();
                _builder.append("/**\t\t\t");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Removes from the <em>");
                EStructuralFeature _eStructuralFeature_5 = featureAnnotation.getEStructuralFeature();
                String _name_4 = _eStructuralFeature_5.getName();
                _builder.append(_name_4, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void removeFrom");
                String _validJavaMemberName_1 = featureAnnotation.getValidJavaMemberName();
                String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
                _builder.append(_firstUpper_1, "");
                _builder.append("(");
                String _itemType_1 = featureAnnotation.getItemType();
                _builder.append(_itemType_1, "");
                _builder.append(" value);");
                _builder.newLineIfNotEmpty();
                _builder.newLine();
                _builder.append("/**\t\t\t");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Clears the <em>");
                EStructuralFeature _eStructuralFeature_6 = featureAnnotation.getEStructuralFeature();
                String _name_5 = _eStructuralFeature_6.getName();
                _builder.append(_name_5, " ");
                _builder.append("</em> feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                _builder.append("public void clear");
                String _validJavaMemberName_2 = featureAnnotation.getValidJavaMemberName();
                String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_2);
                _builder.append(_firstUpper_2, "");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Sets the \'{@link ");
            String _simpleClassName_1 = this.eClassModelGenAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_1, " ");
            _builder.append("#");
            String _getter_1 = featureAnnotation.getGetter();
            _builder.append(_getter_1, " ");
            _builder.append("() <em>");
            EStructuralFeature _eStructuralFeature_7 = featureAnnotation.getEStructuralFeature();
            String _name_6 = _eStructuralFeature_7.getName();
            _builder.append(_name_6, " ");
            _builder.append("</em>}\' feature.");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* <!-- begin-user-doc -->");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* <!-- end-user-doc -->");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* @param the new value of the \'{@link ");
            String _simpleClassName_2 = this.eClassModelGenAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_2, " ");
            _builder.append("#");
            String _getter_2 = featureAnnotation.getGetter();
            _builder.append(_getter_2, " ");
            _builder.append("() <em>");
            EStructuralFeature _eStructuralFeature_8 = featureAnnotation.getEStructuralFeature();
            String _name_7 = _eStructuralFeature_8.getName();
            _builder.append(_name_7, " ");
            _builder.append("</em>}\' feature.");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            EStructuralFeature _eStructuralFeature_9 = featureAnnotation.getEStructuralFeature();
            String _javaAnnotations_2 = this.modelController.getJavaAnnotations(_eStructuralFeature_9, "getter");
            _builder.append(_javaAnnotations_2, "");
            _builder.newLineIfNotEmpty();
            _builder.append("public void ");
            String _setter = featureAnnotation.getSetter();
            _builder.append(_setter, "");
            _builder.append("(");
            String _type_1 = featureAnnotation.getType();
            _builder.append(_type_1, "");
            _builder.append(" new");
            String _name_8 = featureAnnotation.getName();
            String _firstUpper_3 = TemplateUtil.toFirstUpper(_name_8);
            _builder.append(_firstUpper_3, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}