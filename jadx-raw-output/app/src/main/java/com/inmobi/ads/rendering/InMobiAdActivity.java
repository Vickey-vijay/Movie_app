package com.inmobi.ads.rendering;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.webkit.Profile;
import ck.p;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.AbstractC2836ei;
import com.inmobi.media.B;
import com.inmobi.media.C;
import com.inmobi.media.C2888gi;
import com.inmobi.media.C2924i4;
import com.inmobi.media.C2949j5;
import com.inmobi.media.C3053n9;
import com.inmobi.media.C3069o0;
import com.inmobi.media.C3150r7;
import com.inmobi.media.C3298x5;
import com.inmobi.media.Di;
import com.inmobi.media.F3;
import com.inmobi.media.Ff;
import com.inmobi.media.GestureDetectorOnGestureListenerC2785ci;
import com.inmobi.media.InterfaceC3028m9;
import com.inmobi.media.J5;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.L2;
import com.inmobi.media.M8;
import com.inmobi.media.Mh;
import com.inmobi.media.O8;
import com.inmobi.media.P8;
import com.inmobi.media.P9;
import com.inmobi.media.Q5;
import com.inmobi.media.Q8;
import com.inmobi.media.U5;
import com.inmobi.media.V5;
import com.inmobi.media.Vh;
import com.inmobi.media.Y3;
import com.inmobi.media.Ya;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.ko;
import com.inmobi.media.xo;
import com.ironsource.C3426d4;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class InMobiAdActivity extends Activity {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseArray f22317k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC2785ci f22318l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8 f22319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M8 f22320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC2785ci f22321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3028m9 f22326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xo f22327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnBackInvokedCallback f22328j;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.b();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u10;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = inMobiAdActivity.f22321c;
        if (gestureDetectorOnGestureListenerC2785ci != null && (u10 = gestureDetectorOnGestureListenerC2785ci.D0) != null) {
            U5.a(u10, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = inMobiAdActivity.f22321c;
        if (gestureDetectorOnGestureListenerC2785ci2 != null) {
            gestureDetectorOnGestureListenerC2785ci2.reload();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44963i, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x028a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0174  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e A[Catch: Exception -> 0x0276, TryCatch #5 {Exception -> 0x0276, blocks: (B:59:0x0197, B:61:0x019e, B:63:0x01aa, B:62:0x01a6), top: B:119:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6 A[Catch: Exception -> 0x0276, TryCatch #5 {Exception -> 0x0276, blocks: (B:59:0x0197, B:61:0x019e, B:63:0x01aa, B:62:0x01a6), top: B:119:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4 A[Catch: Exception -> 0x026e, TryCatch #2 {Exception -> 0x026e, blocks: (B:67:0x01e9, B:69:0x01f4, B:70:0x01f9, B:72:0x01fd, B:73:0x0202), top: B:114:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01fd A[Catch: Exception -> 0x026e, TryCatch #2 {Exception -> 0x026e, blocks: (B:67:0x01e9, B:69:0x01f4, B:70:0x01f9, B:72:0x01fd, B:73:0x0202), top: B:114:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0212 A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:76:0x0208, B:78:0x020e, B:80:0x0212, B:81:0x0217, B:83:0x0240, B:84:0x0248, B:86:0x024c, B:87:0x024f, B:89:0x0253, B:90:0x0258), top: B:117:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0240 A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:76:0x0208, B:78:0x020e, B:80:0x0212, B:81:0x0217, B:83:0x0240, B:84:0x0248, B:86:0x024c, B:87:0x024f, B:89:0x0253, B:90:0x0258), top: B:117:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x024c A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:76:0x0208, B:78:0x020e, B:80:0x0212, B:81:0x0217, B:83:0x0240, B:84:0x0248, B:86:0x024c, B:87:0x024f, B:89:0x0253, B:90:0x0258), top: B:117:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0253 A[Catch: Exception -> 0x026c, TryCatch #4 {Exception -> 0x026c, blocks: (B:76:0x0208, B:78:0x020e, B:80:0x0212, B:81:0x0217, B:83:0x0240, B:84:0x0248, B:86:0x024c, B:87:0x024f, B:89:0x0253, B:90:0x0258), top: B:117:0x0208 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Ya ya2;
        AbstractC2836ei listener;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        Config configA;
        AbstractC2836ei abstractC2836ei;
        AbstractC2836ei abstractC2836ei2;
        String str;
        String str2;
        InMobiAdActivity inMobiAdActivity;
        InterfaceC3028m9 interfaceC3028m9;
        AdConfig adConfig;
        Ya ya3;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci3;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci4;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci5;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci6;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci7;
        O8 o10;
        Ya ya4;
        Object obj;
        super.onCreate(bundle);
        InterfaceC3028m9 interfaceC3028m10 = this.f22326h;
        if (interfaceC3028m10 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m10).a("InMobiAdActivity", "onCreate called");
        }
        if (!Ji.d()) {
            a();
            InterfaceC3028m9 interfaceC3028m11 = this.f22326h;
            if (interfaceC3028m11 != null) {
                p.i("InMobiAdActivity", "TAG");
                ((C3053n9) interfaceC3028m11).b("InMobiAdActivity", "session not found. close");
            }
            Kb.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f22324f = false;
        if (Build.VERSION.SDK_INT >= 29) {
            J5.c(this);
        }
        this.f22322d = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f22319a = new O8(this);
        String stringExtra = getIntent().getStringExtra("loggerCacheKey");
        if (stringExtra != null) {
            HashMap map = P8.f23320a;
            p.j(stringExtra, C3426d4.i.W);
            try {
                WeakReference weakReference = (WeakReference) P8.f23320a.get(stringExtra);
                obj = weakReference != null ? weakReference.get() : null;
                if (obj == null) {
                    obj = null;
                }
            } catch (ClassCastException unused) {
            }
            this.f22326h = (InterfaceC3028m9) obj;
        }
        int i10 = this.f22322d;
        if (i10 != 100) {
            if (i10 == 102) {
                M8 m10 = new M8(this);
                InterfaceC3028m9 interfaceC3028m12 = this.f22326h;
                if (interfaceC3028m12 != null) {
                    p.j(interfaceC3028m12, "logger");
                    m10.f23148h = interfaceC3028m12;
                }
                O8 o11 = this.f22319a;
                if (o11 == null) {
                    p.B("orientationHandler");
                    o11 = null;
                }
                o11.getClass();
                p.j(m10, "orientationListener");
                o11.f23278b.add(m10);
                o11.a();
                this.f22320b = m10;
                Intent intent = getIntent();
                p.i(intent, "getIntent(...)");
                m10.a(intent, f22317k);
            }
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        long longExtra2 = getIntent().getLongExtra("viewTouchTimestamp", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        String stringExtra3 = getIntent().getStringExtra("impressionId");
        String stringExtra4 = getIntent().getStringExtra("creativeId");
        boolean booleanExtra2 = getIntent().getBooleanExtra("supportLockScreen", false);
        try {
            try {
                try {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT < 33) {
                                Parcelable parcelableExtra = getIntent().getParcelableExtra("lpTelemetryControlInfo");
                                if (parcelableExtra instanceof Ya) {
                                    ya4 = (Ya) parcelableExtra;
                                } else {
                                    ya2 = null;
                                }
                                if (booleanExtra2) {
                                    p.i("InMobiAdActivity", "TAG");
                                    getWindow().requestFeature(1);
                                    C3298x5.f25687a.getClass();
                                    if (Build.VERSION.SDK_INT >= 27) {
                                        setShowWhenLocked(true);
                                    } else {
                                        getWindow().addFlags(524288);
                                    }
                                }
                                listener = GestureDetectorOnGestureListenerC2785ci.f24140f1;
                                gestureDetectorOnGestureListenerC2785ci = f22318l;
                                if (gestureDetectorOnGestureListenerC2785ci != null) {
                                    listener = gestureDetectorOnGestureListenerC2785ci.getListener();
                                    configA = gestureDetectorOnGestureListenerC2785ci.getAdConfig();
                                } else {
                                    C2924i4 c2924i4 = Y3.f23815a;
                                    p.j(AdConfig.class, "clazz");
                                    configA = Y3.f23815a.a(AdConfig.class);
                                }
                                abstractC2836ei = listener;
                                long j10 = longExtra2 + 4;
                                InterfaceC3028m9 interfaceC3028m13 = this.f22326h;
                                ko koVar = new ko(interfaceC3028m13);
                                Di di2 = new Di("default", "browser");
                                if (configA == null) {
                                    p.B("adConfig");
                                    adConfig = null;
                                } else {
                                    adConfig = (AdConfig) configA;
                                }
                                ya3 = ya2;
                                str = "InMobiAdActivity";
                                str2 = "TAG";
                                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci8 = new GestureDetectorOnGestureListenerC2785ci((Context) this, (byte) 1, (LinkedHashSet) null, stringExtra3, (String) null, j10, (C2888gi) null, interfaceC3028m13, di2, koVar, (C3069o0) null, adConfig, 164);
                                inMobiAdActivity = this;
                                inMobiAdActivity.f22321c = gestureDetectorOnGestureListenerC2785ci8;
                                gestureDetectorOnGestureListenerC2785ci8.setPlacementId(longExtra);
                                gestureDetectorOnGestureListenerC2785ci2 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                                    gestureDetectorOnGestureListenerC2785ci2.setCreativeId(stringExtra4);
                                }
                                gestureDetectorOnGestureListenerC2785ci3 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci3 != null) {
                                    gestureDetectorOnGestureListenerC2785ci3.setAllowAutoRedirection(booleanExtra);
                                }
                                gestureDetectorOnGestureListenerC2785ci4 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci4 != null) {
                                    abstractC2836ei2 = abstractC2836ei;
                                    try {
                                        gestureDetectorOnGestureListenerC2785ci4.a(abstractC2836ei2);
                                    } catch (Exception e10) {
                                        e = e10;
                                        interfaceC3028m9 = inMobiAdActivity.f22326h;
                                        if (interfaceC3028m9 != null) {
                                            String str3 = str;
                                            p.i(str3, str2);
                                            ((C3053n9) interfaceC3028m9).a(str3, "Exception while initializing In-App browser", e);
                                        }
                                        mj.g gVar = P9.f23321a;
                                        P9.a(new L2(e));
                                        abstractC2836ei2.c();
                                        a();
                                        return;
                                    }
                                } else {
                                    abstractC2836ei2 = abstractC2836ei;
                                }
                                gestureDetectorOnGestureListenerC2785ci5 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci5 != null) {
                                    gestureDetectorOnGestureListenerC2785ci5.setLandingPageTelemetryControlInfoOnWebViewClient(ya3);
                                }
                                RelativeLayout relativeLayout = new RelativeLayout(inMobiAdActivity);
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                layoutParams.addRule(10);
                                layoutParams.addRule(2, 65533);
                                relativeLayout.setBackgroundColor(-1);
                                relativeLayout.addView(inMobiAdActivity.f22321c, layoutParams);
                                inMobiAdActivity.a(relativeLayout);
                                inMobiAdActivity.setContentView(relativeLayout);
                                gestureDetectorOnGestureListenerC2785ci6 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci6 != null) {
                                    p.g(stringExtra2);
                                    gestureDetectorOnGestureListenerC2785ci6.loadUrl(stringExtra2);
                                }
                                gestureDetectorOnGestureListenerC2785ci7 = inMobiAdActivity.f22321c;
                                if (gestureDetectorOnGestureListenerC2785ci7 != null) {
                                    gestureDetectorOnGestureListenerC2785ci7.setFullScreenActivityContext(inMobiAdActivity);
                                }
                                o10 = inMobiAdActivity.f22319a;
                                if (o10 == null) {
                                    p.B("orientationHandler");
                                    o10 = null;
                                }
                                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci9 = inMobiAdActivity.f22321c;
                                p.g(gestureDetectorOnGestureListenerC2785ci9);
                                o10.getClass();
                                p.j(gestureDetectorOnGestureListenerC2785ci9, "orientationListener");
                                o10.f23278b.add(gestureDetectorOnGestureListenerC2785ci9);
                                o10.a();
                                return;
                            }
                            ya4 = (Ya) getIntent().getParcelableExtra("lpTelemetryControlInfo", Ya.class);
                            inMobiAdActivity.f22321c = gestureDetectorOnGestureListenerC2785ci8;
                            gestureDetectorOnGestureListenerC2785ci8.setPlacementId(longExtra);
                            gestureDetectorOnGestureListenerC2785ci2 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                                gestureDetectorOnGestureListenerC2785ci2.setCreativeId(stringExtra4);
                            }
                            gestureDetectorOnGestureListenerC2785ci3 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci3 != null) {
                                gestureDetectorOnGestureListenerC2785ci3.setAllowAutoRedirection(booleanExtra);
                            }
                            gestureDetectorOnGestureListenerC2785ci4 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci4 != null) {
                                abstractC2836ei2 = abstractC2836ei;
                                gestureDetectorOnGestureListenerC2785ci4.a(abstractC2836ei2);
                            } else {
                                abstractC2836ei2 = abstractC2836ei;
                            }
                            gestureDetectorOnGestureListenerC2785ci5 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci5 != null) {
                                gestureDetectorOnGestureListenerC2785ci5.setLandingPageTelemetryControlInfoOnWebViewClient(ya3);
                            }
                            RelativeLayout relativeLayout2 = new RelativeLayout(inMobiAdActivity);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                            layoutParams2.addRule(10);
                            layoutParams2.addRule(2, 65533);
                            relativeLayout2.setBackgroundColor(-1);
                            relativeLayout2.addView(inMobiAdActivity.f22321c, layoutParams2);
                            inMobiAdActivity.a(relativeLayout2);
                            inMobiAdActivity.setContentView(relativeLayout2);
                            gestureDetectorOnGestureListenerC2785ci6 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci6 != null) {
                                p.g(stringExtra2);
                                gestureDetectorOnGestureListenerC2785ci6.loadUrl(stringExtra2);
                            }
                            gestureDetectorOnGestureListenerC2785ci7 = inMobiAdActivity.f22321c;
                            if (gestureDetectorOnGestureListenerC2785ci7 != null) {
                                gestureDetectorOnGestureListenerC2785ci7.setFullScreenActivityContext(inMobiAdActivity);
                            }
                            o10 = inMobiAdActivity.f22319a;
                            if (o10 == null) {
                                p.B("orientationHandler");
                                o10 = null;
                            }
                            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci10 = inMobiAdActivity.f22321c;
                            p.g(gestureDetectorOnGestureListenerC2785ci10);
                            o10.getClass();
                            p.j(gestureDetectorOnGestureListenerC2785ci10, "orientationListener");
                            o10.f23278b.add(gestureDetectorOnGestureListenerC2785ci10);
                            o10.a();
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            abstractC2836ei2 = abstractC2836ei;
                            interfaceC3028m9 = inMobiAdActivity.f22326h;
                            if (interfaceC3028m9 != null) {
                                String str4 = str;
                                p.i(str4, str2);
                                ((C3053n9) interfaceC3028m9).a(str4, "Exception while initializing In-App browser", e);
                            }
                            mj.g gVar2 = P9.f23321a;
                            P9.a(new L2(e));
                            abstractC2836ei2.c();
                            a();
                            return;
                        }
                        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci11 = new GestureDetectorOnGestureListenerC2785ci((Context) this, (byte) 1, (LinkedHashSet) null, stringExtra3, (String) null, j10, (C2888gi) null, interfaceC3028m13, di2, koVar, (C3069o0) null, adConfig, 164);
                        inMobiAdActivity = this;
                    } catch (Exception e12) {
                        e = e12;
                        inMobiAdActivity = this;
                    }
                    Di di3 = new Di("default", "browser");
                    if (configA == null) {
                        p.B("adConfig");
                        adConfig = null;
                    } else {
                        adConfig = (AdConfig) configA;
                    }
                    ya3 = ya2;
                    str = "InMobiAdActivity";
                    str2 = "TAG";
                } catch (Exception e13) {
                    e = e13;
                    str = "InMobiAdActivity";
                    str2 = "TAG";
                    inMobiAdActivity = this;
                    abstractC2836ei2 = abstractC2836ei;
                }
                ya2 = ya4;
            } catch (Exception unused2) {
            }
            InterfaceC3028m9 interfaceC3028m14 = this.f22326h;
            ko koVar2 = new ko(interfaceC3028m14);
        } catch (Exception e14) {
            e = e14;
            abstractC2836ei2 = abstractC2836ei;
            str = "InMobiAdActivity";
            str2 = "TAG";
            inMobiAdActivity = this;
        }
        if (booleanExtra2) {
            p.i("InMobiAdActivity", "TAG");
            getWindow().requestFeature(1);
            C3298x5.f25687a.getClass();
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        listener = GestureDetectorOnGestureListenerC2785ci.f24140f1;
        gestureDetectorOnGestureListenerC2785ci = f22318l;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            listener = gestureDetectorOnGestureListenerC2785ci.getListener();
            configA = gestureDetectorOnGestureListenerC2785ci.getAdConfig();
        } else {
            C2924i4 c2924i5 = Y3.f23815a;
            p.j(AdConfig.class, "clazz");
            configA = Y3.f23815a.a(AdConfig.class);
        }
        abstractC2836ei = listener;
        long j11 = longExtra2 + 4;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        M8 m10;
        O8 o10;
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (m10 = this.f22320b) == null) {
            return;
        }
        C c10 = m10.f23142b;
        Ff orientationProperties = (c10 == null || !(c10 instanceof GestureDetectorOnGestureListenerC2785ci)) ? null : ((GestureDetectorOnGestureListenerC2785ci) c10).getOrientationProperties();
        if (orientationProperties == null || (o10 = this.f22319a) == null) {
            return;
        }
        o10.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        p.j(intent, "intent");
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f22324f = false;
        this.f22321c = null;
        setIntent(intent);
        M8 m10 = this.f22320b;
        if (m10 != null) {
            SparseArray sparseArray = f22317k;
            p.j(intent, "intent");
            p.j(sparseArray, "adContainers");
            m10.a(intent, sparseArray);
            C3150r7 c3150r7 = m10.f23143c;
            if (c3150r7 != null) {
                c3150r7.e();
            }
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        float f10 = J5.d().f23061c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        relativeLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        if (F3.a(this)) {
            xo xoVar = this.f22327i;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f22327i = new xo(this, new Q8(layoutParams), this.f22326h);
        }
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        C2949j5 c2949j5 = new C2949j5(this, (byte) 2, this.f22326h);
        c2949j5.setOnTouchListener(new View.OnTouchListener() { // from class: a7.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(this.f3499b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j5, layoutParams2);
        C2949j5 c2949j6 = new C2949j5(this, (byte) 3, this.f22326h);
        c2949j6.setOnTouchListener(new View.OnTouchListener() { // from class: a7.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(this.f3500b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j6, layoutParams2);
        C2949j5 c2949j7 = new C2949j5(this, (byte) 4, this.f22326h);
        c2949j7.setOnTouchListener(new View.OnTouchListener() { // from class: a7.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(this.f3501b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j7, layoutParams2);
        C2949j5 c2949j8 = new C2949j5(this, (byte) 6, this.f22326h);
        c2949j8.setOnTouchListener(new View.OnTouchListener() { // from class: a7.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(this.f3502b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j8, layoutParams2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        p.j(configuration, "newConfig");
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(configuration);
        O8 o10 = this.f22319a;
        if (o10 != null) {
            o10.b();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        M8 m10;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        U5 u10;
        B fullScreenEventsListener;
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onDestroy");
        }
        int i10 = this.f22322d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = f22318l;
            if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                gestureDetectorOnGestureListenerC2785ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onClose"));
            }
        } else if (102 == i10 && (m10 = this.f22320b) != null && m10.f23145e != null) {
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            m10.a(Mh.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.f22323e) {
            int i11 = this.f22322d;
            if (100 == i11) {
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci3 = this.f22321c;
                if (gestureDetectorOnGestureListenerC2785ci3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC2785ci3.getFullScreenEventsListener()) != null) {
                    try {
                        Vh vh2 = (Vh) fullScreenEventsListener;
                        InterfaceC3028m9 interfaceC3028m10 = vh2.f23709a.f24162i;
                        if (interfaceC3028m10 != null) {
                            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                            p.i(str, "access$getTAG$cp(...)");
                            ((C3053n9) interfaceC3028m10).a(str, Mf.f27063m);
                        }
                        if (p.e(Profile.DEFAULT_PROFILE_NAME, vh2.f23709a.getViewState())) {
                            vh2.f23709a.setAndUpdateViewState("Hidden");
                        }
                        vh2.f23709a.W();
                        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci4 = this.f22321c;
                        p.g(gestureDetectorOnGestureListenerC2785ci4);
                        gestureDetectorOnGestureListenerC2785ci4.b();
                        O8 o10 = this.f22319a;
                        if (o10 == null) {
                            p.B("orientationHandler");
                            o10 = null;
                        }
                        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci5 = this.f22321c;
                        p.g(gestureDetectorOnGestureListenerC2785ci5);
                        o10.getClass();
                        p.j(gestureDetectorOnGestureListenerC2785ci5, "orientationListener");
                        o10.f23278b.remove(gestureDetectorOnGestureListenerC2785ci5);
                        o10.a();
                        this.f22321c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i11) {
                M8 m11 = this.f22320b;
                if (m11 != null) {
                    O8 o11 = this.f22319a;
                    if (o11 == null) {
                        p.B("orientationHandler");
                        o11 = null;
                    }
                    o11.getClass();
                    p.j(m11, "orientationListener");
                    o11.f23278b.remove(m11);
                    o11.a();
                    C3150r7 c3150r7 = m11.f23143c;
                    if (c3150r7 != null) {
                        c3150r7.b();
                    }
                    RelativeLayout relativeLayout = m11.f23144d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Q5 q10 = m11.f23145e;
                    if (q10 != null) {
                        V5 v10 = q10.f23369c;
                        if (v10 != null) {
                            v10.destroy();
                        }
                        q10.f23369c = null;
                        q10.f23370d = null;
                        q10.f23371e = null;
                        xo xoVar = q10.f23373g;
                        if (xoVar != null) {
                            xoVar.a();
                        }
                        q10.removeAllViews();
                    }
                    m11.f23141a.clear();
                    m11.f23142b = null;
                    m11.f23143c = null;
                    m11.f23144d = null;
                    m11.f23145e = null;
                }
                this.f22320b = null;
            }
        } else {
            int i12 = this.f22322d;
            if (100 != i12 && 102 == i12) {
                M8 m12 = this.f22320b;
                if (m12 != null) {
                    O8 o12 = this.f22319a;
                    if (o12 == null) {
                        p.B("orientationHandler");
                        o12 = null;
                    }
                    o12.getClass();
                    p.j(m12, "orientationListener");
                    o12.f23278b.remove(m12);
                    o12.a();
                    C3150r7 c3150r8 = m12.f23143c;
                    if (c3150r8 != null) {
                        c3150r8.b();
                    }
                    RelativeLayout relativeLayout2 = m12.f23144d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Q5 q11 = m12.f23145e;
                    if (q11 != null) {
                        V5 v11 = q11.f23369c;
                        if (v11 != null) {
                            v11.destroy();
                        }
                        q11.f23369c = null;
                        q11.f23370d = null;
                        q11.f23371e = null;
                        xo xoVar2 = q11.f23373g;
                        if (xoVar2 != null) {
                            xoVar2.a();
                        }
                        q11.removeAllViews();
                    }
                    m12.f23141a.clear();
                    m12.f23142b = null;
                    m12.f23143c = null;
                    m12.f23144d = null;
                    m12.f23145e = null;
                }
                this.f22320b = null;
            }
            if (100 == this.f22322d && (gestureDetectorOnGestureListenerC2785ci = this.f22321c) != null && (u10 = gestureDetectorOnGestureListenerC2785ci.D0) != null) {
                U5.a(u10, 9, true, null, 12);
            }
        }
        xo xoVar3 = this.f22327i;
        if (xoVar3 != null) {
            xoVar3.a();
        }
        this.f22327i = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C3150r7 c3150r7;
        B fullScreenEventsListener;
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", C3426d4.i.f28569u0);
        }
        super.onResume();
        if (this.f22323e) {
            return;
        }
        int i10 = this.f22322d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f22321c;
            if (gestureDetectorOnGestureListenerC2785ci != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC2785ci.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f22324f) {
                        this.f22324f = true;
                        ((Vh) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = f22318l;
            if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                gestureDetectorOnGestureListenerC2785ci2.c(Mh.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i10) {
            M8 m10 = this.f22320b;
            if (m10 != null && (c3150r7 = m10.f23143c) != null && !c3150r7.f25247h) {
                try {
                    c3150r7.f25247h = true;
                    B fullScreenEventsListener2 = c3150r7.f25245f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((Vh) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            M8 m11 = this.f22320b;
            if (m11 == null || m11.f23145e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            m11.a(Mh.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        M8 m10;
        Window window;
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        C3298x5.f25687a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.f22328j == null) {
                this.f22328j = new OnBackInvokedCallback() { // from class: a7.e
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(this.f3503a);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f22328j;
            if (onBackInvokedCallback == null) {
                p.B("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f22323e || 102 != this.f22322d || (m10 = this.f22320b) == null) {
            return;
        }
        C3150r7 c3150r7 = m10.f23143c;
        if (c3150r7 != null) {
            c3150r7.e();
        }
        C c10 = m10.f23142b;
        if (c10 != null) {
            if ((c10 instanceof GestureDetectorOnGestureListenerC2785ci ? ((GestureDetectorOnGestureListenerC2785ci) c10).W0 : false) && !C3298x5.r() && C3298x5.u()) {
                Object obj = m10.f23141a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        C3298x5.f25687a.getClass();
        if (Build.VERSION.SDK_INT < 33 || this.f22328j == null) {
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        OnBackInvokedCallback onBackInvokedCallback = this.f22328j;
        if (onBackInvokedCallback == null) {
            p.B("backInvokedCallback");
            onBackInvokedCallback = null;
        }
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u10;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = inMobiAdActivity.f22321c;
            if (gestureDetectorOnGestureListenerC2785ci != null && gestureDetectorOnGestureListenerC2785ci.canGoBack()) {
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = inMobiAdActivity.f22321c;
                if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                    gestureDetectorOnGestureListenerC2785ci2.goBack();
                }
            } else {
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci3 = inMobiAdActivity.f22321c;
                if (gestureDetectorOnGestureListenerC2785ci3 != null && (u10 = gestureDetectorOnGestureListenerC2785ci3.D0) != null) {
                    U5.a(u10, 5, true, null, 12);
                }
                inMobiAdActivity.f22323e = true;
                inMobiAdActivity.a();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = inMobiAdActivity.f22321c;
            if (gestureDetectorOnGestureListenerC2785ci2 != null && gestureDetectorOnGestureListenerC2785ci2.canGoForward() && (gestureDetectorOnGestureListenerC2785ci = inMobiAdActivity.f22321c) != null) {
                gestureDetectorOnGestureListenerC2785ci.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b();
    }

    @Override // android.app.Activity
    public final void onPause() {
        M8 m10;
        super.onPause();
        int i10 = this.f22322d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = f22318l;
            if (gestureDetectorOnGestureListenerC2785ci != null) {
                GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                gestureDetectorOnGestureListenerC2785ci.c(Mh.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 == i10 && (m10 = this.f22320b) != null && m10.f23145e != null) {
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            m10.a(Mh.a("IN_CUSTOM_EXPAND", "onHidden"));
        }
    }

    public final void b() {
        U5 u10;
        C3150r7 c3150r7;
        InterfaceC3028m9 interfaceC3028m9 = this.f22326h;
        if (interfaceC3028m9 != null) {
            p.i("InMobiAdActivity", "TAG");
            ((C3053n9) interfaceC3028m9).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f22322d;
        if (i10 == 102) {
            InterfaceC3028m9 interfaceC3028m10 = this.f22326h;
            if (interfaceC3028m10 != null) {
                p.i("InMobiAdActivity", "TAG");
                ((C3053n9) interfaceC3028m10).c("InMobiAdActivity", "back pressed on ad");
            }
            M8 m10 = this.f22320b;
            if (m10 == null || (c3150r7 = m10.f23143c) == null) {
                return;
            }
            c3150r7.a();
            return;
        }
        if (i10 == 100) {
            InterfaceC3028m9 interfaceC3028m11 = this.f22326h;
            if (interfaceC3028m11 != null) {
                p.i("InMobiAdActivity", "TAG");
                ((C3053n9) interfaceC3028m11).c("InMobiAdActivity", "back pressed in browser");
            }
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f22321c;
            if (gestureDetectorOnGestureListenerC2785ci != null && (u10 = gestureDetectorOnGestureListenerC2785ci.D0) != null) {
                U5.a(u10, 7, true, null, 12);
            }
            this.f22323e = true;
            a();
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        p.j(configuration, "newConfig");
        super.onMultiWindowModeChanged(z10, configuration);
        onMultiWindowModeChanged(z10);
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        U5 u10;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = inMobiAdActivity.f22321c;
            if (gestureDetectorOnGestureListenerC2785ci != null && (u10 = gestureDetectorOnGestureListenerC2785ci.D0) != null) {
                U5.a(u10, 5, true, null, 12);
            }
            inMobiAdActivity.f22323e = true;
            inMobiAdActivity.a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        if (isTaskRoot()) {
            C3298x5.f25687a.getClass();
            if (C3298x5.v()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }
}
