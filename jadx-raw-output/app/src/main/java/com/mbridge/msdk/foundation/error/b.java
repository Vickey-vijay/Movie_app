package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: MBFailureReason.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f34836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f34837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f34838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f34840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34842j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f34844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f34847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f34848p;

    public b(int i10) {
        this.f34833a = i10;
        this.f34834b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f34836d = th2;
    }

    public CampaignEx d() {
        return this.f34837e;
    }

    public void a(CampaignEx campaignEx) {
        this.f34837e = campaignEx;
    }

    public void b(String str) {
        this.f34840h = str;
    }

    public void c(String str) {
        this.f34835c = str;
    }

    public void d(String str) {
        this.f34843k = str;
    }

    public int g() {
        return this.f34833a;
    }

    public int h() {
        return this.f34834b;
    }

    public String i() {
        return this.f34848p;
    }

    public MBridgeIds j() {
        if (this.f34838f == null) {
            this.f34838f = new MBridgeIds();
        }
        return this.f34838f;
    }

    public String k() {
        return this.f34840h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f34835c) ? this.f34835c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f34833a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f34836d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f34843k;
    }

    public int n() {
        return this.f34842j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f34833a + ", errorSubType=" + this.f34834b + ", message='" + this.f34835c + "', cause=" + this.f34836d + ", campaign=" + this.f34837e + ", ids=" + this.f34838f + ", requestId='" + this.f34839g + "', localRequestId='" + this.f34840h + "', isHeaderBidding=" + this.f34841i + ", typeD=" + this.f34842j + ", reasonD='" + this.f34843k + "', extraMap=" + this.f34844l + ", serverErrorCode=" + this.f34845m + ", errorUrl='" + this.f34846n + "', serverErrorResponse='" + this.f34847o + "'}";
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f34838f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f34841i = z10;
    }

    public b(int i10, String str) {
        this.f34833a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f34835c = str;
        this.f34834b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f34844l == null) {
            this.f34844l = new HashMap<>();
        }
        this.f34844l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f34844l;
        if (map != null && map.containsKey(obj)) {
            return this.f34844l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f34842j = i10;
    }

    public void a(String str) {
        this.f34848p = str;
    }
}
