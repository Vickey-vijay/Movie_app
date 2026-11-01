package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10256h extends AbstractC2138fy {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public Q8 A00;
    public Q8 A01;

    private int A00(QO qo2, View view, Q8 q10) {
        int containerCenter;
        int iA0F = q10.A0F(view) + (q10.A0D(view) / 2);
        if (qo2.A1V()) {
            int iA0A = q10.A0A();
            int childCenter = q10.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = q10.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(QO qo2, Q8 q10) {
        int i10;
        int iA0Y = qo2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        if (qo2.A1V()) {
            int iA0A = q10.A0A();
            int childCount = q10.A0B();
            i10 = iA0A + (childCount / 2);
        } else {
            int childCount2 = q10.A06();
            i10 = childCount2 / 2;
        }
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iA0Y; i12++) {
            View viewA0v = qo2.A0v(i12);
            int iA0F = q10.A0F(viewA0v);
            int childCount3 = q10.A0D(viewA0v);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - i10);
            if (childCount4 < i11) {
                i11 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = viewA0v;
            }
        }
        return view;
    }

    private View A02(QO qo2, Q8 q10) {
        int iA0Y = qo2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int i10 = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < iA0Y; childCount++) {
            View viewA0v = qo2.A0v(childCount);
            int iA0F = q10.A0F(viewA0v);
            if (iA0F < i10) {
                i10 = iA0F;
                view = viewA0v;
            }
        }
        return view;
    }

    private Q8 A03(QO qo2) {
        if (this.A00 == null || this.A00.A02 != qo2) {
            this.A00 = Q8.A00(qo2);
        }
        return this.A00;
    }

    private Q8 A04(QO qo2) {
        if (this.A01 == null || this.A01.A02 != qo2) {
            this.A01 = Q8.A01(qo2);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.AbstractC2138fy
    public final int A0C(QO qo2, int i10, int i11) {
        int iA0r;
        int centerPosition;
        int iA0b = qo2.A0b();
        if (iA0b == 0) {
            return -1;
        }
        View viewA02 = null;
        if (qo2.A23()) {
            viewA02 = A02(qo2, A04(qo2));
        } else if (qo2.A22()) {
            viewA02 = A02(qo2, A03(qo2));
        }
        if (viewA02 == null || (iA0r = qo2.A0r(viewA02)) == -1) {
            return -1;
        }
        if (qo2.A22()) {
            centerPosition = i10 > 0 ? 1 : 0;
        } else {
            centerPosition = i11 > 0 ? 1 : 0;
        }
        boolean z10 = false;
        if (qo2 instanceof InterfaceC1518Qa) {
            int itemCount = iA0b - 1;
            PointF pointFA4y = ((InterfaceC1518Qa) qo2).A4y(itemCount);
            if (pointFA4y != null) {
                z10 = pointFA4y.x < 0.0f || pointFA4y.y < 0.0f;
            }
        }
        if (z10) {
            return centerPosition != 0 ? iA0r - 1 : iA0r;
        }
        return centerPosition != 0 ? iA0r + 1 : iA0r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2138fy
    public final View A0D(QO qo2) {
        if (qo2.A23()) {
            return A01(qo2, A04(qo2));
        }
        if (qo2.A22()) {
            View viewA01 = A01(qo2, A03(qo2));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return viewA01;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2138fy
    public final C2156gH A0E(QO qo2) {
        if (!(qo2 instanceof InterfaceC1518Qa)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C2156gH(context) { // from class: com.facebook.ads.redexgen.X.6i
            @Override // com.facebook.ads.redexgen.core.C2156gH, com.facebook.ads.redexgen.core.AbstractC1519Qb
            public final void A0I(View view, C1521Qd c1521Qd, QZ qz) {
                int[] iArrA0H = this.A00.A0H(((AbstractC2138fy) this.A00).A00.getLayoutManager(), view);
                int time = iArrA0H[0];
                int dy = iArrA0H[1];
                int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
                if (dx > 0) {
                    qz.A04(time, dy, dx, ((C2156gH) this).A04);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2156gH
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.facebook.ads.redexgen.core.C2156gH
            public final int A0L(int i10) {
                return Math.min(100, super.A0L(i10));
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2138fy
    public final int[] A0H(QO qo2, View view) {
        int[] iArr = new int[2];
        if (qo2.A22()) {
            iArr[0] = A00(qo2, view, A03(qo2));
        } else {
            iArr[0] = 0;
        }
        if (qo2.A23()) {
            iArr[1] = A00(qo2, view, A04(qo2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
