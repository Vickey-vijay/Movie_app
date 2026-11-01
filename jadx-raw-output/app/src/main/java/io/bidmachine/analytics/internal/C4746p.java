package io.bidmachine.analytics.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import me.goldze.mvvmhabit.base.ContainerActivity;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u001d¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004JE\u0010\f\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\f\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0013J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010$J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010-\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010.\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,¨\u00061"}, d2 = {"Lio/bidmachine/analytics/internal/p;", "", "Lio/bidmachine/analytics/internal/n$a;", "t", "()Lio/bidmachine/analytics/internal/n$a;", "q", "Lkotlin/Function0;", "Landroid/os/Bundle;", "activeBillingDataFetcher", "historyBillingDataFetcher", "Lkotlin/Function1;", "detailsBillingDataFetcher", "a", "(Lbk/a;Lbk/a;Lbk/l;)Lio/bidmachine/analytics/internal/n$a;", "", "v", "()Z", "u", "l", "()Landroid/os/Bundle;", "o", InneractiveMediationDefs.GENDER_MALE, "p", AdActivity.REQUEST_KEY_EXTRA, "d", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "e", "s", "", "", "productIdList", "(Ljava/util/Collection;)Landroid/os/Bundle;", "r", ContainerActivity.BUNDLE, "", "c", "(Landroid/os/Bundle;)Ljava/util/List;", "b", "Lio/bidmachine/analytics/internal/n;", "n", "()Lio/bidmachine/analytics/internal/n;", "Lio/bidmachine/analytics/internal/x;", "Lio/bidmachine/analytics/internal/x;", "billingInterface", "Ljava/lang/String;", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "billingVersion", "<init>", "(Lio/bidmachine/analytics/internal/x;Ljava/lang/String;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4746p {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mj.g<String> f58989e = kotlin.b.a(j.f59012a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final mj.g<String> f58990f = kotlin.b.a(i.f59011a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final mj.g<String> f58991g = kotlin.b.a(d.f59006a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final mj.g<String> f58992h = kotlin.b.a(g.f59009a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final mj.g<String> f58993i = kotlin.b.a(f.f59008a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final mj.g<String> f58994j = kotlin.b.a(e.f59007a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final mj.g<String> f58995k = kotlin.b.a(c.f59005a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final mj.g<String> f58996l = kotlin.b.a(a.f59003a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final mj.g<String> f58997m = kotlin.b.a(b.f59004a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final mj.g<String> f58998n = kotlin.b.a(h.f59010a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final mj.g<String> f58999o = kotlin.b.a(k.f59013a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4753x billingInterface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String billingVersion;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59003a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("ZW5hYmxlUGVuZGluZ1B1cmNoYXNlcw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f59004a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SVRFTV9JRF9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f59005a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f59006a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("UkVTUE9OU0VfQ09ERQ==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f59007a = new e();

        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("REVUQUlMU19MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$f */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f59008a = new f();

        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SU5BUFBfUFVSQ0hBU0VfREFUQV9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$g */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f59009a = new g();

        public g() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SU5BUFBfUFVSQ0hBU0VfSVRFTV9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$h */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f59010a = new h();

        public h() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("U0tVX0RFVEFJTFNfUkVTUE9OU0VfRk9STUFU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$i */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f59011a = new i();

        public i() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("aW5hcHA=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$j */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f59012a = new j();

        public j() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("c3Vicw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$k */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f59013a = new k();

        public k() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("UFJPRFVDVF9ERVRBSUxT");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$m */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends Lambda implements bk.a<Bundle> {
        public m() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C4746p.this.l();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$n */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends Lambda implements bk.a<Bundle> {
        public n() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C4746p.this.o();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$o */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", AdActivity.REQUEST_KEY_EXTRA, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class o extends Lambda implements bk.l<Bundle, Bundle> {
        public o() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(Bundle bundle) {
            return C4746p.this.d(bundle);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class C0495p extends Lambda implements bk.a<Bundle> {
        public C0495p() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C4746p.this.m();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$q */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class q extends Lambda implements bk.a<Bundle> {
        public q() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C4746p.this.p();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$r */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", AdActivity.REQUEST_KEY_EXTRA, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class r extends Lambda implements bk.l<Bundle, Bundle> {
        public r() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(Bundle bundle) {
            return C4746p.this.e(bundle);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$l, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\r\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R!\u0010\u0011\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R!\u0010\u0015\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R!\u0010\u0019\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R!\u0010\u001d\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R!\u0010!\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R!\u0010%\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R!\u0010)\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0004\u0012\u0004\b(\u0010\b\u001a\u0004\b'\u0010\u0006R!\u0010-\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R!\u00101\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0004\u0012\u0004\b0\u0010\b\u001a\u0004\b/\u0010\u0006R\u0014\u00103\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/bidmachine/analytics/internal/p$l;", "", "", "productTypeSubs$delegate", "Lmj/g;", "j", "()Ljava/lang/String;", "getProductTypeSubs$annotations", "()V", "productTypeSubs", "productTypeInApp$delegate", "i", "getProductTypeInApp$annotations", "productTypeInApp", "argResponseCode$delegate", "d", "getArgResponseCode$annotations", "argResponseCode", "argResponsePurchaseItemList$delegate", "g", "getArgResponsePurchaseItemList$annotations", "argResponsePurchaseItemList", "argResponsePurchaseDataList$delegate", InneractiveMediationDefs.GENDER_FEMALE, "getArgResponsePurchaseDataList$annotations", "argResponsePurchaseDataList", "argResponseDetailsList$delegate", "e", "getArgResponseDetailsList$annotations", "argResponseDetailsList", "argPlayBillingLibraryVersion$delegate", "c", "getArgPlayBillingLibraryVersion$annotations", "argPlayBillingLibraryVersion", "argEnablePendingPurchases$delegate", "a", "getArgEnablePendingPurchases$annotations", "argEnablePendingPurchases", "argItemIdList$delegate", "b", "getArgItemIdList$annotations", "argItemIdList", "argSkuDetailsResponseFormat$delegate", "h", "getArgSkuDetailsResponseFormat$annotations", "argSkuDetailsResponseFormat", "valSkuDetailsResponseFormatProductDetails$delegate", CampaignEx.JSON_KEY_AD_K, "getValSkuDetailsResponseFormatProductDetails$annotations", "valSkuDetailsResponseFormatProductDetails", "", "RESULT_OK", "I", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final String a() {
            return (String) C4746p.f58996l.getValue();
        }

        public final String b() {
            return (String) C4746p.f58997m.getValue();
        }

        public final String c() {
            return (String) C4746p.f58995k.getValue();
        }

        public final String d() {
            return (String) C4746p.f58991g.getValue();
        }

        public final String e() {
            return (String) C4746p.f58994j.getValue();
        }

        public final String f() {
            return (String) C4746p.f58993i.getValue();
        }

        public final String g() {
            return (String) C4746p.f58992h.getValue();
        }

        public final String h() {
            return (String) C4746p.f58998n.getValue();
        }

        public final String i() {
            return (String) C4746p.f58990f.getValue();
        }

        public final String j() {
            return (String) C4746p.f58989e.getValue();
        }

        public final String k() {
            return (String) C4746p.f58999o.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle e(Bundle request) {
        return this.billingInterface.a(this.packageName, INSTANCE.j(), request, r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle l() {
        return this.billingInterface.a(this.packageName, INSTANCE.i(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle m() {
        return this.billingInterface.a(this.packageName, INSTANCE.j(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle o() {
        return this.billingInterface.b(this.packageName, INSTANCE.i(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle p() {
        return this.billingInterface.b(this.packageName, INSTANCE.j(), s());
    }

    private final Bundle r() {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        bundle.putString(companion.h(), companion.k());
        return bundle;
    }

    private final Bundle s() {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        return bundle;
    }

    private final boolean u() {
        return this.billingInterface.a(this.packageName, INSTANCE.i()) == 0;
    }

    private final boolean v() {
        return this.billingInterface.a(this.packageName, INSTANCE.j()) == 0;
    }

    public C4746p(InterfaceC4753x interfaceC4753x, String str, String str2) {
        this.billingInterface = interfaceC4753x;
        this.packageName = str;
        this.billingVersion = str2;
    }

    private final List<String> c(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.g());
                return stringArrayList == null ? nj.s.k() : stringArrayList;
            }
        }
        return nj.s.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle d(Bundle request) {
        return this.billingInterface.a(this.packageName, INSTANCE.i(), request, r());
    }

    private final C4744n.a q() {
        if (!u()) {
            return new C4744n.a(null, null, null, 7, null);
        }
        return a(new m(), new n(), new o());
    }

    private final C4744n.a t() {
        if (!v()) {
            return new C4744n.a(null, null, null, 7, null);
        }
        return a(new C0495p(), new q(), new r());
    }

    public final C4744n n() {
        return new C4744n(q(), t());
    }

    private final List<String> a(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.f());
                return stringArrayList == null ? nj.s.k() : stringArrayList;
            }
        }
        return nj.s.k();
    }

    private final List<String> b(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.e());
                return stringArrayList == null ? nj.s.k() : stringArrayList;
            }
        }
        return nj.s.k();
    }

    private final Bundle a(Collection<String> productIdList) {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        bundle.putStringArrayList(companion.b(), new ArrayList<>(productIdList));
        return bundle;
    }

    private final C4744n.a a(bk.a<Bundle> activeBillingDataFetcher, bk.a<Bundle> historyBillingDataFetcher, bk.l<? super Bundle, Bundle> detailsBillingDataFetcher) {
        C4744n.a aVar = new C4744n.a(null, null, null, 7, null);
        Bundle bundleInvoke = activeBillingDataFetcher.invoke();
        Bundle bundleInvoke2 = historyBillingDataFetcher.invoke();
        List<String> listC = c(bundleInvoke);
        List<String> listC2 = c(bundleInvoke2);
        C4744n.a aVarA = C4744n.a.a(aVar, a(bundleInvoke), a(bundleInvoke2), null, 4, null);
        Set setT0 = nj.b0.T0(nj.b0.y0(listC, listC2));
        return setT0.isEmpty() ^ true ? C4744n.a.a(aVarA, null, null, b(detailsBillingDataFetcher.invoke(a(setT0))), 3, null) : aVarA;
    }
}
