package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pz2 extends s63 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f81661h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fm1 f81665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yl1 f81666g;

    public pz2(long j10, long j11, boolean z10, fm1 fm1Var, yl1 yl1Var) {
        this.f81662c = j10;
        this.f81663d = j11;
        this.f81664e = z10;
        this.f81665f = (fm1) ni.a(fm1Var);
        this.f81666g = yl1Var;
    }

    @Override // yads.s63
    public final int a() {
        return 1;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        ni.a(i10, 1);
        Object obj = z10 ? f81661h : null;
        long j10 = this.f81662c;
        p63Var.getClass();
        return p63Var.a(null, obj, 0, j10, 0L, e6.f76925h, false);
    }

    @Override // yads.s63
    public final int b() {
        return 1;
    }

    static {
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f82697f;
        cm1 cm1Var = cm1.f76322d;
        Uri uri = Uri.EMPTY;
        if (vl1Var.f83946b != null && vl1Var.f83945a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            new am1(uri, null, vl1Var.f83945a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        }
        jm1 jm1Var = jm1.H;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        ni.a(i10, 1);
        return f81661h;
    }

    public pz2(long j10, long j11, boolean z10, boolean z11, fm1 fm1Var) {
        this(j10, j11, z10, fm1Var, z11 ? fm1Var.f77445d : null);
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        ni.a(i10, 1);
        return r63Var.a(r63.f82114s, this.f81665f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f81664e, false, this.f81666g, 0L, this.f81663d, 0, 0, 0L);
    }

    @Override // yads.s63
    public final int a(Object obj) {
        return f81661h.equals(obj) ? 0 : -1;
    }
}
