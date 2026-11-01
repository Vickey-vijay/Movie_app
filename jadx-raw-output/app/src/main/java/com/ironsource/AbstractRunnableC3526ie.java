package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractRunnableC3526ie implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29164a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.ie$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ie$a$a, reason: collision with other inner class name */
        public static final class C0271a extends AbstractRunnableC3526ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bk.a<mj.r> f29165b;

            public C0271a(bk.a<mj.r> aVar) {
                this.f29165b = aVar;
            }

            @Override // com.ironsource.AbstractRunnableC3526ie
            public void a() {
                this.f29165b.invoke();
            }
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final AbstractRunnableC3526ie a(bk.a<mj.r> aVar) {
            ck.p.j(aVar, "block");
            return new C0271a(aVar);
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable th2) {
        ck.p.j(th2, "t");
        C3772wf.a(th2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C3676r4.d().a(th3);
            }
        }
    }
}
