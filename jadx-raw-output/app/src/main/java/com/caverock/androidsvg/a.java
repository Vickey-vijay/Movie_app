package com.caverock.androidsvg;

/* JADX INFO: compiled from: RenderOptions.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CSSParser.n f13938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreserveAspectRatio f13939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SVG.b f13941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SVG.b f13943f;

    public a() {
        this.f13938a = null;
        this.f13939b = null;
        this.f13940c = null;
        this.f13941d = null;
        this.f13942e = null;
        this.f13943f = null;
    }

    public a a(String str) {
        this.f13938a = new CSSParser(CSSParser.Source.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        CSSParser.n nVar = this.f13938a;
        return nVar != null && nVar.f() > 0;
    }

    public boolean c() {
        return this.f13939b != null;
    }

    public boolean d() {
        return this.f13940c != null;
    }

    public boolean e() {
        return this.f13942e != null;
    }

    public boolean f() {
        return this.f13941d != null;
    }

    public boolean g() {
        return this.f13943f != null;
    }

    public a h(float f10, float f11, float f12, float f13) {
        this.f13943f = new SVG.b(f10, f11, f12, f13);
        return this;
    }

    public a(a aVar) {
        this.f13938a = null;
        this.f13939b = null;
        this.f13940c = null;
        this.f13941d = null;
        this.f13942e = null;
        this.f13943f = null;
        if (aVar == null) {
            return;
        }
        this.f13938a = aVar.f13938a;
        this.f13939b = aVar.f13939b;
        this.f13941d = aVar.f13941d;
        this.f13942e = aVar.f13942e;
        this.f13943f = aVar.f13943f;
    }
}
