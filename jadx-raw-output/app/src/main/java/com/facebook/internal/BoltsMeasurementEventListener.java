package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: BoltsMeasurementEventListener.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "Lmj/r;", "finalize", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "intent", "onReceive", "e", "d", "a", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static BoltsMeasurementEventListener f14307c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14308d = "com.parse.bolts.measurement_event";

    /* JADX INFO: renamed from: com.facebook.internal.BoltsMeasurementEventListener$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BoltsMeasurementEventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$a;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/internal/BoltsMeasurementEventListener;", "a", "", "BOLTS_MEASUREMENT_EVENT_PREFIX", "Ljava/lang/String;", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final BoltsMeasurementEventListener a(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            if (BoltsMeasurementEventListener.a() != null) {
                return BoltsMeasurementEventListener.a();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.b(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.c(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.a();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, ck.i iVar) {
        this(context);
    }

    public static final /* synthetic */ BoltsMeasurementEventListener a() {
        if (i2.a.d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f14307c;
        } catch (Throwable th2) {
            i2.a.b(th2, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (i2.a.d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.e();
        } catch (Throwable th2) {
            i2.a.b(th2, BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ void c(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (i2.a.d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            f14307c = boltsMeasurementEventListener;
        } catch (Throwable th2) {
            i2.a.b(th2, BoltsMeasurementEventListener.class);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            com.facebook.appevents.x xVar = new com.facebook.appevents.x(context);
            Set<String> setKeySet = null;
            String strS = ck.p.s("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                setKeySet = bundleExtra.keySet();
            }
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    ck.p.i(str, C3426d4.i.W);
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            xVar.d(strS, bundle);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void d() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            ck.p.i(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void e() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            ck.p.i(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new IntentFilter(f14308d));
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void finalize() throws Throwable {
        if (i2.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
