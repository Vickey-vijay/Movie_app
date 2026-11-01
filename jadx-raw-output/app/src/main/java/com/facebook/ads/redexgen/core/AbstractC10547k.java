package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC10547k extends AbstractC2574nW<C10537j, AbstractC10527i, C2392kM> implements InterfaceC2393kN {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{28, 53, 44, 63, 55, 44, ExifInterface.START_CODE, 59, 44, 43, -25, 43, 44, ExifInterface.START_CODE, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract J7 A0g(byte[] bArr, int i10, boolean z10) throws C2392kM;

    static {
        A0M();
    }

    public AbstractC10547k(String str) {
        super(new C10537j[2], new AbstractC10527i[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0w] */
    @Override // com.facebook.ads.redexgen.core.AbstractC2574nW
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C08860w A0c() {
        return new AbstractC10527i(this) { // from class: com.facebook.ads.redexgen.X.0w
            public final AbstractC10547k A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC10527i, com.facebook.ads.redexgen.core.AbstractC2575nX
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2574nW
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C2392kM A0Y(C10537j c10537j, AbstractC10527i abstractC10527i, boolean z10) {
        try {
            ByteBuffer inputData = (ByteBuffer) C3M.A01(c10537j.A02);
            abstractC10527i.A0C(c10537j.A01, A0g(inputData.array(), inputData.limit(), z10), c10537j.A00);
            abstractC10527i.A01(Integer.MIN_VALUE);
            return null;
        } catch (C2392kM e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2574nW
    /* JADX INFO: renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C2392kM A0Z(Throwable th2) {
        return new C2392kM(A0L(0, 23, 99), th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2574nW
    /* JADX INFO: renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C10537j A0a() {
        return new C10537j();
    }

    public final void A0h(AbstractC10527i abstractC10527i) {
        super.A0f(abstractC10527i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2393kN
    public final void AIx(long j10) {
    }
}
