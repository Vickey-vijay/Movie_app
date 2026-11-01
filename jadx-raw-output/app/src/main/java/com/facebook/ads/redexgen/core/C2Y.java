package com.facebook.ads.redexgen.core;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2Y extends AbstractC1184Da {
    public static String[] A01 = {"BuRuvxulsaJnTsptWr5C74N6kbe62CR1", "s8BhV7yvVPv9fWwhaDhts8ISKp0Ib3uz", "BHQbL486YclXfOG4TttSSmYhAQDicEvh", "6QlBJVUCqIJjaBYG", "bf17tAIDP3PP5oHcfI5KYvpff0TMzylU", "en59KaoZPANthNZYpe9YMIumKtT", "Zp8Yp0vRpWPiTIr1M3XMCxUDLLEg", "TVOb3qDH058zXjUqb6AporPz"};
    public final AbstractC1600Tf<DO> A00;

    public C2Y(C1977dL c1977dL) {
        this(c1977dL, null);
    }

    public C2Y(C1977dL c1977dL, AttributeSet attributeSet) {
        this(c1977dL, attributeSet, 0);
    }

    public C2Y(C1977dL c1977dL, AttributeSet attributeSet, int i10) {
        super(c1977dL, attributeSet, i10);
        this.A00 = new C1181Cx(this);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1184Da
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1184Da
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A00);
        }
        setVisibility(8);
        if (A01[6].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "qxykbLgy7uMqmiLSWk5iAMCsSUesvX5c";
        strArr[0] = "yfv8cLzmeBPWJWXBFW506HD39p2knuA3";
        super.A08();
    }
}
