package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Eb implements V5<Db> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3753vd f26463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3441e1 f26464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26465d;

    public Eb(String str, InterfaceC3753vd interfaceC3753vd, InterfaceC3441e1 interfaceC3441e1, boolean z10) {
        ck.p.j(str, "adm");
        ck.p.j(interfaceC3753vd, "providerName");
        ck.p.j(interfaceC3441e1, "adapterConfigs");
        this.f26462a = str;
        this.f26463b = interfaceC3753vd;
        this.f26464c = interfaceC3441e1;
        this.f26465d = z10;
    }

    @Override // com.ironsource.V5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Db a() throws Exception {
        InterfaceC3612n9 interfaceC3612n9A = this.f26464c.a(this.f26463b);
        new T(this.f26462a, interfaceC3612n9A, this.f26465d).a();
        if (interfaceC3612n9A != null) {
            return new Db(interfaceC3612n9A.f(), interfaceC3612n9A.e(), interfaceC3612n9A.b(), interfaceC3612n9A.d(), false, 16, null);
        }
        return null;
    }
}
