package org.eclipse.jetty.io;

/* JADX INFO: compiled from: BuffersFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static Buffers a(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3, int i12) {
        return i12 >= 0 ? new c(type, i10, type2, i11, type3, i12) : new d(type, i10, type2, i11, type3);
    }
}
