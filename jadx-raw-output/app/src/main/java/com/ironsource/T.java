package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC3563kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3612n9 f27630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27631c;

    public static final class a extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27632a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.r();
        }
    }

    public static final class b extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27633a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.o();
        }
    }

    public static final class c extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27634a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.n();
        }
    }

    public static final class d extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27635a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.q();
        }
    }

    public static final class e extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27636a = new e();

        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.o();
        }
    }

    public static final class f extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27637a = new f();

        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.g();
        }
    }

    public T(String str, InterfaceC3612n9 interfaceC3612n9, boolean z10) {
        ck.p.j(str, "adm");
        this.f27629a = str;
        this.f27630b = interfaceC3612n9;
        this.f27631c = z10;
    }

    @Override // com.ironsource.InterfaceC3563kg
    public void a() throws C3653pe {
        a(this.f27631c, a.f27632a);
        a(this.f27630b != null, b.f27633a);
        InterfaceC3612n9 interfaceC3612n9 = this.f27630b;
        if (interfaceC3612n9 != null) {
            if (interfaceC3612n9.f() == EnumC3648p9.NonBidder) {
                a(this.f27629a.length() == 0, c.f27634a);
            }
            if (interfaceC3612n9.f() == EnumC3648p9.Bidder) {
                a(this.f27629a.length() > 0, d.f27635a);
            }
            a(interfaceC3612n9.f() != EnumC3648p9.NotSupported, e.f27636a);
            a(interfaceC3612n9.e().length() > 0, f.f27637a);
        }
    }
}
