package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static long f13396lh;
    public static boolean vt;
    public static long yu;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final yu f13397cf;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile WeakReference<Activity> f13400le;
    private final yu tlj;
    public final AtomicBoolean ouw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final RunnableC0153ouw f13401ra = new RunnableC0153ouw();
    private final le pno = new le();
    private final fkw bly = new fkw();
    private int ryl = 0;
    public volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.ouw>> fkw = new CopyOnWriteArrayList<>();
    private HandlerThread mwh = null;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private Handler f13398jg = null;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final LinkedList<Activity> f13399ko = new LinkedList<>();

    public class fkw implements Runnable {
        public fkw() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerVt = com.bytedance.sdk.openadsdk.core.jg.vt();
                Message messageObtain = Message.obtain(handlerVt, ouw.this.f13401ra);
                messageObtain.what = 1001;
                handlerVt.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    public class le implements Runnable {
        public le() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bytedance.sdk.openadsdk.core.jg.vt().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
    }

    public static class lh extends yu {
        private lh() {
            super((byte) 0);
        }

        public /* synthetic */ lh(byte b10) {
            this();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ouw.yu, java.lang.Runnable
        public final void run() {
            super.run();
            if (com.bytedance.sdk.openadsdk.utils.fkw.ouw != null && !com.bytedance.sdk.openadsdk.utils.fkw.f13386lh) {
                if (com.bytedance.sdk.openadsdk.utils.fkw.vt > 0) {
                    com.bytedance.sdk.openadsdk.utils.fkw.ouw(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.utils.fkw.vt);
                }
                com.bytedance.sdk.openadsdk.utils.fkw.ouw = null;
                com.bytedance.sdk.openadsdk.utils.fkw.vt = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ouw$ouw, reason: collision with other inner class name */
    public static class RunnableC0153ouw implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            bs.lh(new com.bytedance.sdk.component.pno.pno("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class ra implements Runnable {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private long f13403lh;
        private long vt;
        private boolean yu;

        public ra(long j10, long j11, boolean z10) {
            this.vt = j10;
            this.f13403lh = j11;
            this.yu = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.yu) {
                com.bytedance.sdk.openadsdk.rn.lh lhVarOuw = com.bytedance.sdk.openadsdk.rn.lh.ouw();
                long j10 = this.vt / 1000;
                long j11 = this.f13403lh / 1000;
                com.bytedance.sdk.openadsdk.rn.lh.ouw("general_label", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.4

                    /* JADX INFO: renamed from: lh */
                    public final /* synthetic */ long f13305lh;
                    public final /* synthetic */ long ouw;
                    public final /* synthetic */ long vt;

                    public AnonymousClass4() {
                        j = j10;
                        j = j11;
                        j = j;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        int i10 = !jg.vt.get() ? 1 : 0;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("starttime", j);
                            jSONObject.put("endtime", j);
                            jSONObject.put("start_type", i10);
                        } catch (Throwable unused) {
                        }
                        yu yuVar = new yu();
                        yuVar.ouw = "general_label";
                        yuVar.tlj = String.valueOf(j);
                        yuVar.bly = jSONObject.toString();
                        return yuVar;
                    }
                });
            }
        }
    }

    public static class vt extends yu {
        private vt() {
            super((byte) 0);
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ouw.yu, java.lang.Runnable
        public final void run() {
            super.run();
            final com.bytedance.sdk.openadsdk.le.vt vtVarOuw = com.bytedance.sdk.openadsdk.le.vt.ouw();
            try {
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().mwh) {
                    vtVarOuw.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ouw.ouw().f13222ko) {
                                Iterator it = vt.this.vt.keySet().iterator();
                                while (it.hasNext()) {
                                    com.bytedance.sdk.openadsdk.zih.ouw ouwVar = (com.bytedance.sdk.openadsdk.zih.ouw) vt.this.vt.get((String) it.next());
                                    if (ouwVar != null) {
                                        ouwVar.ouw();
                                    }
                                }
                                return;
                            }
                            if (vt.this.f13228lh != null) {
                                vt.this.f13228lh.ouw();
                            }
                        }
                    });
                }
            } catch (OutOfMemoryError e10) {
                com.bytedance.sdk.component.utils.qbp.yu(e10.getMessage(), new Object[0]);
            }
            if (com.bytedance.sdk.openadsdk.utils.fkw.ouw != null && !com.bytedance.sdk.openadsdk.utils.fkw.f13386lh) {
                com.bytedance.sdk.openadsdk.utils.fkw.vt = SystemClock.elapsedRealtime();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (osn.vt() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ouw.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(@NonNull View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        if (osn.yu(activity)) {
                            osn.lh();
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(@NonNull View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ActivityLifecycle", th2);
        }
        this.ryl++;
        if (this.ouw.get()) {
            this.f13398jg.removeCallbacks(this.f13397cf);
            this.f13398jg.removeCallbacks(this.tlj);
            ouw(this.f13397cf);
        }
        this.ouw.set(false);
    }

    public static class yu implements Runnable {
        private yu() {
        }

        public /* synthetic */ yu(byte b10) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.yu.ouw.cf cfVarFqk = com.bytedance.sdk.openadsdk.core.settings.cf.vt().fqk();
            if (cfVarFqk != null && !cfVarFqk.yu && com.bytedance.sdk.component.utils.vm.vt(com.bytedance.sdk.openadsdk.core.zih.ouw())) {
                com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()));
            }
        }
    }

    private void ouw(Runnable runnable) {
        if (!this.mwh.isAlive()) {
            vt();
        }
        this.f13398jg.postDelayed(runnable, 1000L);
    }

    private void vt() {
        this.mwh = com.bytedance.sdk.component.utils.pno.ouw("lifecycle", 10);
        this.f13398jg = new Handler(this.mwh.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f13399ko.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.fkw != null && this.fkw.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.ouw> weakReference : this.fkw) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().ouw(activity);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (this.f13400le != null && this.f13400le.get() == activity) {
            this.f13400le = null;
        }
        this.f13399ko.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = this.ryl - 1;
        this.ryl = i10;
        if (i10 < 0) {
            this.ryl = 0;
        }
        if (ApmHelper.isIsInit()) {
            ouw(this.bly);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ouw(this.pno);
        if (!vt) {
            f13396lh = System.currentTimeMillis();
            vt = true;
        }
        this.f13400le = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.ryl <= 0) {
            this.ouw.set(true);
        }
        if (this.ouw.get()) {
            vt = false;
            com.bytedance.sdk.openadsdk.core.jg.vt.set(false);
            yu = System.currentTimeMillis();
            this.f13398jg.removeCallbacks(this.f13397cf);
            this.f13398jg.removeCallbacks(this.tlj);
            ouw(this.tlj);
        }
        ouw(new ra(f13396lh, yu, this.ouw.get()));
    }

    public ouw() {
        byte b10 = 0;
        this.tlj = new vt(b10);
        this.f13397cf = new lh(b10);
        vt();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.ouw ouwVar) {
        this.fkw.add(new WeakReference<>(ouwVar));
    }

    public final Activity ouw() {
        if (this.f13399ko.isEmpty()) {
            return null;
        }
        return this.f13399ko.getFirst();
    }
}
