package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC3587m4 {

    /* JADX INFO: renamed from: com.ironsource.m4$a */
    public static final class a implements InterfaceC3587m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29491a;

        @Override // com.ironsource.InterfaceC3587m4
        public void a() {
            A8.a(C3472fe.f28932x, new C3748v8().a(G5.f26614y, Boolean.valueOf(this.f29491a)).a());
        }

        public a(boolean z10) {
            this.f29491a = z10;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$b */
    public static final class b implements InterfaceC3587m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f29493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3710t4 f29494c;

        public b(boolean z10, long j10, InterfaceC3710t4 interfaceC3710t4) {
            ck.p.j(interfaceC3710t4, "currentTimeProvider");
            this.f29492a = z10;
            this.f29493b = j10;
            this.f29494c = interfaceC3710t4;
        }

        @Override // com.ironsource.InterfaceC3587m4
        public void a() {
            C3748v8 c3748v8A = new C3748v8().a(G5.f26614y, Boolean.valueOf(this.f29492a));
            if (this.f29493b > 0) {
                c3748v8A.a(G5.B, Long.valueOf(this.f29494c.a() - this.f29493b));
            }
            A8.a(C3472fe.f28931w, c3748v8A.a());
        }

        public final InterfaceC3710t4 b() {
            return this.f29494c;
        }
    }

    void a();
}
