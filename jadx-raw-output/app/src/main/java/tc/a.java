package tc;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: AdRequestFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pc.a f72343a;

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f72343a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f72343a.a());
    }

    public a(pc.a aVar) {
        this.f72343a = aVar;
    }

    public AdRequest a() {
        return c().build();
    }

    public AdRequest b(String str) {
        if (str.isEmpty()) {
            return a();
        }
        return c().setAdString(str).build();
    }
}
