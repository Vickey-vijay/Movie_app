package com.bytedance.sdk.openadsdk.core.mwh.ouw;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.fkw;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.ryl.le;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.yu;
import com.bytedance.sdk.openadsdk.yu.ra;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ouw implements lh, jae.ouw, com.bytedance.sdk.openadsdk.core.mwh.vt.ouw {
    public long bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public le f12907cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    @NonNull
    public final Context f12908cf;
    public vt ex;
    public SurfaceTexture fkw;
    public WeakReference<lh.vt> jae;
    public final ViewGroup ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.mwh.yu.lh f12911le;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public lh.ouw f12913od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public long f12914pd;

    @NonNull
    public final vpp pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public fkw f12915ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12916rn;
    private long rrs;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f12917tc;
    public boolean uq;
    public boolean vpp;
    public SurfaceHolder yu;
    public String ouw = "TTAD.VideoController";
    public final int vt = 100;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final jae f12912lh = new jae(Looper.getMainLooper(), this);
    public long bly = 0;
    public long tlj = 0;
    public final List<Runnable> ryl = new ArrayList();
    public boolean mwh = false;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f12909jg = false;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f12910ko = true;
    public boolean zih = false;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f12919vm = false;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f12918th = false;
    public AtomicBoolean qbp = new AtomicBoolean(false);
    public AtomicBoolean zin = new AtomicBoolean(false);
    public boolean jqy = true;
    public boolean fvf = false;
    public Runnable fak = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.1
        @Override // java.lang.Runnable
        public final void run() {
            ouw ouwVar = ouw.this;
            ko.vt(ouwVar.ouw, "resumeVideo: run ", Boolean.valueOf(ouwVar.mwh));
            ouw.this.cd();
        }
    };
    public long uoy = 0;
    public boolean osn = true;
    public int ey = 1;
    private final AtomicBoolean jvy = new AtomicBoolean(false);

    private void ey() {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / ((long) this.ey));
        ouwVar.vt = zih();
        ouwVar.f13478le = this.f12914pd;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.f12915ra, ouwVar);
    }

    public final void fak() {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / ((long) this.ey));
        ouwVar.vt = zih();
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.f12915ra, ouwVar);
    }

    public final void lh(boolean z10) {
        this.jqy = z10;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        if (!vpp.le(this.pno)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                try {
                    ouwVar.f13464lh = "video_player";
                    ouwVar.pno = uoy.ouw(ouw.this.pno);
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                } catch (Throwable unused) {
                }
                return ouwVar;
            }
        });
        return false;
    }

    public void pd() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void pno() {
        this.mwh = false;
        ko.lh(this.ouw, "surfaceTextureDestroyed: ");
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.ouw(false);
        }
        this.fkw = null;
        ksc();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ra() {
        this.mwh = false;
        this.yu = null;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.ouw(false);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean tc() {
        return true;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void tlj() {
        this.uq = true;
    }

    public final void uoy() {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.pno, this.f12915ra, this.ex);
    }

    public final void vt(long j10) {
        this.bly = j10;
        this.tlj = Math.max(this.tlj, j10);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[qbp.ouw.values().length];
            ouw = iArr;
            try {
                iArr[qbp.ouw.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[qbp.ouw.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[qbp.ouw.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void ksc() {
        ko.lh(this.ouw, "execPendingActions: before ");
        if (this.ryl.isEmpty()) {
            return;
        }
        ko.lh(this.ouw, "execPendingActions:  exec");
        Iterator it = new ArrayList(this.ryl).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.ryl.clear();
    }

    public final void bs() {
        if (vpp.le(this.pno) && this.zin.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.vm.lh.vt(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.5
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    try {
                        ouwVar.f13464lh = "video_player";
                        ouwVar.pno = uoy.ouw(ouw.this.pno);
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                    } catch (Throwable unused) {
                    }
                    return ouwVar;
                }
            });
        }
    }

    public final void cd() {
        this.f12912lh.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f12911le != null) {
                    ko.vt(ouwVar.ouw, "resumeVideo: execResumePlay", Boolean.valueOf(ouwVar.mwh));
                    com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = ouw.this.f12911le;
                    if (lhVar.fkw || lhVar.f10477ra == null) {
                        return;
                    }
                    lhVar.f10471cf.set(true);
                    lhVar.f10477ra.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.11
                        public AnonymousClass11() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!yu.this.ra() || yu.this.f10480th == null) {
                                return;
                            }
                            try {
                                yu.this.f10480th.lh();
                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "resume play exec start ");
                                for (WeakReference weakReference : yu.this.f10478rn) {
                                    if (weakReference != null && weakReference.get() != null) {
                                        ((com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw) weakReference.get()).fkw(yu.this);
                                    }
                                }
                                yu.this.f10473le = 206;
                            } catch (Throwable th2) {
                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "play: catch exception ", th2.getMessage());
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void cf() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.mwh();
        }
        if (this.vpp || !this.qbp.get()) {
            return;
        }
        ey();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ex() {
        return this.f12917tc;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void fkw() {
        if (!this.f12918th) {
            jg();
            return;
        }
        this.f12918th = false;
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.vt(this.ksc);
        }
        lh(1);
    }

    public final boolean fvf() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        return lhVar != null && lhVar.le();
    }

    public final long jae() {
        return this.f12914pd;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean jqy() {
        return this.f12909jg;
    }

    public final void lh(int i10) {
        Context context = this.f12908cf;
        if (context == null) {
            return;
        }
        boolean z10 = i10 == 0 || i10 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
            if (z10) {
                activity.getWindow().clearFlags(1024);
            } else {
                activity.getWindow().setFlags(1024, 1024);
            }
        }
    }

    public final void od() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return;
        }
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null ? fkwVar.f12925le instanceof com.bykv.vk.openvk.ouw.ouw.ouw.le.yu : false) {
            SurfaceTexture surfaceTexture = this.fkw;
            if (surfaceTexture == null || surfaceTexture == lhVar.ouw) {
                return;
            }
            lhVar.ouw(surfaceTexture);
            return;
        }
        SurfaceHolder surfaceHolder = this.yu;
        if (surfaceHolder == null || surfaceHolder == lhVar.vt) {
            return;
        }
        lhVar.ouw(surfaceHolder);
    }

    public final void osn() {
        ArrayList arrayList;
        vpp vppVar = this.pno;
        List<String> list = vppVar.ksc;
        String strOuw = ryl.ouw(zih.ouw());
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains("{TS}") || next.contains("__TS__")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
                }
                if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strOuw)) {
                    next = next.replace("{UID}", strOuw).replace("__UID__", strOuw);
                }
                if (next.contains("__CID__") && vppVar != null && !TextUtils.isEmpty(vppVar.pv)) {
                    next = next.replace("__CID__", vppVar.pv);
                }
                if (next.contains("__CTYPE__") && vppVar != null) {
                    int i10 = vppVar.ucs;
                    int i11 = 4;
                    if (i10 == 2) {
                        i11 = 2;
                    } else if (i10 == 3) {
                        i11 = 3;
                    } else if (i10 != 4) {
                        i11 = (i10 == 5 || i10 == 15) ? 5 : -1;
                    }
                    next = next.replace("__CTYPE__", String.valueOf(i11));
                }
                if (next.contains("__GAID__")) {
                    next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
                }
                if (next.contains("__OS__")) {
                    next = next.replace("__OS__", "0");
                }
                if (next.contains("__UA1__")) {
                    next = next.replace("__UA1__", URLEncoder.encode(uoy.fkw()));
                }
                arrayList2.add(com.bytedance.sdk.openadsdk.tc.ouw.ouw(next));
            }
            arrayList = arrayList2;
        }
        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(arrayList, 5, this.pno.pv);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final int qbp() {
        return com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(this.tlj, this.bs);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long rn() {
        return this.bly;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long th() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return 0L;
        }
        return lhVar.ko();
    }

    public boolean uq() {
        return this.osn;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final int vm() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return 0;
        }
        return lhVar.f10474lh;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final /* bridge */ /* synthetic */ com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vpp() {
        return this.f12915ra;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void yu() {
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.cf();
        }
        jg();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final long zih() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return 0L;
        }
        if (lhVar.pno) {
            long j10 = lhVar.tlj;
            if (j10 > 0) {
                return lhVar.bly + j10;
            }
        }
        return lhVar.bly;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final com.bykv.vk.openvk.ouw.ouw.ouw.ouw zin() {
        return this.f12911le;
    }

    public ouw(Context context, @NonNull vpp vppVar, ViewGroup viewGroup) {
        this.pno = vppVar;
        this.f12908cf = context;
        this.ksc = viewGroup;
        this.ouw += hashCode();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void le() {
        pd();
    }

    public final void ouw(Runnable runnable) {
        if (this.f12915ra.ex && this.mwh) {
            runnable.run();
        } else {
            vt(runnable);
        }
    }

    public final void vt(Runnable runnable) {
        this.ryl.add(runnable);
    }

    public final void vt(boolean z10) {
        this.f12910ko = z10;
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.fkw(z10);
        }
    }

    public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        vt vtVar = (vt) lhVar;
        this.ex = vtVar;
        this.f12916rn = vtVar.f10442cf;
        lhVar.f10443jg = String.valueOf(this.pno.fqk());
    }

    public final void lh(long j10) {
        this.bly = j10;
        this.tlj = Math.max(this.tlj, j10);
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.ouw(true, this.bly, this.f12916rn);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw(SurfaceHolder surfaceHolder) {
        this.mwh = true;
        this.yu = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(surfaceHolder);
        ko.lh(this.ouw, "surfaceCreated: ");
        ksc();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void vt(int i10) {
        if (this.f12908cf == null) {
            return;
        }
        long j10 = this.bs;
        long j11 = (long) (((((long) i10) * j10) * 1.0f) / 100.0f);
        if (j10 > 0) {
            this.rrs = (int) j11;
        } else {
            this.rrs = 0L;
        }
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw(this.rrs);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void lh() {
        boolean z10 = !this.f12918th;
        this.f12918th = z10;
        Context context = this.f12908cf;
        if (context != null) {
            if (!(context instanceof Activity)) {
                ko.vt(this.ouw, "context is not activity, not support this function.");
                return;
            }
            if (z10) {
                lh(0);
                fkw fkwVar = this.f12915ra;
                if (fkwVar != null) {
                    fkwVar.ouw(this.ksc);
                    this.f12915ra.yu(false);
                }
            } else {
                lh(1);
                fkw fkwVar2 = this.f12915ra;
                if (fkwVar2 != null) {
                    fkwVar2.vt(this.ksc);
                    this.f12915ra.yu(false);
                }
            }
            WeakReference<lh.vt> weakReference = this.jae;
            lh.vt vtVar = weakReference != null ? weakReference.get() : null;
            if (vtVar != null) {
                vtVar.ouw(this.f12918th);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw(SurfaceTexture surfaceTexture) {
        this.mwh = true;
        this.fkw = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.ouw(surfaceTexture);
            this.f12911le.ouw(this.mwh);
        }
        ko.lh(this.ouw, "surfaceTextureCreated: ");
        ksc();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void vt() {
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.pno();
        }
    }

    public final void vt(ra raVar) {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
        ouwVar.ouw(this.bly);
        ouwVar.vt(th() / ((long) this.ey));
        ouwVar.vt = zih();
        ouwVar.ryl = vm();
        ouwVar.f13478le = this.f12914pd;
        ouwVar.fkw = this.uq;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.f12915ra, ouwVar, raVar);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(final boolean z10, String str) {
        this.f12916rn = z10;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.vt(z10);
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.f12915ra, z10, str);
        }
        if (this.f12907cd != null) {
            if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                this.f12907cd.ouw(z10);
            } else {
                this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.f12907cd.ouw(z10);
                    }
                });
            }
        }
    }

    public final void ouw(lh.vt vtVar) {
        this.jae = new WeakReference<>(vtVar);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw(boolean z10) {
        if (this.f12910ko) {
            cf();
        }
        if (!this.f12910ko) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
            if (!(lhVar == null || lhVar.vt())) {
                this.f12915ra.le(true ^ fvf());
                this.f12915ra.vt(z10);
            }
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = this.f12911le;
        if (lhVar2 != null && lhVar2.le()) {
            this.f12915ra.pno();
            this.f12915ra.ra();
        } else {
            this.f12915ra.pno();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw(int i10) {
        fkw fkwVar;
        if (this.f12911le == null) {
            return;
        }
        long j10 = this.rrs;
        boolean zVt = this.f12915ra.vt(i10);
        if (this.f12911le != null) {
            if (zVt && (fkwVar = this.f12915ra) != null) {
                fkwVar.yu(0);
                this.f12915ra.lh(false);
                this.f12915ra.yu(false);
                this.f12915ra.ra();
                this.f12915ra.tlj();
            }
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
            if (lhVar.fkw) {
                return;
            }
            if (lhVar.f10473le == 207 || lhVar.f10473le == 206 || lhVar.f10473le == 209) {
                lhVar.ouw(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.2
                    public final /* synthetic */ long ouw;

                    public AnonymousClass2() {
                        j = j10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (yu.this.f10477ra != null) {
                            yu.this.f10477ra.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                        }
                    }
                });
            }
        }
    }

    public final void ouw(ra raVar) {
        boolean z10 = false;
        if (this.qbp.compareAndSet(false, true)) {
            this.fvf = true;
            final le leVar = this.f12907cd;
            if (leVar != null) {
                final long jTh = th();
                final boolean z11 = this.f12916rn;
                if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                    leVar.ouw(jTh, z11);
                } else {
                    bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.9
                        public final /* synthetic */ long ouw;
                        public final /* synthetic */ boolean vt;

                        public AnonymousClass9() {
                            j = jTh;
                            z = z11;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            le.this.ouw(j, z);
                        }
                    });
                }
            }
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
            ouwVar.f13480ra = uq();
            ouwVar.vt(th());
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
            if (lhVar != null && lhVar.mwh) {
                z10 = true;
            }
            ouwVar.yu = z10;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(zih.ouw(), this.f12915ra, ouwVar, raVar);
        }
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar) {
        this.fvf = true;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
        ouwVar2.vt = zih();
        ouwVar2.vt(th() / ((long) this.ey));
        ouwVar2.ouw(this.bly);
        ouwVar2.f13477jg = ouwVar;
        com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.lh(this.f12915ra, ouwVar2);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(lh.ouw ouwVar) {
        this.f12913od = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw(qbp.ouw ouwVar) {
        int i10 = AnonymousClass6.ouw[ouwVar.ordinal()];
        if (i10 == 1) {
            cf();
            return;
        }
        if (i10 == 2) {
            mwh();
        } else {
            if (i10 != 3) {
                return;
            }
            ryl();
            this.zih = false;
            this.f12919vm = true;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ouw(long j10) {
        this.f12914pd = j10;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(float f10) {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            return lhVar.ouw(f10);
        }
        return false;
    }

    public final void ouw(long j10, long j11) {
        if (!this.jvy.get() && com.bytedance.sdk.openadsdk.le.ouw.ouw().mwh && (j10 * 1.0d) / j11 > 0.3d) {
            this.jvy.set(true);
            if (this.pno != null) {
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoPercent30", this.pno);
            }
        }
    }
}
