/* generated from model GraphQLLite */
/* generated by template core.Interface*/

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


 public  interface IGraphQLLiteGlobalScope extends de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsGlobalScope,graphqllite._symboltable.IGraphQLLiteScope  { 


  default /* generated by template core.Method*/
 public  Set<String> calculateModelNamesForSchema (String name)

 {
      /* generated by template _symboltable.iglobalscope.CalculateModelNamesFor*/
  if (name.contains(".")) {
    return com.google.common.collect.Sets.newHashSet(de.se_rwth.commons.Names.getQualifier(name), name);
  }
  return com.google.common.collect.Sets.newHashSet(name);
}

  default /* generated by template core.Method*/
 public  Set<String> calculateModelNamesForType (String name)

 {
      /* generated by template _symboltable.iglobalscope.CalculateModelNamesFor*/
  if (name.contains(".")) {
    return com.google.common.collect.Sets.newHashSet(de.se_rwth.commons.Names.getQualifier(name), name);
  }
  return com.google.common.collect.Sets.newHashSet(name);
}

  default /* generated by template core.Method*/
 public  Set<String> calculateModelNamesForGQLType (String name)

 {
      /* generated by template _symboltable.iglobalscope.CalculateModelNamesFor*/
  if (name.contains(".")) {
    return com.google.common.collect.Sets.newHashSet(de.se_rwth.commons.Names.getQualifier(name), name);
  }
  return com.google.common.collect.Sets.newHashSet(name);
}

  default /* generated by template core.Method*/
 public  boolean containsAdaptedSchemaSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().contains(element);

}

  default /* generated by template core.Method*/
 public  boolean containsAllAdaptedSchemaSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().containsAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean isEmptyAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().isEmpty();

}

  default /* generated by template core.Method*/
 public  Iterator<graphqllite._symboltable.ISchemaSymbolResolver> iteratorAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().iterator();

}

  default /* generated by template core.Method*/
 public  int sizeAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().size();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ISchemaSymbolResolver[] toArrayAdaptedSchemaSymbolResolver (graphqllite._symboltable.ISchemaSymbolResolver[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().toArray(array);

}

  default /* generated by template core.Method*/
 public  Object[] toArrayAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().toArray();

}

  default /* generated by template core.Method*/
 public  Spliterator<graphqllite._symboltable.ISchemaSymbolResolver> spliteratorAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().spliterator();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.ISchemaSymbolResolver> streamAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().stream();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.ISchemaSymbolResolver> parallelStreamAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().parallelStream();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ISchemaSymbolResolver getAdaptedSchemaSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().get(index);

}

  default /* generated by template core.Method*/
 public  int indexOfAdaptedSchemaSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().indexOf(element);

}

  default /* generated by template core.Method*/
 public  int lastIndexOfAdaptedSchemaSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().lastIndexOf(element);

}

  default /* generated by template core.Method*/
 public  boolean equalsAdaptedSchemaSymbolResolver (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().equals(o);

}

  default /* generated by template core.Method*/
 public  int hashCodeAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().hashCode();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.ISchemaSymbolResolver> listIteratorAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().listIterator();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.ISchemaSymbolResolver> listIteratorAdaptedSchemaSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().listIterator(index);

}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.ISchemaSymbolResolver> subListAdaptedSchemaSymbolResolver (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().subList(start, end);

}

  /* generated by template core.Method*/
 abstract  public  List<graphqllite._symboltable.ISchemaSymbolResolver> getAdaptedSchemaSymbolResolverList ()

