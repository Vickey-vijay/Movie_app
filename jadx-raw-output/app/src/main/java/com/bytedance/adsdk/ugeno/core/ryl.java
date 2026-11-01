package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.ironsource.C3605n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ryl {
    private pno bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private vm f10822cf;
    public fkw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private cf f10823jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f10825le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f10826lh;
    private String mwh;
    public rn ouw;
    private com.bytedance.adsdk.ugeno.vt.lh<View> pno;
    private bly qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private JSONObject f10827ra;
    private ra ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private float f10829th;
    private ko tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f10830vm;
    public com.bytedance.adsdk.ugeno.yu.mwh vt;
    public List<String> yu;
    private com.bytedance.adsdk.ugeno.yu.ouw.ouw zih;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f10824ko = true;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private boolean f10828rn = false;

    private com.bytedance.adsdk.ugeno.vt.lh<View> vt(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        vt vtVar;
        com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw c0074ouwBly;
        List<ra.ouw> listVt;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        if (vtVarOuw == null) {
            this.f10826lh = true;
            if (this.yu == null) {
                vtVar = vtVarOuw;
                this.yu = new ArrayList();
            }
            vtVar = vtVarOuw;
            this.yu.add(str);
            ouwVar.vt = "View";
            vt vtVarOuw2 = yu.ouw("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            if (vtVarOuw2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
            str = "View";
            vtVar = vtVarOuw2;
        }
        vtVar = vtVarOuw;
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVar.ouw(this.f10825le);
        if (lhVarOuw == null) {
            return null;
        }
        JSONObject jSONObject = ouwVar.f10820lh;
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.f10827ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(jSONObject);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.vt(this.f10827ra);
        ra raVar = this.ryl;
        if (raVar == null) {
            lhVarOuw.ouw(true);
        } else {
            lhVarOuw.ouw(raVar.vt);
        }
        lhVarOuw.bly = this.f10823jg;
        lhVarOuw.lgp = this.zih;
        Iterator<String> itKeys = jSONObject.keys();
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            c0074ouwBly = ouwVar2.bly();
            lhVarOuw.ouw(ouwVar2);
        } else {
            c0074ouwBly = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString(next), this.f10827ra);
            lhVarOuw.ouw(next, strOuw);
            if (this.qbp != null && !TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOuw) && ((TextUtils.equals(next, "src") || TextUtils.equals(next, "backgroundImage")) && strOuw.startsWith("http"))) {
                throw null;
            }
            if (c0074ouwBly != null) {
                c0074ouwBly.ouw(this.f10825le, next, strOuw);
            }
        }
        if (c0074ouwBly != null) {
            lhVarOuw.ouw(c0074ouwBly.ouw());
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList == null || linkedList.size() <= 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it = listVt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt = vt(it.next(), lhVarOuw);
                        if (lhVarVt != null && lhVarVt.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt);
                        }
                    }
                }
                return lhVarOuw;
            }
            if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(linkedList, new Comparator<ra.ouw>() { // from class: com.bytedance.adsdk.ugeno.core.ryl.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(ra.ouw ouwVar3, ra.ouw ouwVar4) {
                        return ouwVar3.f10820lh.optInt(C3605n2.f30215u, 0) - ouwVar4.f10820lh.optInt(C3605n2.f30215u, 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<ra.ouw> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt2 = vt(it2.next(), lhVarOuw);
                if (lhVarVt2 != null && !lhVarVt2.f11003xn) {
                    ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt2, lhVarVt2.vpp());
                }
            }
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    public final void ouw(String str, cf cfVar) {
        this.f10823jg = cfVar;
        this.mwh = str;
        if (cfVar != null) {
            this.f10827ra = cfVar.f10800lh;
        }
    }

    public ryl(Context context) {
        this.f10825le = context;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f10827ra = jSONObject2;
        vm vmVar = this.f10822cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, jSONObject2, jSONObject3);
        this.ryl = raVar;
        float f10 = this.f10830vm;
        float f11 = this.f10829th;
        raVar.f10817lh = f10;
        raVar.yu = f11;
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = vt(this.ryl.ouw(), null);
            if (this.qbp == null) {
                vm vmVar2 = this.f10822cf;
                if (vmVar2 != null) {
                    vmVar2.vt();
                    com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.pno;
                    vm vmVar3 = this.f10822cf;
                    lhVar.ixm = vmVar3;
                    vmVar3.lh();
                }
                ouw(this.pno);
                if (this.f10822cf != null) {
                    zih zihVar = new zih();
                    zihVar.ouw = 0;
                    zihVar.f10846lh = this.pno;
                    this.f10822cf.ouw(zihVar);
                }
                return this.pno;
            }
            throw null;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, JSONObject jSONObject) {
        this.f10827ra = jSONObject;
        vm vmVar = this.f10822cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = vt(ouwVar, null);
            vm vmVar2 = this.f10822cf;
            if (vmVar2 != null) {
                vmVar2.vt();
                this.pno.ixm = this.f10822cf;
            }
            ouw(this.pno);
            return this.pno;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject) {
        vm vmVar = this.f10822cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, this.f10827ra);
        this.ryl = raVar;
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = ouw(raVar.ouw(), (com.bytedance.adsdk.ugeno.vt.lh<View>) null);
            vm vmVar2 = this.f10822cf;
            if (vmVar2 != null) {
                vmVar2.vt();
                this.pno.ixm = this.f10822cf;
            }
            return this.pno;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        List<ra.ouw> listVt;
        com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw c0074ouwBly = null;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        if (vtVarOuw == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(str)));
            this.f10826lh = true;
            if (this.yu == null) {
                this.yu = new ArrayList();
            }
            this.yu.add(str);
            return null;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVarOuw.ouw(this.f10825le);
        if (lhVarOuw == null) {
            return null;
        }
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.f10827ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(ouwVar.f10820lh);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.bly = this.f10823jg;
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            lhVarOuw.ouw(ouwVar2);
            c0074ouwBly = ouwVar2.bly();
        }
        Iterator<String> itKeys = ouwVar.f10820lh.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.f10820lh.optString(next), this.f10827ra);
            lhVarOuw.ouw(next, strOuw);
            if (c0074ouwBly != null) {
                c0074ouwBly.ouw(this.f10825le, next, strOuw);
            }
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList != null && linkedList.size() > 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<ra.ouw> it = linkedList.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw2 = ouw(it.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                    if (lhVarOuw2 != null && lhVarOuw2.uq()) {
                        ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw2);
                    }
                }
            } else {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it2 = listVt.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw3 = ouw(it2.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                        if (lhVarOuw3 != null && lhVarOuw3.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw3);
                        }
                    }
                }
                return lhVarOuw;
            }
        }
        if (c0074ouwBly != null) {
            lhVarOuw.ouw(c0074ouwBly.ouw());
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    public final void vt(JSONObject jSONObject) {
        vm vmVar = this.f10822cf;
        if (vmVar != null) {
            vmVar.lh();
        }
        this.f10827ra = jSONObject;
        ouw(this.pno, jSONObject);
        ouw(this.pno);
        if (this.f10822cf != null) {
            zih zihVar = new zih();
            zihVar.ouw = 0;
            zihVar.f10846lh = this.pno;
            this.f10822cf.ouw(zihVar);
        }
    }

    private void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        try {
            if (!lhVar.ex() || lhVar.jqy() == null || lhVar.jqy().yu == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", lhVar.jqy().yu);
            this.f10827ra.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.vt(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            vt(it.next(), str, objArr);
        }
    }

    private void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        if (lhVar == null) {
            return;
        }
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            lhVar.ouw(jSONObject);
            List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno();
            if (listPno == null || listPno.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(it.next(), jSONObject);
            }
            return;
        }
        lhVar.ouw(jSONObject);
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        JSONObject jSONObjectQbp = lhVar.qbp();
        Iterator<String> itKeys = jSONObjectQbp.keys();
        com.bytedance.adsdk.ugeno.vt.ouw ouwVarTc = lhVar.tc();
        com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw c0074ouwBly = ouwVarTc != null ? ouwVarTc.bly() : null;
        vt(lhVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectQbp.optString(next), this.f10827ra);
            lhVar.ouw(next, strOuw);
            if (c0074ouwBly != null) {
                c0074ouwBly.ouw(this.f10825le, next, strOuw);
            }
        }
        lhVar.ouw(this.bly);
        lhVar.ouw(this.tlj);
        lhVar.ouw(this.ouw);
        bly blyVar = this.qbp;
        if (blyVar != null) {
            lhVar.ms = blyVar;
        }
        fkw fkwVar = this.fkw;
        if (fkwVar != null) {
            lhVar.ouw(fkwVar);
        }
        com.bytedance.adsdk.ugeno.yu.mwh mwhVar = this.vt;
        if (mwhVar != null) {
            lhVar.ouw(mwhVar);
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && listPno.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
        if (c0074ouwBly != null) {
            lhVar.ouw(c0074ouwBly.ouw());
        }
        lhVar.vt();
    }

    public final void ouw(ko koVar) {
        com.bytedance.adsdk.ugeno.core.ouw.ouw ouwVar = com.bytedance.adsdk.ugeno.fkw.ouw().f10848le;
        if (ouwVar == null) {
            this.tlj = koVar;
        } else {
            if (ouwVar.ouw() == null) {
                this.tlj = koVar;
                return;
            }
            throw null;
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            ouw(it.next(), str, objArr);
        }
    }

    public final void ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        this.f10827ra = jSONObject;
        lhVar.vt(jSONObject);
        lhVar.bly = this.f10823jg;
        com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw c0074ouwBly = lhVar.tc() instanceof com.bytedance.adsdk.ugeno.vt.ouw ? lhVar.tc().bly() : null;
        Iterator<String> itKeys = lhVar.qbp().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(lhVar.qbp().optString(next), jSONObject);
            lhVar.ouw(next, strOuw);
            if (c0074ouwBly != null) {
                c0074ouwBly.ouw(this.f10825le, next, strOuw);
            }
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && !listPno.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(jSONObject, it.next());
            }
        }
        if (c0074ouwBly != null) {
            lhVar.ouw(c0074ouwBly.ouw());
        }
    }
}
