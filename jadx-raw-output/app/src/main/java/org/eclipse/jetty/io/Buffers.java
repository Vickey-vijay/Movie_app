package org.eclipse.jetty.io;

/* JADX INFO: loaded from: classes4.dex */
public interface Buffers {

    public enum Type {
        BYTE_ARRAY,
        DIRECT,
        INDIRECT
    }

    void a(mm.d dVar);

    mm.d b();

    mm.d c(int i10);

    mm.d getBuffer();
}
