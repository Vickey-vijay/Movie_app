package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vm implements mwh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.mwh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f11280le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final boolean f11281lh;
    private final Path ouw = new Path();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final vt f11282ra = new vt();
    private final String vt;
    private final com.bytedance.adsdk.vt.bly yu;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVar = list.get(i10);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY) {
                    this.f11282ra.ouw(zinVar);
                    zinVar.ouw(this);
                } else if (!(lhVar instanceof th)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((th) lhVar);
                }
            } else if (!(lhVar instanceof th)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((th) lhVar);
            }
        }
        this.fkw.fkw = arrayList;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        if (this.f11280le) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.f11281lh) {
            this.f11280le = true;
            return this.ouw;
        }
        Path pathLe = this.fkw.le();
        if (pathLe == null) {
            return this.ouw;
        }
        this.ouw.set(pathLe);
        this.ouw.setFillType(Path.FillType.EVEN_ODD);
        this.f11282ra.ouw(this.ouw);
        this.f11280le = true;
        return this.ouw;
    }

    public vm(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.zih zihVar) {
        this.vt = zihVar.ouw;
        this.f11281lh = zihVar.f11230lh;
        this.yu = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.mwh mwhVarOuw = zihVar.vt.ouw();
        this.fkw = mwhVarOuw;
        ouwVar.ouw(mwhVarOuw);
        mwhVarOuw.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11280le = false;
        this.yu.invalidateSelf();
    }
}
