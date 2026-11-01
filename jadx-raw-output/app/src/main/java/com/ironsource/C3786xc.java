package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3786xc implements InterfaceC3753vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31593a;

    /* JADX INFO: renamed from: com.ironsource.xc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31594a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f31595b = "IronSource";

        private a() {
        }
    }

    public C3786xc(String str) {
        ck.p.j(str, "networkInstanceId");
        this.f31593a = str;
    }

    @Override // com.ironsource.InterfaceC3753vd
    public String value() {
        if (this.f31593a.length() == 0) {
            return "";
        }
        if (ck.p.e(this.f31593a, "0") || ck.p.e(this.f31593a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f31593a;
    }
}
