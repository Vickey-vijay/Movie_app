package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class G2 extends FrameLayout implements InterfaceC1709Xo {
    public boolean A00;
    public boolean A01;
    public final AbstractC2252hy A02;
    public final SF A03;
    public final C1977dL A04;
    public final US A05;
    public final C1620Ua A06;
    public final XH A07;
    public final AbstractC1707Xm A08;
    public final InterfaceC1708Xn A09;
    public final YY A0A;
    public final C2050eX A0B;
    public final XC A0C;
    public final AbstractC2049eW A0D;
    public static final int A0F = (int) (AbstractC1680Wl.A02 * 48.0f);
    public static final int A0G = (int) (AbstractC1680Wl.A02 * 64.0f);
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);

    public abstract AbstractC1707Xm A0b();

    public abstract void A0e();

    public abstract void A0f();

    public abstract void A0h(R0 r10);

    public abstract boolean A0i();

    public abstract boolean A0j();

    public G2(C1977dL c1977dL, YY yy, US us, AbstractC2252hy abstractC2252hy, SF sf2, InterfaceC1708Xn interfaceC1708Xn) {
        super(c1977dL);
        this.A01 = false;
        this.A0D = new G7(this);
        this.A07 = new XH();
        this.A00 = false;
        this.A04 = c1977dL;
        this.A0A = yy;
        this.A05 = us;
        this.A02 = abstractC2252hy;
        this.A03 = sf2;
        this.A09 = interfaceC1708Xn;
        this.A06 = new C1620Ua(this.A02.A25(), this.A05);
        this.A0B = new C2050eX(this, 1, new WeakReference(this.A0D), this.A04);
        this.A0B.A0W(this.A02.A0i());
        this.A0B.A0X(this.A02.A0j());
        this.A08 = A0Z();
        this.A0C = new XC(this);
        this.A0C.A05(XB.A02);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC1707Xm A0Z() {
        AbstractC1707Xm abstractC1707XmA0b = A0b();
        abstractC1707XmA0b.setFullscreen(true);
        int iA04 = this.A02.A20().A0H().A04();
        abstractC1707XmA0b.setPageDetails(this.A02.A23(), this.A02.A25(), iA04, this.A02.A24());
        abstractC1707XmA0b.A0A(this.A02.A1z().A01(), KE.A05(this.A02));
        if (this.A02.A20().A0H().A02() == 0) {
            this.A01 = true;
            abstractC1707XmA0b.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A02.A20().A0S()) {
            abstractC1707XmA0b.setToolbarActionMode(4);
        }
        if (this.A02.A20().A0H().A02() >= 0) {
            abstractC1707XmA0b.setProgressSpinnerInvisible(true);
        }
        abstractC1707XmA0b.setToolbarListener(new G3(this));
        return abstractC1707XmA0b;
    }

    private void A0a() {
        if (this.A02.A20().A0W()) {
            C1928cX c1928cXA0F = new C1926cV(this.A04, this.A02.A20().A0I(), this.A02.A23()).A0A(this.A02.A1z().A01()).A0F();
            AbstractC1622Uc.A04(c1928cXA0F, this.A06, UZ.A0U);
            addView(c1928cXA0F, A0E);
            c1928cXA0F.A04(new G5(this));
            return;
        }
        A0f();
    }

    public final void A0c() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public final void A0d() {
        if (this.A08.getToolbarActionMode() == 8) {
            this.A08.setToolbarActionMode(2);
        }
        this.A02.A2B(false);
        this.A02.A20().A0M(-1);
    }

    public final void A0g(int i10, AbstractRunnableC1664Vt abstractRunnableC1664Vt, C1180Cw c1180Cw) {
        new C1674Wd(i10, new G6(this, i10, c1180Cw, abstractRunnableC1664Vt)).A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1709Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r10) {
        this.A09.A3x(this, A0E);
        A0h(r10);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1709Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1709Xo
    public String getCurrentClientToken() {
        return this.A02.A25();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1709Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    public void onDestroy() {
        this.A0C.A03();
        if (!TextUtils.isEmpty(this.A02.A25())) {
            this.A05.AAt(this.A02.A25(), new C1762Zp().A03(this.A0B).A02(this.A07).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A07.A06(this.A04, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1708Xn interfaceC1708Xn) {
    }

    public void setUpFullscreenMode(boolean z10) {
        XB xb2;
        if (z10) {
            xb2 = XB.A03;
        } else {
            xb2 = XB.A02;
        }
        this.A0C.A05(xb2);
    }
}
