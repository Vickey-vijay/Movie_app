package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: FileDownloadRandomAccessDownloadFile.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedOutputStream f33408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileDescriptor f33409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f33410c;

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.f33408a.close();
        this.f33410c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.f33408a.flush();
        this.f33409b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j10) throws IOException {
        this.f33410c.seek(j10);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f33408a.write(bArr, i10, i11);
    }

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f33410c = randomAccessFile;
        this.f33409b = randomAccessFile.getFD();
        this.f33408a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }
}
