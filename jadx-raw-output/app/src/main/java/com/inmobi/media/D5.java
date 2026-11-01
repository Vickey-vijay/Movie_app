package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f22502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f22503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H5 f22505d;

    public D5(H5 h10, E5 e10) {
        this.f22505d = h10;
        this.f22502a = e10;
        this.f22503b = e10.f22567c ? null : new boolean[h10.f22779h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        C5 c10;
        synchronized (this.f22505d) {
            E5 e10 = this.f22502a;
            if (e10.f22568d != this) {
                throw new IllegalStateException();
            }
            if (!e10.f22567c) {
                this.f22503b[i10] = true;
            }
            File fileB = e10.b(i10);
            try {
                fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
            } catch (FileNotFoundException unused) {
                this.f22505d.f22773b.mkdirs();
                try {
                    fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused2) {
                    return H5.f22771q;
                }
            }
            c10 = new C5(this, fileOutputStreamFileOutputStreamCtor);
        }
        return c10;
    }
}
