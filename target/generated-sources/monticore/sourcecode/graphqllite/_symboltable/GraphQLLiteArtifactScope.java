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


 public  class GraphQLLiteArtifactScope extends graphqllite._symboltable.GraphQLLiteScope  implements graphqllite._symboltable.IGraphQLLiteArtifactScope {

    /* generated by template core.Attribute*/
 protected  String packageName ;

    /* generated by template core.Attribute*/
 protected  List<de.monticore.symboltable.ImportStatement> imports ;


    /* generated by template core.Constructor*/
 public  GraphQLLiteArtifactScope(String packageName,List<de.monticore.symboltable.ImportStatement> imports)
 {
  this(Optional.empty(), packageName, imports);
}

    /* generated by template core.Constructor*/
 public  GraphQLLiteArtifactScope(Optional<graphqllite._symboltable.IGraphQLLiteScope> enclosingScope,String packageName,List<de.monticore.symboltable.ImportStatement> imports)
 {
  /* generated by template _symboltable.artifactscope.ConstructorArtifactScope*/
  super(true);
  if (enclosingScope.isPresent()) {
    setEnclosingScope(enclosingScope.get());
  }
  setExportingSymbols(true);
  Log.errorIfNull(packageName);
  Log.errorIfNull(imports);

  if (!packageName.isEmpty()) {
    this.packageName = packageName.endsWith(".") ? packageName.substring(0, packageName.length() - 1) : packageName;
  } else {
    // default package
    this.packageName = "";
  }

  this.imports = Collections.unmodifiableList(new ArrayList<>(imports));
}

    /* generated by template core.Constructor*/
 public  GraphQLLiteArtifactScope()
 {
  this("", new java.util.ArrayList<>());
}


    /* generated by template core.Method*/
 public  String getPackageName ()

 {
      /* generated by template methods.Get*/

return this.packageName;

}

    /* generated by template core.Method*/
 public  void setPackageName (String packageName)

 {
      /* generated by template methods.Set*/

this.packageName = packageName;

}

    /* generated by template core.Method*/
 public  List<de.monticore.symboltable.ImportStatement> getImportsList ()

 {
      /* generated by template methods.Get*/

return this.imports;

}

    /* generated by template core.Method*/
 public  void setImportsList (List<de.monticore.symboltable.ImportStatement> imports)

 {
      /* generated by template methods.Set*/

this.imports = imports;

}

    /* generated by template core.Method*/
 public  boolean isPresentName ()

 {
      /* generated by template _symboltable.artifactscope.IsPresentName*/
  if (!super.isPresentName()) {
    final Optional<de.monticore.symboltable.ISymbol> topLevelSymbol = getTopLevelSymbol();
    if (topLevelSymbol.isPresent()) {
      setName(topLevelSymbol.get().getName());
    }
  }
  return this.name.isPresent();
}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template _symboltable.artifactscope.GetName*/
  if (!super.isPresentName()) {
    final Optional<de.monticore.symboltable.ISymbol> topLevelSymbol = getTopLevelSymbol();
    if (topLevelSymbol.isPresent()) {
      setName(topLevelSymbol.get().getName());
    }
  }
  return super.getName();
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (graphqllite._symboltable.IGraphQLLiteScope enclosingScope)

 {
      /* generated by template _symboltable.artifactscope.SetEnclosingScope*/

if(!(enclosingScope instanceof GraphQLLiteGlobalScope)){
  Log.warn("0xA1039x70214 The artifact scope " + (isPresentName() ? getName() : "") + " should have a global scope as enclosing scope or no "
    + "enclosing scope at all.");
}
super.setEnclosingScope(enclosingScope);

}

    /* generated by template core.Method*/
 public  void accept (graphqllite._visitor.GraphQLLiteTraverser visitor)

 {
      visitor.handle(this);
}

}