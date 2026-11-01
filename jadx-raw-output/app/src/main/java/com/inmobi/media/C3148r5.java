package com.inmobi.media;

import com.inmobi.media.C3148r5;

/* JADX INFO: renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3148r5 implements InterfaceC2786cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fc f25233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3169s1 f25234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3276w8 f25235c;

    public C3148r5(InterfaceC3276w8 interfaceC3276w8) {
        this.f25233a = null;
        this.f25234b = null;
        this.f25235c = interfaceC3276w8;
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        nk.l0 l0VarA;
        kotlinx.coroutines.g gVarD;
        InterfaceC3028m9 interfaceC3028m9C;
        InterfaceC3276w8 interfaceC3276w8 = this.f25235c;
        if (interfaceC3276w8 != null && (interfaceC3028m9C = interfaceC3276w8.c()) != null) {
            ((C3053n9) interfaceC3028m9C).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC3276w8 interfaceC3276w9 = this.f25235c;
        if (interfaceC3276w9 == null || (l0VarA = interfaceC3276w9.a()) == null || (gVarD = nk.j.d(l0VarA, null, null, new C3124q5(this, null), 3, null)) == null) {
            return;
        }
        gVarD.F(new bk.l() { // from class: b7.da
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3148r5.a(this.f4897b, (Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    public static final mj.r a(C3148r5 c3148r5, Throwable th2) {
        InterfaceC3028m9 interfaceC3028m9C;
        InterfaceC3276w8 interfaceC3276w8 = c3148r5.f25235c;
        if (interfaceC3276w8 != null && (interfaceC3028m9C = interfaceC3276w8.c()) != null) {
            ((C3053n9) interfaceC3028m9C).a();
        }
        InterfaceC3276w8 interfaceC3276w9 = c3148r5.f25235c;
        F3.a(interfaceC3276w9 != null ? interfaceC3276w9.a() : null);
        c3148r5.f25234b = null;
        c3148r5.f25235c = null;
        c3148r5.f25233a = null;
        return mj.r.f64562a;
    }

    public C3148r5(Fc fc2, AbstractC3169s1 abstractC3169s1, InterfaceC3276w8 interfaceC3276w8) {
        this.f25233a = fc2;
        this.f25234b = abstractC3169s1;
        this.f25235c = interfaceC3276w8;
    }
}
