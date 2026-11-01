package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.L0;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f23035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f23036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f23038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f23040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdQualityControl f23041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Hn f23042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f23043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f23044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f23045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f23046l;

    public final void a(String str, byte[] bArr, boolean z10) {
        Context context = Ji.f22951a;
        if (context != null) {
            Ej ej2 = new Ej(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f23040f.add(ej2);
            }
            AbstractC2817e.a(ej2, new J0(this, z10, ej2, str), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE 
                  (r1v1 'ej2' com.inmobi.media.Ej)
                  (wrap com.inmobi.media.J0:0x002b: CONSTRUCTOR 
                  (r2v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS])
                  (r5v0 'z10' boolean)
                  (r1v1 'ej2' com.inmobi.media.Ej)
                  (r3v0 'str' java.lang.String)
                 A[MD:(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void (m), WRAPPED] (LINE:5) call: com.inmobi.media.J0.<init>(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap bk.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: b7.p6.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, bk.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, bk.a):void (m)] (LINE:2) in method: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: b7.p6, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                android.content.Context r0 = com.inmobi.media.Ji.f22951a
                if (r0 == 0) goto L31
                java.io.File r0 = r0.getFilesDir()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "/adQuality/screenshots"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.inmobi.media.Ej r1 = new com.inmobi.media.Ej
                r1.<init>(r0, r4)
                if (r5 != 0) goto L29
                java.util.concurrent.CopyOnWriteArrayList r4 = r2.f23040f
                r4.add(r1)
            L29:
                com.inmobi.media.J0 r4 = new com.inmobi.media.J0
                r4.<init>(r2, r5, r1, r3)
                com.inmobi.media.AbstractC2817e.a(r1, r4)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void");
        }

        public L0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3028m9 interfaceC3028m9) {
            ck.p.j(adQualityConfig, "adQualityConfig");
            this.f23035a = adQualityConfig;
            this.f23036b = interfaceC3028m9;
            this.f23037c = new AtomicBoolean(false);
            this.f23038d = new AtomicBoolean(false);
            this.f23039e = new AtomicBoolean(false);
            this.f23040f = new CopyOnWriteArrayList();
            this.f23042h = Hn.UNKNOWN;
            this.f23044j = "";
            this.f23045k = new JSONObject();
            this.f23046l = new AtomicBoolean(false);
        }

        public final void a(Activity activity, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
            ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            ck.p.j(str, "url");
            ck.p.j(jSONObject, "extras");
            ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (jSONObject.length() > 0 && str.length() > 0) {
                this.f23044j = str;
                this.f23045k = jSONObject;
                a("report ad starting");
                if (z10) {
                    a("report ad capture");
                    a(activity, 0L, true, qh2);
                    return;
                } else {
                    a("report ad report");
                    a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                    return;
                }
            }
            qh2.f23391a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
        }

        public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
            ck.p.j(gestureDetectorOnGestureListenerC2785ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(str, "url");
            ck.p.j(jSONObject, "extras");
            ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (jSONObject.length() > 0 && str.length() > 0) {
                this.f23044j = str;
                this.f23045k = jSONObject;
                if (z10) {
                    a(gestureDetectorOnGestureListenerC2785ci, 0L, true, qh2);
                    return;
                } else {
                    a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                    return;
                }
            }
            qh2.f23391a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
        }

        public final boolean a() {
            if (this.f23037c.get()) {
                a("ad quality session is already in progress. skipping...");
                return false;
            }
            if (!this.f23035a.getEnabled()) {
                a("config kill switch while state check - false. ad quality will skip");
                return false;
            }
            if (this.f23041g == null) {
                a("setup not done. skipping");
                return false;
            }
            Hn hn2 = this.f23042h;
            if (hn2 != Hn.UNKNOWN && hn2 != Hn.HIDDEN) {
                return true;
            }
            a("ad view is not visible. skipping");
            return false;
        }

        public final void a(AdQualityResult adQualityResult, boolean z10) {
            if (adQualityResult.getBeaconUrl().length() != 0) {
                AbstractC2817e.a(new C3011lh(adQualityResult), new I0(this, z10), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                      (wrap com.inmobi.media.lh:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] (LINE:38) call: com.inmobi.media.lh.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                      (wrap com.inmobi.media.I0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z10' boolean) A[MD:(com.inmobi.media.L0, boolean):void (m), WRAPPED] (LINE:39) call: com.inmobi.media.I0.<init>(com.inmobi.media.L0, boolean):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap bk.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: b7.p6.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, bk.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, bk.a):void (m)] (LINE:2) in method: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: b7.p6, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = r2.getBeaconUrl()
                    int r0 = r0.length()
                    if (r0 != 0) goto L10
                    java.lang.String r2 = "beacon is empty"
                    r1.a(r2)
                    return
                L10:
                    com.inmobi.media.lh r0 = new com.inmobi.media.lh
                    r0.<init>(r2)
                    com.inmobi.media.I0 r2 = new com.inmobi.media.I0
                    r2.<init>(r1, r3)
                    com.inmobi.media.AbstractC2817e.a(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
            }

            public final void a(final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, final long j10, final boolean z10, final Qh qh2) {
                a("isCapture started - " + this.f23046l.get() + ", isReporting - " + z10);
                if (this.f23046l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    gestureDetectorOnGestureListenerC2785ci.post(new Runnable() { // from class: b7.p2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f5120b, gestureDetectorOnGestureListenerC2785ci, j10, z10, qh2);
                        }
                    });
                }
            }

            public static final void a(L0 l10, View view, long j10, boolean z10, Qh qh2) {
                l10.getClass();
                ck.p.j(view, "adView");
                l10.a(new Hi(view, l10.f23035a), j10, z10, qh2);
                l10.f23046l.set(!z10);
            }

            public final void a(final Activity activity, final long j10, final boolean z10, final Qh qh2) {
                a("isCapture started - " + this.f23046l.get() + ", isReporting - " + z10);
                if (this.f23046l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: b7.o2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f5094b, activity, j10, z10, qh2);
                        }
                    });
                }
            }

            public static final void a(L0 l10, Activity activity, long j10, boolean z10, Qh qh2) {
                l10.a("activity is visible");
                Window window = activity.getWindow();
                ck.p.i(window, "getWindow(...)");
                ck.p.j(window, "window");
                l10.a(new C3135qg(window, l10.f23035a), j10, z10, qh2);
                l10.f23046l.set(!z10);
            }

            public final void a(AbstractC3195t2 abstractC3195t2, long j10, boolean z10, Qh qh2) {
                if (!z10) {
                    this.f23040f.add(abstractC3195t2);
                }
                AbstractC2817e.a(abstractC3195t2, new K0(this, abstractC3195t2, z10, qh2), Long.valueOf(j10), new bk.a() { // from class: b7.n2
                    @Override // bk.a
                    public final Object invoke() {
                        return Boolean.valueOf(L0.a(this.f5075b));
                    }
                });
            }

            public static final boolean a(L0 l10) {
                return l10.f23042h == Hn.VISIBLE;
            }

            public final void a(Bitmap bitmap, M0 m10, boolean z10, Qh qh2) {
                String beacon;
                ck.p.j(m10, "process");
                a("Screen shot result received - isReporting - " + z10);
                this.f23040f.remove(m10);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (bitmap != null && qh2 != null) {
                    qh2.f23391a.g("window.mraidview.broadcastEvent('ScreenshotSuccess')");
                }
                if (!z10) {
                    AdQualityControl adQualityControl = this.f23041g;
                    if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                        a("saving to file - beacon - " + beacon);
                        ck.p.g(byteArray);
                        a(beacon, byteArray, false);
                    }
                } else {
                    String str = this.f23044j;
                    ck.p.g(byteArray);
                    a(str, byteArray, true);
                }
                this.f23046l.set(false);
            }

            public final void a(Exception exc, M0 m10) {
                ck.p.j(m10, "process");
                a("error in running process - " + m10.getClass().getSimpleName(), exc);
                this.f23040f.remove(m10);
                a(true);
            }

            public final void a(String str, M0 m10, String str2, boolean z10) {
                ck.p.j(str, "result");
                ck.p.j(m10, "process");
                ck.p.j(str2, "beacon");
                if (z10) {
                    a(new AdQualityResult(str, null, str2, this.f23045k.toString()), false);
                    return;
                }
                this.f23040f.remove(m10);
                AdQualityResult adQualityResult = this.f23043i;
                if (adQualityResult != null) {
                    adQualityResult.setImageLocation(str);
                } else {
                    this.f23043i = new AdQualityResult(str, null, str2, null, 8, null);
                }
                a("file is saved. result - " + this.f23043i);
                a(true);
            }

            public final void a(boolean z10) {
                String beacon;
                AdQualityControl adQualityControl = this.f23041g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f23040f.isEmpty() && this.f23038d.get() && !this.f23039e.get()) {
                    this.f23039e.set(true);
                    a("session end - queuing result");
                    AdQualityResult adQualityResult = this.f23043i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (this.f23038d.get() && !z10 && !this.f23039e.get()) {
                    this.f23039e.set(true);
                    a("session stop - queuing result");
                    nk.l0 l0Var = E0.f22560e;
                    if (l0Var != null) {
                        kotlinx.coroutines.d.c(l0Var, new CancellationException("Shutdown"));
                    }
                    E0.f22560e = null;
                    AdQualityResult adQualityResult2 = this.f23043i;
                    if (adQualityResult2 == null) {
                        adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult2, true);
                    return;
                }
                this.f23040f.size();
                this.f23038d.get();
                Objects.toString(this.f23039e);
            }

            public final void a(String str) {
                InterfaceC3028m9 interfaceC3028m9 = this.f23036b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a("AdQualityManager", str);
                }
            }

            public final void a(String str, Exception exc) {
                mj.r rVar;
                if (exc != null) {
                    InterfaceC3028m9 interfaceC3028m9 = this.f23036b;
                    if (interfaceC3028m9 != null) {
                        ((C3053n9) interfaceC3028m9).a("AdQualityManager", str, exc);
                        rVar = mj.r.f64562a;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null) {
                        return;
                    }
                }
                InterfaceC3028m9 interfaceC3028m10 = this.f23036b;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).b("AdQualityManager", "Error with null exception : " + str);
                    mj.r rVar2 = mj.r.f64562a;
                }
            }
        }
