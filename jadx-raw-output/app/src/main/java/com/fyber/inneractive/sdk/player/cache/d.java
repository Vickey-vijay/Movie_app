package com.fyber.inneractive.sdk.player.cache;

import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f16151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f16153d;

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        g gVar = this.f16153d;
        if (gVar.f16167g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f16153d.f16167g);
        }
        synchronized (gVar) {
            e eVar = this.f16150a;
            if (eVar.f16157d != this) {
                throw new IllegalStateException();
            }
            if (!eVar.f16156c) {
                this.f16151b[0] = true;
            }
            File fileB = eVar.b(0);
            try {
                fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
            } catch (FileNotFoundException unused) {
                this.f16153d.f16161a.mkdirs();
                try {
                    fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused2) {
                    cVar = g.f16160q;
                }
            }
            cVar = new c(this, fileOutputStreamFileOutputStreamCtor);
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f16183a;
            try {
                cVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            Charset charset2 = l.f16183a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused4) {
                }
            }
            throw th2;
        }
    }

    public d(g gVar, e eVar) {
        this.f16153d = gVar;
        this.f16150a = eVar;
        this.f16151b = eVar.f16156c ? null : new boolean[gVar.f16167g];
    }

    public final void a() {
        if (this.f16152c) {
            g.a(this.f16153d, this, false);
            this.f16153d.c(this.f16150a.f16154a);
        } else {
            g.a(this.f16153d, this, true);
        }
    }
}
