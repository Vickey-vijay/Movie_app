package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: RandomOutputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends OutputStream {
    public abstract void write(long j10, int i10) throws IOException;

    public abstract void write(long j10, byte[] bArr) throws IOException;

    public abstract void write(long j10, byte[] bArr, int i10, int i11) throws IOException;
}