;
  default /* generated by template core.Method*/
 public  void clearAdaptedSchemaSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedSchemaSymbolResolverList().clear();

}

  default /* generated by template core.Method*/
 public  boolean addAdaptedSchemaSymbolResolver (graphqllite._symboltable.ISchemaSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().add(element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedSchemaSymbolResolver (Collection<? extends graphqllite._symboltable.ISchemaSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().addAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeAdaptedSchemaSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().remove(element);

}

  default /* generated by template core.Method*/
 public  boolean removeAllAdaptedSchemaSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().removeAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean retainAllAdaptedSchemaSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().retainAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeIfAdaptedSchemaSymbolResolver (Predicate<? super graphqllite._symboltable.ISchemaSymbolResolver> filter)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().removeIf(filter);

}

  default /* generated by template core.Method*/
 public  void forEachAdaptedSchemaSymbolResolver (Consumer<? super graphqllite._symboltable.ISchemaSymbolResolver> action)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedSchemaSymbolResolverList().forEach(action);

}

  default /* generated by template core.Method*/
 public  void addAdaptedSchemaSymbolResolver (int index,graphqllite._symboltable.ISchemaSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedSchemaSymbolResolverList().add(index, element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedSchemaSymbolResolver (int index,Collection<? extends graphqllite._symboltable.ISchemaSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().addAll(index, collection);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ISchemaSymbolResolver removeAdaptedSchemaSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().remove(index);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ISchemaSymbolResolver setAdaptedSchemaSymbolResolver (int index,graphqllite._symboltable.ISchemaSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedSchemaSymbolResolverList().set(index, element);

}

  default /* generated by template core.Method*/
 public  void replaceAllAdaptedSchemaSymbolResolver (UnaryOperator<graphqllite._symboltable.ISchemaSymbolResolver> operator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedSchemaSymbolResolverList().replaceAll(operator);

}

  default /* generated by template core.Method*/
 public  void sortAdaptedSchemaSymbolResolver (Comparator<? super graphqllite._symboltable.ISchemaSymbolResolver> comparator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedSchemaSymbolResolverList().sort(comparator);

}

  /* generated by template core.Method*/
 abstract  public  void setAdaptedSchemaSymbolResolverList (List<graphqllite._symboltable.ISchemaSymbolResolver> adaptedSchemaSymbolResolver)

;
  default /* generated by template core.Method*/
 public  boolean containsAdaptedTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().contains(element);

}

  default /* generated by template core.Method*/
 public  boolean containsAllAdaptedTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().containsAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean isEmptyAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().isEmpty();

}

  default /* generated by template core.Method*/
 public  Iterator<graphqllite._symboltable.ITypeSymbolResolver> iteratorAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().iterator();

}

  default /* generated by template core.Method*/
 public  int sizeAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().size();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ITypeSymbolResolver[] toArrayAdaptedTypeSymbolResolver (graphqllite._symboltable.ITypeSymbolResolver[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().toArray(array);

}

  default /* generated by template core.Method*/
 public  Object[] toArrayAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().toArray();

}

  default /* generated by template core.Method*/
 public  Spliterator<graphqllite._symboltable.ITypeSymbolResolver> spliteratorAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().spliterator();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.ITypeSymbolResolver> streamAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().stream();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.ITypeSymbolResolver> parallelStreamAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().parallelStream();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ITypeSymbolResolver getAdaptedTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().get(index);

}

  default /* generated by template core.Method*/
 public  int indexOfAdaptedTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().indexOf(element);

}

  default /* generated by template core.Method*/
 public  int lastIndexOfAdaptedTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().lastIndexOf(element);

}

  default /* generated by template core.Method*/
 public  boolean equalsAdaptedTypeSymbolResolver (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().equals(o);

}

  default /* generated by template core.Method*/
 public  int hashCodeAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().hashCode();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.ITypeSymbolResolver> listIteratorAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().listIterator();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.ITypeSymbolResolver> listIteratorAdaptedTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().listIterator(index);

}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.ITypeSymbolResolver> subListAdaptedTypeSymbolResolver (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().subList(start, end);

}

  /* generated by template core.Method*/
 abstract  public  List<graphqllite._symboltable.ITypeSymbolResolver> getAdaptedTypeSymbolResolverList ()

