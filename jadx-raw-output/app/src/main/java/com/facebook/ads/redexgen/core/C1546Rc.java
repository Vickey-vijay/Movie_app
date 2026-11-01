package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1546Rc {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public C1759Zm A00;
    public final AudienceNetworkActivity A01;
    public final C1977dL A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, -128, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, ExifInterface.MARKER_APP1, -42, -40, -38, -30, -38, -29, -23, -66, ExifInterface.MARKER_EOI, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public C1546Rc(C1977dL c1977dL, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1977dL;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i10, int i11) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i10, i11);
        }
    }

    public final C1953cw A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            C1977dL c1977dL = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            C1953cw c1953cwA01 = AbstractC1952cv.A01(c1977dL, stringExtra);
            if (c1953cwA01 != null) {
                relativeLayout.addView(c1953cwA01, new RelativeLayout.LayoutParams(-1, -1));
            }
            return c1953cwA01;
        }
        return null;
    }

    public final void A04() {
        if (U7.A2C(this.A01)) {
            A02(16777216, 16777216);
        }
    }

    public final void A05() {
        if (this.A00 != null && U7.A1B(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (U7.A2K(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, EnumC1647Vb enumC1647Vb, RelativeLayout relativeLayout) {
        if (U7.A1B(this.A01)) {
            EnumC1647Vb enumC1647Vb2 = EnumC1647Vb.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (enumC1647Vb != enumC1647Vb2) {
                this.A00 = new C1759Zm();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                C1759Zm c1759Zm = this.A00;
                String placementId = this.A01.getPackageName();
                c1759Zm.A0B(placementId);
                long longExtra = intent.getLongExtra(A00(29, 11, 45), 0L);
                if (longExtra != 0) {
                    C1759Zm c1759Zm2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "JayLC9GMOZb39CtRqvAFG5wuJA";
                    strArr2[5] = "0wpddTnUpSmY";
                    c1759Zm2.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId2 = A00(0, 5, 6);
                textView.setText(placementId2);
                textView.setTextColor(-1);
                XP.A0K(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                RC rc2 = new RC(this.A00, relativeLayout);
                textView.setOnLongClickListener(rc2);
                relativeLayout.setOnLongClickListener(rc2);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(EnumC1647Vb enumC1647Vb, boolean z10) {
        if (U7.A2o(this.A02)) {
            EnumC1647Vb enumC1647Vb2 = EnumC1647Vb.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (enumC1647Vb == enumC1647Vb2 && z10) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
