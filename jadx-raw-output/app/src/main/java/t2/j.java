package t2;

import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import java.util.Map;

/* JADX INFO: compiled from: InMobiInterstitialWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiInterstitial f72180a;

    public Boolean a() {
        return Boolean.valueOf(this.f72180a.isReady());
    }

    public void b() {
        this.f72180a.load();
    }

    public void c(byte[] bArr) {
        this.f72180a.load(bArr);
    }

    public void d(Map<String, String> map) {
        this.f72180a.setExtras(map);
    }

    public void e(String str) {
        this.f72180a.setKeywords(str);
    }

    public void f(WatermarkData watermarkData) {
        this.f72180a.setWatermarkData(watermarkData);
    }

    public void g() {
        this.f72180a.show();
    }

    public j(InMobiInterstitial inMobiInterstitial) {
        this.f72180a = inMobiInterstitial;
    }
}
