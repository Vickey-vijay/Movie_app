package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: WXMiniAppModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33665f;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("app_id");
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get("user_name");
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get("path");
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(DomainCampaignEx.KEY_BIND_ID);
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get("universal_link");
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f33660a;
    }

    public String c() {
        return this.f33662c;
    }

    public String d() {
        return this.f33663d;
    }

    public String e() {
        return this.f33661b;
    }

    public void b(String str) {
        this.f33665f = str;
    }

    public void c(String str) {
        this.f33662c = str;
    }

    public void d(String str) {
        this.f33663d = str;
    }

    public void e(String str) {
        this.f33661b = str;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Context context) {
        this.f33660a = context;
    }

    public String a() {
        return this.f33664e;
    }

    public void a(String str) {
        this.f33664e = str;
    }
}
