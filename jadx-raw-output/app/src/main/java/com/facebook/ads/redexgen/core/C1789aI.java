package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1789aI extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC1707Xm A00;
    public YA A01;
    public final AbstractC2252hy A02;
    public final C1977dL A03;
    public final InterfaceC1708Xn A04;
    public final InterfaceC1788aH A05;
    public final E1 A06;
    public final List<View> A07;

    public C1789aI(C1815ai c1815ai, AbstractC2252hy abstractC2252hy, E1 e10, C1180Cw c1180Cw, AbstractC1768Zv abstractC1768Zv, InterfaceC1708Xn interfaceC1708Xn, InterfaceC1788aH interfaceC1788aH) {
        this(c1815ai, abstractC2252hy, e10, interfaceC1708Xn, interfaceC1788aH, c1180Cw, abstractC1768Zv);
    }

    public C1789aI(C1815ai c1815ai, AbstractC2252hy abstractC2252hy, E1 e10, InterfaceC1708Xn interfaceC1708Xn, InterfaceC1788aH interfaceC1788aH, View... viewArr) {
        this(c1815ai.A06(), c1815ai.A0C(), abstractC2252hy, e10, interfaceC1708Xn, interfaceC1788aH, viewArr);
    }

    public C1789aI(C1977dL c1977dL, AbstractC1707Xm abstractC1707Xm, AbstractC2252hy abstractC2252hy, E1 e10, InterfaceC1708Xn interfaceC1708Xn, InterfaceC1788aH interfaceC1788aH, View... viewArr) {
        super(c1977dL);
        this.A07 = new ArrayList();
        this.A03 = c1977dL;
        this.A00 = abstractC1707Xm;
        this.A02 = abstractC2252hy;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC1708Xn;
        this.A06 = e10;
        this.A05 = interfaceC1788aH;
        A04();
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA0p = this.A02.A0p();
        if (rewardDataA0p == null) {
            strA06 = this.A02.A22().A05();
        } else {
            strA06 = this.A02.A22().A06(rewardDataA0p.getCurrency(), rewardDataA0p.getQuantity());
        }
        this.A01 = new YA(this.A03, -1, ViewCompat.MEASURED_STATE_MASK, strA06, null, this.A02.A22().A04(), this.A02.A22().A03(), XY.A01(XX.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC1786aF(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC1787aG(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0g(EnumC1985dT.A07);
        }
        this.A05.ACI();
        if (!this.A02.A20().A0V()) {
            this.A02.A28(this.A04);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[LOOP:0: B:15:0x004d->B:20:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0024 A[EDGE_INSN: B:23:0x0024->B:8:0x0024 BREAK  A[LOOP:0: B:15:0x004d->B:20:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[SYNTHETIC] */
    public final void A07(ViewGroup viewGroup) {
        Iterator<View> it;
        boolean zHasNext;
        String[] strArr;
        if (this.A06 != null && !this.A06.A0r()) {
            E1 e10 = this.A06;
            String[] strArr2 = A08;
            if (strArr2[0].length() == strArr2[3].length()) {
                String[] strArr3 = A08;
                strArr3[4] = "1Ran1dt8ESvXQPCOL";
                strArr3[1] = BidResponsed.KEY_WN;
                e10.A0m(false, false, 11);
                XP.A0L(this.A06, 4);
                if (this.A00 != null) {
                    XP.A0F(this.A00);
                }
                it = this.A07.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    strArr = A08;
                    if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                        break;
                        break;
                    }
                    String[] strArr4 = A08;
                    strArr4[0] = "6LHnkwVNW3v3BurcJpp";
                    strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
                    if (zHasNext) {
                        View next = it.next();
                        next.clearAnimation();
                        XP.A0L(next, 4);
                    } else {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        viewGroup.addView(this, layoutParams);
                        this.A05.AE8();
                        return;
                    }
                }
            }
        } else {
            if (this.A00 != null) {
                XP.A0F(this.A00);
            }
            it = this.A07.iterator();
            while (true) {
                zHasNext = it.hasNext();
                strArr = A08;
                if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                    break;
                }
                String[] strArr5 = A08;
                strArr5[0] = "6LHnkwVNW3v3BurcJpp";
                strArr5[3] = "pBsoAnuzgJgS4JAM4BB";
                if (zHasNext) {
                    View next2 = it.next();
                    next2.clearAnimation();
                    XP.A0L(next2, 4);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    viewGroup.addView(this, layoutParams2);
                    this.A05.AE8();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }
}
