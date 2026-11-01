package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np f83130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp f83131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pp f83132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83133d;

    public tp(qp qpVar, sp spVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f83131b = spVar;
        this.f83133d = i10;
        this.f83130a = new np(qpVar, j10, j11, j12, j13, j14);
    }

    public final int a(ld0 ld0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        while (true) {
            pp ppVar = this.f83132c;
            if (ppVar == null) {
                throw new IllegalStateException();
            }
            long j10 = ppVar.f81521f;
            long j11 = ppVar.f81522g;
            long j12 = ppVar.f81523h;
            if (j11 - j10 <= this.f83133d) {
                this.f83132c = null;
                this.f83131b.a();
                if (j10 == ld0Var.f79757d) {
                    return 0;
                }
                gg2Var.f77799a = j10;
                return 1;
            }
            long j13 = ld0Var.f79757d;
            long j14 = j12 - j13;
            if (j14 < 0 || j14 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                if (j12 == j13) {
                    return 0;
                }
                gg2Var.f77799a = j12;
                return 1;
            }
            ld0Var.a((int) j14);
            ld0Var.f79759f = 0;
            rp rpVarA = this.f83131b.a(ld0Var, ppVar.f81517b);
            int i10 = rpVarA.f82371a;
            if (i10 == -3) {
                this.f83132c = null;
                this.f83131b.a();
                if (j12 == ld0Var.f79757d) {
                    return 0;
                }
                gg2Var.f77799a = j12;
                return 1;
            }
            if (i10 == -2) {
                long j15 = rpVarA.f82372b;
                long j16 = rpVarA.f82373c;
                ppVar.f81519d = j15;
                ppVar.f81521f = j16;
                ppVar.f81523h = pp.a(ppVar.f81517b, j15, ppVar.f81520e, j16, ppVar.f81522g, ppVar.f81518c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j17 = rpVarA.f82373c - ld0Var.f79757d;
                    if (j17 >= 0 && j17 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        ld0Var.a((int) j17);
                    }
                    this.f83132c = null;
                    this.f83131b.a();
                    long j18 = rpVarA.f82373c;
                    if (j18 == ld0Var.f79757d) {
                        return 0;
                    }
                    gg2Var.f77799a = j18;
                    return 1;
                }
                long j19 = rpVarA.f82372b;
                long j20 = rpVarA.f82373c;
                ppVar.f81520e = j19;
                ppVar.f81522g = j20;
                ppVar.f81523h = pp.a(ppVar.f81517b, ppVar.f81519d, j19, ppVar.f81521f, j20, ppVar.f81518c);
            }
        }
    }

    public final void a(long j10) {
        pp ppVar = this.f83132c;
        if (ppVar == null || ppVar.f81516a != j10) {
            long jA = this.f83130a.f80722a.a(j10);
            np npVar = this.f83130a;
            this.f83132c = new pp(j10, jA, npVar.f80724c, npVar.f80725d, npVar.f80726e, npVar.f80727f, npVar.f80728g);
        }
    }
}
