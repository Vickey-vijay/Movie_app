package gl;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.yk.e.AbstractC4043il;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements AppLovinSdk.SdkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f53501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f53502b;

    public i(e0 e0Var, long j10) {
        this.f53502b = e0Var;
        this.f53501a = j10;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        AdLog.i("Applovin SDK is initialized");
        e1 e1Var = this.f53502b.f53478e;
        if (e1Var.f53482c == 0) {
            e1Var.f53482c = System.currentTimeMillis() - this.f53501a;
            AbstractC4043il.f3372lLi1LL.put("applovin", Long.valueOf(this.f53502b.f53478e.f53482c));
            AdLog.i("applovin init time = " + this.f53502b.f53478e.f53482c + "ms");
        }
        this.f53502b.a();
    }
}
