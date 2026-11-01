package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    private static final h0 INSTANCE = new h0();
    private final ConcurrentMap<Class<?>, l0<?>> schemaCache = new ConcurrentHashMap();
    private final m0 schemaFactory = new t();

    public <T> void mergeFrom(T t10, k0 k0Var) throws IOException {
        mergeFrom(t10, k0Var, ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> l0<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        l0<T> l0Var = (l0) this.schemaCache.get(cls);
        if (l0Var != null) {
            return l0Var;
        }
        l0<T> l0VarCreateSchema = this.schemaFactory.createSchema(cls);
        l0<T> l0Var2 = (l0<T>) registerSchema(cls, l0VarCreateSchema);
        return l0Var2 != null ? l0Var2 : l0VarCreateSchema;
    }

    public static h0 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (l0<?> l0Var : this.schemaCache.values()) {
            if (l0Var instanceof a0) {
                schemaSize += ((a0) l0Var).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor(t10).mergeFrom(t10, k0Var, extensionRegistryLite);
    }

    public l0<?> registerSchema(Class<?> cls, l0<?> l0Var) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(l0Var, "schema");
        return this.schemaCache.putIfAbsent(cls, l0Var);
    }

    public l0<?> registerSchemaOverride(Class<?> cls, l0<?> l0Var) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(l0Var, "schema");
        return this.schemaCache.put(cls, l0Var);
    }

    private h0() {
    }

    public <T> boolean isInitialized(T t10) {
        return schemaFor(t10).isInitialized(t10);
    }

    public <T> void makeImmutable(T t10) {
        schemaFor(t10).makeImmutable(t10);
    }

    public <T> void writeTo(T t10, Writer writer) throws IOException {
        schemaFor(t10).writeTo(t10, writer);
    }

    public <T> l0<T> schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
