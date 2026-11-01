package com.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class Z0 extends C3490ge {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f27946h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f27947i = "numOfAdUnits";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f27948j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f27949k = "totalNumberCredits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f27950l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f27955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27956g;

    public void g(String str) {
        this.f27954e = str;
    }

    private void a(boolean z10) {
        this.f27956g = z10;
    }

    public String b() {
        return this.f27954e;
    }

    public String c() {
        return this.f27953d;
    }

    public String d() {
        return this.f27952c;
    }

    public String e() {
        return this.f27955f;
    }

    public String f() {
        return this.f27951b;
    }

    public boolean g() {
        return this.f27956g;
    }

    public void h(String str) {
        this.f27953d = str;
    }

    public void i(String str) {
        this.f27952c = str;
    }

    public void j(String str) {
        this.f27955f = str;
    }

    public void k(String str) {
        this.f27951b = str;
    }

    public Z0(String str) {
        super(str);
        if (a(f27946h)) {
            k(d(f27946h));
        }
        if (a(f27947i)) {
            h(d(f27947i));
            a(true);
        } else {
            a(false);
        }
        if (a(f27948j)) {
            g(d(f27948j));
        }
        if (a(f27949k)) {
            j(d(f27949k));
        }
        if (a(f27950l)) {
            i(d(f27950l));
        }
    }
}
