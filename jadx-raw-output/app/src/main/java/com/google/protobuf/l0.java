package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes2.dex */
public interface l0<T> {
    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t10, T t11);

    void mergeFrom(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException;

    T newInstance();

    void writeTo(T t10, Writer writer) throws IOException;
}
