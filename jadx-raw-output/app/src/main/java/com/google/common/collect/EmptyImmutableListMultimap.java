package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    public static final EmptyImmutableListMultimap INSTANCE = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.of(), 0);
    }
}
