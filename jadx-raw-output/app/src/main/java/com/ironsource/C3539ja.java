package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.ironsource.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3539ja extends WebView implements InterfaceC3750va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3733ua f29273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qc f29274b;

    public /* synthetic */ C3539ja(Context context, InterfaceC3733ua interfaceC3733ua, int i10, ck.i iVar) {
        this(context, (i10 & 2) != 0 ? new InterfaceC3733ua.a(0, 1, null) : interfaceC3733ua);
    }

    @Override // com.ironsource.InterfaceC3750va
    public void a(String str) {
        ck.p.j(str, "script");
        InterfaceC3733ua interfaceC3733ua = this.f29273a;
        InterfaceC3733ua interfaceC3733ua2 = null;
        if (interfaceC3733ua == null) {
            ck.p.B("javascriptEngine");
            interfaceC3733ua = null;
        }
        if (!interfaceC3733ua.a()) {
            InterfaceC3733ua interfaceC3733ua3 = this.f29273a;
            if (interfaceC3733ua3 == null) {
                ck.p.B("javascriptEngine");
                interfaceC3733ua3 = null;
            }
            interfaceC3733ua3.a(this);
        }
        InterfaceC3733ua interfaceC3733ua4 = this.f29273a;
        if (interfaceC3733ua4 == null) {
            ck.p.B("javascriptEngine");
        } else {
            interfaceC3733ua2 = interfaceC3733ua4;
        }
        interfaceC3733ua2.a(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Qc qc2;
        ck.p.j(keyEvent, "event");
        if (i10 == 4 && (qc2 = this.f29274b) != null && qc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3539ja(Context context, InterfaceC3733ua interfaceC3733ua) {
        this(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(interfaceC3733ua, "javascriptEngine");
        this.f29273a = interfaceC3733ua;
    }

    public final void a(Qc qc2) {
        this.f29274b = qc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539ja(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }

    public final void a() {
        this.f29274b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539ja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539ja(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(attributeSet, "attrs");
    }
}
