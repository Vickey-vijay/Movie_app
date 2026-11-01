package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: VideoReportData.java */
/* JADX INFO: loaded from: classes4.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34808c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f34813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f34815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f34817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f34818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f34820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f34822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f34823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f34824s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f34826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f34827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f34828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f34829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f34830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f34831z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f34806a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34809d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34825t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f34822q = str;
        this.f34826u = i10;
        this.f34827v = str5;
        this.f34821p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f34828w = URLEncoder.encode(str2, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f34829x = str3;
        this.C = i14;
        this.f34814i = str4;
        this.K = i15;
    }

    public String a() {
        return this.f34807b;
    }

    public void b(String str) {
        this.f34811f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34812g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f34811f;
    }

    public String e() {
        return this.f34812g;
    }

    public String f() {
        return this.f34813h;
    }

    public String g() {
        return this.f34814i;
    }

    public String h() {
        return this.f34815j;
    }

    public String i() {
        return this.f34816k;
    }

    public void j(String str) {
        this.f34822q = str;
    }

    public String k() {
        return this.f34818m;
    }

    public void l(String str) {
        this.f34827v = str;
    }

    public void m(String str) {
        this.f34829x = str;
    }

    public String n() {
        return this.f34822q;
    }

    public void o(String str) {
        this.f34831z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f34826u;
    }

    public String r() {
        return this.f34827v;
    }

    public String s() {
        return this.f34828w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f34829x) ? "" : this.f34829x;
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f34831z;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public void a(String str) {
        this.f34807b = str;
    }

    public int b() {
        return this.f34808c;
    }

    public void d(String str) {
        this.f34813h = str;
    }

    public void e(String str) {
        this.f34814i = str;
    }

    public void f(String str) {
        this.f34815j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f34816k = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f34817l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f34820o = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f34817l;
    }

    public void k(String str) {
        this.f34824s = str;
    }

    public String l() {
        return this.f34820o;
    }

    public int m() {
        return this.f34821p;
    }

    public void n(String str) {
        this.f34830y = str;
    }

    public String o() {
        return this.f34823r;
    }

    public int p() {
        return this.f34825t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    @NonNull
    public String toString() {
        return "RewardReportData [key=" + this.f34822q + ", networkType=" + this.f34826u + ", isCompleteView=" + this.f34821p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f34828w + ", reason=" + this.f34829x + ", result=" + this.C + ", duration=" + this.f34814i + ", videoSize=" + this.K + C3426d4.j.f28588e;
    }

    public String u() {
        return this.f34830y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(int i10) {
        this.f34808c = i10;
    }

    public void b(int i10) {
        this.f34825t = i10;
    }

    public void c(int i10) {
        this.f34826u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f34806a) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f34806a == null) {
            this.f34806a = new HashMap();
        }
        try {
            this.f34806a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f34810e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f34822q = str;
        this.f34827v = str4;
        this.f34826u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f34828w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f34829x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f34822q = str;
        this.f34826u = i10;
        this.f34827v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f34828w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f34814i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f34822q = "m_download_end";
        } else if (i11 == 95) {
            this.f34822q = "2000025";
        }
        int iS = m0.s(context);
        this.f34826u = iS;
        this.f34827v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f34830y = campaignEx.getRequestId();
        this.f34831z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f34828w)) {
            try {
                this.f34828w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f34814i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f34822q = str;
        this.f34818m = str2;
        this.H = str3;
        this.f34823r = str4;
        this.I = str5;
        this.f34811f = str6;
        this.f34826u = i10;
        this.f34827v = str7;
    }

    public n(String str) {
        this.f34819n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f34822q = str;
        this.C = i10;
        this.f34814i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f34816k = URLEncoder.encode(str3, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f34811f = str4;
        this.I = str5;
        this.f34829x = str6;
        this.f34815j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f34822q = str;
        this.f34811f = str2;
        this.f34830y = str3;
        this.f34831z = str4;
        this.I = str5;
        this.f34826u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f34822q = str;
        this.f34811f = str2;
        this.f34830y = str3;
        this.f34831z = str4;
        this.I = str5;
        this.f34826u = i10;
        this.f34829x = str6;
        this.f34810e = i11;
    }
}
