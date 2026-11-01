package com.bytedance.adsdk.vt.lh.lh;

import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.ouw.ryl;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw {
    public final ryl bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final int f11140cf;
    public final com.bytedance.adsdk.vt.fkw.tlj ex;
    public final ouw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public final float f11141jg;
    public final com.bytedance.adsdk.vt.lh.vt.ouw jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final float f11142ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final long f11143le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f11144lh;
    public final float mwh;
    public final List<com.bytedance.adsdk.vt.lh.vt.lh> ouw;
    public final List<com.bytedance.adsdk.vt.lh.vt.pno> pno;
    public final List<com.bytedance.adsdk.vt.ra.ouw<Float>> qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f11145ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final float f11146rn;
    public final int ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f11147th;
    public final int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final cf f11148vm;
    public final boolean vpp;
    public final com.bytedance.adsdk.vt.ra vt;
    public final long yu;
    public final com.bytedance.adsdk.vt.lh.ouw.tlj zih;
    public final vt zin;

    public enum ouw {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum vt {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public fkw(List<com.bytedance.adsdk.vt.lh.vt.lh> list, com.bytedance.adsdk.vt.ra raVar, String str, long j10, ouw ouwVar, long j11, String str2, List<com.bytedance.adsdk.vt.lh.vt.pno> list2, ryl rylVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.vt.lh.ouw.tlj tljVar, cf cfVar, List<com.bytedance.adsdk.vt.ra.ouw<Float>> list3, vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, boolean z10, com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2, com.bytedance.adsdk.vt.fkw.tlj tljVar2) {
        this.ouw = list;
        this.vt = raVar;
        this.f11144lh = str;
        this.yu = j10;
        this.fkw = ouwVar;
        this.f11143le = j11;
        this.f11145ra = str2;
        this.pno = list2;
        this.bly = rylVar;
        this.tlj = i10;
        this.f11140cf = i11;
        this.ryl = i12;
        this.mwh = f10;
        this.f11141jg = f11;
        this.f11142ko = f12;
        this.f11146rn = f13;
        this.zih = tljVar;
        this.f11148vm = cfVar;
        this.qbp = list3;
        this.zin = vtVar;
        this.f11147th = vtVar2;
        this.vpp = z10;
        this.jqy = ouwVar2;
        this.ex = tljVar2;
    }

    public final String ouw(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f11144lh);
        sb2.append("\n");
        fkw fkwVarOuw = this.vt.ouw(this.f11143le);
        if (fkwVarOuw != null) {
            sb2.append("\t\tParents: ");
            sb2.append(fkwVarOuw.f11144lh);
            fkw fkwVarOuw2 = this.vt.ouw(fkwVarOuw.f11143le);
            while (fkwVarOuw2 != null) {
                sb2.append("->");
                sb2.append(fkwVarOuw2.f11144lh);
                fkwVarOuw2 = this.vt.ouw(fkwVarOuw2.f11143le);
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!this.pno.isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(this.pno.size());
            sb2.append("\n");
        }
        if (this.tlj != 0 && this.f11140cf != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.tlj), Integer.valueOf(this.f11140cf), Integer.valueOf(this.ryl)));
        }
        if (!this.ouw.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.bytedance.adsdk.vt.lh.vt.lh lhVar : this.ouw) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(lhVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    public final String toString() {
        return ouw("");
    }
}
