package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import io.bidmachine.analytics.ReaderConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u001b\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lio/bidmachine/analytics/internal/H;", "Lio/bidmachine/analytics/internal/i;", "Landroid/content/Context;", "applicationContext", "Lmj/r;", "d", "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/internal/i$a;", com.safedk.android.utils.i.f44984c, "a", "(Lio/bidmachine/analytics/internal/i$a;)V", InneractiveMediationDefs.GENDER_FEMALE, "e", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lrj/c;)Ljava/lang/Object;", "Lio/bidmachine/analytics/internal/J;", "g", "Lio/bidmachine/analytics/internal/J;", C3426d4.a.f28418k, "Lio/bidmachine/analytics/internal/I;", "h", "Lio/bidmachine/analytics/internal/I;", "delegate", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Lio/bidmachine/analytics/internal/J;Lio/bidmachine/analytics/internal/I;)V", "j", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class H extends AbstractC4739i {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final J storage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final I delegate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public H(J j10, I i10) {
        this.storage = j10;
        this.delegate = i10;
        this.name = "alog";
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i
    public Object a(ReaderConfig.Rule rule, rj.c<? super String> cVar) {
        return this.delegate.a(rule);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void d(Context applicationContext) {
    }

    public /* synthetic */ H(J j10, I i10, int i11, ck.i iVar) {
        this(j10, (i11 & 2) != 0 ? new I(j10, null, 2, null) : i10);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        this.delegate.b();
        super.f(applicationContext);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a */
    public void b(AbstractC4739i.a configuration) {
        super.b(configuration);
        this.delegate.a(configuration);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4739i, io.bidmachine.analytics.internal.AbstractC4740j
    public void e(Context applicationContext) {
        super.e(applicationContext);
        this.delegate.a();
    }
}
