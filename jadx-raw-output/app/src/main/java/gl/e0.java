package gl;

import android.content.Context;
import android.net.Uri;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.UsLocalSaveHelper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f53476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IComCallback f53477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f53478e;

    public final void a() {
        e1 e1Var;
        try {
            IComCallback iComCallback = this.f53477d;
            if (iComCallback != null) {
                iComCallback.onSuccess();
            }
            e1 e1Var2 = this.f53478e;
            e1Var2.f53481b = false;
            if (e1Var2.f53480a.isEmpty()) {
                return;
            }
            e1Var = this.f53478e;
            ConcurrentLinkedQueue concurrentLinkedQueue = e1Var.f53480a;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f53477d.onFailed(-1, e10.getMessage());
            e1 e1Var3 = this.f53478e;
            e1Var3.f53481b = false;
            if (e1Var3.f53480a.isEmpty()) {
            } else {
                e1Var = this.f53478e;
            }
        } finally {
            e1 e1Var4 = this.f53478e;
            e1Var4.f53481b = false;
            if (!e1Var4.f53480a.isEmpty()) {
                ((Runnable) this.f53478e.f53480a.poll()).run();
            }
        }
    }

    public e0(e1 e1Var, Context context, String str, IComCallback iComCallback) {
        this.f53478e = e1Var;
        this.f53475b = context;
        this.f53476c = str;
        this.f53477d = iComCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53478e.f53481b = true;
        if (AppLovinSdk.getInstance(this.f53475b).isInitialized()) {
            AdLog.i("Applovin has success");
            a();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AppLovinSdk.getInstance(this.f53475b).getSettings().setVerboseLogging(Constant.debugFlag);
        AppLovinSdk.getInstance(this.f53475b).getSettings().setCreativeDebuggerEnabled(true);
        if (l.a().c("max_user_geography")) {
            e1 e1Var = this.f53478e;
            Context context = this.f53475b;
            e1Var.getClass();
            AppLovinSdk.getInstance(context).getSettings().getTermsAndPrivacyPolicyFlowSettings().setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR);
        }
        if (l.a().c("max_mediation_debug")) {
            AppLovinSdk.getInstance(this.f53475b).showMediationDebugger();
        }
        AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfigurationBuild = AppLovinSdkInitializationConfiguration.builder(this.f53476c, this.f53475b).setMediationProvider("max").build();
        if (UsLocalSaveHelper.getInstance().isStartCmp()) {
            AdLog.i("start cmp for max");
            AppLovinSdkSettings settings = AppLovinSdk.getInstance(this.f53475b).getSettings();
            settings.getTermsAndPrivacyPolicyFlowSettings().setEnabled(true);
            settings.getTermsAndPrivacyPolicyFlowSettings().setPrivacyPolicyUri(Uri.parse(Constant.privacyPolicyUri));
        }
        AppLovinSdk.getInstance(this.f53475b).initialize(appLovinSdkInitializationConfigurationBuild, new i(this, jCurrentTimeMillis));
    }
}
