package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.Q5;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Q5 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V5 f23369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T5 f23370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2736al f23371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC3028m9 f23372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xo f23373g;

    public final void a(String str, R5 r10, boolean z10, long j10, String str2, String str3, String str4, Ya ya2) {
        ck.p.j(str, "expandInput");
        ck.p.j(r10, "inputType");
        ck.p.j(str2, "placementType");
        ck.p.j(str3, "impressionId");
        ck.p.j(str4, "creativeId");
        if (this.f23369c == null) {
            Context context = getContext();
            ck.p.i(context, "getContext(...)");
            V5 v10 = new V5(context, j10, str2, str3, str4, new bk.l() { // from class: b7.x3
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return Q5.a(this.f5245b, (JSONObject) obj);
                }
            }, this.f23372f);
            this.f23369c = v10;
            v10.setId(65517);
        }
        V5 v11 = this.f23369c;
        if (v11 != null) {
            v11.setLandingPageTelemetryControlInfo(ya2);
        }
        if (this.f23368b != str.hashCode()) {
            if (r10 == R5.URL) {
                V5 v12 = this.f23369c;
                if (v12 != null) {
                    v12.loadUrl(str);
                }
            } else {
                V5 v13 = this.f23369c;
                if (v13 != null) {
                    v13.loadData(str, "text/html", "UTF-8");
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            V5 v14 = this.f23369c;
            if (v14 != null) {
                v14.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.f23369c, layoutParams);
            }
        }
        this.f23368b = str.hashCode();
        if (!z10) {
            View viewFindViewById = findViewById(65533);
            if (viewFindViewById != null) {
                removeView(viewFindViewById);
                return;
            }
            return;
        }
        if (findViewById(65533) != null) {
            return;
        }
        float f10 = J5.d().f23061c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (F3.a(this.f23367a)) {
            xo xoVar = this.f23373g;
            if (xoVar != null) {
                xoVar.a();
            }
            this.f23373g = new xo(this.f23367a, new P5(layoutParams2), this.f23372f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        C2949j5 c2949j5 = new C2949j5(context, (byte) 2, this.f23372f);
        c2949j5.setId(65516);
        c2949j5.setOnTouchListener(new View.OnTouchListener() { // from class: b7.z3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.b(this.f5275b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        C2949j5 c2949j5 = new C2949j5(context, (byte) 6, this.f23372f);
        c2949j5.setId(1048283);
        c2949j5.setOnTouchListener(new View.OnTouchListener() { // from class: b7.y3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.c(this.f5259b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        C2949j5 c2949j5 = new C2949j5(context, (byte) 3, this.f23372f);
        c2949j5.setId(65502);
        c2949j5.setOnTouchListener(new View.OnTouchListener() { // from class: b7.b4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.d(this.f4853b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j5, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(Activity activity) {
        super(activity);
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f23367a = activity;
        this.f23368b = -1;
    }

    public final InterfaceC2736al getUserLeftApplicationListener() {
        return this.f23371e;
    }

    public final void setEmbeddedBrowserUpdateListener(T5 t10) {
        ck.p.j(t10, "browserUpdateListener");
        this.f23370d = t10;
    }

    public final void setLogger(InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(interfaceC3028m9, "logger");
        this.f23372f = interfaceC3028m9;
    }

    public final void setUserLeftApplicationListener(InterfaceC2736al interfaceC2736al) {
        this.f23371e = interfaceC2736al;
    }

    public static final boolean b(Q5 q10, View view, MotionEvent motionEvent) {
        U5 u10;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            V5 v10 = q10.f23369c;
            if (v10 != null && (u10 = v10.f23681h) != null) {
                U5.a(u10, 5, true, null, 12);
            }
            T5 t10 = q10.f23370d;
            if (t10 != null) {
                M8.a(((L8) t10).f23064a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(Q5 q10, View view, MotionEvent motionEvent) {
        V5 v10 = q10.f23369c;
        if (v10 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (v10.canGoForward()) {
                v10.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(Q5 q10, View view, MotionEvent motionEvent) {
        U5 u10;
        U5 u11;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            V5 v10 = q10.f23369c;
            if (v10 != null && (u11 = v10.f23681h) != null) {
                U5.a(u11, 6, true, null, 12);
            }
            V5 v11 = q10.f23369c;
            if (v11 != null && (u10 = v11.f23681h) != null) {
                U5.a(u10, 6, true, null, 12);
            }
            V5 v12 = q10.f23369c;
            if (v12 != null) {
                v12.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final mj.r a(Q5 q10, JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        T5 t10 = q10.f23370d;
        if (t10 != null) {
            ck.p.j(jSONObject, "jsonObject");
            C c10 = ((L8) t10).f23064a.f23142b;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = c10 instanceof GestureDetectorOnGestureListenerC2785ci ? (GestureDetectorOnGestureListenerC2785ci) c10 : null;
            if (gestureDetectorOnGestureListenerC2785ci != null) {
                gestureDetectorOnGestureListenerC2785ci.c(jSONObject);
            }
        }
        return mj.r.f64562a;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        C2949j5 c2949j5 = new C2949j5(context, (byte) 4, this.f23372f);
        c2949j5.setId(65503);
        c2949j5.setOnTouchListener(new View.OnTouchListener() { // from class: b7.a4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Q5.a(this.f4839b, view, motionEvent);
            }
        });
        linearLayout.addView(c2949j5, layoutParams);
    }

    public static final boolean a(Q5 q10, View view, MotionEvent motionEvent) {
        V5 v10 = q10.f23369c;
        if (v10 == null) {
            T5 t10 = q10.f23370d;
            if (t10 != null) {
                M8.a(((L8) t10).f23064a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (v10.canGoBack()) {
                v10.goBack();
            } else {
                T5 t11 = q10.f23370d;
                if (t11 != null) {
                    M8.a(((L8) t11).f23064a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
