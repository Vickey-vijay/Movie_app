package yads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0 f76409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mq0 f76410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld0 f76411c;

    public final void a(p30 p30Var, Uri uri, Map map, long j10, long j11, pq0 pq0Var) throws ka3 {
        ld0 ld0Var = new ld0(p30Var, j10, j11);
        this.f76411c = ld0Var;
        if (this.f76410b != null) {
            return;
        }
        mq0[] mq0VarArrCreateExtractors = this.f76409a.createExtractors(uri, map);
        if (mq0VarArrCreateExtractors.length == 1) {
            this.f76410b = mq0VarArrCreateExtractors[0];
        } else {
            for (mq0 mq0Var : mq0VarArrCreateExtractors) {
                try {
                    if (mq0Var.a(ld0Var)) {
                        this.f76410b = mq0Var;
                        ld0Var.f79759f = 0;
                        break;
                    } else if (this.f76410b == null && ld0Var.f79757d != j10) {
                        throw new IllegalStateException();
                    }
                } catch (EOFException unused) {
                    if (this.f76410b != null) {
                        continue;
                    } else if (ld0Var.f79757d != j10) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    if (this.f76410b == null && ld0Var.f79757d != j10) {
                        throw new IllegalStateException();
                    }
                    ld0Var.f79759f = 0;
                    throw th2;
                }
                ld0Var.f79759f = 0;
            }
            if (this.f76410b == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i10 = ib3.f78556a;
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < mq0VarArrCreateExtractors.length; i11++) {
                    sb3.append(mq0VarArrCreateExtractors[i11].getClass().getSimpleName());
                    if (i11 < mq0VarArrCreateExtractors.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String string = sb2.toString();
                uri.getClass();
                throw new ka3(string);
            }
        }
        this.f76410b.a(pq0Var);
    }

    public cr(rq0 rq0Var) {
        this.f76409a = rq0Var;
    }
}
