package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
public final class ix2 extends as2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p30 f78847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u30 f78848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mx2 f78849k;

    public ix2(mx2 mx2Var, rr rrVar, u30 u30Var) {
        this.f78849k = mx2Var;
        this.f78847i = rrVar;
        this.f78848j = u30Var;
    }

    @Override // yads.as2
    public final Object b() {
        p30 p30Var = this.f78847i;
        pb2 pb2Var = this.f78849k.f80445b;
        u30 u30Var = this.f78848j;
        r33 r33Var = new r33(p30Var);
        vf1.f83897a.getAndIncrement();
        r33Var.f82097b = 0L;
        r30 r30Var = new r30(r33Var, u30Var);
        try {
            r30Var.f82087a.a(r30Var.f82088b);
            r30Var.f82090d = true;
            Uri uri = r33Var.f82096a.getUri();
            uri.getClass();
            Object objA = pb2Var.a(uri, r30Var);
            ib3.a((Closeable) r30Var);
            objA.getClass();
            return (dv0) objA;
        } catch (Throwable th2) {
            ib3.a((Closeable) r30Var);
            throw th2;
        }
    }
}
