package f;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f52739a;

    public d0(z zVar) {
        this.f52739a = zVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        String str;
        this.f52739a.f(adValue.getValueMicros() / 1000000.0d);
        this.f52739a.f61605z = "admob_" + this.f52739a.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f52739a.G = new AdInfo();
        this.f52739a.G.setRevenue(((double) adValue.getValueMicros()) / 1000000.0d);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f52739a.G.setRevenuePrecision(str);
        z zVar = this.f52739a;
        zVar.G.setNetworkName(zVar.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
        z zVar2 = this.f52739a;
        zVar2.r(zVar2.G);
    }
}
