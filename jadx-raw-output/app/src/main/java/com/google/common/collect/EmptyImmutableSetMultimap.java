package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    public static final EmptyImmutableSetMultimap INSTANCE = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.of(), 0, null);
    }
}
