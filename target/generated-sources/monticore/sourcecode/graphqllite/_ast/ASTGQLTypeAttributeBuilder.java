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


 public  class ASTGQLTypeAttributeBuilder extends de.monticore.ast.ASTNodeBuilder<ASTGQLTypeAttributeBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTGQLTypeAttributeBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String attributeName ;

    /* generated by template core.Attribute*/
 protected  graphqllite._ast.ASTAttributeType type ;


    /* generated by template core.Constructor*/
 public  ASTGQLTypeAttributeBuilder()
 {
  this.realBuilder = (ASTGQLTypeAttributeBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTGQLTypeAttribute build ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (attributeName == null) {
                Log.error("0xA4522 attributeName of type String must not be null");
            }
            if (type == null) {
                Log.error("0xA4522 type of type graphqllite._ast.ASTAttributeType must not be null");
            }
          throw new IllegalStateException();
        }
        ASTGQLTypeAttribute value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTGQLTypeAttribute();
    value.setAttributeName(this.attributeName);
    value.setType(this.type);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

    /* generated by template core.Method*/
 public  boolean isValid ()

 {
      /* generated by template _ast.builder.IsValidMethod*/

        if (attributeName == null) {
            return false;
        }
        if (type == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  String getAttributeName ()

 {
      /* generated by template methods.Get*/

return this.attributeName;

}

    /* generated by template core.Method*/
 public  graphqllite._ast.ASTAttributeType getType ()

 {
      /* generated by template methods.Get*/

return this.type;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder setAttributeName (String attributeName)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.attributeName = attributeName;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder setType (graphqllite._ast.ASTAttributeType type)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.type = type;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_SourcePositionEnd (SourcePosition end)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_SourcePositionEndAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_SourcePositionStart (SourcePosition start)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_SourcePositionStartAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder clear_PreComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder add_PreComment (Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder add_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder addAll_PreComments (Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder remove_PreComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder remove_PreComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder removeAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder retainAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_PreCommentList (List<Comment> preComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder clear_PostComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder add_PostComment (Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder add_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder remove_PostComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder remove_PostComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder removeAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder retainAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_PostCommentList (List<Comment> postComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttributeBuilder set_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTGQLTypeAttribute uncheckedBuild ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        ASTGQLTypeAttribute value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTGQLTypeAttribute();
    value.setAttributeName(this.attributeName);
    value.setType(this.type);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

}
