package com.mbridge.msdk.config.component.cal.model;

import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import java.util.Map;

/* JADX INFO: compiled from: CallBackModel.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f32975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32980h;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("action");
            if (obj != null) {
                this.f32973a = String.valueOf(obj);
            }
            Object obj2 = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (obj2 != null) {
                this.f32974b = String.valueOf(obj2);
            }
            Object obj3 = map.get("reward");
            if (obj3 instanceof Map) {
                this.f32975c = (Map) obj3;
            }
            Object obj4 = map.get("code");
            if (obj4 != null) {
                this.f32976d = String.valueOf(obj4);
            }
            Object obj5 = map.get("reason");
            if (obj5 != null) {
                this.f32977e = String.valueOf(obj5);
            }
            Object obj6 = map.get(BillingClientBridgeCommon.isReadyMethodName);
            if (obj6 instanceof String) {
                this.f32978f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f32978f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(CreativeInfo.L);
            if (obj7 instanceof String) {
                this.f32979g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get("init_status"));
            if (strValueOf.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(strValueOf));
            }
        }
    }

    public String b() {
        return this.f32973a;
    }

    public String c() {
        return this.f32977e;
    }

    public int d() {
        return this.f32980h;
    }

    public int e() {
        return this.f32978f;
    }

    public Map<String, Object> f() {
        return this.f32975c;
    }

    public String g() {
        return this.f32974b;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f32979g;
    }

    public void a(int i10) {
        this.f32980h = i10;
    }
}
