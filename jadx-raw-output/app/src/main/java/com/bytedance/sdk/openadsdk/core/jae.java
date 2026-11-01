package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class jae {
    public static ConcurrentHashMap<Integer, jae> ouw = new ConcurrentHashMap<>();
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f12685le;
    public int yu;
    public String vt = "";

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12686lh = "";

    public static void ouw(int i10) {
        jae jaeVar;
        if (i10 == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        if (!ouw.containsKey(Integer.valueOf(i10)) || (jaeVar = ouw.get(Integer.valueOf(i10))) == null) {
            return;
        }
        jaeVar.fkw = 1;
    }

    public static void vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        jae jaeVar;
        if (vppVar == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(vppVar.fqk());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        if (!ouw.containsKey(numValueOf) || (jaeVar = ouw.get(numValueOf)) == null) {
            return;
        }
        jaeVar.yu = 1;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.yhj)) {
            return;
        }
        Integer numValueOf = Integer.valueOf(vppVar.fqk());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        jae jaeVar = ouw.containsKey(numValueOf) ? ouw.get(numValueOf) : null;
        if (jaeVar == null) {
            jaeVar = new jae();
        }
        String strUx = vppVar.ux();
        if (TextUtils.isEmpty(strUx) || !strUx.equals(jaeVar.f12685le)) {
            jaeVar.vt = "";
            jaeVar.f12686lh = "";
            jaeVar.yu = 0;
            jaeVar.fkw = 0;
            String strUx2 = vppVar.ux();
            if (!TextUtils.isEmpty(strUx2)) {
                jaeVar.f12685le = strUx2;
            }
            String strOuw = vppVar.osn;
            if (TextUtils.isEmpty(strOuw) && vppVar.cd()) {
                strOuw = vppVar.cu.ouw();
            }
            if (!TextUtils.isEmpty(strOuw)) {
                String[] strArrSplit = strOuw.split("/");
                if (strArrSplit.length >= 3) {
                    jaeVar.vt = strArrSplit[2];
                }
            }
            com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.f12779lh)) {
                jaeVar.f12686lh = vppVar.wp.f12779lh;
            }
            ouw.put(numValueOf, jaeVar);
        }
    }
}
