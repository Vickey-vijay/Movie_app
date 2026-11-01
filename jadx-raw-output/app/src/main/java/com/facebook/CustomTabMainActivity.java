package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import ck.i;
import ck.p;
import com.facebook.internal.d;
import com.facebook.internal.d0;
import com.facebook.internal.j0;
import com.facebook.internal.v;
import com.facebook.login.LoginTargetApp;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: CustomTabMainActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Lmj/r;", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", C3426d4.i.f28569u0, "", C3426d4.f.f28487f, "resultIntent", "a", "", "b", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", "c", "Landroid/content/BroadcastReceiver;", "redirectReceiver", "<init>", "()V", VastTagName.COMPANION, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCloseCustomTab = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver redirectReceiver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRA_ACTION = p.s(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
    public static final String EXTRA_PARAMS = p.s(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
    public static final String EXTRA_CHROME_PACKAGE = p.s(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
    public static final String EXTRA_URL = p.s(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
    public static final String EXTRA_TARGET_APP = p.s(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
    public static final String REFRESH_ACTION = p.s(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
    public static final String NO_ACTIVITY_EXCEPTION = p.s(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.facebook", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        p.j(intent, "intent");
        super.onNewIntent(intent);
        if (p.e(REFRESH_ACTION, intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.DESTROY_ACTION));
            a(-1, intent);
        } else if (p.e(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            a(-1, intent);
        }
    }

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/CustomTabMainActivity$a;", "", "", "urlString", "Landroid/os/Bundle;", "b", "EXTRA_ACTION", "Ljava/lang/String;", "EXTRA_CHROME_PACKAGE", "EXTRA_PARAMS", "EXTRA_TARGET_APP", "EXTRA_URL", "NO_ACTIVITY_EXCEPTION", "REFRESH_ACTION", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Bundle b(String urlString) {
            Uri uri = Uri.parse(urlString);
            j0 j0Var = j0.f14425a;
            Bundle bundleJ0 = j0.j0(uri.getQuery());
            bundleJ0.putAll(j0.j0(uri.getFragment()));
            return bundleJ0;
        }
    }

    public final void a(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            Bundle bundleB = stringExtra != null ? INSTANCE.b(stringExtra) : new Bundle();
            d0 d0Var = d0.f14364a;
            Intent intent2 = getIntent();
            p.i(intent2, "intent");
            Intent intentM = d0.m(intent2, bundleB, null);
            if (intentM != null) {
                intent = intentM;
            }
            setResult(i10, intent);
        } else {
            d0 d0Var2 = d0.f14364a;
            Intent intent3 = getIntent();
            p.i(intent3, "intent");
            setResult(i10, d0.m(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        d dVar;
        super.onCreate(bundle);
        String str = CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION;
        if (p.e(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(EXTRA_ACTION)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_PARAMS);
        String stringExtra2 = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
        if (b.$EnumSwitchMapping$0[LoginTargetApp.INSTANCE.a(getIntent().getStringExtra(EXTRA_TARGET_APP)).ordinal()] == 1) {
            dVar = new v(stringExtra, bundleExtra);
        } else {
            dVar = new d(stringExtra, bundleExtra);
        }
        boolean zA = dVar.a(this, stringExtra2);
        this.shouldCloseCustomTab = false;
        if (!zA) {
            setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
            finish();
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
                    Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                    if (p11 == null) {
                        return;
                    }
                    BrandSafetyUtils.detectAdClick(p11, "com.facebook");
                    p10.startActivity(p11);
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    p.j(context, GAMConfig.KEY_CONTEXT);
                    p.j(intent, "intent");
                    Intent intent2 = new Intent(this.f14066a, (Class<?>) CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.REFRESH_ACTION);
                    String str2 = CustomTabMainActivity.EXTRA_URL;
                    intent2.putExtra(str2, intent.getStringExtra(str2));
                    intent2.addFlags(603979776);
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f14066a, intent2);
                }
            };
            this.redirectReceiver = broadcastReceiver;
            LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            a(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
