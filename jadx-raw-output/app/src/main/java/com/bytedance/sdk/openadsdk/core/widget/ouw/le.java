package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.internal.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class le implements jae.ouw {
    public String bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private final boolean f13117cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public float f13118cf;
    public boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public float f13119jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public float f13120ko;
    public long ksc;
    public float mwh;
    public Context ouw;
    public boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f13125ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public long f13126rn;
    public float ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public long f13128th;
    public int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f13129vm;
    public vpp vt;
    public WebView yu;
    public boolean zih;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private final Handler f13123od = new jae(jg.vt().getLooper(), this);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13122lh = "landingpage";

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13121le = 0;
    private final String uq = ".*\\/serp\\?sc=.*&clkt=\\d+$";

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private final String f13124pd = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    public ouw ex = new ouw() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw
        public final void ouw() {
            le leVar = le.this;
            leVar.pno = true;
            leVar.vt();
            le leVar2 = le.this;
            leVar2.ouw(2, leVar2.bly, leVar2.tlj);
        }
    };

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public GestureDetector f13127tc = new GestureDetector(zih.ouw(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            le.this.zih = true;
            return false;
        }
    });
    public int fkw = zih.yu().pno.ouw("bus_con_behavior_count", d.f44769a);
    public Map<Integer, Long> qbp = new HashMap();
    public Map<Integer, Float> zin = new HashMap();
    public Map<Integer, Long> vpp = new HashMap();
    public List<Integer> jqy = new ArrayList();

    public interface ouw {
        void ouw();
    }

    private void vt(int i10) {
        if (lh()) {
            return;
        }
        vt();
        this.f13125ra = true;
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw().ouw(this.bly).ouw(this.tlj).ouw(this.f13118cf).vt(this.ryl).lh(this.f13128th).vt(i10).ouw;
        try {
            if (this.jae) {
                ko.vt("_arbitrage_event", "can collect hit result");
                WebView.HitTestResult hitTestResult = this.yu.getHitTestResult();
                ouwVar.f13315th = hitTestResult.getExtra();
                ouwVar.f13316vm = hitTestResult.getType();
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = ouwVar;
        this.f13123od.sendMessageDelayed(messageObtain, 100L);
    }

    public final void ouw(int i10) {
        float height = (i10 + this.yu.getHeight()) / osn.ouw(this.ouw, this.yu.getContentHeight());
        Float f10 = this.zin.get(Integer.valueOf(this.tlj));
        float fFloatValue = f10 == null ? 0.0f : f10.floatValue();
        ko.ouw("_arbitrage_", "onScrollChange, oldPerUnBox is:", Float.valueOf(fFloatValue), ", browsingPer is:", Float.valueOf(height), ", index is: ", Integer.valueOf(this.tlj));
        if (height > fFloatValue) {
            this.zin.put(Integer.valueOf(this.tlj), Float.valueOf(height));
        }
    }

    public final boolean lh() {
        int i10 = this.f13121le + 1;
        this.f13121le = i10;
        if (i10 > this.fkw) {
            return true;
        }
        return ("landingpage".equals(this.f13122lh) || "landingpage_endcard".equals(this.f13122lh) || "landingpage_split_screen".equals(this.f13122lh) || "landingpage_direct".equals(this.f13122lh) || "landingpage_split_ceiling".equals(this.f13122lh)) ? false : true;
    }

    public final void yu() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.yu.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            this.tlj = currentIndex;
            if (this.f13117cd) {
                this.tlj = currentIndex + 1;
            }
        }
        ko.ouw("_arbitrage_", "trigger onPageStarted, and index is: ", Integer.valueOf(this.tlj));
    }

    public le(WebView webView, vpp vppVar, Context context, boolean z10) {
        this.vt = vppVar;
        this.yu = webView;
        this.ouw = context;
        this.f13117cd = z10;
    }

    public final void ouw(MotionEvent motionEvent) {
        boolean z10;
        this.f13127tc.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13118cf = motionEvent.getX();
            this.ryl = motionEvent.getY();
            this.f13126rn = SystemClock.elapsedRealtime();
            return;
        }
        if (action != 1) {
            if (action != 3) {
                return;
            }
            vt(2);
            return;
        }
        this.f13128th = SystemClock.elapsedRealtime() - this.f13126rn;
        this.mwh = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.f13119jg = y10;
        float f10 = this.ryl;
        if (y10 - f10 != 0.0f) {
            this.f13120ko = y10 - f10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (lh()) {
                return;
            }
            ko.vt("_arbitrage_", "trigger processScrollEvent()");
            com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw c0149ouwOuw = new com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw().ouw(this.bly).ouw(this.tlj);
            float f11 = this.f13118cf;
            com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = c0149ouwOuw.ouw;
            ouwVar.f13313ra = f11;
            ouwVar.pno = this.ryl;
            ouwVar.bly = this.f13120ko;
            ouwVar.f13308cf = this.f13128th;
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.obj = ouwVar;
            this.f13123od.sendMessageDelayed(messageObtain, 20L);
            return;
        }
        vt(1);
    }

    @MainThread
    public final void vt() {
        if (this.zin.get(Integer.valueOf(this.tlj)) != null) {
            return;
        }
        float height = this.yu.getHeight() / osn.ouw(this.ouw, this.yu.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        ko.ouw("_arbitrage_", "initBrowsingPer, browsingPer is: ", Float.valueOf(height), "index is: ", Integer.valueOf(this.tlj));
        this.zin.put(Integer.valueOf(this.tlj), Float.valueOf(height));
    }

    public final void ouw(int i10, String str, int i11) {
        if (lh()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.qbp.get(Integer.valueOf(i11));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.zin.get(Integer.valueOf(i11));
        float fFloatValue = f10 == null ? 0.0f : f10.floatValue();
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.rn.ouw.ouw.C0149ouw().ouw(str).ouw(i11).ouw;
        ouwVar.ryl = jElapsedRealtime - jLongValue;
        ouwVar.mwh = fFloatValue;
        ouwVar.f13309jg = i10;
        com.bytedance.sdk.openadsdk.yu.lh.lh(this.vt, ouwVar, this.f13122lh);
    }

    public final boolean ouw() {
        try {
            int i10 = this.tlj;
            if (i10 == 2 || i10 == 3) {
                return Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.bly) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.bly);
            }
            return false;
        } catch (Throwable th2) {
            qbp.lh("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = (com.bytedance.sdk.openadsdk.rn.ouw.ouw) message.obj;
        if (i10 == 100) {
            ouwVar.tlj = this.zih ? 2 : 1;
            com.bytedance.sdk.openadsdk.yu.lh.yu(this.vt, ouwVar, this.f13122lh);
            this.zih = false;
        } else if (i10 == 200) {
            if (this.f13129vm) {
                ouw(1, ouwVar.ouw, ouwVar.vt);
            }
            ouwVar.f13311le = this.f13129vm ? 1 : 0;
            com.bytedance.sdk.openadsdk.yu.lh.fkw(this.vt, ouwVar, this.f13122lh);
            this.f13125ra = false;
            this.f13129vm = false;
        }
    }
}
