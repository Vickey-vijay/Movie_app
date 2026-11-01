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
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.C2924i4;
import com.inmobi.media.C3298x5;
import com.inmobi.media.F3;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.N1;
import com.inmobi.media.Oj;
import com.inmobi.media.R1;
import com.inmobi.media.S8;
import com.inmobi.media.W1;
import com.inmobi.media.Y3;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Map;
import lk.x;

/* JADX INFO: loaded from: classes4.dex */
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAdEventListener f22276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f22277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f22279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22282g;

    public static final class a extends R1 {
        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio inMobiAudio) {
            super(inMobiAudio);
            p.j(inMobiAudio, "audio");
        }

        @Override // com.inmobi.media.R1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            p.j(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                W1 mAdManager$media_release = inMobiAudio.getMAdManager$media_release();
                if (mAdManager$media_release != null) {
                    mAdManager$media_release.k();
                }
            } catch (IllegalStateException e10) {
                Kb.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener$media_release = inMobiAudio.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            AudioAdEventListener mPubListener$media_release;
            p.j(inMobiAdRequestStatus, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiAudio, inMobiAdRequestStatus);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(attributeSet, "attributeSet");
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f22279d = jg2;
        if (!Ji.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f22278c = new WeakReference(context);
        }
        this.f22277b = new W1(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f22935a = jA;
        }
        Context context2 = getContext();
        p.i(context2, "getContext(...)");
        W1 w10 = this.f22277b;
        if (w10 != null) {
            w10.a(context2, jg2, getFrameSizeString());
        }
    }

    public final boolean a() {
        if (this.f22281f <= 0 || this.f22282g <= 0) {
            if (getLayoutParams() == null) {
                Kb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Kb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f22281f = F3.b(getLayoutParams().width / J5.b());
                this.f22282g = F3.b(getLayoutParams().height / J5.b());
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            W1 w10 = this.f22277b;
            if (w10 != null) {
                w10.j();
            }
            if (getLayoutParams() != null) {
                this.f22281f = F3.b(getLayoutParams().width / J5.b());
                this.f22282g = F3.b(getLayoutParams().height / J5.b());
            }
            if (!(this.f22281f > 0 && this.f22282g > 0)) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l10 = J5.f22893a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                p.i(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f22281f > 0 && inMobiAudio.f22282g > 0;
    }

    private final String getFrameSizeString() {
        return this.f22281f + VastAttributes.HORIZONTAL_POSITION + this.f22282g;
    }

    public final void b() {
        W1 w10;
        W1 w11;
        try {
            C2924i4 c2924i4 = Y3.f23815a;
            p.j(AdConfig.class, "clazz");
            C2924i4 c2924i5 = Y3.f23815a;
            if (!((AdConfig) c2924i5.a(AdConfig.class)).getAudio().isAudioEnabled()) {
                W1 w12 = this.f22277b;
                if (w12 != null) {
                    w12.a((short) 107);
                }
                W1 w13 = this.f22277b;
                if (w13 != null) {
                    w13.a(w13.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Kb.a((byte) 1, "InMobi", "");
                return;
            }
            Jg jg2 = this.f22279d;
            jg2.getClass();
            p.j("NonAB", "<set-?>");
            jg2.f22941g = "NonAB";
            Context context = getContext();
            p.i(context, "getContext(...)");
            W1 w14 = this.f22277b;
            if (w14 != null) {
                w14.a(context, this.f22279d, getFrameSizeString());
            }
            W1 w15 = this.f22277b;
            boolean z10 = false;
            if (w15 != null) {
                N1 n10 = w15.f23720j;
                if (n10 != null && n10.f24710b == 7) {
                    w15.b((short) 15);
                    AudioAdEventListener audioAdEventListener = this.f22276a;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    Kb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!a()) {
                W1 w16 = this.f22277b;
                if (w16 != null) {
                    w16.a((short) 108);
                }
                W1 w17 = this.f22277b;
                if (w17 != null) {
                    w17.a(w17.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            p.j(AdConfig.class, "clazz");
            if (((AdConfig) c2924i5.a(AdConfig.class)).getAudio().getMinDeviceVolume() > C3298x5.f25687a.a(Ji.f22951a, Ji.f22956f)) {
                W1 w18 = this.f22277b;
                if (w18 != null) {
                    w18.a((short) 106);
                }
                W1 w19 = this.f22277b;
                if (w19 != null) {
                    w19.a(w19.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (!(this.f22281f > 0 && this.f22282g > 0)) {
                Runnable runnable = new Runnable() { // from class: z6.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(this.f86315b);
                    }
                };
                mj.g gVar = Oj.f23299a;
                p.j(runnable, "runnable");
                ((Handler) Oj.f23299a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j10 = this.f22280e;
            if (j10 == 0 || (w11 = this.f22277b) == null || w11.a(j10)) {
                this.f22280e = SystemClock.elapsedRealtime();
                z10 = true;
            }
            if (!z10 || (w10 = this.f22277b) == null) {
                return;
            }
            w10.b(getFrameSizeString());
        } catch (Exception e10) {
            W1 w20 = this.f22277b;
            if (w20 != null) {
                w20.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void disableHardwareAcceleration() {
        this.f22279d.f22938d = true;
    }

    public final W1 getMAdManager$media_release() {
        return this.f22277b;
    }

    public final AudioAdEventListener getMPubListener$media_release() {
        return this.f22276a;
    }

    @UiThread
    public final void load() {
        W1 w10 = this.f22277b;
        if (w10 != null) {
            w10.g();
        }
        b();
    }

    public final void pause() {
        W1 w10;
        try {
            if (this.f22278c != null || (w10 = this.f22277b) == null) {
                return;
            }
            w10.i();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void resume() {
        W1 w10;
        try {
            if (this.f22278c != null || (w10 = this.f22277b) == null) {
                return;
            }
            w10.l();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void setAudioSize(@IntRange(from = 1) int i10, @IntRange(from = 1) int i11) {
        this.f22281f = i10;
        this.f22282g = i11;
    }

    public final void setContentUrl(String str) {
        p.j(str, "contentUrl");
        this.f22279d.f22939e = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                Ki.f23020b = str;
            }
            String str2 = map.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                Ki.f23019a = str2;
            }
        }
        this.f22279d.f22937c = map;
    }

    public final void setKeywords(String str) {
        this.f22279d.f22936b = str;
    }

    public final void setListener(AudioAdEventListener audioAdEventListener) {
        p.j(audioAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f22276a = audioAdEventListener;
    }

    public final void setMAdManager$media_release(W1 w10) {
        this.f22277b = w10;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.f22276a = audioAdEventListener;
    }

    @UiThread
    public final void show() {
        W1 w10 = this.f22277b;
        if (w10 != null) {
            w10.n();
        }
        W1 w11 = this.f22277b;
        if (w11 != null) {
            w11.a(this);
        }
    }

    @UiThread
    public final void destroy() {
        removeAllViews();
        W1 w10 = this.f22277b;
        if (w10 != null) {
            w10.h();
        }
        this.f22276a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            W1 w10 = this.f22277b;
            if (w10 != null) {
                w10.p();
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new S8(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j10) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f22279d = jg2;
        if (Ji.d()) {
            if (context instanceof Activity) {
                this.f22278c = new WeakReference(context);
            }
            W1 w10 = new W1(aVar);
            this.f22277b = w10;
            jg2.f22935a = j10;
            w10.a(context, jg2, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        W1 w10;
        W1 w11;
        try {
            boolean z10 = false;
            if (inMobiAudio.f22281f > 0 && inMobiAudio.f22282g > 0) {
                long j10 = inMobiAudio.f22280e;
                if (j10 == 0 || (w11 = inMobiAudio.f22277b) == null || w11.a(j10)) {
                    inMobiAudio.f22280e = SystemClock.elapsedRealtime();
                    z10 = true;
                }
                if (!z10 || (w10 = inMobiAudio.f22277b) == null) {
                    return;
                }
                w10.b(inMobiAudio.getFrameSizeString());
                return;
            }
            Kb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            W1 w12 = inMobiAudio.f22277b;
            if (w12 != null) {
                w12.a((short) 108);
            }
            W1 w13 = inMobiAudio.f22277b;
            if (w13 != null) {
                w13.a(w13.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e10) {
            W1 w14 = inMobiAudio.f22277b;
            if (w14 != null) {
                w14.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e10.getMessage();
        }
    }

    public static long a(String str) {
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
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }
}
