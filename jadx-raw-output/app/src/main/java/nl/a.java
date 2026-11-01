package nl;

import kl.e;
import kl.k;
import kl.l;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: BaseDanmakuParser.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<?> f64846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f64847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f64850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f64851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f64852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f64853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DanmakuContext f64854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0594a f64855j;

    /* JADX INFO: renamed from: nl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseDanmakuParser.java */
    public interface InterfaceC0594a {
    }

    public abstract k e();

    public k a() {
        k kVar = this.f64852g;
        if (kVar != null) {
            return kVar;
        }
        this.f64854i.f64339z.g();
        this.f64852g = e();
        g();
        this.f64854i.f64339z.i();
        return this.f64852g;
    }

    public l b() {
        return this.f64853h;
    }

    public e c() {
        return this.f64847b;
    }

    public float d() {
        return 1.0f / (this.f64850e - 0.6f);
    }

    public void g() {
        b<?> bVar = this.f64846a;
        if (bVar != null) {
            bVar.release();
        }
        this.f64846a = null;
    }

    public a h(DanmakuContext danmakuContext) {
        this.f64854i = danmakuContext;
        return this;
    }

    public a i(l lVar) {
        this.f64853h = lVar;
        this.f64848c = lVar.getWidth();
        this.f64849d = lVar.getHeight();
        this.f64850e = lVar.f();
        this.f64851f = lVar.e();
        this.f64854i.f64339z.l(this.f64848c, this.f64849d, d());
        this.f64854i.f64339z.i();
        return this;
    }

    public a j(InterfaceC0594a interfaceC0594a) {
        this.f64855j = interfaceC0594a;
        return this;
    }

    public a k(e eVar) {
        this.f64847b = eVar;
        return this;
    }

    public void f() {
        g();
    }
}
