package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.M8;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class M8 implements Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f23142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3150r7 f23143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f23144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q5 f23145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Df f23146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3028m9 f23148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L8 f23149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final K8 f23150j;

    public final void a(Intent intent, SparseArray sparseArray) {
        Q5 q10;
        Window window;
        ck.p.j(intent, "intent");
        ck.p.j(sparseArray, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.f23141a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).a();
                return;
            }
            return;
        }
        C c10 = (C) sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c10 == null) {
            Activity activity2 = (Activity) this.f23141a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).a();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            B fullScreenEventsListener = ((GestureDetectorOnGestureListenerC2785ci) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((Vh) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.f23141a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).a();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f23141a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f23141a.get();
            ck.p.h(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).f22325g) {
                Object obj2 = this.f23141a.get();
                ck.p.h(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).f22325g = true;
                if (!(c10 instanceof GestureDetectorOnGestureListenerC2785ci) ? false : ((GestureDetectorOnGestureListenerC2785ci) c10).W0) {
                    InterfaceC3028m9 interfaceC3028m9 = this.f23148h;
                    if (interfaceC3028m9 != null) {
                        ((C3053n9) interfaceC3028m9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f23141a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        C3298x5.f25687a.getClass();
                        if (C3298x5.r()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        } else if (C3298x5.p()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        }
                        if (C3298x5.r()) {
                            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                            ck.p.i(insetsController, "getInsetsController(...)");
                            insetsController.setSystemBarsBehavior(2);
                            insetsController.hide(WindowInsetsCompat.Type.systemBars());
                            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
                        } else if (C3298x5.u()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.f23141a.get();
                    if (activity4 != null) {
                        ck.p.j(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !ck.p.e(CreativeInfo.f44315al, ((GestureDetectorOnGestureListenerC2785ci) c10).getMarkupType())) || ((202 == intExtra && !ck.p.e("htmlUrl", ((GestureDetectorOnGestureListenerC2785ci) c10).getMarkupType())) || (201 == intExtra && !ck.p.e("inmobiJson", ((GestureDetectorOnGestureListenerC2785ci) c10).getMarkupType())))) {
            B fullScreenEventsListener2 = ((GestureDetectorOnGestureListenerC2785ci) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((Vh) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.f23141a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).a();
                return;
            }
            return;
        }
        try {
            this.f23142b = c10;
            ((GestureDetectorOnGestureListenerC2785ci) c10).setFullScreenActivityContext((Activity) this.f23141a.get());
            a();
            Activity activity6 = (Activity) this.f23141a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.f23144d = relativeLayout;
            }
            a(c10);
            C3150r7 c3150r7 = this.f23143c;
            if (c3150r7 != null) {
                c3150r7.d();
            }
            Activity activity7 = (Activity) this.f23141a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.f23144d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    C3150r7 c3150r8 = this.f23143c;
                    if (c3150r8 != null) {
                        c3150r8.c();
                    }
                }
            }
            if (c10 instanceof GestureDetectorOnGestureListenerC2785ci) {
                ((GestureDetectorOnGestureListenerC2785ci) c10).setEmbeddedBrowserJsCallbacks(this.f23150j);
            }
            if (!(c10 instanceof GestureDetectorOnGestureListenerC2785ci) || (q10 = this.f23145e) == null) {
                return;
            }
            q10.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC2785ci) c10).getListener());
        } catch (Exception e10) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) c10;
            gestureDetectorOnGestureListenerC2785ci.setFullScreenActivityContext(null);
            B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC2785ci.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((Vh) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.f23141a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).a();
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void b(Df df2) {
        Objects.toString(df2);
        this.f23146f = df2;
    }

    public M8(InMobiAdActivity inMobiAdActivity) {
        ck.p.j(inMobiAdActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f23141a = new WeakReference(inMobiAdActivity);
        this.f23146f = Ef.a(J5.g());
        this.f23147g = 1.0f;
        this.f23149i = new L8(this);
        this.f23150j = new K8(this);
    }

    public final void c() {
        try {
            final Q5 q10 = this.f23145e;
            if (q10 != null) {
                ViewParent parent = q10.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(q10);
                }
                ViewParent parent2 = q10.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new Runnable() { // from class: b7.n3
                        @Override // java.lang.Runnable
                        public final void run() {
                            M8.a(q10);
                        }
                    });
                }
            }
            Q5 q11 = this.f23145e;
            if (q11 != null) {
                V5 v10 = q11.f23369c;
                if (v10 != null) {
                    v10.destroy();
                }
                q11.f23369c = null;
                q11.f23370d = null;
                q11.f23371e = null;
                xo xoVar = q11.f23373g;
                if (xoVar != null) {
                    xoVar.a();
                }
                q11.removeAllViews();
            }
            this.f23145e = null;
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            a(Mh.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public final void b() {
        L5 l5D;
        Activity activity;
        if (this.f23145e == null) {
            return;
        }
        C c10 = this.f23142b;
        if (c10 != null) {
            if ((!(c10 instanceof GestureDetectorOnGestureListenerC2785ci) ? false : ((GestureDetectorOnGestureListenerC2785ci) c10).W0) || ((activity = (Activity) this.f23141a.get()) != null && F3.a(activity))) {
                l5D = J5.h();
            } else {
                l5D = J5.d();
            }
        } else {
            l5D = J5.d();
        }
        float f10 = l5D.f23059a;
        float f11 = l5D.f23061c;
        float f12 = f10 * f11;
        float f13 = l5D.f23060b * f11;
        if (Ef.b(this.f23146f)) {
            a(ek.b.c((1 - this.f23147g) * f12), -1);
        } else {
            a(-1, ek.b.c((1 - this.f23147g) * f13));
        }
    }

    public final void a() {
        Activity activity = (Activity) this.f23141a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(C c10) {
        RelativeLayout relativeLayout;
        if (((Activity) this.f23141a.get()) == null || (relativeLayout = this.f23144d) == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) c10;
        String markupType = gestureDetectorOnGestureListenerC2785ci.getMarkupType();
        if (!ck.p.e(markupType, CreativeInfo.f44315al) && !ck.p.e(markupType, "htmlUrl")) {
            throw new IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        C3150r7 c3150r7 = new C3150r7(this.f23141a, gestureDetectorOnGestureListenerC2785ci, relativeLayout);
        this.f23143c = c3150r7;
        c3150r7.a(this.f23146f);
        c3150r7.f25242c = this.f23147g;
        c3150r7.f25243d = gestureDetectorOnGestureListenerC2785ci.W0;
    }

    public final void a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        C c10 = this.f23142b;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c10 instanceof GestureDetectorOnGestureListenerC2785ci ? (GestureDetectorOnGestureListenerC2785ci) c10 : null;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.c(jSONObject);
        }
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df df2) {
        ck.p.j(df2, "orientation");
        if (((Activity) this.f23141a.get()) == null) {
            return;
        }
        C3150r7 c3150r7 = this.f23143c;
        if (c3150r7 != null) {
            c3150r7.a(df2);
        }
        Df df3 = this.f23146f;
        if (df3 != df2 && Ef.b(df3) != Ef.b(df2)) {
            b(df2);
            C3150r7 c3150r8 = this.f23143c;
            if (c3150r8 != null) {
                c3150r8.c();
            }
            b();
            return;
        }
        b(df2);
    }

    public static final void a(M8 m10) {
        m10.f23147g = 1.0f;
        C3150r7 c3150r7 = m10.f23143c;
        if (c3150r7 != null) {
            c3150r7.f25242c = 1.0f;
            c3150r7.c();
        }
        Q5 q10 = m10.f23145e;
        if (q10 != null) {
            q10.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        m10.c();
    }

    public static final void a(Q5 q10) {
        q10.getParent().requestLayout();
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f23141a.get();
        if (activity == null) {
            return;
        }
        Ef.b(this.f23146f);
        if (Ef.b(this.f23146f)) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        ck.p.g(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            Q5 q10 = this.f23145e;
            if (q10 != null) {
                q10.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        Q5 q11 = this.f23145e;
        if (q11 != null) {
            relativeLayout.addView(q11, layoutParams);
        }
    }
}
