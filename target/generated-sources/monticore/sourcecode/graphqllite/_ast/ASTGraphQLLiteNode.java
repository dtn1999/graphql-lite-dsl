/* generated from model GraphQLLite */
/* generated by template core.Interface*/

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


 public  interface ASTGraphQLLiteNode extends ASTNode  { 


  /* generated by template core.Method*/
 abstract  public  void accept (graphqllite._visitor.GraphQLLiteTraverser visitor)

;
}