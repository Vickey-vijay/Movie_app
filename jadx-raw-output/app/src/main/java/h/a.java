package h;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f53646a;

    public a(g gVar) {
        this.f53646a = gVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        String str;
        this.f53646a.f53653c.f(adValue.getValueMicros() / 1000000.0d);
        n nVar = this.f53646a.f53653c;
        StringBuilder sb2 = new StringBuilder("admob_");
        n nVar2 = this.f53646a.f53653c;
        sb2.append(n.E(nVar2, nVar2.G));
        nVar.f61605z = sb2.toString();
        this.f53646a.f53653c.r(adValue);
        this.f53646a.f53653c.I.setRevenue(adValue.getValueMicros() / 1000000.0d);
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 0) {
            str = "UNKNOWN";
        } else if (precisionType != 1) {
            str = precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE";
        } else {
            str = "ESTIMATED";
        }
        this.f53646a.f53653c.I.setRevenuePrecision(str);
        n nVar3 = this.f53646a.f53653c;
        nVar3.I.setNetworkName(n.E(nVar3, nVar3.G));
    }
}
