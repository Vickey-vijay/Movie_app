package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1708Xn A03;
    public C2050eX A04;
    public String A05;
    public List<C1944cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2252hy A08;
    public final SF A09;
    public final C1977dL A0A;
    public final US A0B;
    public final C1520Qc A0C;
    public final XH A0D;
    public final C10105s A0E;
    public final C1180Cw A0F;

    public LE(C1977dL c1977dL, List<C1944cn> list, AbstractC2252hy abstractC2252hy, US us, C1520Qc c1520Qc, InterfaceC1708Xn interfaceC1708Xn, String str, C10105s c10105s, C1180Cw c1180Cw) {
        this.A0A = c1977dL;
        this.A0B = us;
        this.A0C = c1520Qc;
        this.A09 = c1520Qc.A11();
        this.A04 = c1520Qc.A1B();
        this.A0D = c1520Qc.A1A();
        this.A03 = interfaceC1708Xn;
        this.A08 = abstractC2252hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c10105s;
        this.A0F = c1180Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i10) {
        return new FD(AbstractC1778a6.A00(new C1814ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd2, int i10) {
        C1944cn c1944cn = this.A06.get(i10);
        fd2.A0q(this.A04);
        fd2.A0p(c1944cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C2050eX c2050eX) {
        this.A04 = c2050eX;
    }
}
