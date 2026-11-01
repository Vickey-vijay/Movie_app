package xc;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: AdRequestFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pc.a f74430a;

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f74430a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f74430a.a());
    }

    public a(pc.a aVar) {
        this.f74430a = aVar;
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
