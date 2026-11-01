package io.bidmachine.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 +2\u00020\u0001:\u0004\t\u0012\u0015\u0005B\u0007¢\u0006\u0004\b*\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J%\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R*\u0010$\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0015\u0010(¨\u0006,"}, d2 = {"Lio/bidmachine/analytics/internal/O;", "Lio/bidmachine/analytics/internal/e;", "Landroid/content/Context;", "applicationContext", "Lmj/r;", "d", "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/internal/g$a;", com.safedk.android.utils.i.f44984c, "a", "(Lio/bidmachine/analytics/internal/g$a;)V", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "", "", "data", "Lio/bidmachine/analytics/internal/e$b;", "b", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$b;", "Lio/bidmachine/analytics/internal/e$a;", "c", "(Ljava/util/Map;)Lio/bidmachine/analytics/internal/e$a;", "h", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lio/bidmachine/analytics/internal/O$d;", "i", "Lio/bidmachine/analytics/internal/O$d;", "getProxy", "()Lio/bidmachine/analytics/internal/O$d;", "setProxy", "(Lio/bidmachine/analytics/internal/O$d;)V", "getProxy$annotations", "()V", "proxy", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "j", "Lmj/g;", "()Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "emptySubscriber", "<init>", CampaignEx.JSON_KEY_AD_K, "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class O extends AbstractC4735e {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private d proxy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String name = "mimp";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mj.g emptySubscriber = kotlin.b.a(e.f58726a);

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/O$b;", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "", "getCommunicatorId", "()Ljava/lang/String;", "Lcom/applovin/communicator/AppLovinCommunicatorMessage;", "message", "Lmj/r;", "onMessageReceived", "(Lcom/applovin/communicator/AppLovinCommunicatorMessage;)V", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class b implements AppLovinCommunicatorSubscriber {
        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0013"}, d2 = {"Lio/bidmachine/analytics/internal/O$c;", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "", "getCommunicatorId", "()Ljava/lang/String;", "Lcom/applovin/communicator/AppLovinCommunicatorMessage;", "message", "Lmj/r;", "onMessageReceived", "(Lcom/applovin/communicator/AppLovinCommunicatorMessage;)V", "Lio/bidmachine/analytics/internal/f;", "a", "Lio/bidmachine/analytics/internal/f;", "callback", "b", "Lmj/g;", "subscriberCommunicatorId", "<init>", "(Lio/bidmachine/analytics/internal/f;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class c implements AppLovinCommunicatorSubscriber {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4736f callback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mj.g subscriberCommunicatorId = kotlin.b.a(a.f58723a);

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements bk.a<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58723a = new a();

            public a() {
                super(0);
            }

            @Override // bk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }

        private final String a() {
            return (String) this.subscriberCommunicatorId.getValue();
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Object trackerError;
            try {
                Result.a aVar = Result.Companion;
                if (message != null && ck.p.e("max_revenue_events", message.getTopic())) {
                    Bundle messageData = message.getMessageData();
                    if (messageData == null || messageData.size() <= 0) {
                        this.callback.a(new TrackerError("mimp", TrackerError.a.MONITOR_NO_CONTENT, null, 4, null));
                        return;
                    }
                    try {
                        this.callback.a(s0.a(messageData));
                        trackerError = mj.r.f64562a;
                    } catch (Throwable th2) {
                        trackerError = new TrackerError("mimp", TrackerError.a.MONITOR_BAD_CONTENT, s0.a(th2));
                    }
                    Result.m3458constructorimpl(trackerError);
                }
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th3));
            }
        }

        public c(InterfaceC4736f interfaceC4736f) {
            this.callback = interfaceC4736f;
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0005\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/O$d;", "Lcom/applovin/impl/sdk/AppLovinBroadcastManager$Receiver;", "", "isEnabled", "Lmj/r;", "a", "(Z)V", "Landroid/content/Intent;", "intent", "", "", "", "map", "onReceive", "(Landroid/content/Intent;Ljava/util/Map;)V", "Z", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "b", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "getSubscriber", "()Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "(Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;)V", "subscriber", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class d implements AppLovinBroadcastManager.Receiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private volatile boolean isEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile AppLovinCommunicatorSubscriber subscriber;

        public final void a(boolean isEnabled) {
            this.isEnabled = isEnabled;
        }

        public final void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
            this.subscriber = appLovinCommunicatorSubscriber;
        }

        @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
        public void onReceive(Intent intent, Map<String, ? extends Object> map) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber;
            if (this.isEnabled && (intent instanceof AppLovinCommunicatorMessage) && (appLovinCommunicatorSubscriber = this.subscriber) != null) {
                appLovinCommunicatorSubscriber.onMessageReceived((AppLovinCommunicatorMessage) intent);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/bidmachine/analytics/internal/O$b;", "a", "()Lio/bidmachine/analytics/internal/O$b;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements bk.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f58726a = new e();

        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b();
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
            Object obj = data.get(BrandSafetyEvent.f44576ad);
            if (obj != null && (string = obj.toString()) != null) {
                return new AbstractC4735e.b(0, fFloatValue, string, 1, null);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.bidmachine.analytics.internal.AbstractC4735e
    public AbstractC4735e.a c(Map<String, ? extends Object> data) {
        String string;
        String upperCase;
        Object obj = data.get("ad_format");
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        switch (upperCase.hashCode()) {
            case -2053424887:
                if (!upperCase.equals(BrandSafetyUtils.f43551n)) {
                    return null;
                }
                return AbstractC4735e.a.BANNER;
            case -1999289321:
                if (upperCase.equals("NATIVE")) {
                    return AbstractC4735e.a.NATIVE;
                }
                return null;
            case -1372958932:
                if (!upperCase.equals("INTERSTITIAL")) {
                    return null;
                }
                return AbstractC4735e.a.INTERSTITIAL;
            case 2374915:
                if (!upperCase.equals(BrandSafetyUtils.f43552o)) {
                    return null;
                }
                return AbstractC4735e.a.BANNER;
            case 69823676:
                if (!upperCase.equals(BrandSafetyUtils.f43547j)) {
                    return null;
                }
                return AbstractC4735e.a.INTERSTITIAL;
            case 543046670:
                if (!upperCase.equals(BrandSafetyUtils.f43548k)) {
                    return null;
                }
                return AbstractC4735e.a.REWARDED;
            case 1854800829:
                if (!upperCase.equals("REWARDED_INTERSTITIAL")) {
                    return null;
                }
                return AbstractC4735e.a.REWARDED;
            case 1951953708:
                if (!upperCase.equals("BANNER")) {
                    return null;
                }
                return AbstractC4735e.a.BANNER;
            default:
                return null;
        }
    }

    private final AppLovinCommunicatorSubscriber c() {
        return (AppLovinCommunicatorSubscriber) this.emptySubscriber.getValue();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e, io.bidmachine.analytics.internal.AbstractC4740j
    /* JADX INFO: renamed from: a */
    public void b(AbstractC4737g.a configuration) {
        super.b(configuration);
        d dVar = this.proxy;
        if (dVar == null) {
            return;
        }
        dVar.a(new c(this));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void d(Context applicationContext) {
        d dVar = new d();
        AppLovinBroadcastManager.registerReceiver(dVar, new IntentFilter("max_revenue_events"));
        this.proxy = dVar;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4740j
    public void e(Context applicationContext) {
        d dVar = this.proxy;
        if (dVar != null) {
            dVar.a(false);
        }
        AppLovinCommunicator.getInstance(applicationContext).unsubscribe(c(), "max_revenue_events");
    }

    @Override // io.bidmachine.analytics.internal.AbstractC4735e, io.bidmachine.analytics.internal.AbstractC4740j
    public void f(Context applicationContext) {
        super.f(applicationContext);
        d dVar = this.proxy;
        if (dVar != null) {
            dVar.a(true);
        }
        AppLovinCommunicator.getInstance(applicationContext).subscribe(c(), "max_revenue_events");
    }
}
