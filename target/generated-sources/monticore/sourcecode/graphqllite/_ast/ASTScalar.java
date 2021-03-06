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


 public  class ASTScalar extends ASTCNode  implements graphqllite._ast.ASTGQLType,graphqllite._ast.ASTGraphQLLiteNode {

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  Optional<graphqllite._symboltable.GQLTypeSymbol> symbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  graphqllite._symboltable.IGraphQLLiteScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTScalar()
 {
  /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  boolean deepEquals (Object o)

 {
           return deepEquals(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEquals (Object o,boolean forceSameOrder)

 {
      /* generated by template data.DeepEqualsWithOrder*/

      ASTScalar comp;
    if ((o instanceof ASTScalar)) {
      comp = (ASTScalar) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    return true;     


}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o)

 {
           return deepEqualsWithComments(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)

 {
      /* generated by template data.DeepEqualsWithComments*/

      ASTScalar comp;
    if ((o instanceof ASTScalar)) {
      comp = (ASTScalar) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)

 {
      /* generated by template data.EqualAttributes*/

      ASTScalar comp;
    if ((o instanceof ASTScalar)) {
      comp = (ASTScalar) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)

 {
      /* generated by template data.EqualsWithComments*/

      ASTScalar comp;
    if ((o instanceof ASTScalar)) {
      comp = (ASTScalar) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template core.Method*/
 public  ASTScalar deepClone ()

 {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTScalar deepClone (ASTScalar result)

 {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      result.setName(getName());
    
    return result;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  void setName (String name)

 {
      /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template core.Method*/
 public  void accept (graphqllite._visitor.GraphQLLiteTraverser visitor)

 {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof graphqllite._visitor.GraphQLLiteTraverser) {
    accept((graphqllite._visitor.GraphQLLiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x52723 AST node type ASTScalar expected a visitor of type graphqllite._visitor.GraphQLLiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof graphqllite._visitor.GraphQLLiteTraverser) {
    accept((graphqllite._visitor.GraphQLLiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x96630 AST node type ASTScalar expected a visitor of type graphqllite._visitor.GraphQLLiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof graphqllite._visitor.GraphQLLiteTraverser) {
    accept((graphqllite._visitor.GraphQLLiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x11472 AST node type ASTScalar expected a visitor of type graphqllite._visitor.GraphQLLiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof graphqllite._visitor.GraphQLLiteTraverser) {
    accept((graphqllite._visitor.GraphQLLiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x24449 AST node type ASTScalar expected a visitor of type graphqllite._visitor.GraphQLLiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTScalar _construct ()

 {
      return graphqllite.GraphQLLiteMill.scalarBuilder().uncheckedBuild();
}

    /* generated by template core.Method*/
 public  graphqllite._symboltable.GQLTypeSymbol getSymbol ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentSymbol()) {
        return this.symbol.get();
    }
    Log.error("0xA7003x62780 get for Symbol can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSymbol ()

 {
      /* generated by template methods.opt.IsPresent4Opt*/

return this.symbol.isPresent();

}

    /* generated by template core.Method*/
 public  void setSymbol (graphqllite._symboltable.GQLTypeSymbol symbol)

 {
      /* generated by template methods.opt.Set4Opt*/

this.symbol = Optional.ofNullable(symbol);

}

    /* generated by template core.Method*/
 public  void setSymbolAbsent ()

 {
      /* generated by template methods.opt.SetAbsent*/

this.symbol = Optional.empty();

}

    /* generated by template core.Method*/
 public  graphqllite._symboltable.IGraphQLLiteScope getEnclosingScope ()

 {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (graphqllite._symboltable.IGraphQLLiteScope enclosingScope)

 {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof graphqllite._symboltable.IGraphQLLiteScope){
    this.enclosingScope = (graphqllite._symboltable.IGraphQLLiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x51283 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type graphqllite._symboltable.IGraphQLLiteScope. Please call the Method setEnclosingScope with a parameter form type graphqllite._symboltable.IGraphQLLiteScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof graphqllite._symboltable.IGraphQLLiteScope){
    this.enclosingScope = (graphqllite._symboltable.IGraphQLLiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x51284 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type graphqllite._symboltable.IGraphQLLiteScope. Please call the Method setEnclosingScope with a parameter form type graphqllite._symboltable.IGraphQLLiteScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof graphqllite._symboltable.IGraphQLLiteScope){
    this.enclosingScope = (graphqllite._symboltable.IGraphQLLiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x51285 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type graphqllite._symboltable.IGraphQLLiteScope. Please call the Method setEnclosingScope with a parameter form type graphqllite._symboltable.IGraphQLLiteScope");
  }
}

}
