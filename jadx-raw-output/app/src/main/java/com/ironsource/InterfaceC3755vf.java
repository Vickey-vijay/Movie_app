package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3755vf {

    /* JADX INFO: renamed from: com.ironsource.vf$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final W6.a.InterfaceC0250a f31483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31484b;

        public a(W6.a.InterfaceC0250a interfaceC0250a) {
            ck.p.j(interfaceC0250a, "onCancel");
            this.f31483a = interfaceC0250a;
        }

        public final void a() {
            this.f31483a.cancel();
            this.f31484b = true;
        }

        public final boolean b() {
            return this.f31484b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vf$b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f31485b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractRunnableC3526ie f31486a;

        /* JADX INFO: renamed from: com.ironsource.vf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.vf$b$a$a, reason: collision with other inner class name */
            public static final class C0292a extends AbstractRunnableC3526ie {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WeakReference<T> f31487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bk.l<T, mj.r> f31488c;

                /* JADX WARN: Multi-variable type inference failed */
                public C0292a(WeakReference<T> weakReference, bk.l<? super T, mj.r> lVar) {
                    this.f31487b = weakReference;
                    this.f31488c = lVar;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.AbstractRunnableC3526ie
                public void a() {
                    Object obj = this.f31487b.get();
                    if (obj != null) {
                        this.f31488c.invoke((T) obj);
                    }
                }
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            private a() {
            }

            public final <T> b a(T t10, bk.l<? super T, mj.r> lVar) {
                ck.p.j(lVar, "block");
                return new b(new C0292a(new WeakReference(t10), lVar), null);
            }
        }

        public /* synthetic */ b(AbstractRunnableC3526ie abstractRunnableC3526ie, ck.i iVar) {
            this(abstractRunnableC3526ie);
        }

        private b(AbstractRunnableC3526ie abstractRunnableC3526ie) {
            this.f31486a = abstractRunnableC3526ie;
        }

        public final AbstractRunnableC3526ie a() {
            return this.f31486a;
        }
    }

    a a(b bVar, long j10);

    a a(Runnable runnable, long j10);
}
