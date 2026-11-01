package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public interface Kg {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0248a f26940a = new C0248a(null);

        /* JADX INFO: renamed from: com.ironsource.Kg$a$a, reason: collision with other inner class name */
        public static final class C0248a {
            public /* synthetic */ C0248a(ck.i iVar) {
                this();
            }

            private C0248a() {
            }

            public final Kg a(boolean z10, Dg dg2) {
                ck.p.j(dg2, "waterfallOperations");
                return z10 ? new Ig(dg2) : new Hg(dg2);
            }
        }
    }

    void a();

    void a(A a10);

    Ed b();

    default A c() {
        return null;
    }
}
