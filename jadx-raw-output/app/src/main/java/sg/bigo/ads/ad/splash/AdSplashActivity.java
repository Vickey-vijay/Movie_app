package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.Mf;
import com.ironsource.Z7;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.controller.landing.e;

/* JADX INFO: loaded from: classes10.dex */
public class AdSplashActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, b> f69072a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f69073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f69074c = new AtomicBoolean(false);

    public static void a(@NonNull Context context, @NonNull b bVar) {
        Intent intent = new Intent(context, (Class<?>) (bVar.getStyle() == SplashAd.Style.HORIZONTAL ? LandscapeAdSplashActivity.class : AdSplashActivity.class));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        int iHashCode = bVar.hashCode();
        intent.putExtra("splash_hash", iHashCode);
        f69072a.put(Integer.valueOf(iHashCode), bVar);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            if (this.f69073b == null || !this.f69074c.compareAndSet(false, true)) {
                return;
            }
            this.f69073b.B.onAdClosed();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            int intExtra = intent.getIntExtra("splash_hash", -1);
            Map<Integer, b> map = f69072a;
            b bVar = map.get(Integer.valueOf(intExtra));
            if (bVar == null) {
                finish();
                return;
            }
            map.remove(Integer.valueOf(intExtra));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(-1);
            setContentView(frameLayout);
            this.f69073b = bVar;
            bVar.B.f69279c = new SplashAdInteractionListener() { // from class: sg.bigo.ads.ad.splash.AdSplashActivity.1
                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClicked() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f27056f);
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClosed() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f27057g);
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdError(@NonNull AdError adError) {
                    if (adError == null) {
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdError: " + adError.getCode() + Z7.f27998r + adError.getMessage());
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdFinished() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdFinished");
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdImpression() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdImpression");
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdOpened() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f27053c);
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdSkipped() {
                    sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdSkipped");
                    AdSplashActivity.this.finish();
                }
            };
            bVar.a(frameLayout);
            b bVar2 = this.f69073b;
            if (bVar2 != null) {
                bVar2.B.onAdOpened();
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f69073b != null && this.f69074c.compareAndSet(false, true)) {
                this.f69073b.B.onAdClosed();
            }
            b bVar = this.f69073b;
            if (bVar != null) {
                bVar.destroy();
                this.f69073b = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        b bVar = this.f69073b;
        if (bVar == null || !bVar.isSkippable()) {
            return true;
        }
        this.f69073b.c(8);
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        sg.bigo.ads.ad.b.b bVar = this.f69073b.f69249z;
        if (bVar != null) {
            e.a((Activity) this, (sg.bigo.ads.ad.c) bVar);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        View decorView;
        super.onResume();
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
            sg.bigo.ads.controller.landing.c cVarY = this.f69073b.f69249z.y();
            if (cVarY == null || cVarY.f70979a != 4 || cVarY.f70981c) {
                return;
            }
            this.f69073b.f69249z.y().f70981c = true;
            e.a((Activity) this, (sg.bigo.ads.ad.c) this.f69073b.f69249z);
            sg.bigo.ads.core.landing.a.a(this, cVarY.f70980b, getPackageName());
        } catch (Throwable unused) {
            finish();
        }
    }
}
