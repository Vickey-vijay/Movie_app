package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002\t\u0012B\u0007¢\u0006\u0004\b%\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J%\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R*\u0010$\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lio/bidmachine/analytics/internal/A;", "Lio/bidmachine/analytics/internal/e;", "Landroid/content/Context;", "applicationContext", "Lmj/r;", "d", "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/internal/g$a;", com.safedk.android.utils.i.f44984c, "a", "(Lio/bidmachine/analytics/internal/g$a;)V", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "", "", "data", "Lio/bidmachine/analytics/internal/e$b;", "b", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$b;", "Lio/bidmachine/analytics/internal/e$a;", "c", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$a;", "h", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lio/bidmachine/analytics/internal/A$b;", "i", "Lio/bidmachine/analytics/internal/A$b;", "getListener", "()Lio/bidmachine/analytics/internal/A$b;", "setListener", "(Lio/bidmachine/analytics/internal/A$b;)V", "getListener$annotations", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "j", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class A extends AbstractC4735e {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String name = "isimp";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private b listener;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lio/bidmachine/analytics/internal/A$b;", "Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;", "Lcom/ironsource/mediationsdk/impressionData/ImpressionData;", "impressionData", "Lmj/r;", "onImpressionSuccess", "(Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V", "Lio/bidmachine/analytics/internal/f;", "a", "Lio/bidmachine/analytics/internal/f;", "callback", "<init>", "(Lio/bidmachine/analytics/internal/f;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class b implements ImpressionDataListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4736f callback;

        public void onImpressionSuccess(ImpressionData impressionData) {
            if (impressionData == null) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                JSONObject allData = impressionData.getAllData();
                if (allData == null || allData.length() <= 0) {
                    this.callback.a(new TrackerError("isimp", TrackerError.a.MONITOR_NO_CONTENT, null, 4, null));
                    return;
                }
                try {
                    this.callback.a(s0.a(allData));
                } catch (Throwable th2) {
                    this.callback.a(new TrackerError("isimp", TrackerError.a.MONITOR_BAD_CONTENT, s0.a(th2)));
                }
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th3));
            }
        }

        public b(InterfaceC4736f interfaceC4736f) {
            this.callback = interfaceC4736f;
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e
    public AbstractC4735e.b b(Map<String, ? extends Object> data) {
        String string;
        Float fA = a0.a(data.get("revenue"));
        if (fA != null) {
            float fFloatValue = fA.floatValue();
            Object obj = data.get("adNetwork");
            if (obj != null && (string = obj.toString()) != null) {
                return new AbstractC4735e.b(0, fFloatValue, string, 1, null);
            }
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void d(Context applicationContext) {
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e, io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a */
    public void b(AbstractC4737g.a configuration) {
        super.b(configuration);
        this.listener = new b(this);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e
    public AbstractC4735e.a c(Map<String, ? extends Object> data) {
        String string;
        String upperCase;
        Object obj = data.get("adFormat");
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        int iHashCode = upperCase.hashCode();
        if (iHashCode == -1466654086) {
            if (upperCase.equals("NATIVEAD")) {
                return AbstractC4735e.a.NATIVE;
            }
            return null;
        }
        if (iHashCode == -1372958932) {
            if (upperCase.equals("INTERSTITIAL")) {
                return AbstractC4735e.a.INTERSTITIAL;
            }
            return null;
        }
        if (iHashCode == 1666382058) {
            if (upperCase.equals("REWARDED_VIDEO")) {
                return AbstractC4735e.a.REWARDED;
            }
            return null;
        }
        if (iHashCode == 1951953708 && upperCase.equals("BANNER")) {
            return AbstractC4735e.a.BANNER;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void e(Context applicationContext) {
        b bVar = this.listener;
        if (bVar != null) {
            IronSource.removeImpressionDataListener(bVar);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e, io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        super.f(applicationContext);
        b bVar = this.listener;
        if (bVar != null) {
            IronSource.addImpressionDataListener(bVar);
        }
    }
}
