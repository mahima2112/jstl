/*
 * Copyright (c) 1997, 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package collections;

public interface MultiSet<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Object[] toArray();

    boolean add(E e);

    boolean remove(Object o);

    void clear();

    boolean equals(Object o);

    int hashCode();
}
