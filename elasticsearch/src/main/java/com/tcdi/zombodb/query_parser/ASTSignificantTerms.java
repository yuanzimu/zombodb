/* Generated By:JJTree: Do not edit this line. ASTSignificantTerms.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.tcdi.zombodb.query_parser;

public
class ASTSignificantTerms extends ASTAggregate {
  public ASTSignificantTerms(int id) {
    super(id);
  }

  public ASTSignificantTerms(QueryParser p, int id) {
    super(p, id);
  }

  public String getStem() {
    return String.valueOf(getChild(0).getValue());
  }

  public int getMaxTerms() {
    return Integer.valueOf(String.valueOf(getChild(1).getValue()));
  }

  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a14231184aeb86312eea0db4e26bf156 (do not edit this line) */
