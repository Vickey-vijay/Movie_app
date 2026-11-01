package t2;

import androidx.annotation.Nullable;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.Map;

/* JADX INFO: compiled from: InMobiNativeWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNative f72187a;

    @Nullable
    public String a() {
        return this.f72187a.getCtaText();
    }

    @Nullable
    public String b() {
        return this.f72187a.getAdDescription();
    }

    @Nullable
    public String c() {
        InMobiNativeImage adIcon = this.f72187a.getAdIcon();
        if (adIcon == null) {
            return null;
        }
        return adIcon.getUrl();
    }

    public float d() {
        return this.f72187a.getAdRating();
    }

    @Nullable
    public String e() {
        return this.f72187a.getAdTitle();
    }

    @Nullable
    public String f() {
        return this.f72187a.getAdvertiserName();
    }

    @Nullable
    public MediaView g() {
        return this.f72187a.getMediaView();
    }

    public Boolean h() {
        return Boolean.valueOf(this.f72187a.isVideo());
    }

    public void i() {
        this.f72187a.load();
    }

    public void j(byte[] bArr) {
        this.f72187a.load(bArr);
    }

    public void k(InMobiNativeViewData inMobiNativeViewData) {
        this.f72187a.registerViewForTracking(inMobiNativeViewData);
    }

    public void l(Map<String, String> map) {
        this.f72187a.setExtras(map);
    }

    public void m(String str) {
        this.f72187a.setKeywords(str);
    }

    public void n(VideoEventListener videoEventListener) {
        this.f72187a.setVideoEventListener(videoEventListener);
    }

    public void o() {
        this.f72187a.unTrackViews();
    }

    public m(InMobiNative inMobiNative) {
        this.f72187a = inMobiNative;
    }
}
