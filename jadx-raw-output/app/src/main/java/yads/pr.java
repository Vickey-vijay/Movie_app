package yads;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class pr implements n30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f81543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81544b = 5242880;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81545c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f81546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f81547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f81548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f81549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f81550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f81551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iq2 f81552j;

    public final void a() {
        OutputStream outputStream = this.f81549g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            ib3.a((Closeable) this.f81549g);
            this.f81549g = null;
            File file = this.f81548f;
            this.f81548f = null;
            nr nrVar = this.f81543a;
            long j10 = this.f81550h;
            vy2 vy2Var = (vy2) nrVar;
            synchronized (vy2Var) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    yy2 yy2VarA = yy2.a(file, j10, -9223372036854775807L, vy2Var.f84049c);
                    yy2VarA.getClass();
                    ls lsVar = vy2Var.f84049c;
                    hs hsVar = (hs) lsVar.f79894a.get(yy2VarA.f85570b);
                    hsVar.getClass();
                    if (!hsVar.c(yy2VarA.f85571c, yy2VarA.f85572d)) {
                        throw new IllegalStateException();
                    }
                    long jA = qz.a(hsVar.f78343e);
                    if (jA != -1 && yy2VarA.f85571c + yy2VarA.f85572d > jA) {
                        throw new IllegalStateException();
                    }
                    if (vy2Var.f84050d == null) {
                        vy2Var.a(yy2VarA);
                        vy2Var.f84049c.a();
                        vy2Var.notifyAll();
                        return;
                    }
                    try {
                        vy2Var.f84050d.a(file.getName(), yy2VarA.f85572d, yy2VarA.f85575g);
                        vy2Var.a(yy2VarA);
                        try {
                            vy2Var.f84049c.a();
                            vy2Var.notifyAll();
                            return;
                        } catch (Throwable th2) {
                            throw new kr(th2);
                        }
                    } catch (IOException e10) {
                        throw new kr(e10);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            ib3.a((Closeable) this.f81549g);
            this.f81549g = null;
            File file2 = this.f81548f;
            this.f81548f = null;
            file2.delete();
            throw th3;
        }
    }

    public pr(nr nrVar) {
        this.f81543a = (nr) ni.a(nrVar);
    }

    public final void a(u30 u30Var) {
        File file;
        long j10 = u30Var.f83347g;
        long jMin = j10 == -1 ? -1L : Math.min(j10 - this.f81551i, this.f81547e);
        nr nrVar = this.f81543a;
        String str = u30Var.f83348h;
        int i10 = ib3.f78556a;
        long j11 = u30Var.f83346f + this.f81551i;
        vy2 vy2Var = (vy2) nrVar;
        synchronized (vy2Var) {
            vy2Var.a();
            hs hsVar = (hs) vy2Var.f84049c.f79894a.get(str);
            hsVar.getClass();
            if (hsVar.c(j11, jMin)) {
                if (!vy2Var.f84047a.exists()) {
                    vy2.a(vy2Var.f84047a);
                    vy2Var.c();
                }
                bf1 bf1Var = (bf1) vy2Var.f84048b;
                if (jMin != -1) {
                    bf1Var.a(vy2Var, jMin);
                } else {
                    bf1Var.getClass();
                }
                File file2 = new File(vy2Var.f84047a, Integer.toString(vy2Var.f84052f.nextInt(10)));
                if (!file2.exists()) {
                    vy2.a(file2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i11 = hsVar.f78339a;
                Pattern pattern = yy2.f85150h;
                file = new File(file2, i11 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
            } else {
                throw new IllegalStateException();
            }
        }
        this.f81548f = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f81548f);
        if (this.f81545c > 0) {
            iq2 iq2Var = this.f81552j;
            if (iq2Var == null) {
                this.f81552j = new iq2(fileOutputStream, this.f81545c);
            } else {
                iq2Var.a(fileOutputStream);
            }
            this.f81549g = this.f81552j;
        } else {
            this.f81549g = fileOutputStream;
        }
        this.f81550h = 0L;
    }
}
