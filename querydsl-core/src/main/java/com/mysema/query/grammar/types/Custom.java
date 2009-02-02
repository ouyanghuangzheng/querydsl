/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.grammar.types;

/**
 * Custom provides base types for custom expresions with integrated serialization patterns
 * 
 * @author tiwe
 * @version $Id$
 */
public interface Custom<T> {

    Expr<?>[] getArgs();
    java.lang.String getPattern();
       
    /**
     * The Class Boolean.
     */
    public static abstract class Boolean extends Expr.EBoolean implements Custom<java.lang.Boolean>{ }
    
    /**
     * The Class Comparable.
     */
    public static abstract class Comparable<T extends java.lang.Comparable<T>> 
        extends Expr.EComparable<T> implements Custom<T>{
        public Comparable(Class<T> type) {
            super(type);
        }
    }    
   
    /**
     * The Class String.
     */
    public static abstract class String extends Expr.EString implements Custom<java.lang.String>{ }
    
}
