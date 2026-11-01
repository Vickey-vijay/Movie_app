package io.bidmachine.iab.vast.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidInterstitialListener;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabCtaWrapper;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabElementWrapper;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabMuteWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabRepeatWrapper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastExtension;
import io.bidmachine.iab.vast.VastHelper;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestManager;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastVideoLoadedListener;
import io.bidmachine.iab.vast.VastViewListener;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.PostBannerTag;
import io.bidmachine.iab.vast.view.IabVideoTexture;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class VastView extends RelativeLayout implements IabClickCallback {
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final List O;
    private final List P;
    private final Runnable Q;
    private final Runnable R;
    private final a S;
    private final a T;
    private final LinkedList U;
    private int V;
    private float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59511a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final a f59512a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IabVideoTexture f59513b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f59514b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f59515c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f59516c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f59517d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f59518d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f59519e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f59520e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CloseableLayout f59521f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final MediaPlayer.OnVideoSizeChangedListener f59522f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IabCloseWrapper f59523g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private VastHelper.OnScreenStateChangeListener f59524g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IabCountDownWrapper f59525h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final View.OnTouchListener f59526h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IabRepeatWrapper f59527i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final WebChromeClient f59528i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IabMuteWrapper f59529j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final WebViewClient f59530j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IabLoadingWrapper f59531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IabProgressWrapper f59532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IabCtaWrapper f59533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaPlayer f59534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f59535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CompanionTag f59536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CompanionTag f59537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f59538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MraidInterstitial f59539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VastRequest f59540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0 f59541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VastViewListener f59542v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private VastPlaybackListener f59543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VastAdMeasurer f59544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MraidAdMeasurer f59545y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a0 f59546z;

    public static class PostBannerAdMeasurer implements MraidAdMeasurer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VastView f59547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MraidAdMeasurer f59548b;

        public PostBannerAdMeasurer(@NonNull VastView vastView, @NonNull MraidAdMeasurer mraidAdMeasurer) {
            this.f59547a = vastView;
            this.f59548b = mraidAdMeasurer;
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdClicked() {
            this.f59548b.onAdClicked();
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdShown() {
            this.f59548b.onAdShown();
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onError(@NonNull IabError iabError) {
            this.f59548b.onError(iabError);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer
        @NonNull
        public String prepareCreativeForMeasure(@NonNull String str) {
            return this.f59548b.prepareCreativeForMeasure(str);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdContainer(@NonNull ViewGroup viewGroup) {
            this.f59548b.registerAdContainer(this.f59547a);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdViewReady(@NonNull WebView webView) {
            this.f59548b.onAdViewReady(webView);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdView(@NonNull WebView webView) {
            this.f59548b.registerAdView(webView);
        }
    }

    public interface a {
        void a(int i10, int i11, float f10);
    }

    public static abstract class a0 extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f59549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f59550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f59551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f59552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f59553e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a0 a0Var = a0.this;
                a0Var.a(a0Var.f59552d);
            }
        }

        public a0(Context context, Uri uri, String str) {
            this.f59549a = new WeakReference(context);
            this.f59550b = uri;
            this.f59551c = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                a((Bitmap) null);
            } else {
                start();
            }
        }

        public abstract void a(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.f59549a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f59550b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f59551c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f59552d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e10) {
                    VastLog.e("MediaFrameRetriever", e10.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e11) {
                VastLog.e("MediaFrameRetriever", e11.getMessage(), new Object[0]);
            }
            if (this.f59553e) {
                return;
            }
            Utils.onUiThread(new a());
        }

        public void a() {
            this.f59553e = true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.d();
            }
        }
    }

    public static class b0 implements Parcelable {
        public static final Parcelable.Creator<b0> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f59556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f59557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f59559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f59560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f59561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f59562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f59563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f59564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f59565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f59566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f59567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f59568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f59569n;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0 createFromParcel(Parcel parcel) {
                return new b0(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0[] newArray(int i10) {
                return new b0[i10];
            }
        }

        public b0() {
            this.f59556a = null;
            this.f59557b = 5.0f;
            this.f59558c = 0;
            this.f59559d = 0;
            this.f59560e = true;
            this.f59561f = false;
            this.f59562g = false;
            this.f59563h = false;
            this.f59564i = false;
            this.f59565j = false;
            this.f59566k = false;
            this.f59567l = false;
            this.f59568m = true;
            this.f59569n = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f59556a);
            parcel.writeFloat(this.f59557b);
            parcel.writeInt(this.f59558c);
            parcel.writeInt(this.f59559d);
            parcel.writeByte(this.f59560e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59561f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59562g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59563h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59564i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59565j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59566k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59567l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59568m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f59569n ? (byte) 1 : (byte) 0);
        }

        public b0(Parcel parcel) {
            this.f59556a = null;
            this.f59557b = 5.0f;
            this.f59558c = 0;
            this.f59559d = 0;
            this.f59560e = true;
            this.f59561f = false;
            this.f59562g = false;
            this.f59563h = false;
            this.f59564i = false;
            this.f59565j = false;
            this.f59566k = false;
            this.f59567l = false;
            this.f59568m = true;
            this.f59569n = false;
            this.f59556a = parcel.readString();
            this.f59557b = parcel.readFloat();
            this.f59558c = parcel.readInt();
            this.f59559d = parcel.readInt();
            this.f59560e = parcel.readByte() != 0;
            this.f59561f = parcel.readByte() != 0;
            this.f59562g = parcel.readByte() != 0;
            this.f59563h = parcel.readByte() != 0;
            this.f59564i = parcel.readByte() != 0;
            this.f59565j = parcel.readByte() != 0;
            this.f59566k = parcel.readByte() != 0;
            this.f59567l = parcel.readByte() != 0;
            this.f59568m = parcel.readByte() != 0;
            this.f59569n = parcel.readByte() != 0;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VastView.this.isPlaybackStarted() && VastView.this.f59534n.isPlaying()) {
                    int duration = VastView.this.f59534n.getDuration();
                    int currentPosition = VastView.this.f59534n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f10 = (currentPosition * 100.0f) / duration;
                        VastView.this.S.a(duration, currentPosition, f10);
                        VastView.this.T.a(duration, currentPosition, f10);
                        VastView.this.f59512a0.a(duration, currentPosition, f10);
                        if (f10 > 105.0f) {
                            VastLog.e(VastView.this.f59511a, "Playback tracking: video hang detected", new Object[0]);
                            VastView.this.g();
                        }
                    }
                }
            } catch (Exception e10) {
                VastLog.e(VastView.this.f59511a, "Playback tracking exception: %s", e10.getMessage());
            }
            VastView.this.postDelayed(this, 16L);
        }
    }

    public class d implements a {
        public d() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            IabCountDownWrapper iabCountDownWrapper;
            VastView vastView = VastView.this;
            b0 b0Var = vastView.f59541u;
            if (b0Var.f59564i || b0Var.f59557b == 0.0f || !vastView.a(vastView.f59540t)) {
                return;
            }
            VastView vastView2 = VastView.this;
            float f11 = vastView2.f59541u.f59557b * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            VastLog.d(vastView2.f59511a, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (iabCountDownWrapper = VastView.this.f59525h) != null) {
                iabCountDownWrapper.changePercentage(i12, (int) Math.ceil(((double) f13) / 1000.0d));
            }
            if (f13 <= 0.0f) {
                VastView vastView3 = VastView.this;
                b0 b0Var2 = vastView3.f59541u;
                b0Var2.f59557b = 0.0f;
                b0Var2.f59564i = true;
                vastView3.setCloseControlsVisible(true);
            }
        }
    }

    public class e implements a {
        public e() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            VastView vastView = VastView.this;
            b0 b0Var = vastView.f59541u;
            if (b0Var.f59563h && b0Var.f59558c == 3) {
                return;
            }
            if (vastView.f59540t.getMaxDurationMillis() > 0 && i11 > VastView.this.f59540t.getMaxDurationMillis() && VastView.this.f59540t.getVideoType() == VideoType.Rewarded) {
                VastView vastView2 = VastView.this;
                vastView2.f59541u.f59564i = true;
                vastView2.setCloseControlsVisible(true);
            }
            VastView vastView3 = VastView.this;
            int i12 = vastView3.f59541u.f59558c;
            if (f10 > i12 * 25.0f) {
                if (i12 == 3) {
                    VastLog.d(vastView3.f59511a, "Video at third quartile: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.thirdQuartile);
                    if (VastView.this.f59543w != null) {
                        VastView.this.f59543w.onVideoThirdQuartile();
                    }
                } else if (i12 == 0) {
                    VastLog.d(vastView3.f59511a, "Video at start: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.start);
                    if (VastView.this.f59543w != null) {
                        VastView.this.f59543w.onVideoStarted(i10, VastView.this.f59541u.f59561f ? 0.0f : 1.0f);
                    }
                } else if (i12 == 1) {
                    VastLog.d(vastView3.f59511a, "Video at first quartile: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.firstQuartile);
                    if (VastView.this.f59543w != null) {
                        VastView.this.f59543w.onVideoFirstQuartile();
                    }
                } else if (i12 == 2) {
                    VastLog.d(vastView3.f59511a, "Video at midpoint: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.midpoint);
                    if (VastView.this.f59543w != null) {
                        VastView.this.f59543w.onVideoMidpoint();
                    }
                }
                VastView.this.f59541u.f59558c++;
            }
        }
    }

    public class f implements a {
        public f() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            if (VastView.this.U.size() == 2 && ((Integer) VastView.this.U.getFirst()).intValue() > ((Integer) VastView.this.U.getLast()).intValue()) {
                VastLog.e(VastView.this.f59511a, "Playing progressing error: seek", new Object[0]);
                VastView.this.U.removeFirst();
            }
            if (VastView.this.U.size() == 19) {
                int iIntValue = ((Integer) VastView.this.U.getFirst()).intValue();
                int iIntValue2 = ((Integer) VastView.this.U.getLast()).intValue();
                VastLog.d(VastView.this.f59511a, "Playing progressing position: last=%d, first=%d)", Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                if (iIntValue2 > iIntValue) {
                    VastView.this.U.removeFirst();
                } else {
                    VastView.l(VastView.this);
                    if (VastView.this.V >= 3) {
                        VastView.this.c(IabError.internal("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                VastView.this.U.addLast(Integer.valueOf(i11));
                if (i10 == 0 || i11 <= 0) {
                    return;
                }
                VastView vastView = VastView.this;
                if (vastView.f59532l != null) {
                    VastLog.d(vastView.f59511a, "Playing progressing percent: %s", Float.valueOf(f10));
                    if (VastView.this.W < f10) {
                        VastView.this.W = f10;
                        int i12 = i10 / 1000;
                        VastView.this.f59532l.changePercentage(f10, Math.min(i12, (int) Math.ceil(i11 / 1000.0f)), i12);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements TextureView.SurfaceTextureListener {
        public g() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            VastLog.d(VastView.this.f59511a, "onSurfaceTextureAvailable", new Object[0]);
            VastView.this.f59517d = new Surface(surfaceTexture);
            VastView.this.G = true;
            if (VastView.this.H) {
                VastView.this.H = false;
                VastView.this.startPlayback("onSurfaceTextureAvailable");
            } else if (VastView.this.isPlaybackStarted()) {
                VastView vastView = VastView.this;
                vastView.f59534n.setSurface(vastView.f59517d);
                VastView.this.r();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VastLog.d(VastView.this.f59511a, "onSurfaceTextureDestroyed", new Object[0]);
            VastView vastView = VastView.this;
            vastView.f59517d = null;
            vastView.G = false;
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.f59534n.setSurface(null);
                VastView.this.l();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            VastLog.d(VastView.this.f59511a, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class h implements MediaPlayer.OnCompletionListener {
        public h() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f59511a, "MediaPlayer - onCompletion", new Object[0]);
            VastView.this.g();
        }
    }

    public class i implements MediaPlayer.OnErrorListener {
        public i() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            VastView.this.c(IabError.internal(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i10), Integer.valueOf(i11))));
            return true;
        }
    }

    public class j implements MediaPlayer.OnPreparedListener {
        public j() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f59511a, "MediaPlayer - onPrepared", new Object[0]);
            VastView vastView = VastView.this;
            if (vastView.f59541u.f59565j) {
                return;
            }
            vastView.c(TrackingEvent.creativeView);
            VastView.this.c(TrackingEvent.fullscreen);
            VastView.this.y();
            VastView.this.setLoadingViewVisibility(false);
            VastView.this.J = true;
            if (!VastView.this.f59541u.f59562g) {
                mediaPlayer.start();
                VastView.this.u();
            }
            VastView.this.x();
            int i10 = VastView.this.f59541u.f59559d;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
                VastView.this.c(TrackingEvent.resume);
                if (VastView.this.f59543w != null) {
                    VastView.this.f59543w.onVideoResumed();
                }
            }
            VastView vastView2 = VastView.this;
            if (!vastView2.f59541u.f59568m) {
                vastView2.l();
            }
            VastView vastView3 = VastView.this;
            if (vastView3.f59541u.f59566k) {
                return;
            }
            vastView3.h();
            if (VastView.this.f59540t.shouldPreloadCompanion()) {
                VastView.this.a(false);
            }
        }
    }

    public class k implements MediaPlayer.OnVideoSizeChangedListener {
        public k() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            VastLog.d(VastView.this.f59511a, "onVideoSizeChanged", new Object[0]);
            VastView.this.C = i10;
            VastView.this.D = i11;
            VastView.this.d();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VastView.this.isPlaybackStarted() || VastView.this.f59541u.f59565j) {
                VastView.this.t();
            }
        }
    }

    public class m implements VastHelper.OnScreenStateChangeListener {
        public m() {
        }

        @Override // io.bidmachine.iab.vast.VastHelper.OnScreenStateChangeListener
        public void onScreenStateChange(boolean z10) {
            VastView.this.z();
        }
    }

    public class n implements View.OnTouchListener {
        public n() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.O.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public class o extends WebChromeClient {
        public o() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            VastLog.d("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    public class p extends WebViewClient {
        public p() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("io.bidmachine", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            VastView.this.o();
            return true;
        }

        public boolean safedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2(WebView p10, WebResourceRequest p11) {
            if (p11.hasGesture()) {
                VastView.this.O.add(p10);
            }
            return shouldOverrideUrlLoading(p10, p11.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("io.bidmachine", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse("io.bidmachine", view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$p;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2 = safedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders("io.bidmachine", webView, webResourceRequest, zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2);
            return zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$p;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb = safedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, str, zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb);
            return zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb;
        }

        public boolean safedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb(WebView p10, String p11) {
            if (!VastView.this.O.contains(p10)) {
                return true;
            }
            VastLog.d(VastView.this.f59511a, "banner clicked", new Object[0]);
            VastView vastView = VastView.this;
            vastView.a(vastView.f59536p, p11);
            return true;
        }
    }

    public class q implements VastVideoLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f59584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CacheControl f59585b;

        public q(boolean z10, CacheControl cacheControl) {
            this.f59584a = z10;
            this.f59585b = cacheControl;
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onError(VastRequest vastRequest, IabError iabError) {
            VastView vastView = VastView.this;
            vastView.b(vastView.f59542v, vastRequest, IabError.placeholder(String.format("Error loading video after showing with %s - %s", this.f59585b, iabError)));
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onSuccess(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.a(vastRequest, vastAd, this.f59584a);
        }
    }

    public class r implements CloseableLayout.OnCloseClickListener {
        public r() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            VastView vastView = VastView.this;
            vastView.b(vastView.f59542v, VastView.this.f59540t, IabError.placeholder("Close button clicked"));
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastRequest vastRequest = VastView.this.f59540t;
            if (vastRequest != null && vastRequest.isR1()) {
                VastView vastView = VastView.this;
                if (!vastView.f59541u.f59567l && vastView.i()) {
                    return;
                }
            }
            if (VastView.this.I) {
                VastView.this.e();
            } else {
                VastView.this.handleBackPress();
            }
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.A();
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.q();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    public class x extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WeakReference f59593f;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
                VastView.this.e();
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.f59515c.setVisibility(8);
            }
        }

        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f59593f = weakReference;
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a0
        public void a(Bitmap bitmap) {
            View.OnClickListener cVar;
            ImageView imageView = (ImageView) this.f59593f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    cVar = new a();
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                    cVar = new c();
                }
                imageView.setOnClickListener(cVar);
            }
        }
    }

    public final class y implements MraidInterstitialListener {
        private y() {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onCalendarEvent(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onClose(MraidInterstitial mraidInterstitial) {
            VastView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onExpired(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoadFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoaded(MraidInterstitial mraidInterstitial) {
            VastView vastView = VastView.this;
            if (vastView.f59541u.f59565j) {
                vastView.setLoadingViewVisibility(false);
                mraidInterstitial.showInView(VastView.this, false);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenPrivacySheet(MraidInterstitial mraidInterstitial, PrivacySheetParams privacySheetParams) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenUrl(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
            iabClickCallback.clickHandled();
            VastView vastView = VastView.this;
            vastView.a(vastView.f59537q, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShowFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShown(MraidInterstitial mraidInterstitial) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onStorePicture(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }

        public /* synthetic */ y(VastView vastView, l lVar) {
            this();
        }
    }

    public static class z extends View.BaseSavedState {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f59599a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        public z(Parcel parcel) {
            super(parcel);
            this.f59599a = (b0) parcel.readParcelable(b0.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f59599a, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VastView(@NonNull Context context) {
        this(context, null);
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public static /* synthetic */ int l(VastView vastView) {
        int i10 = vastView.V;
        vastView.V = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        this.L = z10;
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        IabLoadingWrapper iabLoadingWrapper = this.f59531k;
        if (iabLoadingWrapper == null) {
            return;
        }
        if (!z10) {
            iabLoadingWrapper.setVisibility(8);
        } else {
            iabLoadingWrapper.setVisibility(0);
            this.f59531k.bringToFront();
        }
    }

    private void setMute(boolean z10) {
        this.f59541u.f59561f = z10;
        x();
        c(this.f59541u.f59561f ? TrackingEvent.mute : TrackingEvent.unmute);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        CloseableLayout closeableLayout = this.f59521f;
        VastRequest vastRequest = this.f59540t;
        closeableLayout.setCloseVisibility(z10, vastRequest != null ? vastRequest.getPlaceholderTimeoutSec() : 3.0f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f59519e.bringToFront();
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleCanceled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else {
            r();
        }
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleError() {
        if (isPlaybackStarted()) {
            r();
        } else if (isCompanionShown()) {
            f();
        } else {
            s();
        }
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else if (this.E) {
            r();
        } else {
            l();
        }
    }

    public void destroy() {
        MraidInterstitial mraidInterstitial = this.f59539s;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.f59539s = null;
            this.f59537q = null;
        }
        this.f59542v = null;
        this.f59543w = null;
        this.f59544x = null;
        this.f59545y = null;
        a0 a0Var = this.f59546z;
        if (a0Var != null) {
            a0Var.a();
            this.f59546z = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public boolean display(@Nullable VastRequest vastRequest, @Nullable Boolean bool) {
        return a(vastRequest, bool, false);
    }

    @Nullable
    public VastViewListener getListener() {
        return this.f59542v;
    }

    public void handleBackPress() {
        if (this.f59521f.isVisible() && this.f59521f.canBeClosed()) {
            b(this.f59542v, this.f59540t, IabError.placeholder("OnBackPress event fired"));
            return;
        }
        if (isSkipEnabled()) {
            if (!isCompanionShown()) {
                m();
                return;
            }
            VastRequest vastRequest = this.f59540t;
            if (vastRequest == null || vastRequest.getVideoType() != VideoType.NonRewarded) {
                return;
            }
            if (this.f59537q == null) {
                e();
                return;
            }
            MraidInterstitial mraidInterstitial = this.f59539s;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                f();
            }
        }
    }

    public boolean isCompanionShown() {
        return this.f59541u.f59565j;
    }

    public boolean isFinished() {
        VastRequest vastRequest = this.f59540t;
        return vastRequest != null && ((vastRequest.getCompanionCloseTime() == 0.0f && this.f59541u.f59563h) || (this.f59540t.getCompanionCloseTime() > 0.0f && this.f59541u.f59565j));
    }

    public boolean isFullscreen() {
        return this.f59541u.f59560e;
    }

    public boolean isLoaded() {
        VastRequest vastRequest = this.f59540t;
        return (vastRequest == null || vastRequest.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.f59534n != null && this.J;
    }

    public boolean isSkipEnabled() {
        b0 b0Var = this.f59541u;
        return b0Var.f59564i || b0Var.f59557b == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        VastRequest vastRequest = this.f59540t;
        return vastRequest != null && vastRequest.checkFile();
    }

    public void mute() {
        setMute(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            startPlayback("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            i(this.f59540t.getVastAd().getAppodealExtension());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.getSuperState());
        b0 b0Var = zVar.f59599a;
        if (b0Var != null) {
            this.f59541u = b0Var;
        }
        VastRequest vastRequest = VastRequestManager.get(this.f59541u.f59556a);
        if (vastRequest != null) {
            a(vastRequest, (Boolean) null, true);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.f59541u.f59559d = this.f59534n.getCurrentPosition();
        }
        z zVar = new z(super.onSaveInstanceState());
        zVar.f59599a = this.f59541u;
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        removeCallbacks(this.Q);
        post(this.Q);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        VastLog.d(this.f59511a, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.E = z10;
        z();
    }

    public void pause() {
        setCanAutoResume(false);
        l();
    }

    public void resume() {
        setCanAutoResume(true);
        r();
    }

    public void setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
        this.f59544x = vastAdMeasurer;
    }

    public void setCanAutoResume(boolean z10) {
        this.M = z10;
        this.f59541u.f59568m = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.N = z10;
        this.f59541u.f59569n = z10;
    }

    public void setListener(@Nullable VastViewListener vastViewListener) {
        this.f59542v = vastViewListener;
    }

    public void setPlaybackListener(@Nullable VastPlaybackListener vastPlaybackListener) {
        this.f59543w = vastPlaybackListener;
    }

    public void setPostBannerAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
        this.f59545y = mraidAdMeasurer != null ? new PostBannerAdMeasurer(this, mraidAdMeasurer) : null;
    }

    public void startPlayback(String str) {
        VastLog.d(this.f59511a, "startPlayback: %s", str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.f59541u.f59565j) {
                s();
                return;
            }
            if (!this.E) {
                this.F = true;
                return;
            }
            if (this.G) {
                stopPlayback();
                k();
                d();
                n();
                VastHelper.addScreenStateChangeListener(this, this.f59524g0);
            } else {
                this.H = true;
            }
            if (this.f59515c.getVisibility() != 0) {
                this.f59515c.setVisibility(0);
            }
        }
    }

    public void stopPlayback() {
        this.f59541u.f59562g = false;
        if (this.f59534n != null) {
            VastLog.d(this.f59511a, "stopPlayback", new Object[0]);
            try {
                if (this.f59534n.isPlaying()) {
                    this.f59534n.stop();
                }
                this.f59534n.setSurface(null);
                this.f59534n.release();
            } catch (Exception e10) {
                VastLog.e(this.f59511a, e10);
            }
            this.f59534n = null;
            this.J = false;
            this.K = false;
            c();
            VastHelper.removeScreenStateChangeListener(this);
        }
    }

    public void unmute() {
        setMute(false);
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        setMute(!this.f59541u.f59561f);
    }

    private void g(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getProgressStyle().isVisible().booleanValue()) {
            IabProgressWrapper iabProgressWrapper = this.f59532l;
            if (iabProgressWrapper != null) {
                iabProgressWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59532l == null) {
            IabProgressWrapper iabProgressWrapper2 = new IabProgressWrapper(null);
            this.f59532l = iabProgressWrapper2;
            this.P.add(iabProgressWrapper2);
        }
        this.f59532l.attach(getContext(), this.f59519e, a(vastExtension, vastExtension != null ? vastExtension.getProgressStyle() : null));
        this.f59532l.changePercentage(0.0f, 0, 0);
    }

    private void h(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.getRepeatStyle().isVisible().booleanValue()) {
            IabRepeatWrapper iabRepeatWrapper = this.f59527i;
            if (iabRepeatWrapper != null) {
                iabRepeatWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59527i == null) {
            IabRepeatWrapper iabRepeatWrapper2 = new IabRepeatWrapper(new v());
            this.f59527i = iabRepeatWrapper2;
            this.P.add(iabRepeatWrapper2);
        }
        this.f59527i.attach(getContext(), this.f59519e, a(vastExtension, vastExtension.getRepeatStyle()));
    }

    private void i(VastExtension vastExtension) {
        IabElementStyle iabElementStyleCopyWith;
        IabElementStyle iabElementStyleCopyWith2 = Assets.DEF_VIDEO_STYLE;
        if (vastExtension != null) {
            iabElementStyleCopyWith2 = iabElementStyleCopyWith2.copyWith(vastExtension.getVideoStyle());
        }
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            this.f59515c.setOnClickListener(null);
            this.f59515c.setClickable(false);
        } else {
            this.f59515c.setOnClickListener(new w());
        }
        this.f59515c.setBackgroundColor(iabElementStyleCopyWith2.getFillColor().intValue());
        o();
        if (this.f59536p == null || this.f59541u.f59565j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f59515c.setLayoutParams(layoutParams);
            return;
        }
        this.f59535o = a(getContext(), this.f59536p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f59535o.getLayoutParams());
        if ("inline".equals(iabElementStyleCopyWith2.getStyle())) {
            iabElementStyleCopyWith = Assets.DEF_INLINE_BANNER_STYLE;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (iabElementStyleCopyWith2.getHorizontalPosition().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f59535o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f59535o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (iabElementStyleCopyWith2.getVerticalPosition().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f59535o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f59535o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            IabElementStyle iabElementStyle = Assets.DEF_BANNER_STYLE;
            layoutParams2.addRule(13);
            iabElementStyleCopyWith = iabElementStyle;
        }
        if (vastExtension != null) {
            iabElementStyleCopyWith = iabElementStyleCopyWith.copyWith(vastExtension.getCtaStyle());
        }
        iabElementStyleCopyWith.applyPadding(getContext(), this.f59535o);
        iabElementStyleCopyWith.applyMargin(getContext(), layoutParams3);
        iabElementStyleCopyWith.applyRelativeAlignment(layoutParams3);
        this.f59535o.setBackgroundColor(iabElementStyleCopyWith.getFillColor().intValue());
        iabElementStyleCopyWith2.applyPadding(getContext(), this.f59515c);
        iabElementStyleCopyWith2.applyMargin(getContext(), layoutParams2);
        this.f59515c.setLayoutParams(layoutParams2);
        addView(this.f59535o, layoutParams3);
        a(TrackingEvent.creativeView);
    }

    private void j() {
        VastLog.d(this.f59511a, "finishVideoPlaying", new Object[0]);
        stopPlayback();
        VastRequest vastRequest = this.f59540t;
        if (vastRequest == null || vastRequest.isAutoClose() || !(this.f59540t.getVastAd().getAppodealExtension() == null || this.f59540t.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            e();
            return;
        }
        if (isSkipEnabled()) {
            c(TrackingEvent.close);
        }
        setLoadingViewVisibility(false);
        o();
        s();
    }

    private void k() {
        if (this.f59538r != null) {
            p();
        } else {
            MraidInterstitial mraidInterstitial = this.f59539s;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
                this.f59539s = null;
                this.f59537q = null;
            }
        }
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!isPlaybackStarted() || this.f59541u.f59562g) {
            return;
        }
        VastLog.d(this.f59511a, "pausePlayback", new Object[0]);
        b0 b0Var = this.f59541u;
        b0Var.f59562g = true;
        b0Var.f59559d = this.f59534n.getCurrentPosition();
        this.f59534n.pause();
        c();
        a();
        c(TrackingEvent.pause);
        VastPlaybackListener vastPlaybackListener = this.f59543w;
        if (vastPlaybackListener != null) {
            vastPlaybackListener.onVideoPaused();
        }
    }

    private void m() {
        VastLog.e(this.f59511a, "performVideoCloseClick", new Object[0]);
        stopPlayback();
        if (this.K) {
            e();
            return;
        }
        if (!this.f59541u.f59563h) {
            c(TrackingEvent.skip);
            VastPlaybackListener vastPlaybackListener = this.f59543w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoSkipped();
            }
        }
        VastRequest vastRequest = this.f59540t;
        if (vastRequest != null && vastRequest.getVideoType() == VideoType.Rewarded) {
            VastPlaybackListener vastPlaybackListener2 = this.f59543w;
            if (vastPlaybackListener2 != null) {
                vastPlaybackListener2.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.f59542v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.f59540t);
            }
        }
        j();
    }

    private void n() {
        try {
            if (!isLoaded() || this.f59541u.f59565j) {
                return;
            }
            if (this.f59534n == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f59534n = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.f59534n.setAudioStreamType(3);
                this.f59534n.setOnCompletionListener(this.f59516c0);
                this.f59534n.setOnErrorListener(this.f59518d0);
                this.f59534n.setOnPreparedListener(this.f59520e0);
                this.f59534n.setOnVideoSizeChangedListener(this.f59522f0);
            }
            this.f59534n.setSurface(this.f59517d);
            Uri fileUri = isVideoFileLoaded() ? this.f59540t.getFileUri() : null;
            if (fileUri == null) {
                setLoadingViewVisibility(true);
                this.f59534n.setDataSource(this.f59540t.getVastAd().getPickedMediaFileTag().getText());
            } else {
                setLoadingViewVisibility(false);
                this.f59534n.setDataSource(getContext(), fileUri);
            }
            this.f59534n.prepareAsync();
        } catch (Exception e10) {
            VastLog.e(this.f59511a, e10);
            c(IabError.throwable("Exception during preparing MediaPlayer", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        View view = this.f59535o;
        if (view != null) {
            Utils.removeFromParent(view);
            this.f59535o = null;
        }
    }

    private void p() {
        if (this.f59538r != null) {
            b();
            removeView(this.f59538r);
            this.f59538r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (isLoaded()) {
            b0 b0Var = this.f59541u;
            b0Var.f59565j = false;
            b0Var.f59559d = 0;
            k();
            i(this.f59540t.getVastAd().getAppodealExtension());
            startPlayback("restartPlayback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        b0 b0Var = this.f59541u;
        if (!b0Var.f59568m) {
            if (isPlaybackStarted()) {
                this.f59534n.start();
                this.f59534n.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f59541u.f59565j) {
                    return;
                }
                startPlayback("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (b0Var.f59562g && this.E) {
            VastLog.d(this.f59511a, "resumePlayback", new Object[0]);
            this.f59541u.f59562g = false;
            if (!isPlaybackStarted()) {
                if (this.f59541u.f59565j) {
                    return;
                }
                startPlayback("resumePlayback");
                return;
            }
            this.f59534n.start();
            y();
            u();
            setLoadingViewVisibility(false);
            c(TrackingEvent.resume);
            VastPlaybackListener vastPlaybackListener = this.f59543w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoResumed();
            }
        }
    }

    private void s() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).toggleShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        v();
        c();
        this.R.run();
    }

    private void v() {
        this.U.clear();
        this.V = 0;
        this.W = 0.0f;
    }

    private void w() {
        boolean z10;
        boolean z11 = true;
        if (!this.L) {
            z10 = false;
            z11 = false;
        } else if (isSkipEnabled() || this.I) {
            z10 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        IabCloseWrapper iabCloseWrapper = this.f59523g;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.setVisibility(z11 ? 0 : 8);
        }
        IabCountDownWrapper iabCountDownWrapper = this.f59525h;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        IabMuteWrapper iabMuteWrapper;
        float f10;
        VastPlaybackListener vastPlaybackListener;
        if (!isPlaybackStarted() || (iabMuteWrapper = this.f59529j) == null) {
            return;
        }
        iabMuteWrapper.setMuted(this.f59541u.f59561f);
        if (this.f59541u.f59561f) {
            f10 = 0.0f;
            this.f59534n.setVolume(0.0f, 0.0f);
            vastPlaybackListener = this.f59543w;
            if (vastPlaybackListener == null) {
                return;
            }
        } else {
            f10 = 1.0f;
            this.f59534n.setVolume(1.0f, 1.0f);
            vastPlaybackListener = this.f59543w;
            if (vastPlaybackListener == null) {
                return;
            }
        }
        vastPlaybackListener.onVideoVolumeChanged(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoaded()) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (!this.E || !VastHelper.isScreenOn(getContext())) {
            l();
            return;
        }
        if (this.F) {
            this.F = false;
            startPlayback("onWindowFocusChanged");
        } else if (this.f59541u.f59565j) {
            setLoadingViewVisibility(false);
        } else {
            r();
        }
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59511a = "VastView-" + Integer.toHexString(hashCode());
        this.f59541u = new b0();
        this.A = 0;
        this.B = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new b();
        this.R = new c();
        this.S = new d();
        this.T = new e();
        this.U = new LinkedList();
        this.V = 0;
        this.W = 0.0f;
        this.f59512a0 = new f();
        g gVar = new g();
        this.f59514b0 = gVar;
        this.f59516c0 = new h();
        this.f59518d0 = new i();
        this.f59520e0 = new j();
        this.f59522f0 = new k();
        this.f59524g0 = new m();
        this.f59526h0 = new n();
        this.f59528i0 = new o();
        this.f59530j0 = new p();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setOnClickListener(new l());
        IabVideoTexture iabVideoTexture = new IabVideoTexture(context);
        this.f59513b = iabVideoTexture;
        iabVideoTexture.setSurfaceTextureListener(gVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59515c = frameLayout;
        frameLayout.addView(this.f59513b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f59515c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59519e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f59519e, new ViewGroup.LayoutParams(-1, -1));
        CloseableLayout closeableLayout = new CloseableLayout(getContext());
        this.f59521f = closeableLayout;
        closeableLayout.setBackgroundColor(0);
        addView(this.f59521f, new ViewGroup.LayoutParams(-1, -1));
    }

    private void d(VastExtension vastExtension) {
        if (vastExtension == null || vastExtension.getLoadingStyle().isVisible().booleanValue()) {
            if (this.f59531k == null) {
                this.f59531k = new IabLoadingWrapper(null);
            }
            this.f59531k.attach(getContext(), this, a(vastExtension, vastExtension != null ? vastExtension.getLoadingStyle() : null));
        } else {
            IabLoadingWrapper iabLoadingWrapper = this.f59531k;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.detach();
            }
        }
    }

    private void e(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getMuteStyle().isVisible().booleanValue()) {
            IabMuteWrapper iabMuteWrapper = this.f59529j;
            if (iabMuteWrapper != null) {
                iabMuteWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59529j == null) {
            IabMuteWrapper iabMuteWrapper2 = new IabMuteWrapper(new u());
            this.f59529j = iabMuteWrapper2;
            this.P.add(iabMuteWrapper2);
        }
        this.f59529j.attach(getContext(), this.f59519e, a(vastExtension, vastExtension != null ? vastExtension.getMuteStyle() : null));
    }

    private void f(VastExtension vastExtension) {
        this.f59521f.setCountDownStyle(a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
        if (isFullscreen()) {
            this.f59521f.setCloseStyle(a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
            this.f59521f.setCloseClickListener(new r());
        }
        d(vastExtension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        VastLog.d(this.f59511a, "handleComplete", new Object[0]);
        b0 b0Var = this.f59541u;
        b0Var.f59564i = true;
        if (!this.K && !b0Var.f59563h) {
            b0Var.f59563h = true;
            VastPlaybackListener vastPlaybackListener = this.f59543w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.f59542v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.f59540t);
            }
            VastRequest vastRequest = this.f59540t;
            if (vastRequest != null && vastRequest.isR2() && !this.f59541u.f59567l) {
                i();
            }
            c(TrackingEvent.complete);
        }
        if (this.f59541u.f59563h) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        VastLog.d(this.f59511a, "handleImpressions", new Object[0]);
        VastRequest vastRequest = this.f59540t;
        if (vastRequest != null) {
            this.f59541u.f59566k = true;
            a(vastRequest.getVastAd().getImpressionUrlList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        VastLog.e(this.f59511a, "handleInfoClicked", new Object[0]);
        VastRequest vastRequest = this.f59540t;
        if (vastRequest != null) {
            return a(vastRequest.getVastAd().getClickTrackingUrlList(), this.f59540t.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    private void c() {
        removeCallbacks(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i10;
        int i11 = this.C;
        if (i11 == 0 || (i10 = this.D) == 0) {
            VastLog.d(this.f59511a, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f59513b.setVideoSize(i11, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        VastRequest vastRequest;
        VastLog.e(this.f59511a, "handleClose", new Object[0]);
        c(TrackingEvent.close);
        VastViewListener vastViewListener = this.f59542v;
        if (vastViewListener == null || (vastRequest = this.f59540t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        VastRequest vastRequest;
        VastLog.e(this.f59511a, "handleCompanionClose", new Object[0]);
        b(TrackingEvent.close);
        VastViewListener vastViewListener = this.f59542v;
        if (vastViewListener == null || (vastRequest = this.f59540t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void b() {
        a0 a0Var = this.f59546z;
        if (a0Var != null) {
            a0Var.a();
            this.f59546z = null;
        }
    }

    private void c(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            return;
        }
        this.P.clear();
    }

    private void b(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCountDownStyle().isVisible().booleanValue()) {
            IabCountDownWrapper iabCountDownWrapper = this.f59525h;
            if (iabCountDownWrapper != null) {
                iabCountDownWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59525h == null) {
            IabCountDownWrapper iabCountDownWrapper2 = new IabCountDownWrapper(null);
            this.f59525h = iabCountDownWrapper2;
            this.P.add(iabCountDownWrapper2);
        }
        this.f59525h.attach(getContext(), this.f59519e, a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        VastLog.e(this.f59511a, "handlePlaybackError - %s", iabError);
        this.K = true;
        a(VastSpecError.SHOWING);
        a(this.f59542v, this.f59540t, iabError);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        VastRequest vastRequest;
        VastLog.e(this.f59511a, "handleCompanionShowError - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        a(this.f59542v, this.f59540t, iabError);
        if (this.f59537q != null) {
            k();
            b(true);
            return;
        }
        VastViewListener vastViewListener = this.f59542v;
        if (vastViewListener == null || (vastRequest = this.f59540t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(TrackingEvent trackingEvent) {
        VastLog.d(this.f59511a, "Track Event: %s", trackingEvent);
        VastRequest vastRequest = this.f59540t;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        if (vastAd != null) {
            a(vastAd.getTrackingEventListMap(), trackingEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        a(vastViewListener, vastRequest, iabError);
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, false);
    }

    private void b(boolean z10) {
        VastViewListener vastViewListener;
        if (!isLoaded() || this.I) {
            return;
        }
        this.I = true;
        this.f59541u.f59565j = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.B;
        if (i10 != i11 && (vastViewListener = this.f59542v) != null) {
            vastViewListener.onOrientationRequested(this, this.f59540t, i11);
        }
        IabProgressWrapper iabProgressWrapper = this.f59532l;
        if (iabProgressWrapper != null) {
            iabProgressWrapper.detach();
        }
        IabMuteWrapper iabMuteWrapper = this.f59529j;
        if (iabMuteWrapper != null) {
            iabMuteWrapper.detach();
        }
        IabRepeatWrapper iabRepeatWrapper = this.f59527i;
        if (iabRepeatWrapper != null) {
            iabRepeatWrapper.detach();
        }
        a();
        if (this.f59541u.f59569n) {
            if (this.f59538r == null) {
                this.f59538r = a(getContext());
            }
            this.f59538r.setImageBitmap(this.f59513b.getBitmap());
            addView(this.f59538r, new FrameLayout.LayoutParams(-1, -1));
            this.f59519e.bringToFront();
            return;
        }
        a(z10);
        if (this.f59537q == null) {
            setCloseControlsVisible(true);
            if (this.f59538r != null) {
                this.f59546z = new x(getContext(), this.f59540t.getFileUri(), this.f59540t.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.f59538r));
            }
            addView(this.f59538r, new FrameLayout.LayoutParams(-1, -1));
        } else {
            setCloseControlsVisible(false);
            this.f59515c.setVisibility(8);
            o();
            IabCtaWrapper iabCtaWrapper = this.f59533m;
            if (iabCtaWrapper != null) {
                iabCtaWrapper.setVisibility(8);
            }
            MraidInterstitial mraidInterstitial = this.f59539s;
            if (mraidInterstitial == null) {
                setLoadingViewVisibility(false);
                b(IabError.internal("CompanionInterstitial is null"));
            } else if (mraidInterstitial.isReady()) {
                setLoadingViewVisibility(false);
                this.f59539s.showInView(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        stopPlayback();
        this.f59519e.bringToFront();
        b(TrackingEvent.creativeView);
    }

    private void b(TrackingEvent trackingEvent) {
        VastLog.d(this.f59511a, "Track Companion Event: %s", trackingEvent);
        CompanionTag companionTag = this.f59537q;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(VastRequest vastRequest) {
        return vastRequest.getVideoType() != VideoType.Rewarded || vastRequest.getMaxDurationMillis() <= 0;
    }

    private void a() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).cancelHide();
        }
    }

    private void a(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCloseStyle().isVisible().booleanValue()) {
            IabCloseWrapper iabCloseWrapper = this.f59523g;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59523g == null) {
            IabCloseWrapper iabCloseWrapper2 = new IabCloseWrapper(new t());
            this.f59523g = iabCloseWrapper2;
            this.P.add(iabCloseWrapper2);
        }
        this.f59523g.attach(getContext(), this.f59519e, a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
    }

    private void a(VastExtension vastExtension, boolean z10) {
        if (z10 || !(vastExtension == null || vastExtension.getCtaStyle().isVisible().booleanValue())) {
            IabCtaWrapper iabCtaWrapper = this.f59533m;
            if (iabCtaWrapper != null) {
                iabCtaWrapper.detach();
                return;
            }
            return;
        }
        if (this.f59533m == null) {
            IabCtaWrapper iabCtaWrapper2 = new IabCtaWrapper(new s());
            this.f59533m = iabCtaWrapper2;
            this.P.add(iabCtaWrapper2);
        }
        this.f59533m.attach(getContext(), this.f59519e, a(vastExtension, vastExtension != null ? vastExtension.getCtaStyle() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, VastAd vastAd, boolean z10) {
        AppodealExtensionTag appodealExtension = vastAd.getAppodealExtension();
        this.A = vastRequest.getPreferredVideoOrientation();
        this.f59536p = (appodealExtension == null || !appodealExtension.getCtaStyle().isVisible().booleanValue()) ? null : appodealExtension.getCompanionTag();
        if (this.f59536p == null) {
            this.f59536p = vastAd.getBanner(getContext());
        }
        i(appodealExtension);
        a(appodealExtension, this.f59535o != null);
        a(appodealExtension);
        b(appodealExtension);
        e(appodealExtension);
        h(appodealExtension);
        g(appodealExtension);
        d(appodealExtension);
        c(appodealExtension);
        setLoadingViewVisibility(false);
        VastAdMeasurer vastAdMeasurer = this.f59544x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.registerAdContainer(this);
            this.f59544x.registerAdView(this.f59513b);
        }
        VastViewListener vastViewListener = this.f59542v;
        if (vastViewListener != null) {
            vastViewListener.onOrientationRequested(this, vastRequest, this.f59541u.f59565j ? this.B : this.A);
        }
        if (!z10) {
            this.f59541u.f59556a = vastRequest.getId();
            b0 b0Var = this.f59541u;
            b0Var.f59568m = this.M;
            b0Var.f59569n = this.N;
            if (appodealExtension != null) {
                b0Var.f59561f = appodealExtension.isMuted();
            }
            this.f59541u.f59557b = vastRequest.getFusedVideoCloseTimeSec();
            VastAdMeasurer vastAdMeasurer2 = this.f59544x;
            if (vastAdMeasurer2 != null) {
                vastAdMeasurer2.onAdViewReady(this.f59513b);
                this.f59544x.onAdShown();
            }
            VastViewListener vastViewListener2 = this.f59542v;
            if (vastViewListener2 != null) {
                vastViewListener2.onShown(this, vastRequest);
            }
        }
        setCloseControlsVisible(a(vastRequest));
        startPlayback("load (restoring: " + z10 + ")");
    }

    private View a(Context context, CompanionTag companionTag) {
        float width;
        float height;
        boolean zIsTablet = Utils.isTablet(context);
        if (companionTag.getWidth() > 0) {
            width = companionTag.getWidth();
        } else {
            width = zIsTablet ? 728.0f : 320.0f;
        }
        int iDpToPx = Utils.dpToPx(context, width);
        if (companionTag.getHeight() > 0) {
            height = companionTag.getHeight();
        } else {
            height = zIsTablet ? 90.0f : 50.0f;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, Utils.dpToPx(context, height));
        WebView webView = new WebView(context);
        webView.setId(Utils.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f59526h0);
        webView.setWebViewClient(this.f59530j0);
        webView.setWebChromeClient(this.f59528i0);
        String html = companionTag.getHtml();
        if (html != null) {
            webView.loadDataWithBaseURL("", html, "text/html", G5.N, null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(Utils.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        IabError iabErrorBadContent;
        if (isLoaded()) {
            l lVar = null;
            if (!z10) {
                CompanionTag companion = this.f59540t.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight());
                if (this.f59537q != companion) {
                    this.B = (companion == null || !this.f59540t.shouldUseScreenSizeForCompanionOrientation()) ? this.A : Utils.orientationBySize(companion.getWidth(), companion.getHeight());
                    this.f59537q = companion;
                    MraidInterstitial mraidInterstitial = this.f59539s;
                    if (mraidInterstitial != null) {
                        mraidInterstitial.destroy();
                        this.f59539s = null;
                    }
                }
            }
            if (this.f59537q == null) {
                if (this.f59538r == null) {
                    this.f59538r = a(getContext());
                    return;
                }
                return;
            }
            if (this.f59539s == null) {
                p();
                String htmlForMraid = this.f59537q.getHtmlForMraid();
                if (htmlForMraid != null) {
                    AppodealExtensionTag appodealExtension = this.f59540t.getVastAd().getAppodealExtension();
                    PostBannerTag postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                    MraidInterstitial.Builder listener = MraidInterstitial.newBuilder().setBaseUrl(null).setCacheControl(CacheControl.FullLoad).setCloseTime(this.f59540t.getCompanionCloseTime()).forceUseNativeCloseButton(this.f59540t.isForceUseNativeCloseTime()).setIsTag(false).setAdMeasurer(this.f59545y).setListener(new y(this, lVar));
                    if (postBannerTag != null) {
                        listener.setCloseStyle(postBannerTag.getCloseStyle());
                        listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                        listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                        listener.setProgressStyle(postBannerTag.getProgressStyle());
                        listener.setDurationSec(postBannerTag.getDurationSec());
                        listener.setProductLink(postBannerTag.getProductLink());
                        if (postBannerTag.isForceUseNativeClose()) {
                            listener.forceUseNativeCloseButton(true);
                        }
                        listener.setR1(postBannerTag.isR1());
                        listener.setR2(postBannerTag.isR2());
                    }
                    try {
                        MraidInterstitial mraidInterstitialBuild = listener.build(getContext());
                        this.f59539s = mraidInterstitialBuild;
                        mraidInterstitialBuild.load(htmlForMraid);
                        return;
                    } catch (Throwable th2) {
                        iabErrorBadContent = IabError.throwable("Exception during companion creation", th2);
                    }
                } else {
                    iabErrorBadContent = IabError.badContent("Companion creative is null");
                }
                b(iabErrorBadContent);
            }
        }
    }

    private ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    private void a(List list) {
        if (isLoaded()) {
            if (list == null || list.isEmpty()) {
                VastLog.d(this.f59511a, "\turl list is null", new Object[0]);
            } else {
                this.f59540t.fireUrls(list, null);
            }
        }
    }

    private void a(Map map, TrackingEvent trackingEvent) {
        if (map == null || map.isEmpty()) {
            VastLog.d(this.f59511a, "Processing Event - fail: %s (tracking event map is null or empty)", trackingEvent);
        } else {
            a((List) map.get(trackingEvent));
        }
    }

    private boolean a(VastRequest vastRequest, Boolean bool, boolean z10) {
        stopPlayback();
        if (!z10) {
            this.f59541u = new b0();
        }
        if (bool != null) {
            this.f59541u.f59560e = bool.booleanValue();
        }
        this.f59540t = vastRequest;
        if (vastRequest == null) {
            e();
            VastLog.e(this.f59511a, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAd = vastRequest.getVastAd();
        if (vastAd == null) {
            e();
            VastLog.e(this.f59511a, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        CacheControl cacheControl = vastRequest.getCacheControl();
        if (cacheControl == CacheControl.PartialLoad && !isVideoFileLoaded()) {
            a(vastRequest, vastAd, cacheControl, z10);
            return true;
        }
        if (cacheControl != CacheControl.Stream || isVideoFileLoaded()) {
            a(vastRequest, vastAd, z10);
            return true;
        }
        a(vastRequest, vastAd, cacheControl, z10);
        vastRequest.performCache(getContext().getApplicationContext(), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        VastLog.e(this.f59511a, "handleCompanionExpired - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        if (this.f59537q != null) {
            k();
            a(true);
        }
    }

    private void a(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onShowFailed(this, vastRequest, iabError);
    }

    private IabElementStyle a(VastExtension vastExtension, IabElementStyle iabElementStyle) {
        if (vastExtension == null) {
            return null;
        }
        if (iabElementStyle == null) {
            IabElementStyle iabElementStyle2 = new IabElementStyle();
            iabElementStyle2.setStrokeColor(vastExtension.getAssetsColor());
            iabElementStyle2.setFillColor(vastExtension.getAssetsBackgroundColor());
            return iabElementStyle2;
        }
        if (!iabElementStyle.hasStrokeColor()) {
            iabElementStyle.setStrokeColor(vastExtension.getAssetsColor());
        }
        if (!iabElementStyle.hasFillColor()) {
            iabElementStyle.setFillColor(vastExtension.getAssetsBackgroundColor());
        }
        return iabElementStyle;
    }

    private void a(VastRequest vastRequest, VastAd vastAd, CacheControl cacheControl, boolean z10) {
        vastRequest.setVastVideoLoadedListener(new q(z10, cacheControl));
        f(vastAd.getAppodealExtension());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(CompanionTag companionTag, String str) {
        VastRequest vastRequest = this.f59540t;
        ArrayList arrayList = null;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = companionTag != null ? companionTag.getCompanionClickTrackingList() : null;
        if (wrapperCompanionClickTrackingUrlList != null || companionClickTrackingList != null) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        return a(arrayList, str);
    }

    private boolean a(List list, String str) {
        VastLog.d(this.f59511a, "processClickThroughEvent: %s", str);
        this.f59541u.f59567l = true;
        if (str == null) {
            return false;
        }
        a(list);
        VastAdMeasurer vastAdMeasurer = this.f59544x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.onAdClicked();
        }
        if (this.f59542v != null && this.f59540t != null) {
            l();
            setLoadingViewVisibility(true);
            this.f59542v.onClick(this, this.f59540t, this, str);
        }
        return true;
    }

    private void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.f59540t;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }

    private void a(TrackingEvent trackingEvent) {
        VastLog.d(this.f59511a, "Track Banner Event: %s", trackingEvent);
        CompanionTag companionTag = this.f59536p;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }
}
