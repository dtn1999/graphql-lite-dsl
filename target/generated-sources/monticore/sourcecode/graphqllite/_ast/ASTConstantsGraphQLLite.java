/* generated from model GraphQLLite */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package graphqllite._ast;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;


 public  class ASTConstantsGraphQLLite  {

    /* generated by template core.Attribute*/
 public  final  static  String LANGUAGE = "GraphQLLite";

    /* generated by template core.Attribute*/
 public  final  static  int DEFAULT = 0;

    /* generated by template core.Attribute*/
 public  final  static  int BOOLEAN = 1;

    /* generated by template core.Attribute*/
 public  final  static  int FLOAT = 2;

    /* generated by template core.Attribute*/
 public  final  static  int ID = 3;

    /* generated by template core.Attribute*/
 public  final  static  int INT = 4;

    /* generated by template core.Attribute*/
 public  final  static  int REQUIRED = 5;

    /* generated by template core.Attribute*/
 public  final  static  int STRING = 6;

    /* generated by template core.Attribute*/
 public  static  String[] superGrammars = {"de.monticore.literals.MCCommonLiterals", "de.monticore.MCBasics", "de.monticore.literals.MCLiteralsBasis"};


    /* generated by template core.Constructor*/
 public  ASTConstantsGraphQLLite()
 {
  /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  static  Collection<String> getAllLanguages ()

 {
      /* generated by template _ast.ast_constants.GetAllLanguages*/


  Collection<String> allLanguages = com.google.common.collect.Sets.newLinkedHashSet();
    allLanguages.addAll(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.getAllLanguages());
    allLanguages.addAll(de.monticore.mcbasics._ast.ASTConstantsMCBasics.getAllLanguages());
    allLanguages.addAll(de.monticore.literals.mcliteralsbasis._ast.ASTConstantsMCLiteralsBasis.getAllLanguages());
  allLanguages.add(LANGUAGE);
  return allLanguages;
}

}
