package io.bidmachine.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastActivityListener;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestManager;
import io.bidmachine.iab.vast.VastViewListener;
import io.bidmachine.util.UiUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class VastActivity extends io.bidmachine.rendering.internal.a {
    public static final int VAST_VIEW_ID = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f59492h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f59493i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static WeakReference f59494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f59495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f59496l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastRequest f59498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastView f59499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastActivityListener f59500d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f59503g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VastViewListener f59497a = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59501e = false;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private VastRequest f59504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private VastActivityListener f59505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private VastView f59506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private VastPlaybackListener f59507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private VastAdMeasurer f59508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MraidAdMeasurer f59509f;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
            p10.startActivity(p11);
        }

        public Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        @Nullable
        public IabError display(Context context) {
            VastRequest vastRequest = this.f59504a;
            if (vastRequest == null) {
                VastLog.e("VastActivity", "VastRequest is null", new Object[0]);
                return IabError.internal("VastRequest is null");
            }
            try {
                VastRequestManager.store(vastRequest);
                Intent intentA = a(context);
                intentA.putExtra("vast_request_id", this.f59504a.getId());
                VastActivityListener vastActivityListener = this.f59505b;
                if (vastActivityListener != null) {
                    VastActivity.b(this.f59504a, vastActivityListener);
                }
                VastView vastView = this.f59506c;
                if (vastView != null) {
                    VastActivity.b(this.f59504a, vastView);
                }
                if (this.f59507d != null) {
                    WeakReference unused = VastActivity.f59494j = new WeakReference(this.f59507d);
                } else {
                    WeakReference unused2 = VastActivity.f59494j = null;
                }
                if (this.f59508e != null) {
                    WeakReference unused3 = VastActivity.f59495k = new WeakReference(this.f59508e);
                } else {
                    WeakReference unused4 = VastActivity.f59495k = null;
                }
                if (this.f59509f != null) {
                    WeakReference unused5 = VastActivity.f59496l = new WeakReference(this.f59509f);
                } else {
                    WeakReference unused6 = VastActivity.f59496l = null;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                return null;
            } catch (Throwable th2) {
                VastLog.e("VastActivity", th2);
                VastActivity.f(this.f59504a);
                VastActivity.g(this.f59504a);
                WeakReference unused7 = VastActivity.f59494j = null;
                WeakReference unused8 = VastActivity.f59495k = null;
                WeakReference unused9 = VastActivity.f59496l = null;
                return IabError.throwable("Exception during displaying VastActivity", th2);
            }
        }

        public Builder setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
            this.f59508e = vastAdMeasurer;
            return this;
        }

        public Builder setListener(@Nullable VastActivityListener vastActivityListener) {
            this.f59505b = vastActivityListener;
            return this;
        }

        public Builder setPlaybackListener(@Nullable VastPlaybackListener vastPlaybackListener) {
            this.f59507d = vastPlaybackListener;
            return this;
        }

        public Builder setPostBannerAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.f59509f = mraidAdMeasurer;
            return this;
        }

        public Builder setRequest(@NonNull VastRequest vastRequest) {
            this.f59504a = vastRequest;
            return this;
        }

        public Builder setVastView(@Nullable VastView vastView) {
            this.f59506c = vastView;
            return this;
        }
    }

    public class b implements VastViewListener {
        private b() {
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str) {
            if (VastActivity.this.f59500d != null) {
                VastActivity.this.f59500d.onVastClick(VastActivity.this, vastRequest, iabClickCallback, str);
            }
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onComplete(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f59500d != null) {
                VastActivity.this.f59500d.onVastComplete(VastActivity.this, vastRequest);
            }
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onFinish(VastView vastView, VastRequest vastRequest, boolean z10) {
            VastActivity.this.a(vastRequest, z10);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i10) {
            int forceOrientation = vastRequest.getForceOrientation();
            if (forceOrientation > -1) {
                i10 = forceOrientation;
            }
            VastActivity.this.a(i10);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onShowFailed(VastView vastView, VastRequest vastRequest, IabError iabError) {
            VastActivity.this.a(vastRequest, iabError);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onShown(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f59500d != null) {
                VastActivity.this.f59500d.onVastShown(VastActivity.this, vastRequest);
            }
        }
    }

    private static VastActivityListener d(VastRequest vastRequest) {
        WeakReference weakReference = (WeakReference) f59492h.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastActivityListener) weakReference.get();
        }
        f(vastRequest);
        return null;
    }

    private static VastView e(VastRequest vastRequest) {
        WeakReference weakReference = (WeakReference) f59493i.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastView) weakReference.get();
        }
        g(vastRequest);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(VastRequest vastRequest) {
        f59492h.remove(vastRequest.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(VastRequest vastRequest) {
        f59493i.remove(vastRequest.getId());
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        Integer numC;
        super.onCreate(bundle);
        this.f59498b = VastRequestManager.get(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        VastRequest vastRequest = this.f59498b;
        if (vastRequest == null) {
            a((VastRequest) null, IabError.internal("VastRequest is null"));
            a((VastRequest) null, false);
            return;
        }
        if (bundle == null && (numC = c(vastRequest)) != null) {
            a(numC.intValue());
            try {
                if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f59500d = d(this.f59498b);
        VastView vastViewE = e(this.f59498b);
        this.f59499c = vastViewE;
        if (vastViewE == null) {
            this.f59501e = true;
            this.f59499c = new VastView(this);
        }
        this.f59499c.setId(1);
        this.f59499c.setListener(this.f59497a);
        WeakReference weakReference = f59494j;
        if (weakReference != null) {
            this.f59499c.setPlaybackListener((VastPlaybackListener) weakReference.get());
        }
        WeakReference weakReference2 = f59495k;
        if (weakReference2 != null) {
            this.f59499c.setAdMeasurer((VastAdMeasurer) weakReference2.get());
        }
        WeakReference weakReference3 = f59496l;
        if (weakReference3 != null) {
            this.f59499c.setPostBannerAdMeasurer((MraidAdMeasurer) weakReference3.get());
        }
        if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
            this.f59502f = true;
            if (!this.f59499c.display(this.f59498b, Boolean.TRUE)) {
                return;
            }
        }
        a(this.f59499c);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        VastRequest vastRequest;
        VastView vastView;
        super.onDestroy();
        if (isChangingConfigurations() || (vastRequest = this.f59498b) == null) {
            return;
        }
        VastView vastView2 = this.f59499c;
        a(vastRequest, vastView2 != null && vastView2.isFinished());
        if (this.f59501e && (vastView = this.f59499c) != null) {
            vastView.destroy();
        }
        f(this.f59498b);
        g(this.f59498b);
        f59494j = null;
        f59495k = null;
        f59496l = null;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f59502f);
        bundle.putBoolean("isFinishedPerformed", this.f59503g);
    }

    private Integer c(VastRequest vastRequest) {
        int forceOrientation = vastRequest.getForceOrientation();
        if (forceOrientation > -1) {
            return Integer.valueOf(forceOrientation);
        }
        int preferredVideoOrientation = vastRequest.getPreferredVideoOrientation();
        if (preferredVideoOrientation == 0 || preferredVideoOrientation == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(preferredVideoOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VastRequest vastRequest, VastActivityListener vastActivityListener) {
        f59492h.put(vastRequest.getId(), new WeakReference(vastActivityListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VastRequest vastRequest, VastView vastView) {
        f59493i.put(vastRequest.getId(), new WeakReference(vastView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, boolean z10) {
        VastActivityListener vastActivityListener = this.f59500d;
        if (vastActivityListener != null && !this.f59503g) {
            vastActivityListener.onVastDismiss(this, vastRequest, z10);
        }
        this.f59503g = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            VastLog.e("VastActivity", e10.getMessage(), new Object[0]);
        }
        if (vastRequest != null) {
            a(vastRequest.getRequestedOrientation());
        }
        UiUtils.finishActivityWithoutAnimation(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, IabError iabError) {
        VastActivityListener vastActivityListener = this.f59500d;
        if (vastActivityListener != null) {
            vastActivityListener.onVastShowFailed(vastRequest, iabError);
        }
    }

    @Override // io.bidmachine.rendering.internal.a
    public void a() {
        VastView vastView = this.f59499c;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 7;
        } else {
            i11 = i10 == 2 ? 6 : 4;
        }
        setRequestedOrientation(i11);
    }

    private void a(VastView vastView) {
        Utils.applyFullscreenActivityFlags(this);
        Utils.removeFromParent(vastView);
        setContentView(vastView);
        Utils.applyWindowInsets(this);
    }
}
