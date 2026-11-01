package e3;

import android.content.Context;
import com.applovin.mediation.adapters.unityads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;

/* JADX INFO: compiled from: UnityInitializer.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f52324b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f52325a = new b();

    public static synchronized e a() {
        if (f52324b == null) {
            f52324b = new e();
        }
        return f52324b;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws JSONException {
        if (this.f52325a.f()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataA = this.f52325a.a(context);
        mediationMetaDataA.setName("AdMob");
        mediationMetaDataA.setVersion(this.f52325a.d());
        mediationMetaDataA.set("adapter_version", BuildConfig.VERSION_NAME);
        mediationMetaDataA.commit();
        this.f52325a.e(context, str, iUnityAdsInitializationListener);
    }
}
