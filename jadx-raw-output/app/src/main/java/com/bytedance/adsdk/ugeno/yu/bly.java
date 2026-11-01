package com.bytedance.adsdk.ugeno.yu;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bly implements cf {
    private boolean bly;
    private com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.vt.ouw f11052le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ouw f11053lh;
    public com.bytedance.adsdk.ugeno.core.fkw ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11054ra;
    public mwh vt;
    private Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> yu;

    public final void ouw() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("shake");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public final void vt() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("twist");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public static class ouw {
        public Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> ouw;
        public Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> vt;

        public ouw(Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map, Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map2) {
            this.ouw = map;
            this.vt = map2;
        }
    }

    public final void lh() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> value;
        ouw ouwVar = this.f11053lh;
        if (ouwVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> entry : ouwVar.ouw.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : value) {
                    if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.yu) {
                        lhVar.ouw = this;
                        lhVar.ouw(new Object[0]);
                    }
                }
            }
        }
    }

    public final void yu() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("animateState");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    private bly(com.bytedance.adsdk.ugeno.vt.lh lhVar, ouw ouwVar) {
        this.fkw = lhVar;
        this.f11053lh = ouwVar;
        if (ouwVar != null) {
            this.yu = ouwVar.ouw;
        }
        if (lhVar != null && lhVar.eay && this.f11052le == null) {
            this.f11052le = new com.bytedance.adsdk.ugeno.core.vt.ouw();
        }
    }

    public final boolean ouw(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("touchStart");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
                if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.ryl) {
                    lhVar.ouw = this;
                    lhVar.ouw(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw2 = ouw("touchEnd");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw3 = ouw("tap");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw4 = ouw("slide");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar2 : listOuw2) {
                if (lhVar2 instanceof com.bytedance.adsdk.ugeno.yu.yu.cf) {
                    lhVar2.ouw = this;
                    this.bly = lhVar2.ouw(motionEvent);
                }
            }
        }
        if ((listOuw3 != null && !listOuw3.isEmpty()) || (listOuw4 != null && !listOuw4.isEmpty())) {
            if (this.bly && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.vt.ouw ouwVar = this.f11052le;
            if (ouwVar != null) {
                if (ouwVar.ouw(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.f11052le.ouw(this.fkw, motionEvent);
            }
            if (listOuw3 != null && !listOuw3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar3 : listOuw3) {
                    if (lhVar3 instanceof com.bytedance.adsdk.ugeno.yu.yu.bly) {
                        ((com.bytedance.adsdk.ugeno.yu.yu.bly) lhVar3).f11060cf = this.vt;
                        lhVar3.ouw = this;
                        this.f11054ra = lhVar3.ouw(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.f11054ra) {
                return true;
            }
            if (listOuw4 != null && !listOuw4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar4 : listOuw4) {
                    if (lhVar4 instanceof com.bytedance.adsdk.ugeno.yu.yu.fkw) {
                        lhVar4.ouw = this;
                        this.pno = lhVar4.ouw(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.f11054ra && !this.pno && this.f11052le != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.f11052le.ouw(this.fkw);
            }
            return this.f11054ra || this.pno;
        }
        return this.bly;
    }

    public final com.bytedance.adsdk.ugeno.yu.yu.lh vt(String str) {
        Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map;
        if (this.f11053lh == null || TextUtils.isEmpty(str) || (map = this.f11053lh.vt) == null) {
            return null;
        }
        return map.get(str);
    }

    public final List<com.bytedance.adsdk.ugeno.yu.yu.lh> ouw(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map = this.yu;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.yu.get(str);
    }

    public final void ouw(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarVt = vt(str);
        if (lhVarVt != null) {
            lhVarVt.ouw = this;
            lhVarVt.ouw(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu.cf
    public final void ouw(String str, List<le.ouw> list) {
        com.bytedance.adsdk.ugeno.yu.vt.ouw ouwVarOuw;
        com.bytedance.adsdk.ugeno.core.fkw fkwVar = this.ouw;
        if (fkwVar != null) {
            fkwVar.ouw(str);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<le.ouw> it = list.iterator();
        while (it.hasNext()) {
            le.ouw next = it.next();
            if (next != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = this.fkw;
                vt vtVarOuw = yu.ouw(next.yu);
                if (vtVarOuw == null || (ouwVarOuw = vtVarOuw.ouw(lhVar, str, next)) == null) {
                    ouwVarOuw = new com.bytedance.adsdk.ugeno.yu.vt.lh(lhVar, str, next);
                }
                ouwVarOuw.ouw();
                ouwVarOuw.vt();
            }
        }
    }

    public static bly ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str) {
        le.ouw ouwVar;
        ra raVarOuw;
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarOuw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            ouw ouwVar2 = new ouw(new HashMap(), new HashMap());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    Context context = lhVar.fkw.getContext();
                    le leVarOuw = le.ouw(jSONObjectOptJSONObject, lhVar.yu);
                    if (leVarOuw == null || (ouwVar = leVarOuw.ouw) == null) {
                        lhVarOuw = null;
                    } else {
                        String str2 = ouwVar.f11056lh;
                        if (TextUtils.equals(str2, "custom")) {
                            lhVarOuw = new com.bytedance.adsdk.ugeno.yu.yu.yu(context);
                            lhVarOuw.vt = lhVar;
                            lhVarOuw.f11069lh = leVarOuw;
                            lhVarOuw.lh();
                        } else {
                            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, "global")) {
                                raVarOuw = tlj.ouw(ouwVar.vt);
                            } else {
                                raVarOuw = tlj.ouw(ouwVar.yu);
                            }
                            if (raVarOuw == null) {
                                lhVarOuw = null;
                            } else {
                                lhVarOuw = raVarOuw.ouw(context);
                                lhVarOuw.vt = lhVar;
                                lhVarOuw.f11069lh = leVarOuw;
                                lhVarOuw.lh();
                            }
                        }
                    }
                    if (lhVarOuw != null) {
                        if (ouwVar2.ouw.containsKey(lhVarOuw.f11068le)) {
                            List<com.bytedance.adsdk.ugeno.yu.yu.lh> list = ouwVar2.ouw.get(lhVarOuw.f11068le);
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(lhVarOuw);
                                ouwVar2.ouw.put(lhVarOuw.f11068le, arrayList);
                            } else {
                                list.add(lhVarOuw);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(lhVarOuw);
                            ouwVar2.ouw.put(lhVarOuw.f11068le, arrayList2);
                        }
                        ouwVar2.vt.put(lhVarOuw.yu(), lhVarOuw);
                    }
                }
            }
            return new bly(lhVar, ouwVar2);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