;
  default /* generated by template core.Method*/
 public  void clearAdaptedTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedTypeSymbolResolverList().clear();

}

  default /* generated by template core.Method*/
 public  boolean addAdaptedTypeSymbolResolver (graphqllite._symboltable.ITypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().add(element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedTypeSymbolResolver (Collection<? extends graphqllite._symboltable.ITypeSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().addAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeAdaptedTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().remove(element);

}

  default /* generated by template core.Method*/
 public  boolean removeAllAdaptedTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().removeAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean retainAllAdaptedTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().retainAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeIfAdaptedTypeSymbolResolver (Predicate<? super graphqllite._symboltable.ITypeSymbolResolver> filter)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().removeIf(filter);

}

  default /* generated by template core.Method*/
 public  void forEachAdaptedTypeSymbolResolver (Consumer<? super graphqllite._symboltable.ITypeSymbolResolver> action)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedTypeSymbolResolverList().forEach(action);

}

  default /* generated by template core.Method*/
 public  void addAdaptedTypeSymbolResolver (int index,graphqllite._symboltable.ITypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedTypeSymbolResolverList().add(index, element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedTypeSymbolResolver (int index,Collection<? extends graphqllite._symboltable.ITypeSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().addAll(index, collection);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ITypeSymbolResolver removeAdaptedTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().remove(index);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.ITypeSymbolResolver setAdaptedTypeSymbolResolver (int index,graphqllite._symboltable.ITypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedTypeSymbolResolverList().set(index, element);

}

  default /* generated by template core.Method*/
 public  void replaceAllAdaptedTypeSymbolResolver (UnaryOperator<graphqllite._symboltable.ITypeSymbolResolver> operator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedTypeSymbolResolverList().replaceAll(operator);

}

  default /* generated by template core.Method*/
 public  void sortAdaptedTypeSymbolResolver (Comparator<? super graphqllite._symboltable.ITypeSymbolResolver> comparator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedTypeSymbolResolverList().sort(comparator);

}

  /* generated by template core.Method*/
 abstract  public  void setAdaptedTypeSymbolResolverList (List<graphqllite._symboltable.ITypeSymbolResolver> adaptedTypeSymbolResolver)

;
  default /* generated by template core.Method*/
 public  boolean containsAdaptedGQLTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().contains(element);

}

  default /* generated by template core.Method*/
 public  boolean containsAllAdaptedGQLTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().containsAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean isEmptyAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().isEmpty();

}

  default /* generated by template core.Method*/
 public  Iterator<graphqllite._symboltable.IGQLTypeSymbolResolver> iteratorAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().iterator();

}

  default /* generated by template core.Method*/
 public  int sizeAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().size();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.IGQLTypeSymbolResolver[] toArrayAdaptedGQLTypeSymbolResolver (graphqllite._symboltable.IGQLTypeSymbolResolver[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().toArray(array);

}

  default /* generated by template core.Method*/
 public  Object[] toArrayAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().toArray();

}

  default /* generated by template core.Method*/
 public  Spliterator<graphqllite._symboltable.IGQLTypeSymbolResolver> spliteratorAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().spliterator();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.IGQLTypeSymbolResolver> streamAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().stream();

}

  default /* generated by template core.Method*/
 public  Stream<graphqllite._symboltable.IGQLTypeSymbolResolver> parallelStreamAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().parallelStream();

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.IGQLTypeSymbolResolver getAdaptedGQLTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().get(index);

}

  default /* generated by template core.Method*/
 public  int indexOfAdaptedGQLTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().indexOf(element);

}

  default /* generated by template core.Method*/
 public  int lastIndexOfAdaptedGQLTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().lastIndexOf(element);

}

  default /* generated by template core.Method*/
 public  boolean equalsAdaptedGQLTypeSymbolResolver (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().equals(o);

}

  default /* generated by template core.Method*/
 public  int hashCodeAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().hashCode();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.IGQLTypeSymbolResolver> listIteratorAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().listIterator();

}

  default /* generated by template core.Method*/
 public  ListIterator<graphqllite._symboltable.IGQLTypeSymbolResolver> listIteratorAdaptedGQLTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().listIterator(index);

}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.IGQLTypeSymbolResolver> subListAdaptedGQLTypeSymbolResolver (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().subList(start, end);

}

  /* generated by template core.Method*/
 abstract  public  List<graphqllite._symboltable.IGQLTypeSymbolResolver> getAdaptedGQLTypeSymbolResolverList ()

