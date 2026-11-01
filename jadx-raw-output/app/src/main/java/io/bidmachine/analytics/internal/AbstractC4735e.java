package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\b\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0015B\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0006\u0010\u0013J%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH&¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lio/bidmachine/analytics/internal/e;", "Lio/bidmachine/analytics/internal/g;", "Lio/bidmachine/analytics/internal/f;", "Lio/bidmachine/analytics/internal/g$a;", com.safedk.android.utils.i.f44984c, "Lmj/r;", "a", "(Lio/bidmachine/analytics/internal/g$a;)V", "Landroid/content/Context;", "applicationContext", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/content/Context;)V", "", "", "", "data", "(Ljava/util/Map;)V", "Lio/bidmachine/analytics/internal/q0;", "error", "(Lio/bidmachine/analytics/internal/q0;)V", "Lio/bidmachine/analytics/internal/e$b;", "b", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$b;", "Lio/bidmachine/analytics/internal/e$a;", "c", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$a;", "adType", "(Lio/bidmachine/analytics/internal/e$a;)Lio/bidmachine/analytics/internal/e$b;", "()Lio/bidmachine/analytics/internal/e$b;", "d", "Lio/bidmachine/analytics/internal/f;", "callback", "e", "Ljava/lang/Object;", "impressionMonitor", "", "Ljava/util/Map;", "lastImpressionInfoMap", "g", "Lio/bidmachine/analytics/internal/e$b;", "lastImpressionInfo", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractC4735e extends AbstractC4737g implements InterfaceC4736f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4736f callback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object impressionMonitor = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<a, b> lastImpressionInfoMap = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b lastImpressionInfo;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public enum a {
        UNSPECIFIED,
        BANNER,
        INTERSTITIAL,
        REWARDED,
        NATIVE
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.e$b */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\n\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001d"}, d2 = {"Lio/bidmachine/analytics/internal/e$b;", "", "", "toString", "()Ljava/lang/String;", "", "count", "", "revenue", "networkName", "a", "(IFLjava/lang/String;)Lio/bidmachine/analytics/internal/e$b;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "b", "F", "getRevenue", "()F", "c", "Ljava/lang/String;", "d", "cpm", "<init>", "(IFLjava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int count;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float revenue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String networkName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float cpm;

        public b(int i10, float f10, String str) {
            this.count = i10;
            this.revenue = f10;
            this.networkName = str;
            this.cpm = f10 * 1000;
        }

        public final b a(int count, float revenue, String networkName) {
            return new b(count, revenue, networkName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.count == bVar.count && Float.compare(this.revenue, bVar.revenue) == 0 && ck.p.e(this.networkName, bVar.networkName);
        }

        public /* synthetic */ b(int i10, float f10, String str, int i11, ck.i iVar) {
            this((i11 & 1) != 0 ? 0 : i10, f10, str);
        }

        public static /* synthetic */ b a(b bVar, int i10, float f10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = bVar.count;
            }
            if ((i11 & 2) != 0) {
                f10 = bVar.revenue;
            }
            if ((i11 & 4) != 0) {
                str = bVar.networkName;
            }
            return bVar.a(i10, f10, str);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getCpm() {
            return this.cpm;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNetworkName() {
            return this.networkName;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.count) * 31) + Float.hashCode(this.revenue)) * 31) + this.networkName.hashCode();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final b a(a adType) {
        b bVar;
        synchronized (this.impressionMonitor) {
            bVar = this.lastImpressionInfoMap.get(adType);
        }
        return bVar;
    }

    public final b b() {
        b bVar;
        synchronized (this.impressionMonitor) {
            bVar = this.lastImpressionInfo;
        }
        return bVar;
    }

    public abstract b b(Map<String, ? extends Object> data);

    public abstract a c(Map<String, ? extends Object> data);

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC4737g.a configuration) {
        this.callback = configuration.getCallback();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        synchronized (this.impressionMonitor) {
            this.lastImpressionInfoMap.clear();
            this.lastImpressionInfo = null;
            mj.r rVar = mj.r.f64562a;
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC4736f
    public void a(Map<String, ? extends Object> data) {
        b bVarB;
        InterfaceC4736f interfaceC4736f = this.callback;
        if (interfaceC4736f != null) {
            interfaceC4736f.a(data);
        }
        a aVarC = c(data);
        if (aVarC == null || (bVarB = b(data)) == null) {
            return;
        }
        synchronized (this.impressionMonitor) {
            b bVar = this.lastImpressionInfo;
            this.lastImpressionInfo = b.a(bVarB, (bVar != null ? bVar.getCount() : 0) + 1, 0.0f, null, 6, null);
            b bVar2 = this.lastImpressionInfoMap.get(aVarC);
            this.lastImpressionInfoMap.put(aVarC, bVar2 == null ? b.a(bVarB, 1, 0.0f, null, 6, null) : b.a(bVarB, bVar2.getCount() + 1, 0.0f, null, 6, null));
            mj.r rVar = mj.r.f64562a;
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC4736f
    public void a(TrackerError error) {
        InterfaceC4736f interfaceC4736f = this.callback;
        if (interfaceC4736f != null) {
            interfaceC4736f.a(error);
        }
    }
}
