package z2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.List;
import y2.k;

/* JADX INFO: compiled from: MintegralNativeAd.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Campaign f85908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f85909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f85910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85911e;

    /* JADX INFO: compiled from: MintegralNativeAd.java */
    public class a extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f85912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f85913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f85914c;

        public a(Drawable drawable, Uri uri, double d10) {
            this.f85912a = drawable;
            this.f85913b = uri;
            this.f85914c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f85912a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f85914c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f85913b;
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }

    @NonNull
    public void a(@NonNull Campaign campaign, Context context) {
        this.f85908b = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.f85908b.getAppName());
        }
        if (this.f85908b.getAppDesc() != null) {
            setBody(this.f85908b.getAppDesc());
        }
        if (this.f85908b.getAdCall() != null) {
            setCallToAction(this.f85908b.getAdCall());
        }
        setStarRating(Double.valueOf(this.f85908b.getRating()));
        if (!TextUtils.isEmpty(this.f85908b.getIconUrl())) {
            setIcon(new a(null, Uri.parse(this.f85908b.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!this.f85911e);
        mBMediaView.setNativeAd(this.f85908b);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(this.f85908b);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    public List b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view == null) {
            return arrayList;
        }
        if (!(view instanceof MediaView) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    arrayList.addAll(b(viewGroup.getChildAt(i10)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    public d(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f85911e = k.f(mediationNativeAdConfiguration.getMediationExtras());
        this.f85909c = mediationAdLoadCallback;
    }
}
