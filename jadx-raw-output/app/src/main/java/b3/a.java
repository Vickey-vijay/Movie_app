package b3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import y2.i;
import y2.j;
import y2.k;

/* JADX INFO: compiled from: MintegralWaterfallAppOpenAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends z2.a {
    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        Activity activity = (Activity) context;
        if (this.f85898e != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f85898e.g(relativeLayout);
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, y2.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f85895b.onFailure(adErrorG);
            return;
        }
        if (this.f85899f.a()) {
            i iVar = new i(string, string2);
            this.f85896c = iVar;
            Map<i, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(iVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f85895b.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f85896c, new WeakReference<>(this));
        }
        j jVarF = y2.e.f();
        this.f85898e = jVarF;
        jVarF.b(string2, string);
        this.f85898e.c(this);
        this.f85898e.f(this);
        this.f85898e.a();
    }
}
