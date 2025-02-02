package org.bimserver.tools.generators;

import org.eclipse.emf.ecore.*;
import org.bimserver.utils.*;
import org.bimserver.emf.MetaDataManager;
import java.io.File;
import java.util.Set;
import org.bimserver.utils.StringUtils;

public class SConverterGenerator
{
  protected static String nl;
  public static synchronized SConverterGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    SConverterGenerator result = new SConverterGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package org.bimserver.interfaces;";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "import org.bimserver.emf.IdEObjectImpl;" + NL + "import org.bimserver.interfaces.objects.*;" + NL + "import java.util.*;" + NL + "import org.bimserver.models.log.*;" + NL + "import org.bimserver.models.store.*;" + NL + "import org.bimserver.database.DatabaseSession;" + NL + "" + NL + "public class SConverter {";
  protected final String TEXT_5 = NL + NL + "\tpublic Set<S";
  protected final String TEXT_6 = "> convertToSSet";
  protected final String TEXT_7 = "(Collection<";
  protected final String TEXT_8 = "> input) {" + NL + "\t\tSet<S";
  protected final String TEXT_9 = "> result = new HashSet<S";
  protected final String TEXT_10 = ">();" + NL + "\t\tfor (";
  protected final String TEXT_11 = " o : input) {" + NL + "\t\t\tresult.add(convertToSObject(o));" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\tpublic Set<";
  protected final String TEXT_12 = "> convertFromSSet";
  protected final String TEXT_13 = "(Collection<S";
  protected final String TEXT_14 = "> input, DatabaseSession session) {" + NL + "\t\tSet<";
  protected final String TEXT_15 = "> result = new HashSet<";
  protected final String TEXT_16 = ">();" + NL + "\t\tfor (S";
  protected final String TEXT_17 = " o : input) {" + NL + "\t\t\tresult.add(convertFromSObject(o, session));" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\tpublic List<S";
  protected final String TEXT_18 = "> convertToSList";
  protected final String TEXT_19 = "(Collection<";
  protected final String TEXT_20 = "> input) {" + NL + "\t\tList<S";
  protected final String TEXT_21 = "> result = new ArrayList<S";
  protected final String TEXT_22 = ">();" + NL + "\t\tfor (";
  protected final String TEXT_23 = " o : input) {" + NL + "\t\t\tresult.add(convertToSObject(o));" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\tpublic List<";
  protected final String TEXT_24 = "> convertFromSList";
  protected final String TEXT_25 = "(Collection<S";
  protected final String TEXT_26 = "> input, DatabaseSession session) {" + NL + "\t\tList<";
  protected final String TEXT_27 = "> result = new ArrayList<";
  protected final String TEXT_28 = ">();" + NL + "\t\tfor (S";
  protected final String TEXT_29 = " o : input) {" + NL + "\t\t\tresult.add(convertFromSObject(o, session));" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\tpublic S";
  protected final String TEXT_30 = " convertToSObject(";
  protected final String TEXT_31 = " input) {" + NL + "\t\tif (input == null) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t";
  protected final String TEXT_33 = "if (input instanceof ";
  protected final String TEXT_34 = ") {" + NL + "\t\t\treturn convertToSObject((";
  protected final String TEXT_35 = ")input);" + NL + "\t\t}";
  protected final String TEXT_36 = NL + "\t\tS";
  protected final String TEXT_37 = " result = new S";
  protected final String TEXT_38 = "();" + NL + "\t\tresult.setOid(input.getOid());";
  protected final String TEXT_39 = NL + "\t\tresult.set";
  protected final String TEXT_40 = "(S";
  protected final String TEXT_41 = ".values()[input.get";
  protected final String TEXT_42 = "().ordinal()]);";
  protected final String TEXT_43 = NL + "\t\tresult.get";
  protected final String TEXT_44 = "().addAll(input.";
  protected final String TEXT_45 = "());";
  protected final String TEXT_46 = NL + "\t\tresult.set";
  protected final String TEXT_47 = "(input.";
  protected final String TEXT_48 = "());";
  protected final String TEXT_49 = NL + "\t\tList<S";
  protected final String TEXT_50 = "> list";
  protected final String TEXT_51 = " = new ArrayList<S";
  protected final String TEXT_52 = ">();" + NL + "\t\tfor (";
  protected final String TEXT_53 = " v : input.get";
  protected final String TEXT_54 = "()) {" + NL + "\t\t\tlist";
  protected final String TEXT_55 = ".add(convertToSObject(v));" + NL + "\t\t}" + NL + "\t\tresult.set";
  protected final String TEXT_56 = "(list";
  protected final String TEXT_57 = ");";
  protected final String TEXT_58 = NL + "\t\tList<Long> list";
  protected final String TEXT_59 = " = new ArrayList<Long>();" + NL + "\t\tfor (";
  protected final String TEXT_60 = " v : input.get";
  protected final String TEXT_61 = "()) {" + NL + "\t\t\tlist";
  protected final String TEXT_62 = ".add(v.getOid());" + NL + "\t\t}" + NL + "\t\tresult.set";
  protected final String TEXT_63 = "(list";
  protected final String TEXT_64 = ");";
  protected final String TEXT_65 = NL + "\t\t";
  protected final String TEXT_66 = " ";
  protected final String TEXT_67 = "Val = input.get";
  protected final String TEXT_68 = "();" + NL + "\t\tresult.set";
  protected final String TEXT_69 = "(convertToSObject(";
  protected final String TEXT_70 = "Val));";
  protected final String TEXT_71 = NL + "\t\t";
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = "Val = input.get";
  protected final String TEXT_74 = "();" + NL + "\t\tresult.set";
  protected final String TEXT_75 = "Id(";
  protected final String TEXT_76 = "Val == null ? -1 : ";
  protected final String TEXT_77 = "Val.getOid());";
  protected final String TEXT_78 = NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_79 = " convertFromSObject(S";
  protected final String TEXT_80 = " input, DatabaseSession session) {" + NL + "\t\tif (input == null) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_81 = " result = ";
  protected final String TEXT_82 = "Factory.eINSTANCE.create";
  protected final String TEXT_83 = "();" + NL + "\t\t((IdEObjectImpl)result).setOid(input.getOid());";
  protected final String TEXT_84 = NL + "\t\tresult.set";
  protected final String TEXT_85 = "(";
  protected final String TEXT_86 = ".values()[input.get";
  protected final String TEXT_87 = "().ordinal()]);";
  protected final String TEXT_88 = NL + "\t\tresult.get";
  protected final String TEXT_89 = "().addAll(input.";
  protected final String TEXT_90 = "());";
  protected final String TEXT_91 = NL + "\t\tresult.set";
  protected final String TEXT_92 = "(input.";
  protected final String TEXT_93 = "());";
  protected final String TEXT_94 = NL + "\t\tList<";
  protected final String TEXT_95 = "> list";
  protected final String TEXT_96 = " = result.get";
  protected final String TEXT_97 = "();" + NL + "\t\tfor (S";
  protected final String TEXT_98 = " v : input.get";
  protected final String TEXT_99 = "()) {" + NL + "\t\t\tlist";
  protected final String TEXT_100 = ".add(convertFromSObject(v, session));" + NL + "\t\t}";
  protected final String TEXT_101 = NL + "\t\tList<";
  protected final String TEXT_102 = "> list";
  protected final String TEXT_103 = " = result.get";
  protected final String TEXT_104 = "();" + NL + "\t\tfor (long oid : input.get";
  protected final String TEXT_105 = "()) {" + NL + "\t\t\tlist";
  protected final String TEXT_106 = ".add((";
  protected final String TEXT_107 = ")session.get(";
  protected final String TEXT_108 = "Package.eINSTANCE.get";
  protected final String TEXT_109 = "(), oid, false, null));" + NL + "\t\t}";
  protected final String TEXT_110 = NL + "\t\tresult.set";
  protected final String TEXT_111 = "(convertFromSObject(input.get";
  protected final String TEXT_112 = "(), session));";
  protected final String TEXT_113 = NL + "\t\tresult.set";
  protected final String TEXT_114 = "((";
  protected final String TEXT_115 = ")session.get(";
  protected final String TEXT_116 = "Package.eINSTANCE.get";
  protected final String TEXT_117 = "(), input.get";
  protected final String TEXT_118 = "Id(), false, null));";
  protected final String TEXT_119 = NL + "\t\treturn result;" + NL + "\t}";
  protected final String TEXT_120 = NL + "\t\tpublic S";
  protected final String TEXT_121 = " convertToSObject(";
  protected final String TEXT_122 = " input) {" + NL + "\t\t\treturn S";
  protected final String TEXT_123 = ".values()[input.ordinal()];" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tpublic ";
  protected final String TEXT_124 = " convertFromSObject(S";
  protected final String TEXT_125 = " input) {" + NL + "\t\t\treturn ";
  protected final String TEXT_126 = ".values()[input.ordinal()];" + NL + "\t\t}";
  protected final String TEXT_127 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(Licenser.getCommentedLicenseText(new File("license.txt")));
    stringBuffer.append(TEXT_4);
    
	Object[] argumentsArray = (Object[])argument;
	MetaDataManager metaDataManager = (MetaDataManager)argumentsArray[0];
	@SuppressWarnings("unchecked") Set<EPackage> ePackages = (Set<EPackage>)argumentsArray[1];
	for (EPackage ePackage : ePackages) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass)eClassifier;

