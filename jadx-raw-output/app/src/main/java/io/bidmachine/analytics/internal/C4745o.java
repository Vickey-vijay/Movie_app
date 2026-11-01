package io.bidmachine.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u001d\u0010)\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\rR\u001d\u0010,\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010\rR\u001d\u0010/\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\rR\u001d\u00102\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010\rR\u001d\u00106\u001a\u0004\u0018\u0001038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lio/bidmachine/analytics/internal/o;", "", "Landroid/content/Intent;", CampaignEx.JSON_KEY_AD_K, "()Landroid/content/Intent;", "Landroid/content/ComponentName;", "r", "()Landroid/content/ComponentName;", "", "className", "a", "(Ljava/lang/String;)Ljava/lang/String;", InneractiveMediationDefs.GENDER_MALE, "()Ljava/lang/String;", "Lmj/r;", "i", "()V", "j", "", "timeMillis", "Lio/bidmachine/analytics/internal/n;", "(JLrj/c;)Ljava/lang/Object;", "", "s", "()Z", "t", "Landroid/content/Context;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/bidmachine/analytics/internal/p;", "b", "Lio/bidmachine/analytics/internal/p;", "billingService", "c", "Z", "billingServiceConnected", "d", "serviceBind", "e", "Lmj/g;", "n", "libraryBillingVersion", InneractiveMediationDefs.GENDER_FEMALE, "o", "libraryKtxBillingVersion", "g", "p", "metadataBillingVersion", "h", "q", "requestBillingLibraryVersion", "Lio/bidmachine/analytics/internal/t0;", "l", "()Lio/bidmachine/analytics/internal/t0;", "billingVersion", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "<init>", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4745o {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final mj.g<String> f58950l = kotlin.b.a(d.f58971a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final mj.g<String> f58951m = kotlin.b.a(e.f58972a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final mj.g<String> f58952n = kotlin.b.a(f.f58973a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final mj.g<String> f58953o = kotlin.b.a(b.f58969a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final mj.g<String> f58954p = kotlin.b.a(h.f58975a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final mj.g<String> f58955q = kotlin.b.a(c.f58970a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final mj.g<String> f58956r = kotlin.b.a(g.f58974a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final mj.g<String> f58957s = kotlin.b.a(a.f58968a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile C4746p billingService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile boolean billingServiceConnected;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile boolean serviceBind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mj.g libraryBillingVersion = kotlin.b.a(new l());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mj.g libraryKtxBillingVersion = kotlin.b.a(new m());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mj.g metadataBillingVersion = kotlin.b.a(new n());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mj.g requestBillingLibraryVersion = kotlin.b.a(new C0494o());

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final mj.g billingVersion = kotlin.b.a(new j());

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ServiceConnection serviceConnection = new p();

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58968a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58969a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("VkVSU0lPTl9OQU1F");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f58970a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLkluQXBwQmlsbGluZ1NlcnZpY2UuQklORA==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f58971a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5CdWlsZENvbmZpZw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f58972a = new e();

        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5rdHguQnVpbGRDb25maWc=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$f */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f58973a = new f();

        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmdvb2dsZS5hbmRyb2lkLnBsYXkuYmlsbGluZ2NsaWVudC52ZXJzaW9u");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$g */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f58974a = new g();

        public g() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$h */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f58975a = new h();

        public h() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5CSUxMSU5H");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$j */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/t0;", "a", "()Lio/bidmachine/analytics/internal/t0;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements bk.a<t0> {
        public j() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0 invoke() {
            Object objM3458constructorimpl;
            t0 t0VarA;
            C4745o c4745o = C4745o.this;
            try {
                Result.a aVar = Result.Companion;
                String strP = c4745o.p();
                if (strP == null || (t0VarA = t0.INSTANCE.a(strP)) == null) {
                    String strN = c4745o.n();
                    t0VarA = strN != null ? t0.INSTANCE.a(strN) : null;
                }
                objM3458constructorimpl = Result.m3458constructorimpl(t0VarA);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            return (t0) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$k */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnk/l0;", "Lio/bidmachine/analytics/internal/n;", "<anonymous>", "(Lnk/l0;)Lio/bidmachine/analytics/internal/n;"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.service.reader.apur.BillingManager$getBillingData$2", f = "BillingManager.kt", l = {92}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements bk.p<nk.l0, rj.c<? super C4744n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58977a;

        public k(rj.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return C4745o.this.new k(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super C4744n> cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f58977a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            while (C4745o.this.billingService == null) {
                this.f58977a = 1;
                if (nk.s0.a(100L, this) == objF) {
                    return objF;
                }
            }
            C4746p c4746p = C4745o.this.billingService;
            if (c4746p != null) {
                return c4746p.n();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$l */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class l extends Lambda implements bk.a<String> {
        public l() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4745o.this.a(C4745o.INSTANCE.d());
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$m */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends Lambda implements bk.a<String> {
        public m() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4745o.this.a(C4745o.INSTANCE.e());
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$n */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends Lambda implements bk.a<String> {
        public n() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4745o.this.m();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class C0494o extends Lambda implements bk.a<String> {
        public C0494o() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strO = C4745o.this.o();
            if (strO != null) {
                return strO;
            }
            String strN = C4745o.this.n();
            return strN == null ? C4745o.this.p() : strN;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$p */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"io/bidmachine/analytics/internal/o$p", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "binder", "Lmj/r;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class p implements ServiceConnection {
        public p() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder binder) {
            C4746p c4746p;
            t0 t0VarL = C4745o.this.l();
            if (t0VarL == null) {
                throw new IllegalArgumentException("Version not found in connected callback".toString());
            }
            C4745o c4745o = C4745o.this;
            String strQ = c4745o.q();
            if (strQ != null) {
                c4746p = new C4746p(new InterfaceC4753x.a(binder, InterfaceC4753x.a.INSTANCE.a(t0VarL), null, 4, null), C4745o.this.context.getPackageName(), strQ);
            } else {
                c4746p = null;
            }
            c4745o.billingService = c4746p;
            C4745o c4745o2 = C4745o.this;
            c4745o2.billingServiceConnected = c4745o2.billingService != null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C4745o.this.billingServiceConnected = false;
            C4745o.this.billingService = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            objM3458constructorimpl = Result.m3458constructorimpl(bundle != null ? bundle.getString(INSTANCE.f()) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o$i, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\r\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R!\u0010\u0011\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R!\u0010\u0015\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R!\u0010\u0019\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R!\u0010\u001d\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R!\u0010!\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R!\u0010%\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lio/bidmachine/analytics/internal/o$i;", "", "", "javaClientBuildConfigClassName$delegate", "Lmj/g;", "d", "()Ljava/lang/String;", "getJavaClientBuildConfigClassName$annotations", "()V", "javaClientBuildConfigClassName", "kotlinClientBuildConfigClassName$delegate", "e", "getKotlinClientBuildConfigClassName$annotations", "kotlinClientBuildConfigClassName", "metaDataClientVersionField$delegate", InneractiveMediationDefs.GENDER_FEMALE, "getMetaDataClientVersionField$annotations", "metaDataClientVersionField", "fieldVersionName$delegate", "b", "getFieldVersionName$annotations", "fieldVersionName", "permissionBilling$delegate", "h", "getPermissionBilling$annotations", "permissionBilling", "intentActionBillingBind$delegate", "c", "getIntentActionBillingBind$annotations", "intentActionBillingBind", "packageVending$delegate", "g", "getPackageVending$annotations", "packageVending", "argPlayBillingLibraryVersion$delegate", "a", "getArgPlayBillingLibraryVersion$annotations", "argPlayBillingLibraryVersion", "TAG", "Ljava/lang/String;", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final String a() {
            return (String) C4745o.f58957s.getValue();
        }

        public final String b() {
            return (String) C4745o.f58953o.getValue();
        }

        public final String c() {
            return (String) C4745o.f58955q.getValue();
        }

        public final String d() {
            return (String) C4745o.f58950l.getValue();
        }

        public final String e() {
            return (String) C4745o.f58951m.getValue();
        }

        public final String f() {
            return (String) C4745o.f58952n.getValue();
        }

        public final String g() {
            return (String) C4745o.f58956r.getValue();
        }

        public final String h() {
            return (String) C4745o.f58954p.getValue();
        }
    }

    private final Intent k() {
        Companion companion = INSTANCE;
        Intent intent = new Intent(companion.c());
        intent.setPackage(companion.g());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.libraryBillingVersion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (String) this.libraryKtxBillingVersion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p() {
        return (String) this.metadataBillingVersion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q() {
        return (String) this.requestBillingLibraryVersion.getValue();
    }

    public final void j() {
        if (this.serviceBind) {
            this.context.unbindService(this.serviceConnection);
        }
        this.serviceBind = false;
    }

    public final t0 l() {
        return (t0) this.billingVersion.getValue();
    }

    public final boolean s() {
        return this.context.getPackageManager().checkPermission(INSTANCE.h(), this.context.getPackageName()) == 0;
    }

    public C4745o(Context context) {
        this.context = context;
    }

    private final ComponentName r() {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = this.context.getPackageManager().queryIntentServices(k(), 0);
        if (listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            return null;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!ck.p.e(INSTANCE.g(), str) || str2 == null) {
            return null;
        }
        return new ComponentName(str, str2);
    }

    public final void i() {
        ComponentName componentNameR = r();
        if (componentNameR != null) {
            String strQ = q();
            if (strQ != null) {
                Context context = this.context;
                Intent intentK = k();
                intentK.setComponent(componentNameR);
                intentK.putExtra(INSTANCE.a(), strQ);
                if (context.bindService(intentK, this.serviceConnection, 1)) {
                    this.serviceBind = true;
                    return;
                }
                throw new IllegalStateException("Can't connect".toString());
            }
            throw new IllegalArgumentException("Library version not found".toString());
        }
        throw new IllegalArgumentException("Component name not found".toString());
    }

    public final boolean t() {
        if (r() != null) {
            return true;
        }
        return false;
    }

    public final Object a(long j10, rj.c<? super C4744n> cVar) {
        return TimeoutKt.d(j10, new k(null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String className) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Object obj = Class.forName(className).getField(INSTANCE.b()).get(null);
            ck.p.h(obj, "null cannot be cast to non-null type kotlin.String");
            objM3458constructorimpl = Result.m3458constructorimpl((String) obj);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
