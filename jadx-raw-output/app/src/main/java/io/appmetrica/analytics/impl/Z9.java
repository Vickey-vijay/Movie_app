package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes7.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f56277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f56278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f56279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f56280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56281e;

    public Z9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f56277a, "rw");
        this.f56279c = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f56280d = channel;
        if (this.f56281e == 0) {
            this.f56278b = channel.lock();
        }
        this.f56281e++;
    }

    public final synchronized void b() {
        this.f56277a.getAbsolutePath();
        int i10 = this.f56281e - 1;
        this.f56281e = i10;
        if (i10 == 0) {
            Ka.a(this.f56278b);
        }
        mo.a((Closeable) this.f56279c);
        mo.a((Closeable) this.f56280d);
        this.f56279c = null;
        this.f56278b = null;
        this.f56280d = null;
    }

    public Z9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Z9(File file) {
        this.f56281e = 0;
        this.f56277a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
