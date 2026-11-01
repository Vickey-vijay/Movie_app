package com.bytedance.sdk.component.adexpress.fkw;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.pno;
import com.bytedance.sdk.component.adexpress.vt.ra;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jg;
import com.bytedance.sdk.component.utils.ko;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ouw implements com.bytedance.sdk.component.adexpress.ouw, com.bytedance.sdk.component.adexpress.theme.ouw, cf, com.bytedance.sdk.component.adexpress.vt.yu<le> {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private String f11490cf;
    public mwh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11491jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public le f11492le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11493lh;
    private volatile ra mwh;
    public JSONObject ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f11494ra;
    private String ryl;
    private Context tlj;
    public boolean vt;
    public pno yu;
    public int pno = 8;
    public AtomicBoolean bly = new AtomicBoolean(false);

    public abstract void fkw();

    public abstract void ouw(int i10);

    public void pno() {
    }

    public void ra() {
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public int vt() {
        return 0;
    }

    private le bly() {
        return this.fkw.vpp ? fkw.ouw().ouw(this.tlj, this.f11490cf) : fkw.ouw().vt(this.tlj, this.f11490cf);
    }

    public final void ouw(String str) {
        this.ryl = str;
    }

    public void yu() {
        if (this.bly.get()) {
            return;
        }
        this.bly.set(true);
        fkw();
        if (this.f11492le.getParent() != null) {
            ((ViewGroup) this.f11492le.getParent()).removeView(this.f11492le);
        }
        if (!this.f11493lh) {
            fkw.ouw();
            fkw.lh(this.f11492le);
        } else if (this.fkw.vpp) {
            fkw.ouw().ouw(this.f11492le);
        } else {
            fkw.ouw().vt(this.f11492le);
        }
    }

    public ouw(Context context, mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        le.lh lhVar;
        this.vt = false;
        this.tlj = context;
        this.fkw = mwhVar;
        this.f11490cf = mwhVar.ouw;
        themeStatusBroadcastReceiver.ouw(this);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            if (this.tlj == null && com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
                this.tlj = com.bytedance.sdk.component.adexpress.yu.ouw();
            }
            if (this.tlj != null) {
                le leVarBly = bly();
                this.f11492le = leVarBly;
                if (leVarBly == null) {
                    Log.d("WebViewRender", "initWebView: create WebView by act");
                    MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(this.tlj.getApplicationContext());
                    if (this.fkw.vpp) {
                        lhVar = le.lh.ADS_V3;
                    } else {
                        lhVar = le.lh.ADS;
                    }
                    this.f11492le = new le(mutableContextWrapper, lhVar);
                    return;
                }
                this.vt = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
                return;
            }
            return;
        }
        le leVarBly2 = bly();
        this.f11492le = leVarBly2;
        if (leVarBly2 == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
                this.f11492le = new le(com.bytedance.sdk.component.adexpress.yu.ouw(), le.lh.ADS);
                return;
            }
            return;
        }
        this.vt = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    public void le() {
        ra();
        Activity activityOuw = com.bytedance.sdk.component.utils.vt.ouw(this.f11492le);
        if (activityOuw != null) {
            this.f11491jg = activityOuw.hashCode();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
    public le lh() {
        return this.f11492le;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public void ouw(ra raVar) {
        String str;
        this.mwh = raVar;
        if (lh() != null && lh().getWebView() != null) {
            if (TextUtils.isEmpty(this.ryl)) {
                this.mwh.ouw(102, "url is empty");
                return;
            }
            if (!this.fkw.vpp) {
                if (!com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(this.ouw)) {
                    ra raVar2 = this.mwh;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.ouw == null);
                    raVar2.ouw(103, sb2.toString());
                    return;
                }
            } else if (vt() == 9 && !com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt(this.ouw)) {
                ra raVar3 = this.mwh;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.ouw == null);
                raVar3.ouw(103, sb3.toString());
                return;
            }
            this.fkw.vt.ouw(this.vt);
            if (this.vt) {
                try {
                    mwh mwhVar = this.fkw;
                    int i10 = mwhVar.ex;
                    if (mwhVar.vpp && i10 == 1) {
                        ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in reuse, templateInfo is：", mwhVar.ouw());
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.fkw.ouw() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.f11492le.tlj();
                    this.fkw.vt.fkw();
                    jg.ouw(this.f11492le.getWebView(), str);
                    return;
                } catch (Exception e10) {
                    ko.vt("WebViewRender", "reuse webview load fail ");
                    fkw.ouw();
                    fkw.lh(this.f11492le);
                    this.mwh.ouw(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            le leVarLh = lh();
            leVarLh.tlj();
            this.fkw.vt.fkw();
            leVarLh.a_(this.ryl);
            return;
        }
        ra raVar4 = this.mwh;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(lh() == null);
        sb4.append(" or Webview is null");
        raVar4.ouw(102, sb4.toString());
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public void ouw(final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        if (jgVar == null) {
            if (this.mwh != null) {
                this.mwh.ouw(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean z10 = jgVar.vt;
        final float f10 = (float) jgVar.f11588lh;
        final float f11 = (float) jgVar.yu;
        if (vt() == 0 && (f10 <= 0.0f || f11 <= 0.0f)) {
            if (this.mwh != null) {
                this.mwh.ouw(105, "width is " + f10 + "height is " + f11);
                return;
            }
            return;
        }
        this.f11493lh = z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ouw(jgVar, f10, f11);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fkw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw(jgVar, f10, f11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar, float f10, float f11) {
        boolean z10 = this.f11493lh;
        if (z10 && !this.f11494ra) {
            ouw(f10, f11);
            ouw(this.pno);
            if (this.mwh != null) {
                this.mwh.ouw(lh(), jgVar);
                return;
            }
            return;
        }
        if (!z10) {
            fkw.ouw();
            fkw.lh(this.f11492le);
        }
        ouw(jgVar.f11585jg, jgVar.mwh);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.ouw(view, i10, lhVar);
        }
    }

    @UiThread
    private void ouw(float f10, float f11) {
        this.fkw.vt.le();
        if (vt() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lh().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            lh().setLayoutParams(layoutParams);
            return;
        }
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f10);
        int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) lh().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iOuw, iOuw2);
        }
        layoutParams2.width = iOuw;
        layoutParams2.height = iOuw2;
        lh().setLayoutParams(layoutParams2);
    }

    private void ouw(int i10, String str) {
        if (this.mwh != null) {
            this.mwh.ouw(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ouw
    public final void ouw(Activity activity) {
        if (this.f11491jg == 0 || activity == null || activity.hashCode() != this.f11491jg) {
            return;
        }
        ko.vt("WebViewRender", "release from activity onDestroy");
        yu();
        pno();
    }

    public final void ouw(JSONObject jSONObject) {
        this.ouw = jSONObject;
    }
}
