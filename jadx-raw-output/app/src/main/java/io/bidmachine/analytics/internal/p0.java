package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import nk.w0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001b\u0010\u000f\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\t\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0017"}, d2 = {"Lio/bidmachine/analytics/internal/p0;", "", "Lkotlin/Function0;", "Lnk/h0;", "a", "Lbk/a;", "mainProvider", "b", "ioProvider", "c", "defaultProvider", "d", "Lmj/g;", "getMain", "()Lnk/h0;", C3426d4.i.Z, "e", "io", InneractiveMediationDefs.GENDER_FEMALE, "default", "<init>", "(Lbk/a;Lbk/a;Lbk/a;)V", "g", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p0 f59021h = new p0(a.f59028a, b.f59029a, c.f59030a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bk.a<nk.h0> mainProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bk.a<nk.h0> ioProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bk.a<nk.h0> defaultProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mj.g main = kotlin.b.a(new g());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mj.g io = kotlin.b.a(new f());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mj.g default = kotlin.b.a(new e());

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements bk.a<nk.h0> {
        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return (nk.h0) p0.this.defaultProvider.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements bk.a<nk.h0> {
        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return (nk.h0) p0.this.ioProvider.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements bk.a<nk.h0> {
        public g() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return (nk.h0) p0.this.mainProvider.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<nk.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59028a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return w0.c();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<nk.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f59029a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return w0.b();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/h0;", "a", "()Lnk/h0;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements bk.a<nk.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f59030a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nk.h0 invoke() {
            return w0.a();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p0$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/p0$d;", "", "Lio/bidmachine/analytics/internal/p0;", "default", "Lio/bidmachine/analytics/internal/p0;", "a", "()Lio/bidmachine/analytics/internal/p0;", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final p0 a() {
            return p0.f59021h;
        }
    }

    public final nk.h0 b() {
        return (nk.h0) this.default.getValue();
    }

    public final nk.h0 c() {
        return (nk.h0) this.io.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(bk.a<? extends nk.h0> aVar, bk.a<? extends nk.h0> aVar2, bk.a<? extends nk.h0> aVar3) {
        this.mainProvider = aVar;
        this.ioProvider = aVar2;
        this.defaultProvider = aVar3;
    }
}
