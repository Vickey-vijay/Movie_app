package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC2995l1;
import com.inmobi.media.C2717a2;
import com.inmobi.media.C2769c2;
import com.inmobi.media.C2820e2;
import com.inmobi.media.C3053n9;
import com.inmobi.media.F3;
import com.inmobi.media.HandlerC2795d2;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.Oj;
import com.inmobi.media.U8;
import com.inmobi.media.V1;
import com.inmobi.media.V8;
import com.inmobi.media.Y1;
import com.inmobi.media.Z1;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.V2;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Map;
import lk.x;
import mj.r;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiBanner extends RelativeLayout {
    public static final U8 Companion = new U8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y1 f22283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioListener f22284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V1 f22285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2820e2 f22286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HandlerC2795d2 f22290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnimationType f22293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f22295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Jg f22296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f22297o;

    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS;

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());

        public static uj.a<AnimationType> getEntries() {
            return $ENTRIES;
        }
    }

    public static final class a extends C2769c2 {
        @Override // com.inmobi.media.C2769c2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner inMobiBanner) {
            super(inMobiBanner);
            p.j(inMobiBanner, "banner");
        }

        @Override // com.inmobi.media.C2769c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            p.j(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C2820e2 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.o();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    p.i(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }

        @Override // com.inmobi.media.C2769c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            p.j(inMobiAdRequestStatus, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(inMobiBanner, inMobiAdRequestStatus);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(attributeSet, "attributeSet");
        this.f22285c = V1.f23665d;
        this.f22287e = new a(this);
        this.f22289g = true;
        this.f22293k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.f22296n = jg2;
        this.f22297o = new d(this);
        if (!Ji.d()) {
            p.i("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.f22295m = new WeakReference(context);
        }
        this.f22286d = new C2820e2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", V2.f27785b);
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f22935a = jA;
        }
        Context context2 = getContext();
        p.i(context2, "getContext(...)");
        a(this, context2);
        C2820e2 c2820e2 = this.f22286d;
        this.f22288f = c2820e2 != null ? c2820e2.k() : 0;
        this.f22290h = new HandlerC2795d2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = p.l(attributeValue2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i10, length + 1).toString()));
            } catch (NumberFormatException unused) {
                p.i("InMobiBanner", "TAG");
                Kb.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final r a(InMobiBanner inMobiBanner, byte[] bArr) {
        C3053n9 c3053n9;
        C2820e2 c2820e2 = inMobiBanner.f22286d;
        if (c2820e2 != null && (c3053n9 = c2820e2.f22542f) != null) {
            p.i("InMobiBanner", "TAG");
            c3053n9.c("InMobiBanner", "load with response");
        }
        C2820e2 c2820e3 = inMobiBanner.f22286d;
        if (c2820e3 != null) {
            c2820e3.a(bArr, inMobiBanner.f22287e);
        }
        return r.f64562a;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final boolean b() {
        C3053n9 c3053n9;
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 == null || (c3053n9 = c2820e2.f22542f) == null) {
            return true;
        }
        p.i("InMobiBanner", "TAG");
        c3053n9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void load(final byte[] bArr) {
        b();
        Jg jg2 = this.f22296n;
        jg2.getClass();
        p.j("AB", "<set-?>");
        jg2.f22941g = "AB";
        if (getLayoutParams() != null) {
            this.f22291i = F3.b(getLayoutParams().width / J5.b());
            this.f22292j = F3.b(getLayoutParams().height / J5.b());
        }
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 == null || c2820e2.f24284j == null || c2820e2.f24285k == null || c2820e2.f22537a == 0) {
            Context context = getContext();
            p.i(context, "getContext(...)");
            a(this, context);
        }
        C2820e2 c2820e3 = this.f22286d;
        if (c2820e3 != null) {
            c2820e3.g();
        }
        a("load(byte[])", new bk.a() { // from class: z6.d
            @Override // bk.a
            public final Object invoke() {
                return InMobiBanner.a(this.f86321b, bArr);
            }
        });
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final boolean access$hasValidSize(InMobiBanner inMobiBanner) {
        return inMobiBanner.f22291i > 0 && inMobiBanner.f22292j > 0;
    }

    private final String getFrameSizeString() {
        return this.f22291i + VastAttributes.HORIZONTAL_POSITION + this.f22292j;
    }

    public final void disableHardwareAcceleration() {
        this.f22296n.f22938d = true;
    }

    public final V1 getAudioStatusInternal$media_release() {
        return this.f22285c;
    }

    public final C2820e2 getMAdManager$media_release() {
        return this.f22286d;
    }

    public final AudioListener getMAudioListener$media_release() {
        return this.f22284b;
    }

    public final Y1 getMPubListener$media_release() {
        return this.f22283a;
    }

    public final Jg getMPubSettings$media_release() {
        return this.f22296n;
    }

    public final long getPlacementId() {
        return this.f22296n.f22935a;
    }

    public final PreloadManager getPreloadManager() {
        return this.f22297o;
    }

    public final void getSignals() {
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            c2820e2.a(this.f22287e);
        }
    }

    public final boolean isAudioAd() {
        C2717a2 c2717a2;
        Ad adB;
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 == null || (c2717a2 = c2820e2.f24286l) == null || (adB = c2717a2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = adB.getMetaInfo();
        return p.e(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = "loss notification failed to trigger";
        if (this.f22286d == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            r rVar = r.f64562a;
        }
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            if (c2820e2.f() != null) {
                AbstractC2995l1 abstractC2995l1F = c2820e2.f();
                strA = abstractC2995l1F != null ? abstractC2995l1F.a(i10, d10) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = "win notification failed to trigger";
        if (this.f22286d == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            r rVar = r.f64562a;
        }
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            if (c2820e2.f() != null) {
                AbstractC2995l1 abstractC2995l1F = c2820e2.f();
                strA = abstractC2995l1F != null ? abstractC2995l1F.a(d10) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        C3053n9 c3053n9;
        p.j(view, "changedView");
        try {
            super.onVisibilityChanged(view, i10);
            if (i10 == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 == null || (c3053n9 = c2820e2.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        C3053n9 c3053n9;
        C2820e2 c2820e2;
        try {
            if (this.f22295m != null || (c2820e2 = this.f22286d) == null) {
                return;
            }
            c2820e2.m();
        } catch (Exception e10) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 == null || (c3053n9 = c2820e3.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f22287e, "NonAB", true);
    }

    public final void resume() {
        C3053n9 c3053n9;
        C2820e2 c2820e2;
        try {
            if (this.f22295m != null || (c2820e2 = this.f22286d) == null) {
                return;
            }
            c2820e2.p();
        } catch (Exception e10) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 == null || (c3053n9 = c2820e3.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        p.j(animationType, "animationType");
        this.f22293k = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        AudioStatus audioStatus;
        p.j(audioListener, "audioListener");
        this.f22284b = audioListener;
        V1 v10 = this.f22285c;
        if (v10 == V1.f23665d || audioListener == null) {
            return;
        }
        V1.f23663b.getClass();
        p.j(v10, "item");
        int iOrdinal = v10.ordinal();
        if (iOrdinal != 1) {
            audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
        } else {
            audioStatus = AudioStatus.PLAYING;
        }
        audioListener.onAudioStatusChanged(this, audioStatus);
    }

    public final void setAudioStatusInternal$media_release(V1 v10) {
        p.j(v10, "<set-?>");
        this.f22285c = v10;
    }

    public final void setBannerSize(@IntRange(from = 1) int i10, @IntRange(from = 1) int i11) {
        this.f22291i = i10;
        this.f22292j = i11;
    }

    public final void setContentUrl(String str) {
        p.j(str, "contentUrl");
        this.f22296n.f22939e = str;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        C3053n9 c3053n9;
        try {
            if (this.f22289g == z10) {
                return;
            }
            this.f22289g = z10;
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 == null || (c3053n9 = c2820e2.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f23020b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f23019a = str2;
            }
        }
        this.f22296n.f22937c = map;
    }

    public final void setKeywords(String str) {
        this.f22296n.f22936b = str;
    }

    public final void setListener(BannerAdEventListener bannerAdEventListener) {
        p.j(bannerAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f22283a = new Z1(bannerAdEventListener);
    }

    public final void setMAdManager$media_release(C2820e2 c2820e2) {
        this.f22286d = c2820e2;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.f22284b = audioListener;
    }

    public final void setMPubListener$media_release(Y1 y10) {
        this.f22283a = y10;
    }

    public final void setRefreshInterval(int i10) {
        C3053n9 c3053n9;
        try {
            Jg jg2 = this.f22296n;
            jg2.getClass();
            p.j("NonAB", "<set-?>");
            jg2.f22941g = "NonAB";
            Context context = getContext();
            p.i(context, "getContext(...)");
            a(this, context);
            C2820e2 c2820e2 = this.f22286d;
            this.f22288f = c2820e2 != null ? c2820e2.a(i10, this.f22288f) : 0;
        } catch (Exception e10) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 == null || (c3053n9 = c2820e3.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    @UiThread
    public final void swapAdUnitsAndDisplayAd$media_release() {
        C3053n9 c3053n9;
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            c2820e2.s();
        }
        try {
            Animation animationA = b.a(this.f22293k, getWidth(), getHeight());
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 != null) {
                c2820e3.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            C2820e2 c2820e4 = this.f22286d;
            if (c2820e4 == null || (c3053n9 = c2820e4.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }

    @UiThread
    public final void destroy() {
        a();
        removeAllViews();
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            c2820e2.j();
        }
        this.f22283a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3053n9 c3053n9;
        boolean z10;
        try {
            super.onAttachedToWindow();
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null) {
                c2820e2.n();
            }
            if (getLayoutParams() != null) {
                this.f22291i = F3.b(getLayoutParams().width / J5.b());
                this.f22292j = F3.b(getLayoutParams().height / J5.b());
            }
            if (this.f22291i > 0 && this.f22292j > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l10 = J5.f22893a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                p.i(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 != null && (c3053n9 = c2820e3.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3053n9 c3053n9;
        try {
            super.onDetachedFromWindow();
            a();
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null) {
                c2820e2.t();
            }
        } catch (Exception e10) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 != null && (c3053n9 = c2820e3.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        C3053n9 c3053n9;
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null && (c3053n9 = c2820e2.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
            }
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC2795d2 handlerC2795d2;
        if (isShown() && hasWindowFocus()) {
            HandlerC2795d2 handlerC2795d3 = this.f22290h;
            if (handlerC2795d3 != null) {
                handlerC2795d3.removeMessages(1);
            }
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null && c2820e2.i() && this.f22289g && (handlerC2795d2 = this.f22290h) != null) {
                handlerC2795d2.sendEmptyMessageDelayed(1, this.f22288f * 1000);
            }
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        p.j(watermarkData, "watermarkData");
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null) {
            c2820e2.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new V8(this));
    }

    public final boolean b(String str) {
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        if (this.f22291i > 0 && this.f22292j > 0) {
            return true;
        }
        if (getLayoutParams() == null) {
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null && (c3053n10 = c2820e2.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n10.b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f22291i = F3.b(getLayoutParams().width / J5.b());
            this.f22292j = F3.b(getLayoutParams().height / J5.b());
            return true;
        }
        C2820e2 c2820e3 = this.f22286d;
        if (c2820e3 != null && (c3053n9 = c2820e3.f22542f) != null) {
            p.i("InMobiBanner", "TAG");
            c3053n9.b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before " + str);
        }
        return false;
    }

    public final void a(final PublisherCallbacks publisherCallbacks, String str, final boolean z10) {
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        C3053n9 c3053n11;
        C3053n9 c3053n12;
        C3053n9 c3053n13;
        try {
            Jg jg2 = this.f22296n;
            jg2.getClass();
            p.j(str, "<set-?>");
            jg2.f22941g = str;
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null && c2820e2.l()) {
                C2820e2 c2820e3 = this.f22286d;
                if (c2820e3 != null) {
                    c2820e3.g();
                }
                C2820e2 c2820e4 = this.f22286d;
                if (c2820e4 != null && (c3053n13 = c2820e4.f22542f) != null) {
                    p.i("InMobiBanner", "TAG");
                    c3053n13.a("InMobiBanner", "load called - placementType - " + str + Z7.f27998r + this);
                }
                C2820e2 c2820e5 = this.f22286d;
                if (c2820e5 != null && (c3053n12 = c2820e5.f22542f) != null) {
                    p.i("InMobiBanner", "TAG");
                    c3053n12.b("InMobiBanner", "load already in progress");
                }
                C2820e2 c2820e6 = this.f22286d;
                if (c2820e6 != null) {
                    c2820e6.b((short) 2169);
                }
                Y1 y10 = this.f22283a;
                if (y10 != null) {
                    y10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C2820e2 c2820e7 = this.f22286d;
                if (c2820e7 != null && (c3053n11 = c2820e7.f22542f) != null) {
                    p.i("InMobiBanner", "TAG");
                    c3053n11.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            p.i(context, "getContext(...)");
            a(this, context);
            C2820e2 c2820e8 = this.f22286d;
            if (c2820e8 != null) {
                c2820e8.g();
            }
            C2820e2 c2820e9 = this.f22286d;
            if (c2820e9 != null && (c3053n10 = c2820e9.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n10.a("InMobiBanner", "load called - placementType - " + str + Z7.f27998r + this);
            }
            a("load", new bk.a() { // from class: z6.c
                @Override // bk.a
                public final Object invoke() {
                    return InMobiBanner.a(this.f86318b, publisherCallbacks, z10);
                }
            });
        } catch (Exception e10) {
            C2820e2 c2820e10 = this.f22286d;
            if (c2820e10 != null) {
                c2820e10.a((short) 2172);
            }
            Y1 y11 = this.f22283a;
            if (y11 != null) {
                y11.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C2820e2 c2820e11 = this.f22286d;
            if (c2820e11 == null || (c3053n9 = c2820e11.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    @UiThread
    public final void load() {
        b();
        a((PublisherCallbacks) this.f22287e, "NonAB", false);
    }

    @UiThread
    public final void load(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        b();
        this.f22295m = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f22287e, "NonAB", false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j10) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f22285c = V1.f23665d;
        this.f22287e = new a(this);
        this.f22289g = true;
        this.f22293k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.f22296n = jg2;
        this.f22297o = new d(this);
        if (Ji.d()) {
            if (context instanceof Activity) {
                this.f22295m = new WeakReference(context);
            }
            this.f22286d = new C2820e2();
            jg2.f22935a = j10;
            a(this, context);
            C2820e2 c2820e2 = this.f22286d;
            this.f22288f = c2820e2 != null ? c2820e2.k() : 0;
            this.f22290h = new HandlerC2795d2(this);
            return;
        }
        p.i("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final r a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        C2820e2 c2820e2;
        inMobiBanner.a();
        long j10 = inMobiBanner.f22294l;
        if (j10 == 0 || (c2820e2 = inMobiBanner.f22286d) == null || c2820e2.a(j10)) {
            inMobiBanner.f22294l = SystemClock.elapsedRealtime();
            C2820e2 c2820e3 = inMobiBanner.f22286d;
            if (c2820e3 != null) {
                c2820e3.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z10);
            }
        }
        return r.f64562a;
    }

    public final void a(String str, final bk.a aVar) {
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        C2820e2 c2820e2 = this.f22286d;
        if (c2820e2 != null && (c3053n10 = c2820e2.f22542f) != null) {
            p.i("InMobiBanner", "TAG");
            c3053n10.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 != null && (c3053n9 = c2820e3.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n9.b("InMobiBanner", "invalid banner size. fail.");
            }
            C2820e2 c2820e4 = this.f22286d;
            if (c2820e4 != null) {
                c2820e4.a((short) 2170);
            }
            Y1 y10 = this.f22283a;
            if (y10 != null) {
                y10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (this.f22291i > 0 && this.f22292j > 0) {
            aVar.invoke();
            return;
        }
        Runnable runnable = new Runnable() { // from class: z6.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiBanner.a(this.f86316b, aVar);
            }
        };
        mj.g gVar = Oj.f23299a;
        p.j(runnable, "runnable");
        ((Handler) Oj.f23299a.getValue()).postDelayed(runnable, 200L);
    }

    public static final void a(InMobiBanner inMobiBanner, bk.a aVar) {
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        try {
            if (inMobiBanner.f22291i > 0 && inMobiBanner.f22292j > 0) {
                aVar.invoke();
                return;
            }
            C2820e2 c2820e2 = inMobiBanner.f22286d;
            if (c2820e2 != null && (c3053n10 = c2820e2.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n10.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C2820e2 c2820e3 = inMobiBanner.f22286d;
            if (c2820e3 != null) {
                c2820e3.a((short) 2171);
            }
            Y1 y10 = inMobiBanner.f22283a;
            if (y10 != null) {
                y10.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            C2820e2 c2820e4 = inMobiBanner.f22286d;
            if (c2820e4 != null) {
                c2820e4.a((short) 2172);
            }
            Y1 y11 = inMobiBanner.f22283a;
            if (y11 != null) {
                y11.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C2820e2 c2820e5 = inMobiBanner.f22286d;
            if (c2820e5 == null || (c3053n9 = c2820e5.f22542f) == null) {
                return;
            }
            p.i("InMobiBanner", "TAG");
            c3053n9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int iA;
        C2820e2 c2820e2 = inMobiBanner.f22286d;
        if (c2820e2 != null) {
            c2820e2.a(context, inMobiBanner.f22296n, inMobiBanner.getFrameSizeString());
        }
        C2820e2 c2820e3 = inMobiBanner.f22286d;
        if (c2820e3 != null) {
            int i10 = inMobiBanner.f22288f;
            iA = c2820e3.a(i10, i10);
        } else {
            iA = 0;
        }
        inMobiBanner.f22288f = iA;
    }

    public final void a() {
        HandlerC2795d2 handlerC2795d2 = this.f22290h;
        if (handlerC2795d2 != null) {
            handlerC2795d2.removeMessages(1);
        }
    }

    public final long a(String str) {
        C3053n9 c3053n9;
        C3053n9 c3053n10;
        C3053n9 c3053n11;
        try {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = p.l(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            StringBuilder sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
            if (x.E("plid-", sb2.substring(0, 5), true)) {
                String strSubstring = sb2.substring(5, sb2.length());
                p.g(strSubstring);
                int length2 = strSubstring.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = p.l(strSubstring.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                return Long.parseLong(strSubstring.subSequence(i11, length2 + 1).toString());
            }
            C2820e2 c2820e2 = this.f22286d;
            if (c2820e2 != null && (c3053n11 = c2820e2.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n11.b("InMobiBanner", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            C2820e2 c2820e3 = this.f22286d;
            if (c2820e3 != null && (c3053n10 = c2820e3.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n10.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            C2820e2 c2820e4 = this.f22286d;
            if (c2820e4 != null && (c3053n9 = c2820e4.f22542f) != null) {
                p.i("InMobiBanner", "TAG");
                c3053n9.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        }
    }
}
