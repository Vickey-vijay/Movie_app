package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IV {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public IP A04;
    public C1325Im A05;
    public final H1 A06;
    public final C1327Io A07 = new C1327Io();
    public final C4J A09 = new C4J(1);
    public final C4J A08 = new C4J();

    public IV(H1 h10) {
        this.A06 = h10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1326In A00() {
        C1326In encryptionBox;
        int i10 = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i10);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1326In c1326InA00 = A00();
        if (c1326InA00 == null) {
            return;
        }
        C4J c4j = this.A07.A0H;
        if (c1326InA00.A00 != 0) {
            c4j.A0g(c1326InA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c4j.A0g(c4j.A0M() * 6);
        }
    }

    public final int A04() {
        C4J c4j;
        int vectorSize;
        C1326In c1326InA00 = A00();
        if (c1326InA00 == null) {
            return 0;
        }
        if (c1326InA00.A00 != 0) {
            c4j = this.A07.A0H;
            vectorSize = c1326InA00.A00;
        } else {
            byte[] initVectorData = c1326InA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c4j = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        H1 h10 = this.A06;
        C4J initializationVectorData = this.A09;
        h10.AI7(initializationVectorData, 1);
        this.A06.AI7(c4j, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C4J c4j2 = this.A07.A0H;
        int iA0M = c4j2.A0M();
        c4j2.A0g(-2);
        int i10 = (iA0M * 6) + 2;
        this.A06.AI7(c4j2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j10) {
        for (int i10 = this.A01; i10 < searchIndex && this.A07.A00(i10) < j10; i10++) {
            if (this.A07.A0G[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        C1326In encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6W(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(C1325Im c1325Im, IP ip) {
        this.A05 = (C1325Im) C3M.A01(c1325Im);
        this.A04 = (IP) C3M.A01(ip);
        this.A06.A6W(c1325Im.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
