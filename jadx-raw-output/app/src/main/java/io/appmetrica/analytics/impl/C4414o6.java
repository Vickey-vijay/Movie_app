package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4414o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4085ba f57378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4210g6 f57379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f57380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4059aa f57381d;

    public C4414o6(Context context) {
        this(context, new C4085ba(), new C4210g6(), C4059aa.a(context));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(C4624wh c4624wh) {
        boolean zMkdir;
        String str;
        C4666y9 c4666y9B;
        PrintWriter printWriter;
        PrintWriter printWriter2;
        C4059aa c4059aa;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f57380c);
        this.f57379b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            zMkdir = crashesDirectory.mkdir();
                        }
                    }
                    Cf cf2 = c4624wh.f57891e.f55334a;
                    str = cf2.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + cf2.f55103a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    c4666y9B = this.f57381d.b(str);
                    printWriter = null;
                    c4666y9B.f58017a.lock();
                    c4666y9B.f58018b.a();
                    this.f57378a.getClass();
                    printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter2.write(new C4318kb(c4624wh.f57887a, c4624wh.f57891e, c4624wh.f57890d).k());
                    mo.a((Closeable) printWriter2);
                    c4666y9B.c();
                    c4059aa = this.f57381d;
                    synchronized (c4059aa) {
                        c4059aa.f56346b.remove(str);
                    }
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter2.write(new C4318kb(c4624wh.f57887a, c4624wh.f57891e, c4624wh.f57890d).k());
                mo.a((Closeable) printWriter2);
                c4666y9B.c();
                c4059aa = this.f57381d;
                synchronized (c4059aa) {
                    c4059aa.f56346b.remove(str);
                    return;
                }
            } catch (Throwable unused) {
                printWriter = printWriter2;
                mo.a((Closeable) printWriter);
                c4666y9B.c();
                this.f57381d.a(str);
                return;
            }
            c4666y9B.f58017a.lock();
            c4666y9B.f58018b.a();
            this.f57378a.getClass();
            printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
        }
        if (!zMkdir) {
            return;
        }
        Cf cf3 = c4624wh.f57891e.f55334a;
        str = cf3.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + cf3.f55103a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        c4666y9B = this.f57381d.b(str);
        printWriter = null;
    }

    public C4414o6(Context context, C4085ba c4085ba, C4210g6 c4210g6, C4059aa c4059aa) {
        this.f57380c = context;
        this.f57378a = c4085ba;
        this.f57379b = c4210g6;
        this.f57381d = c4059aa;
    }
}
