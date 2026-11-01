package com.bytedance.sdk.openadsdk.zih;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    public static int fkw = 3;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f13596lh = 1;
    public static int ouw = -1;
    public static int vt = 0;
    public static int yu = 2;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13597le = ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private long f13598ra = 0;
    private long pno = 0;
    private final List<lh> bly = new ArrayList();
    private long tlj = 0;

    public final void ouw(long j10) {
        this.f13597le = vt;
        this.f13598ra = j10;
    }

    public final void lh(long j10) {
        int i10;
        int i11 = this.f13597le;
        if (i11 == ouw || i11 == (i10 = yu) || i11 == fkw) {
            return;
        }
        this.f13597le = i10;
        this.tlj = j10;
    }

    public final void vt(long j10) {
        int i10;
        int i11 = this.f13597le;
        if (i11 == ouw || i11 == (i10 = fkw)) {
            return;
        }
        this.f13597le = i10;
        this.pno = j10;
    }

    public final void yu(long j10) {
        int i10 = this.f13597le;
        if (i10 == ouw || i10 != yu) {
            return;
        }
        this.f13597le = f13596lh;
        this.bly.add(new lh(this.tlj, j10));
        this.tlj = 0L;
    }

    public final long ouw(long j10, long j11) {
        long j12;
        long j13 = this.pno;
        if (j13 != 0 && j10 > j13) {
            return 0L;
        }
        int i10 = 0;
        for (lh lhVar : this.bly) {
            long j14 = lhVar.vt;
            if (j14 > j10) {
                long j15 = lhVar.ouw;
                i10 = j10 < j15 ? (int) (((long) i10) + (j14 - j15)) : (int) (((long) i10) + (j14 - j10));
            }
        }
        long j16 = this.f13598ra;
        if (j16 < j10) {
            long j17 = this.tlj;
            if (j17 == 0) {
                j17 = this.pno;
                if (j17 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j17 <= j10) {
                return 0L;
            }
            return (j17 - j10) - ((long) i10);
        }
        long j18 = this.tlj;
        if (j18 == 0) {
            j18 = this.pno;
            if (j18 == 0) {
                j12 = j11 - j16;
            }
        } else if (j18 <= j16) {
            return 0L;
        }
        return (j18 - j16) - ((long) i10);
        return j12 - ((long) i10);
    }
}
