package t2;

import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: InMobiBannerWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f72176a;

    public InMobiBanner a() {
        return this.f72176a;
    }

    public void b() {
        this.f72176a.load();
    }

    public void c(byte[] bArr) {
        this.f72176a.load(bArr);
    }

    public void d(InMobiBanner.AnimationType animationType) {
        this.f72176a.setAnimationType(animationType);
    }

    public void e(Boolean bool) {
        this.f72176a.setEnableAutoRefresh(bool.booleanValue());
    }

    public void f(Map<String, String> map) {
        this.f72176a.setExtras(map);
    }

    public void g(String str) {
        this.f72176a.setKeywords(str);
    }

    public void h(ViewGroup.LayoutParams layoutParams) {
        this.f72176a.setLayoutParams(layoutParams);
    }

    public void i(BannerAdEventListener bannerAdEventListener) {
        this.f72176a.setListener(bannerAdEventListener);
    }

    public void j(WatermarkData watermarkData) {
        this.f72176a.setWatermarkData(watermarkData);
    }

    public e(InMobiBanner inMobiBanner) {
        this.f72176a = inMobiBanner;
    }
}
