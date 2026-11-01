package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class WZ {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"u9Ssvniz27TlV85K0pYswnvngpWD7UTv", "yLtbvA2Xz23YXdIWqrcyb7jywu5SSFGZ", "scrB43nD9W", "wsEo4KD", "NKrjwyp9F68gvgrQJDNYzVT8tQP7WanP", "VznZXKKoMO4DiuN4LwEwkvbHVlMTJ38P", "0a9nN5zxgtKrFfFA5lDM9YM14l5DBDtv", "nZC8h8R09gEqYECwHp8yIoQ586Dae6j4"};
    public static final AtomicReference<Boolean> A03;
    public static volatile WY A04;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{126, -85, -95, -81, -84, -90, -95, -118, -98, -85, -90, -93, -94, -80, -79, 107, -75, -86, -87, -29, -27, -10, -21, -8, -21, -10, -5, -96, -81, -81, -85, -88, -94, -96, -77, -88, -82, -83, -28, -30, -21, -30, -17, -26, -32, -90, -94, -89, -116, -99, -92, -113, -98, -85, -84, -94, -88, -89, -94, -107, -93, -103, -86, -107, -111, -110, -100, -107, 113, -109, -92, -103, -90, -103, -92, -87, -2, -4, -18, -4, -74, -4, -19, -12};
    }

    static {
        A07();
        A00 = -1;
        A04 = WY.A04;
        A03 = new AtomicReference<>(null);
    }

    public static int A01(Context context) {
        if (A04 == WY.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 21));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int A05(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(76, 8, 97))) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (xmlPullParser.getAttributeName(i10).equals(A06(45, 13, 17))) {
                        String attributeValue = xmlPullParser.getAttributeValue(i10);
                        String[] strArr = A02;
                        String str = strArr[0];
                        String str2 = strArr[1];
                        int iCharAt = str.charAt(20);
                        int i11 = str2.charAt(20);
                        if (iCharAt == i11) {
                            throw new RuntimeException();
                        }
                        A02[2] = "E9WdjcV1cB";
                        int i12 = Integer.parseInt(attributeValue);
                        return i12;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0B()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A04 != WY.A04) {
            return;
        }
        A04 = WY.A03;
        Executors.newSingleThreadExecutor().execute(new P0(context));
    }

    public static void A0A(SQ sq, Throwable th2) {
        sq.A08().AAy(A06(38, 7, 85), AbstractC1590Sv.A1c, new C1591Sw(th2));
    }

    public static boolean A0B() {
        return A04 == WY.A02;
    }

    public static boolean A0C(SQ sq) {
        Boolean cachedValue = A03.get();
        if (cachedValue != null) {
            boolean zBooleanValue = cachedValue.booleanValue();
            String[] strArr = A02;
            if (strArr[0].charAt(20) != strArr[1].charAt(20)) {
                A02[2] = "MLFYzbWhDK";
                return zBooleanValue;
            }
        } else {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = null;
            boolean z10 = true;
            try {
                xmlResourceParserOpenXmlResourceParser = sq.getAssets().openXmlResourceParser(A06(0, 19, 21));
                loop0: while (xmlResourceParserOpenXmlResourceParser.next() != 1) {
                    if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2 && (xmlResourceParserOpenXmlResourceParser.getName().equals(A06(27, 11, 23)) || xmlResourceParserOpenXmlResourceParser.getName().equals(A06(19, 8, 90)))) {
                        for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                            if (xmlResourceParserOpenXmlResourceParser.getAttributeName(i10).equals(A06(58, 18, 8)) && !Boolean.parseBoolean(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10))) {
                                z10 = false;
                                break loop0;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                String[] strArr2 = A02;
                if (strArr2[0].charAt(20) != strArr2[1].charAt(20)) {
                    A02[5] = "KCUHy5Pusu5FHvSmqkTRk1L0JwcSe1Zm";
                    A0A(sq, th2);
                    if (xmlResourceParserOpenXmlResourceParser != null) {
                        try {
                            xmlResourceParserOpenXmlResourceParser.close();
                        } catch (Exception e10) {
                            A0A(sq, e10);
                        }
                    }
                }
                throw new RuntimeException();
            }
            A03.set(Boolean.valueOf(z10));
            return z10;
        }
        throw new RuntimeException();
    }
}
