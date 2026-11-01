package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.ReaderConfig;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0005\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lio/bidmachine/analytics/internal/d0;", "Lio/bidmachine/analytics/internal/i;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "", "a", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lrj/c;)Ljava/lang/Object;", "Lio/bidmachine/analytics/internal/i$a;", com.safedk.android.utils.i.f44984c, "Lmj/r;", "(Lio/bidmachine/analytics/internal/i$a;)V", "Landroid/content/Context;", "applicationContext", "d", "(Landroid/content/Context;)V", InneractiveMediationDefs.GENDER_FEMALE, "e", "Lio/bidmachine/analytics/internal/e0;", "g", "Lio/bidmachine/analytics/internal/e0;", "purchaseStorage", "Lkotlin/Function1;", "Lio/bidmachine/analytics/internal/o;", "h", "Lbk/l;", "billingManagerFactory", "i", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "j", "Lio/bidmachine/analytics/internal/o;", "billingManager", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Lio/bidmachine/analytics/internal/e0;Lbk/l;)V", "l", "b", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class d0 extends AbstractC4739i {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e0 purchaseStorage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bk.l<Context, C4745o> billingManagerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C4745o billingManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/bidmachine/analytics/internal/o;", "a", "(Landroid/content/Context;)Lio/bidmachine/analytics/internal/o;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements bk.l<Context, C4745o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58805a = new a();

        public a() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4745o invoke(Context context) {
            return new C4745o(context);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.service.reader.apur.PurchaseReaderService", f = "PurchaseReaderService.kt", l = {26}, m = "dataHash")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f58806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f58807b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f58809d;

        public c(rj.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58807b = obj;
            this.f58809d |= Integer.MIN_VALUE;
            return d0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(e0 e0Var, bk.l<? super Context, C4745o> lVar) {
        this.purchaseStorage = e0Var;
        this.billingManagerFactory = lVar;
        this.name = "apur";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.bidmachine.analytics.internal.AbstractC4739i
    public Object a(ReaderConfig.Rule rule, rj.c<? super String> cVar) throws Throwable {
        c cVar2;
        d0 d0Var;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f58809d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f58809d = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object objA = cVar2.f58807b;
        Object objF = sj.a.f();
        int i11 = cVar2.f58809d;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C4745o c4745o = this.billingManager;
            if (c4745o == null) {
                throw new IllegalArgumentException("Not configured".toString());
            }
            mk.b.a aVar = mk.b.f64563c;
            long jP = mk.b.p(mk.d.s(10, DurationUnit.SECONDS));
            cVar2.f58806a = this;
            cVar2.f58809d = 1;
            objA = c4745o.a(jP, cVar2);
            if (objA == objF) {
                return objF;
            }
            d0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (d0) cVar2.f58806a;
            kotlin.c.b(objA);
        }
        C4744n c4744n = (C4744n) objA;
        d0Var.purchaseStorage.a(c4744n);
        if (c4744n == null) {
            throw new FileNotFoundException("Data not received yet");
        }
        if (c4744n.e()) {
            throw new FileNotFoundException("Data is empty");
        }
        return c4744n.a();
    }

    public /* synthetic */ d0(e0 e0Var, bk.l lVar, int i10, ck.i iVar) {
        this(e0Var, (i10 & 2) != 0 ? a.f58805a : lVar);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void d(Context applicationContext) {
        this.context = applicationContext;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        C4745o c4745o = this.billingManager;
        if (c4745o != null) {
            c4745o.i();
        }
        super.f(applicationContext);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a */
    public void b(AbstractC4739i.a configuration) {
        super.b(configuration);
        Context context = this.context;
        if (context == null) {
            throw new IllegalArgumentException("Context is null".toString());
        }
        if (configuration.c().size() != 1) {
            throw new IllegalStateException(("Reader " + getName() + " should contains only one rule, received " + configuration.c().size()).toString());
        }
        List listN0 = lk.a0.N0(s0.b(((ReaderConfig.Rule) nj.b0.f0(configuration.c())).getPath()), new String[]{"-"}, false, 0, 6, null);
        if (listN0.size() != 2) {
            throw new IllegalStateException("Path should contains min and max value".toString());
        }
        t0.Companion companion = t0.INSTANCE;
        t0 t0VarA = companion.a(lk.a0.k1((String) listN0.get(0)).toString());
        if (t0VarA == null) {
            throw new IllegalStateException("Min version not found".toString());
        }
        t0 t0VarA2 = companion.a(lk.a0.k1((String) listN0.get(1)).toString());
        if (t0VarA2 == null) {
            throw new IllegalStateException("Max version not found".toString());
        }
        C4745o c4745oInvoke = this.billingManager;
        if (c4745oInvoke == null) {
            c4745oInvoke = this.billingManagerFactory.invoke(context);
        }
        this.billingManager = c4745oInvoke;
        t0 t0VarL = c4745oInvoke.l();
        if (t0VarL == null) {
            throw new IllegalStateException("Version not found".toString());
        }
        if (t0VarL.compareTo(t0VarA) < 0 || t0VarL.compareTo(t0VarA2) > 0) {
            throw new IllegalStateException(("Version " + t0VarL + " not supported by config").toString());
        }
        if (!c4745oInvoke.t()) {
            throw new IllegalStateException("No host found".toString());
        }
        if (!c4745oInvoke.s()) {
            throw new IllegalStateException("No permission".toString());
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    public void e(Context applicationContext) {
        super.e(applicationContext);
        C4745o c4745o = this.billingManager;
        if (c4745o != null) {
            c4745o.j();
        }
    }
}
