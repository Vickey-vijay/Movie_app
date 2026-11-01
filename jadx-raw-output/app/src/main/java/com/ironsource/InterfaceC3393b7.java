package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3393b7 {

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC3393b7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3429d7 f28217a;

        @Override // com.ironsource.InterfaceC3393b7
        public String a() {
            return "WebView is unavailable";
        }

        public a(EnumC3429d7 enumC3429d7) {
            ck.p.j(enumC3429d7, C3426d4.f.f28486e);
            this.f28217a = enumC3429d7;
        }

        @Override // com.ironsource.InterfaceC3393b7
        public EnumC3429d7 b() {
            return this.f28217a;
        }

        public final EnumC3429d7 c() {
            return this.f28217a;
        }
    }

    String a();

    EnumC3429d7 b();
}