    stringBuffer.append(TEXT_5);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_31);
     if (!metaDataManager.getDirectSubClasses(eClass).isEmpty()) {
	for (EClass subClass : metaDataManager.getDirectSubClasses(eClass)) {

    stringBuffer.append(TEXT_32);
    stringBuffer.append(metaDataManager.getDirectSubClasses(eClass).iterator().next() == subClass ? "" : "else ");
    stringBuffer.append(TEXT_33);
    stringBuffer.append(subClass.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(subClass.getName());
    stringBuffer.append(TEXT_35);
    
		}
	}

    stringBuffer.append(TEXT_36);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_38);
    
	for (EAttribute eAttribute : eClass.getEAllAttributes()) {
		if (eAttribute.getEType() instanceof EEnum) {

    stringBuffer.append(TEXT_39);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(eAttribute.getEType().getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_42);
    
		} else {
			if (eAttribute.isMany()) {

    stringBuffer.append(TEXT_43);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(eAttribute.getEType() == EcorePackage.eINSTANCE.getEBoolean() ? "is" : "get");
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_45);
    
			} else {

    stringBuffer.append(TEXT_46);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(eAttribute.getEType() == EcorePackage.eINSTANCE.getEBoolean() ? "is" : "get");
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_48);
    
			}
		}
	}
	for (EReference eReference : eClass.getEAllReferences()) {
		if (eReference.isMany()) {
			if (eReference.getEAnnotation("embedsreference") != null) {

    stringBuffer.append(TEXT_49);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_57);
    
			} else {

    stringBuffer.append(TEXT_58);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_64);
    
			}
		} else {
			if (eReference.getEAnnotation("embedsreference") != null) {

    stringBuffer.append(TEXT_65);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_70);
    
			} else {

    stringBuffer.append(TEXT_71);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_77);
    
			}
		}
	}

    stringBuffer.append(TEXT_78);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(StringUtils.firstUpperCase(eClass.getEPackage().getName()));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_83);
    
	for (EAttribute eAttribute : eClass.getEAllAttributes()) {
		if (eAttribute.getEType() instanceof EEnum) {

    stringBuffer.append(TEXT_84);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(eAttribute.getEType().getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_87);
    
		} else {
			if (eAttribute.isMany()) {

    stringBuffer.append(TEXT_88);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(eAttribute.getEType() == EcorePackage.eINSTANCE.getEBoolean() ? "is" : "get");
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_90);
    
			} else {

    stringBuffer.append(TEXT_91);
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(eAttribute.getEType() == EcorePackage.eINSTANCE.getEBoolean() ? "is" : "get");
    stringBuffer.append(StringUtils.firstUpperCase(eAttribute.getName()));
    stringBuffer.append(TEXT_93);
    
			}
		}
	}
	for (EReference eReference : eClass.getEAllReferences()) {
		if (eReference.isMany()) {
			if (eReference.getEAnnotation("embedsreference") != null) {

    stringBuffer.append(TEXT_94);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_100);
    
			} else {

    stringBuffer.append(TEXT_101);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(eReference.getName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getEType().getEPackage().getName()));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_109);
    		
			}
		} else {
			if (eReference.getEAnnotation("embedsreference") != null) {

    stringBuffer.append(TEXT_110);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_112);
    
			} else {

    stringBuffer.append(TEXT_113);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getEType().getEPackage().getName()));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(eReference.getEType().getName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(StringUtils.firstUpperCase(eReference.getName()));
    stringBuffer.append(TEXT_118);
    
			}
		}
	}

    stringBuffer.append(TEXT_119);
    
		} else if (eClassifier instanceof EEnum) {
			EEnum eEnum = (EEnum)eClassifier;

    stringBuffer.append(TEXT_120);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(eEnum.getName());
    stringBuffer.append(TEXT_126);
    
		}
	}
}

    stringBuffer.append(TEXT_127);
    return stringBuffer.toString();
  }
}
