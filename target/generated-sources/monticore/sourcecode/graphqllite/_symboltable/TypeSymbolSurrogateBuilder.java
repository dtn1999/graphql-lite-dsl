/* generated from model GraphQLLite */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package graphqllite._symboltable;

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


 public  class TypeSymbolSurrogateBuilder  {

    /* generated by template core.Attribute*/
 protected  TypeSymbolSurrogateBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  graphqllite._symboltable.IGraphQLLiteScope enclosingScope ;


    /* generated by template core.Constructor*/
 public  TypeSymbolSurrogateBuilder()
 {
  this.realBuilder = (TypeSymbolSurrogateBuilder) this;
}


    /* generated by template core.Method*/
 public  TypeSymbolSurrogateBuilder setName (String name)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  graphqllite._symboltable.IGraphQLLiteScope getEnclosingScope ()

 {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  TypeSymbolSurrogateBuilder setEnclosingScope (graphqllite._symboltable.IGraphQLLiteScope enclosingScope)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.enclosingScope = enclosingScope;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  TypeSymbolSurrogate build ()

 {
      /* generated by template _symboltable.symbolsurrogate.BuildSymbolSurrogate*/

  TypeSymbolSurrogate symbolReference = new TypeSymbolSurrogate(name);
  symbolReference.setEnclosingScope(enclosingScope);
  return symbolReference;
}

}
