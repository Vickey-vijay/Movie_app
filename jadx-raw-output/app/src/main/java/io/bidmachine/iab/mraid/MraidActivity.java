package io.bidmachine.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.internal.b;
import io.bidmachine.util.UiUtils;

/* JADX INFO: loaded from: classes9.dex */
public class MraidActivity extends io.bidmachine.rendering.internal.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseArray f59151d = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f59152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MraidInterstitial f59153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59154c = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59155a;

        static {
            int[] iArr = new int[MraidType.values().length];
            f59155a = iArr;
            try {
                iArr[MraidType.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59155a[MraidType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59155a[MraidType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void a(MraidInterstitial mraidInterstitial) {
        f59151d.put(mraidInterstitial.f59220id, mraidInterstitial);
    }

    private void c() {
        a(this.f59152a);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
    }

    public static void show(@Nullable Context context, @Nullable MraidInterstitial mraidInterstitial, @Nullable MraidType mraidType) {
        if (mraidInterstitial == null) {
            MraidLog.e("MraidActivity", "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            MraidLog.e("MraidActivity", "Context is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("Context is null during showing MraidActivity"));
            return;
        }
        if (mraidType == null) {
            MraidLog.e("MraidActivity", "MraidType is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            a(mraidInterstitial);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(context, mraidType, mraidInterstitial.f59220id));
        } catch (Throwable th2) {
            MraidLog.e("Exception during showing MraidActivity", th2);
            mraidInterstitial.c(IabError.throwable("Exception during showing MraidActivity", th2));
            a(Integer.valueOf(mraidInterstitial.f59220id));
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            MraidLog.e("MraidActivity", "Mraid display cache id not provided", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("InterstitialId", 0));
        this.f59152a = numValueOf;
        MraidInterstitial mraidInterstitial = (MraidInterstitial) f59151d.get(numValueOf.intValue());
        this.f59153b = mraidInterstitial;
        if (mraidInterstitial == null) {
            MraidLog.e("MraidActivity", "Mraid interstitial not found in display cache, id=%s", this.f59152a);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        MraidType mraidType = (MraidType) getIntent().getSerializableExtra("InterstitialType");
        if (mraidType == null) {
            MraidLog.e("MraidActivity", "MraidType is null", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            this.f59153b.c(IabError.internal("MraidType is null"));
            return;
        }
        Utils.applyFullscreenActivityFlags(this);
        int i10 = a.f59155a[mraidType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f59154c = true;
        } else if (i10 == 3) {
            this.f59154c = false;
        }
        try {
            this.f59153b.a((Activity) this, false);
        } catch (Exception e10) {
            MraidLog.e("Exception during showing MraidInterstial in MraidActivity", e10);
            UiUtils.finishActivityWithoutAnimation(this);
            this.f59153b.c(IabError.throwable("Exception during showing MraidInterstial in MraidActivity", e10));
            c();
        }
        Utils.applyWindowInsets(this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f59153b == null || isChangingConfigurations()) {
            return;
        }
        this.f59153b.b();
        c();
    }

    private static Intent a(Context context, MraidType mraidType, int i10) {
        Intent intentA = b.a(context, MraidActivity.class);
        intentA.putExtra("InterstitialId", i10);
        intentA.putExtra("InterstitialType", mraidType);
        return intentA;
    }

    @Override // io.bidmachine.rendering.internal.a
    public void a() {
        if (this.f59154c) {
            MraidInterstitial mraidInterstitial = this.f59153b;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                UiUtils.finishActivityWithoutAnimation(this);
            }
        }
    }

    private static void a(Integer num) {
        if (num == null) {
            return;
        }
        f59151d.remove(num.intValue());
    }
}
