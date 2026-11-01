package com.mbridge.msdk.config.component.midi.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: PlayerModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33447b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33450e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CusPlayerView f33454i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33448c = "0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33451f = 5000;

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("url");
                if (obj != null) {
                    String strValueOf = String.valueOf(obj);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        e(strValueOf);
                    }
                }
                Object obj2 = map.get("action");
                if (obj2 != null) {
                    String strValueOf2 = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        a(strValueOf2);
                    }
                }
                Object obj3 = map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                if (obj3 != null) {
                    String strValueOf3 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        c(strValueOf3);
                    }
                }
                Object obj4 = map.get("view_tag");
                if (obj4 != null) {
                    String strValueOf4 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        d(strValueOf4);
                    }
                }
                Object obj5 = map.get("mix_audio");
                if (obj5 != null) {
                    b(String.valueOf(obj5));
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.containsKey("timeout")) {
                    Object obj = map.get("timeout");
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        Object obj2 = map2.get("playTimeout");
                        if (obj2 instanceof String) {
                            b(Integer.valueOf(obj2.toString()).intValue() * 1000);
                        } else if (obj2 instanceof Integer) {
                            b(((Integer) obj2).intValue() * 1000);
                        }
                        Object obj3 = map2.get("bufferTimeout");
                        if (obj3 instanceof String) {
                            a(Integer.valueOf(obj3.toString()).intValue() * 1000);
                        } else if (obj3 instanceof Integer) {
                            a(((Integer) obj3).intValue() * 1000);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void c(String str) {
        this.f33448c = str;
    }

    public CusPlayerView d() {
        return this.f33454i;
    }

    public void e(String str) {
        this.f33446a = str;
    }

    public int c() {
        return this.f33449d;
    }

    public void d(String str) {
        this.f33452g = str;
    }

    public String e() {
        return this.f33453h;
    }

    public String f() {
        return this.f33448c;
    }

    public int g() {
        return this.f33451f;
    }

    public String h() {
        return this.f33452g;
    }

    public String i() {
        return this.f33446a;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public String b() {
        return this.f33447b;
    }

    public void b(String str) {
        this.f33453h = str;
    }

    public void b(int i10) {
        this.f33451f = i10;
    }

    public void a(CusPlayerView cusPlayerView) {
        this.f33454i = cusPlayerView;
    }

    public void a(String str) {
        this.f33447b = str;
    }

    public int a() {
        return this.f33450e;
    }

    public void a(int i10) {
        this.f33450e = i10;
    }
}