;
  default /* generated by template core.Method*/
 public  void clearAdaptedGQLTypeSymbolResolver ()

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedGQLTypeSymbolResolverList().clear();

}

  default /* generated by template core.Method*/
 public  boolean addAdaptedGQLTypeSymbolResolver (graphqllite._symboltable.IGQLTypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().add(element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedGQLTypeSymbolResolver (Collection<? extends graphqllite._symboltable.IGQLTypeSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().addAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeAdaptedGQLTypeSymbolResolver (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().remove(element);

}

  default /* generated by template core.Method*/
 public  boolean removeAllAdaptedGQLTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().removeAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean retainAllAdaptedGQLTypeSymbolResolver (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().retainAll(collection);

}

  default /* generated by template core.Method*/
 public  boolean removeIfAdaptedGQLTypeSymbolResolver (Predicate<? super graphqllite._symboltable.IGQLTypeSymbolResolver> filter)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().removeIf(filter);

}

  default /* generated by template core.Method*/
 public  void forEachAdaptedGQLTypeSymbolResolver (Consumer<? super graphqllite._symboltable.IGQLTypeSymbolResolver> action)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedGQLTypeSymbolResolverList().forEach(action);

}

  default /* generated by template core.Method*/
 public  void addAdaptedGQLTypeSymbolResolver (int index,graphqllite._symboltable.IGQLTypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedGQLTypeSymbolResolverList().add(index, element);

}

  default /* generated by template core.Method*/
 public  boolean addAllAdaptedGQLTypeSymbolResolver (int index,Collection<? extends graphqllite._symboltable.IGQLTypeSymbolResolver> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().addAll(index, collection);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.IGQLTypeSymbolResolver removeAdaptedGQLTypeSymbolResolver (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().remove(index);

}

  default /* generated by template core.Method*/
 public  graphqllite._symboltable.IGQLTypeSymbolResolver setAdaptedGQLTypeSymbolResolver (int index,graphqllite._symboltable.IGQLTypeSymbolResolver element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedGQLTypeSymbolResolverList().set(index, element);

}

  default /* generated by template core.Method*/
 public  void replaceAllAdaptedGQLTypeSymbolResolver (UnaryOperator<graphqllite._symboltable.IGQLTypeSymbolResolver> operator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedGQLTypeSymbolResolverList().replaceAll(operator);

}

  default /* generated by template core.Method*/
 public  void sortAdaptedGQLTypeSymbolResolver (Comparator<? super graphqllite._symboltable.IGQLTypeSymbolResolver> comparator)

 {
      /* generated by template methods.MethodDelegate*/

this.getAdaptedGQLTypeSymbolResolverList().sort(comparator);

}

  /* generated by template core.Method*/
 abstract  public  void setAdaptedGQLTypeSymbolResolverList (List<graphqllite._symboltable.IGQLTypeSymbolResolver> adaptedGQLTypeSymbolResolver)

;
  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.SchemaSymbol> resolveAdaptedSchema (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.SchemaSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<graphqllite._symboltable.SchemaSymbol> adaptedSymbols = new ArrayList<graphqllite._symboltable.SchemaSymbol>();
    for (graphqllite._symboltable.ISchemaSymbolResolver symDel : getAdaptedSchemaSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedSchemaSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.TypeSymbol> resolveAdaptedType (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.TypeSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<graphqllite._symboltable.TypeSymbol> adaptedSymbols = new ArrayList<graphqllite._symboltable.TypeSymbol>();
    for (graphqllite._symboltable.ITypeSymbolResolver symDel : getAdaptedTypeSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedTypeSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.GQLTypeSymbol> resolveAdaptedGQLType (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.GQLTypeSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveAdapted*/

    List<graphqllite._symboltable.GQLTypeSymbol> adaptedSymbols = new ArrayList<graphqllite._symboltable.GQLTypeSymbol>();
    for (graphqllite._symboltable.IGQLTypeSymbolResolver symDel : getAdaptedGQLTypeSymbolResolverList()) {
        adaptedSymbols.addAll(symDel.resolveAdaptedGQLTypeSymbol(foundSymbols, name, modifier, predicate));
    }
    return adaptedSymbols;
}

  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.SchemaSymbol> resolveSchemaMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.SchemaSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<graphqllite._symboltable.SchemaSymbol> resolvedSymbol = resolveSchemaDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadSchema(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveSchemaDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isSchemaSymbolsAlreadyResolved()){
    setSchemaSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedSchema(foundSymbols, name, modifier, predicate));
  }
  setSchemaSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template core.Method*/
 abstract  public  void loadSchema (String name)

;
  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.TypeSymbol> resolveTypeMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.TypeSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<graphqllite._symboltable.TypeSymbol> resolvedSymbol = resolveTypeDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadType(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveTypeDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isTypeSymbolsAlreadyResolved()){
    setTypeSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedType(foundSymbols, name, modifier, predicate));
  }
  setTypeSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template core.Method*/
 abstract  public  void loadType (String name)

;
  default /* generated by template core.Method*/
 public  List<graphqllite._symboltable.GQLTypeSymbol> resolveGQLTypeMany (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<graphqllite._symboltable.GQLTypeSymbol> predicate)

 {
      /* generated by template _symboltable.iglobalscope.ResolveMany4GlobalScope*/

  // First, try to resolve the symbol in the current scope and its sub scopes.
  List<graphqllite._symboltable.GQLTypeSymbol> resolvedSymbol = resolveGQLTypeDownMany(foundSymbols, name,  modifier, predicate);

  if (!resolvedSymbol.isEmpty()) {
    return resolvedSymbol;
  }

  // Symbol not found: try to load corresponding model and build its symbol table
  loadGQLType(name);

  // Maybe the symbol now exists in this scope (or its sub scopes). So, resolve down, again.
  resolvedSymbol = resolveGQLTypeDownMany(false, name, modifier, predicate);
  foundSymbols = foundSymbols  || resolvedSymbol.size() > 0;
  if (!foundSymbols && !isGQLTypeSymbolsAlreadyResolved()){
    setGQLTypeSymbolsAlreadyResolved(true);
    resolvedSymbol.addAll(resolveAdaptedGQLType(foundSymbols, name, modifier, predicate));
  }
  setGQLTypeSymbolsAlreadyResolved(false);
  return resolvedSymbol;
}

  /* generated by template core.Method*/
 abstract  public  void loadGQLType (String name)

;
  /* generated by template core.Method*/
 abstract  public  void loadFileForModelName (String modelName)

;
  default /* generated by template core.Method*/
 public  graphqllite._symboltable.IGraphQLLiteScope getEnclosingScope ()

 {
      Log.error("0xA6100x60876 GlobalScope GraphQLLiteGlobalScope has no EnclosingScope, so you cannot call methodgetEnclosingScope.");
    return null;
}

  default /* generated by template core.Method*/
 public  void setEnclosingScope (graphqllite._symboltable.IGraphQLLiteScope enclosingScope)

 {
      Log.error("0xA6100x60877 GlobalScope GraphQLLiteGlobalScope has no EnclosingScope, so you cannot call methodsetEnclosingScope.");
}

  default /* generated by template core.Method*/
 public  String getName ()

 {
      Log.error("0xA6101x90744 Global scopes do not have names.");
    return null;
}

  default /* generated by template core.Method*/
 public  boolean isPresentName ()

 {
      return false;
}

  default /* generated by template core.Method*/
 public  boolean checkIfContinueAsSubScope (String symbolName)

 {
      return false;
}

  /* generated by template core.Method*/
 abstract  public  Map<String,de.monticore.symboltable.serialization.ISymbolDeSer> getSymbolDeSers ()

;
  default /* generated by template core.Method*/
 public  void putSymbolDeSer (String key,de.monticore.symboltable.serialization.ISymbolDeSer value)

 {
      getSymbolDeSers().put(key, value);
}

  default /* generated by template core.Method*/
 public  de.monticore.symboltable.serialization.ISymbolDeSer getSymbolDeSer (String key)

 {
      return getSymbolDeSers().get(key);
}

  default /* generated by template core.Method*/
 public  void putSchemaSymbolDeSer (String kind)

 {
      putSymbolDeSer(kind, new graphqllite._symboltable.SchemaSymbolDeSer());
}

  default /* generated by template core.Method*/
 public  void putTypeSymbolDeSer (String kind)

 {
      putSymbolDeSer(kind, new graphqllite._symboltable.TypeSymbolDeSer());
}

  default /* generated by template core.Method*/
 public  void putGQLTypeSymbolDeSer (String kind)

 {
      putSymbolDeSer(kind, new graphqllite._symboltable.GQLTypeSymbolDeSer());
}

  default /* generated by template core.Method*/
 public  de.monticore.symboltable.serialization.ISymbolDeSer getSchemaSymbolDeSer ()

 {
      return getSymbolDeSer("graphqllite._symboltable.GraphQLLiteScope");
}

  default /* generated by template core.Method*/
 public  de.monticore.symboltable.serialization.ISymbolDeSer getTypeSymbolDeSer ()

 {
      return getSymbolDeSer("graphqllite._symboltable.GraphQLLiteScope");
}

  default /* generated by template core.Method*/
 public  de.monticore.symboltable.serialization.ISymbolDeSer getGQLTypeSymbolDeSer ()

 {
      return getSymbolDeSer("graphqllite._symboltable.GraphQLLiteScope");
}

  /* generated by template core.Method*/
 abstract  public  IGraphQLLiteGlobalScope getRealThis ()

;
}