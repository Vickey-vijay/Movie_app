package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.jqy;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.tc;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.cf;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class bly extends lh {
    private cf bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.lh f12085cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12086jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private fkw f12087ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public jg f12088le;
    private vt.AbstractC0104vt mwh;
    private final List<pno> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f12089ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private pno f12090rn;
    private com.bytedance.sdk.openadsdk.core.le.pno ryl;
    private com.bytedance.sdk.openadsdk.core.le.lh tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f12091vm;
    private int zih;

    private void vt(pno pnoVar) {
        try {
            this.ryl.setText(this.ouw.getString(vpp.vt(zih.ouw(), "tt_multiple_ad_indicator"), Integer.valueOf(pnoVar.f12105cf + 1), Integer.valueOf(this.f12086jg)));
            this.ryl.setVisibility(0);
        } catch (Throwable th2) {
            qbp.ouw("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0170 A[SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw() {
        int i10;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        int i11;
        boolean z10;
        tc tcVar;
        super.ouw();
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        boolean zTlj = com.bytedance.sdk.openadsdk.core.settings.cf.tlj(String.valueOf(this.vt.fqk()));
        if (this.yu.bly) {
            List<com.bytedance.sdk.openadsdk.core.model.vpp> list2 = this.vt.f12885vm.yu;
            if (list2.isEmpty()) {
                i10 = 0;
            } else {
                int size = list2.size();
                this.f12086jg = size;
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    boolean z11 = i13 == size + (-1);
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = list2.get(i13);
                    if (vppVar2 != null) {
                        vppVar2.f12873rn = this.fkw;
                    }
                    if (!od.vt(vppVar2)) {
                        list = list2;
                        vppVar = vppVar2;
                        if (!th.fkw(vppVar) && th.le(vppVar)) {
                            int i14 = i12 + 1;
                            this.pno.add(ouw(this.yu, vppVar, i12, i13, z11));
                            i11 = i14 + 1;
                            this.pno.add(new fkw(this.yu, vppVar, i14, i13, false, z11, false));
                        } else {
                            int i15 = i12 + 1;
                            this.pno.add(ouw(this.yu, vppVar, i12, i13, z11));
                            i12 = i15;
                            if (!zTlj) {
                                if (vppVar != null || th.ryl(vppVar) || vppVar.euf() || (tcVar = vppVar.ccd) == null || tcVar.ouw <= 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z11) {
                                    if (this.yu.f12120cf && z10 && !od.vt(vppVar)) {
                                        this.pno.add(new fkw(this.yu, vppVar, i12, i13, false, z11, false));
                                        i12++;
                                    }
                                    if (!TextUtils.isEmpty(this.vt.yu())) {
                                        fkw fkwVar = new fkw(this.yu, vppVar, i12, i13, false, z11, true);
                                        this.f12087ko = fkwVar;
                                        this.pno.add(fkwVar);
                                        i12++;
                                    }
                                } else if (!this.yu.ouw() && z10) {
                                    this.pno.add(new fkw(this.yu, vppVar, i12, i13, false, z11, false));
                                    i12++;
                                }
                            }
                            i13++;
                            list2 = list;
                        }
                    } else if (od.lh(vppVar2)) {
                        i11 = i12 + 1;
                        list = list2;
                        vppVar = vppVar2;
                        this.pno.add(new fkw(this.yu, vppVar2, i12, i13, true, z11, false));
                    } else {
                        list = list2;
                        vppVar = vppVar2;
                        int i16 = i12 + 1;
                        this.pno.add(ouw(this.yu, vppVar, i12, i13, z11));
                        i11 = i16 + 1;
                        this.pno.add(new fkw(this.yu, vppVar, i16, i13, true, z11, false));
                    }
                    i12 = i11;
                    if (!zTlj) {
                        if (vppVar != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (!z11) {
                            if (this.yu.f12120cf) {
                                this.pno.add(new fkw(this.yu, vppVar, i12, i13, false, z11, false));
                                i12++;
                            }
                            if (!TextUtils.isEmpty(this.vt.yu())) {
                                fkw fkwVar2 = new fkw(this.yu, vppVar, i12, i13, false, z11, true);
                                this.f12087ko = fkwVar2;
                                this.pno.add(fkwVar2);
                                i12++;
                            }
                        } else if (!this.yu.ouw()) {
                        }
                    }
                    i13++;
                    list2 = list;
                }
                i10 = i12;
            }
        } else {
            i10 = 0;
        }
        if (this.pno.isEmpty() && !od.lh(this.vt)) {
            this.pno.add(ouw(this.yu, this.vt, i10, i10 + 1, true));
        }
        if (jg() == null && this.yu.bly) {
            this.f12088le = com.bytedance.sdk.openadsdk.utils.bly.ouw(this.ouw, new com.bytedance.sdk.openadsdk.utils.bly.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.bly.1
                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final View ouw() {
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = bly.this.f12089ra;
                    if (lhVar != null) {
                        return lhVar.getCloseButton();
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final void vt() {
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = bly.this.f12089ra;
                    if (lhVar != null) {
                        lhVar.setSkipInvisiable();
                    }
                }
            });
        }
    }

    private int qbp() {
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            return pnoVar.tlj;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno cf() {
        return this.f12090rn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final fkw jg() {
        fkw fkwVar = this.f12087ko;
        if (fkwVar != null) {
            return fkwVar;
        }
        pno pnoVar = this.f12090rn;
        int i10 = pnoVar != null ? pnoVar.tlj : -1;
        for (int size = this.pno.size() - 1; size > i10; size--) {
            pno pnoVar2 = this.pno.get(size);
            if (pnoVar2 instanceof fkw) {
                fkw fkwVar2 = (fkw) pnoVar2;
                if (fkwVar2.ouw) {
                    this.f12087ko = fkwVar2;
                    break;
                }
            }
        }
        return this.f12087ko;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final List<com.bytedance.sdk.openadsdk.core.model.vpp> ko() {
        return this.vt.f12885vm.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno mwh() {
        pno pnoVar = this.f12090rn;
        if (pnoVar == null) {
            return null;
        }
        int i10 = pnoVar.tlj;
        while (true) {
            i10++;
            if (i10 >= this.pno.size()) {
                return null;
            }
            pno pnoVar2 = this.pno.get(i10);
            if (pnoVar2 instanceof ouw) {
                return pnoVar2;
            }
            if ((pnoVar2 instanceof fkw) && od.lh(pnoVar2.f12108le) && pnoVar2.f12110rn) {
                return pnoVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int pno() {
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            return abstractC0104vt.ouw();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final com.bytedance.sdk.openadsdk.component.reward.top.lh ryl() {
        return this.f12089ra;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void th() {
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            ko.vt("TTAD.AdSceneManager", "onDialogShow: ");
            if (abstractC0104vt.f12146th) {
                abstractC0104vt.qbp = true;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int tlj() {
        return this.zih;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vm() {
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            abstractC0104vt.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean yu() {
        if (this.pno.isEmpty()) {
            return false;
        }
        List<pno> list = this.pno;
        pno pnoVar = list.get(list.size() - 1);
        return (pnoVar instanceof fkw) && ((fkw) pnoVar).ouw;
    }

    public bly(Activity activity, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, vt vtVar) {
        super(activity, vppVar, vtVar);
        this.pno = new ArrayList();
        this.f12091vm = false;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(activity);
        this.tlj = lhVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lhVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.tlj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void bly() {
        super.bly();
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.zin();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void le() {
        super.le();
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void lh() {
        super.lh();
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            abstractC0104vt.ouw(-1);
        }
        jg jgVar = this.f12088le;
        if (jgVar != null) {
            jgVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ra() {
        super.ra();
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.yu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt() {
        super.vt();
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.lh();
        }
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            abstractC0104vt.vt(-1);
        }
        jg jgVar = this.f12088le;
        if (jgVar != null) {
            jgVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(pno pnoVar, int i10) {
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0104vt.ouw(i10);
            jg jgVar = this.f12088le;
            if (jgVar != null) {
                jgVar.vt();
                return;
            }
            return;
        }
        if (i10 == 1) {
            abstractC0104vt.vt(i10);
            jg jgVar2 = this.f12088le;
            if (jgVar2 != null) {
                jgVar2.ouw();
                return;
            }
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                this.f12090rn.ksc().ex.zih();
            } catch (Throwable th2) {
                qbp.yu("SeqSwitchLayoutManager", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(Activity activity) {
        super.vt(activity);
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.ouw(activity);
        }
    }

    private static pno ouw(vt vtVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, int i11, boolean z10) {
        boolean zEy = vppVar.ey();
        AdSlot adSlot = vppVar.yiz;
        if (adSlot != null) {
            zEy = adSlot.getDurationSlotType() == 7;
        }
        if (zEy) {
            return new ra(vtVar, vppVar, i10, i11, z10);
        }
        return new le(vtVar, vppVar, i10, i11, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Bundle bundle) {
        super.ouw(bundle);
        this.f12085cf = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw);
        this.tlj.addView(this.f12085cf, new FrameLayout.LayoutParams(-1, -1));
        this.bly = new cf(this.ouw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, osn.ouw(this.ouw, 2.0f));
        layoutParams.gravity = 80;
        this.tlj.addView(this.bly, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this.ouw);
        this.ryl = pnoVar;
        pnoVar.setTextColor(-1);
        this.ryl.setTextSize(15.0f);
        this.ryl.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = osn.ouw(this.ouw, 60.0f);
        layoutParams2.rightMargin = osn.ouw(this.ouw, 16.0f);
        layoutParams2.gravity = BadgeDrawable.TOP_END;
        this.tlj.addView(this.ryl, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw);
        this.f12089ra = lhVar;
        this.tlj.addView(lhVar, new FrameLayout.LayoutParams(-1, -2));
        this.f12089ra.ouw(this.vt);
        this.f12089ra.setShowDislike(true);
        ouw(null, null, new vt.fkw(1, null));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2;
        pno pnoVar3 = this.f12090rn;
        if ((pnoVar3 == null || pnoVar3 == pnoVar) && !com.bytedance.sdk.component.utils.vt.ouw(this.ouw)) {
            qbp();
            if (pnoVar2 == null) {
                pno pnoVar4 = this.f12090rn;
                int i10 = pnoVar4 != null ? pnoVar4.tlj + 1 : 0;
                if (i10 < this.pno.size()) {
                    pnoVar2 = this.pno.get(i10);
                }
                if (pnoVar2 == null) {
                    this.yu.vt();
                    return;
                }
            }
            pno pnoVar5 = this.f12090rn;
            if (pnoVar5 != null) {
                if (pnoVar5 == pnoVar2) {
                    return;
                }
                pnoVar5.jg();
                this.f12090rn.yu();
                com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = this.f12090rn.ouw();
                if (blyVarOuw != null) {
                    this.f12085cf.removeView(blyVarOuw);
                }
                this.f12090rn.qbp();
                this.f12090rn.ryl = false;
                if (this.yu.ouw()) {
                    pno pnoVar6 = this.f12090rn;
                    if (pnoVar6 instanceof ouw) {
                        int i11 = pnoVar6.tlj + 1;
                        pno pnoVar7 = i11 < this.pno.size() ? this.pno.get(i11) : null;
                        if ((pnoVar7 instanceof fkw) && pnoVar7 != pnoVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw2 = pnoVar7.ouw();
                            if (blyVarOuw2 != null && blyVarOuw2.getParent() != null && (blyVarOuw2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) blyVarOuw2.getParent()).removeView(blyVarOuw2);
                            }
                            pnoVar7.qbp();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.vt.ouw(this.ouw)) {
                return;
            }
            pnoVar2.ryl = true;
            pno pnoVar8 = this.f12090rn;
            this.f12090rn = pnoVar2;
            if (this.mwh == null) {
                if (pnoVar2.d_()) {
                    this.mwh = new vt.yu(this.yu, this.vt, this.f12089ra);
                } else {
                    this.mwh = new vt.ouw(this.yu, this.vt, this.f12089ra);
                }
            }
            this.mwh.vt();
            int iMwh = 0;
            for (int i12 = pnoVar2.tlj; i12 < this.pno.size(); i12++) {
                pno pnoVar9 = this.pno.get(i12);
                if ((pnoVar9 instanceof fkw) && ((fkw) pnoVar9).ouw) {
                    break;
                }
                boolean z10 = pnoVar9.f12110rn;
                boolean zLe = th.le(pnoVar9.f12108le);
                boolean zFkw = th.fkw(pnoVar9.f12108le);
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = pnoVar9.f12108le;
                jqy jqyVar = vppVar3.f12854jg;
                int i13 = jqyVar != null ? jqyVar.f12761lh : 10;
                if (pnoVar9 instanceof ouw) {
                    if (zFkw) {
                        iMwh += i13;
                    } else {
                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar3.f12874sd;
                        iMwh = vtVar != null ? (int) (((double) iMwh) + vtVar.yu) : (int) (((long) iMwh) + 10);
                    }
                } else if (pnoVar9 instanceof fkw) {
                    if (zLe) {
                        iMwh += i13;
                    } else if (z10) {
                        if (vppVar3.euf()) {
                            iMwh += i13;
                        } else {
                            iMwh += od.mwh(pnoVar9.f12108le) + od.rn(pnoVar9.f12108le);
                        }
                    } else if (this.yu.ouw() && (vppVar2 = pnoVar9.f12108le) != null && !vppVar2.mq()) {
                        iMwh += pnoVar9.f12108le.ccd.ouw;
                    }
                }
            }
            boolean z11 = pnoVar2 instanceof fkw;
            if (z11 && !((fkw) pnoVar2).ouw && !pnoVar2.f12110rn && (vppVar = pnoVar2.f12108le) != null && vppVar.mq()) {
                this.mwh.yu();
            } else {
                this.mwh.ouw(iMwh, pnoVar2.f12108le);
                if (z11 && ((fkw) pnoVar2).ouw) {
                    cf cfVar = this.bly;
                    if (cfVar != null) {
                        osn.ra(cfVar);
                        this.bly = null;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f12089ra;
                    if (lhVar != null) {
                        osn.ra(lhVar);
                        osn.ra(this.f12089ra.getITopLayout());
                        this.f12089ra = null;
                    }
                    vt.AbstractC0104vt abstractC0104vt = this.mwh;
                    if (abstractC0104vt != null) {
                        abstractC0104vt.lh();
                    }
                    if (pnoVar8 instanceof ra) {
                        ((ra) pnoVar8).ub();
                    }
                    jg jgVar = this.f12088le;
                    if (jgVar != null) {
                        jgVar.lh();
                    }
                } else if (pnoVar2.f12108le.euf()) {
                    boolean z12 = (pnoVar2 instanceof ouw) && th.fkw(pnoVar2.f12108le);
                    boolean z13 = z11 && (pnoVar2.f12110rn || th.le(pnoVar2.f12108le));
                    if (z12 || z13) {
                        this.mwh.ouw(pnoVar2);
                    }
                } else if (pnoVar2.f12110rn) {
                    this.mwh.ouw(pnoVar2.f12108le, pnoVar2.zih);
                } else if (z11) {
                    this.mwh.lh(pnoVar2.f12108le.ccd.ouw);
                }
            }
            jg jgVar2 = this.f12088le;
            if (jgVar2 != null && pnoVar8 == null) {
                jgVar2.ouw(iMwh * 1000);
            }
            if (pnoVar2 instanceof ouw) {
                this.zih++;
                ouw(0.0f);
                if (th.fkw(pnoVar2.f12108le)) {
                    this.ryl.setVisibility(8);
                } else {
                    vt(pnoVar2);
                }
            } else if (z11) {
                if (((fkw) pnoVar2).ouw) {
                    this.ryl.setVisibility(8);
                } else {
                    if (pnoVar2.f12110rn && od.lh(pnoVar2.f12108le)) {
                        this.zih++;
                    }
                    if (!pnoVar2.f12110rn && !th.le(pnoVar2.f12108le)) {
                        vt(pnoVar2);
                    } else {
                        this.ryl.setVisibility(8);
                    }
                }
            }
            pnoVar2.vt(this.ouw, fkwVar);
            com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw3 = pnoVar2.ouw();
            if (blyVarOuw3 != null) {
                ViewParent parent = blyVarOuw3.getParent();
                if (parent != null) {
                    if (parent == this.f12085cf) {
                        blyVarOuw3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(blyVarOuw3);
                    }
                }
                if (blyVarOuw3.getParent() == null) {
                    this.f12085cf.addView(blyVarOuw3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i14 = pnoVar8 != null ? pnoVar8.tlj : 0; i14 < this.pno.size(); i14++) {
                this.pno.get(i14).ouw(pnoVar8, this.f12090rn, fkwVar);
            }
            this.yu.lh(this.f12090rn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i10, int i11) {
        super.ouw(i10, i11);
        if (i10 >= 0) {
            if (TextUtils.isEmpty(this.f12099lh)) {
                this.ryl.setText(this.ouw.getString(vpp.vt(zih.ouw(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i10)));
            } else {
                this.ryl.setText(String.format(this.f12099lh, Integer.valueOf(i10)));
            }
            this.ryl.setVisibility(0);
            return;
        }
        this.ryl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Activity activity) {
        super.ouw(activity);
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.vt(activity);
        }
        int iQbp = qbp();
        for (pno pnoVar2 : this.pno) {
            if (pnoVar2.tlj >= iQbp) {
                pnoVar2.qbp();
            }
        }
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            abstractC0104vt.lh();
        }
        jg jgVar = this.f12088le;
        if (jgVar != null) {
            jgVar.lh();
        }
        pno pnoVar3 = this.f12090rn;
        if (pnoVar3 != null && !pnoVar3.jqy() && !this.vt.f12887zn) {
            com.bytedance.sdk.openadsdk.core.jg.vt().post(new vt.lh(this.vt));
        }
        this.f12090rn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(float f10) {
        cf cfVar = this.bly;
        if (cfVar == null) {
            return;
        }
        cfVar.setProgress(f10);
        if (f10 == 0.0f && this.bly.getVisibility() == 0) {
            this.bly.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.bly.getVisibility() == 0) {
                return;
            }
            this.bly.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i10) {
        ko.vt("SeqSwitchLayoutManager", "changeCountDownStatus: status=".concat(String.valueOf(i10)));
        vt.AbstractC0104vt abstractC0104vt = this.mwh;
        if (abstractC0104vt != null) {
            if (i10 == 2) {
                abstractC0104vt.ouw(2);
            } else if (i10 == 1) {
                abstractC0104vt.vt(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, vt.fkw fkwVar) {
        pno pnoVar2 = this.f12090rn;
        if (pnoVar2 == null || pnoVar2 == pnoVar) {
            if (pnoVar2 != null && (pnoVar2 instanceof ouw)) {
                final long j10 = 0;
                if (pnoVar2.ksc() != null && this.f12090rn.ksc().ex != null) {
                    j10 = this.f12090rn.ksc().ex.pno;
                }
                final int i10 = this.f12090rn.f12105cf + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                pno pnoVar3 = this.f12090rn;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, pnoVar3.f12108le, pnoVar3.e_(), "dislike_skip", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.bly.2
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        return com.bytedance.sdk.openadsdk.yu.lh.ouw(i10);
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject vt() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", j10);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            pno pnoVarMwh = mwh();
            if (pnoVarMwh == null) {
                pnoVarMwh = jg();
            }
            ouw(this.f12090rn, pnoVarMwh, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z10, boolean z11, boolean z12, int i10) {
        fkw fkwVarJg;
        pno pnoVar2 = this.f12090rn;
        if ((pnoVar2 == null || pnoVar2 == pnoVar) && (fkwVarJg = jg()) != null) {
            vt.fkw fkwVar = new vt.fkw(i10, pnoVar != null ? pnoVar.ksc() : null);
            fkwVar.ouw.putBoolean("isSkip", z10);
            fkwVar.ouw.putBoolean("force", z11);
            fkwVar.ouw.putBoolean("isFromLandingPage", z12);
            ouw(this.f12090rn, fkwVarJg, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(ouw ouwVar, boolean z10) {
        vt.AbstractC0104vt abstractC0104vt;
        super.ouw(ouwVar, z10);
        if (ouwVar == null || ouwVar != this.f12090rn || (abstractC0104vt = this.mwh) == null) {
            return;
        }
        if (z10) {
            abstractC0104vt.bly = (int) (1000.0f / abstractC0104vt.pno);
        } else {
            abstractC0104vt.bly = 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar) {
        vt.AbstractC0104vt abstractC0104vt;
        super.ouw(pnoVar);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "onPlayableLoadingDismiss [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl);
        if (pnoVar.ryl && (abstractC0104vt = this.mwh) != null) {
            abstractC0104vt.fkw();
        }
        pno pnoVarMwh = mwh();
        if (pnoVarMwh instanceof ouw) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = pnoVarMwh.ksc();
            if (ouwVarKsc == null || !th.fkw(ouwVarKsc.vt)) {
                ((ouw) pnoVarMwh).vpp();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z10) {
        vt.AbstractC0104vt abstractC0104vt;
        super.ouw(pnoVar, z10);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "setIsHappenInteraction [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl + ",isHappenInteraction=" + z10);
        if (!pnoVar.ryl || (abstractC0104vt = this.mwh) == null) {
            return;
        }
        abstractC0104vt.f12138ko = z10;
        abstractC0104vt.f12147vm = 0;
        if (z10) {
            int i10 = abstractC0104vt.ryl;
            int i11 = abstractC0104vt.f12136cf;
            abstractC0104vt.tlj = i10 - i11;
            abstractC0104vt.f12137jg = i11;
            abstractC0104vt.mwh = i10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view) {
        super.ouw(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f12085cf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view, boolean z10) {
        super.ouw(view, z10);
        if (view.getParent() == null && this.f12085cf != null) {
            view.setVisibility(4);
            int childCount = this.f12085cf.getChildCount();
            if (z10) {
                this.f12085cf.addView(view, 0);
            } else {
                this.f12085cf.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean ouw(pno pnoVar, int i10) {
        return i10 == this.pno.size() - 1 && this.pno.get(i10) != null && (this.pno.get(i10) instanceof fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(boolean z10) {
        super.ouw(z10);
        pno pnoVar = this.f12090rn;
        if (pnoVar != null) {
            pnoVar.vt(z10);
        }
    }
}
