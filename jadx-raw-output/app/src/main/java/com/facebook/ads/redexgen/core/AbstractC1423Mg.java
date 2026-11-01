package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1423Mg {
    public static byte[] A00;
    public static String[] A01 = {"rumqJp0zjtXTj7VCZC", "TMr6rmpz3eFeqFi1AyEescympmX4mKYs", "yKc30ML1ifcOIqfiQ1Y0n8yeP8tTgKvd", "ifxbXcWS1dksd5gxUX3XXpeR8fGAW9", "ARavVsGpFp1prhlT9X", "AJCuKBIGe5nliswM6BoL4M7qaWNzDabC", "wiV5dRZ8vBgNvrirj4IbquLjXKvqAP", "mqXFYOGhIorfWow0I7OGPDKbQEIe0IwJ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2261iB A01(@Nullable C1977dL c1977dL, JSONObject jSONObject, String str, boolean z10, int i10, int i11) {
        boolean zOptBoolean;
        int iOptInt;
        ArrayList arrayList;
        if (jSONObject == null) {
            return new C2261iB();
        }
        WX.A04(c1977dL, A02(0, 23, 112));
        String strOptString = jSONObject.optString(A02(371, 10, 72));
        int iOptInt2 = jSONObject.optInt(A02(116, 12, 106), 0);
        String strOptString2 = jSONObject.optString(A02(253, 13, 18));
        String strA02 = AbstractC1686Wr.A02(jSONObject, A02(266, 12, 52));
        Uri uriA00 = TextUtils.isEmpty(strA02) ? null : WQ.A00(strA02);
        String strA03 = AbstractC1686Wr.A02(jSONObject, A02(128, 4, 54));
        String strA01 = X9.A01(strA03);
        String strA04 = AbstractC1686Wr.A02(jSONObject, A02(101, 15, 34));
        String strA05 = AbstractC1686Wr.A02(jSONObject, A02(485, 5, 32));
        String strA06 = AbstractC1686Wr.A02(jSONObject, A02(477, 8, 43));
        String strA07 = AbstractC1686Wr.A02(jSONObject, A02(278, 8, 99));
        String strA08 = AbstractC1686Wr.A02(jSONObject, A02(431, 14, 94));
        String strA09 = AbstractC1686Wr.A02(jSONObject, A02(295, 16, 122));
        String strA010 = AbstractC1686Wr.A02(jSONObject, A02(445, 21, 1));
        String strA011 = AbstractC1686Wr.A02(jSONObject, A02(87, 14, 99));
        String strA012 = AbstractC1686Wr.A02(jSONObject, A02(351, 20, 125));
        String strA013 = AbstractC1686Wr.A02(jSONObject, A02(335, 16, 114));
        String strA014 = AbstractC1686Wr.A02(jSONObject, A02(318, 17, 38));
        String strA015 = AbstractC1686Wr.A02(jSONObject, A02(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 14, 16));
        AnonymousClass74 anonymousClass74A00 = AnonymousClass74.A00(jSONObject, c1977dL);
        C1635Up c1635UpA00 = C1635Up.A00(jSONObject.optJSONObject(A02(286, 4, 38)));
        C1635Up c1635UpA01 = C1635Up.A00(jSONObject.optJSONObject(A02(290, 5, 12)));
        C1636Uq c1636UqA00 = C1636Uq.A00(jSONObject.optJSONObject(A02(466, 11, 29)));
        String strA016 = AbstractC1686Wr.A02(jSONObject, A02(490, 15, 41));
        boolean zOptBoolean2 = jSONObject.optBoolean(A02(238, 15, 64));
        boolean zOptBoolean3 = jSONObject.optBoolean(A02(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 19, 54));
        int iOptInt3 = jSONObject.optInt(A02(406, 25, 123), 4);
        int iOptInt4 = jSONObject.optInt(A02(381, 25, 38), 0);
        int iOptInt5 = jSONObject.optInt(A02(569, 31, 83), 0);
        int iOptInt6 = jSONObject.optInt(A02(600, 26, 76), 1000);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(53, 15, 30));
        C1635Up c1635UpA02 = jSONObjectOptJSONObject != null ? C1635Up.A00(jSONObjectOptJSONObject) : null;
        String strA017 = AbstractC1686Wr.A02(jSONObject, A02(68, 19, 95));
        MJ mjA00 = ML.A00(jSONObject);
        Collection<String> collectionA03 = ML.A03(c1977dL, jSONObject);
        String strA018 = AbstractC1686Wr.A02(jSONObject, A02(560, 9, 10));
        long jOptLong = jSONObject.optLong(A02(536, 24, 82), -1L);
        if (A01[2].charAt(6) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3DgIwYJYxCZHaga7jdAdEfDBKsaQLEaY";
        strArr[0] = "PJjdxes2PDM40JhdCx";
        String strA019 = AbstractC1686Wr.A02(jSONObject, A02(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 9, 123));
        String strA020 = A02(505, 22, 124);
        EnumC1640Uu enumC1640Uu = jSONObject.has(strA020) ? jSONObject.optBoolean(strA020) ? EnumC1640Uu.A05 : EnumC1640Uu.A04 : EnumC1640Uu.A03;
        String strA021 = A02(190, 29, 111);
        if (A01[2].charAt(6) != 'o') {
            A01[5] = "EiaN2GrSxKmld9dBg6rLOOlJPXBJhn44";
            zOptBoolean = jSONObject.optBoolean(strA021);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            arrayList = null;
        } else {
            zOptBoolean = jSONObject.optBoolean(strA021);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            arrayList = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(146, 8, 26));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                for (int i12 = 0; i12 < length; i12++) {
                    try {
                        arrayList2.add(A01(c1977dL, jSONArrayOptJSONArray.getJSONObject(i12), str, true, i12, length));
                    } catch (JSONException e10) {
                        e = e10;
                        arrayList = arrayList2;
                        c1977dL.A08().AAy(A02(311, 7, 111), AbstractC1590Sv.A2A, new C1591Sw(e));
                        Log.e(C2273iN.A0E, A02(23, 30, 97), e);
                        return new C2261iB(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, c1635UpA02, anonymousClass74A00, c1635UpA00, c1635UpA01, c1636UqA00, strA018, strA019, jOptLong, enumC1640Uu, z10, i10, i11, arrayList, str, strOptString, iOptInt2, strOptString2, uriA00, strA016, zOptBoolean2, zOptBoolean3, iOptInt4, iOptInt3, iOptInt5, iOptInt6, mjA00, collectionA03, iOptInt, zOptBoolean);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (JSONException e11) {
            e = e11;
        }
        return new C2261iB(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, c1635UpA02, anonymousClass74A00, c1635UpA00, c1635UpA01, c1636UqA00, strA018, strA019, jOptLong, enumC1640Uu, z10, i10, i11, arrayList, str, strOptString, iOptInt2, strOptString2, uriA00, strA016, zOptBoolean2, zOptBoolean3, iOptInt4, iOptInt3, iOptInt5, iOptInt6, mjA00, collectionA03, iOptInt, zOptBoolean);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{26, 78, 61, 66, 62, 71, 60, 62, -7, 39, 62, 77, 80, 72, 75, 68, -7, 37, 72, 58, 61, 62, 61, 31, 56, 43, 44, 54, 47, -22, 62, 57, -22, 58, 43, 60, 61, 47, -22, 45, 43, 60, 57, 63, 61, 47, 54, -22, 46, 43, 62, 43, -8, -24, -21, -26, -22, -17, -10, -16, -22, -20, -6, -26, -16, -22, -10, -11, 41, 44, 39, 43, 48, 55, 49, 43, 45, 59, 39, 52, 49, 54, 51, 39, 61, 58, 52, 45, 48, 43, 64, 62, 45, 58, 63, 56, 45, 64, 53, 59, 58, -20, -17, 1, -16, -3, -1, -12, -2, -16, -3, -22, -7, -20, -8, -16, 52, 65, 50, 63, 66, 58, 66, 50, 71, 76, 67, 56, 1, 14, 3, 24, -36, -38, -27, -27, -40, -19, -24, -40, -38, -36, -19, -30, -24, -25, -26, -28, -11, -14, -8, -10, -24, -17, 55, 67, 66, 72, 53, 61, 66, 57, 70, 51, 74, 61, 57, 75, 53, 54, 61, 64, 61, 72, 77, 51, 55, 60, 57, 55, 63, 51, 61, 66, 72, 57, 70, 74, 53, 64, 59, 71, 70, 76, 57, 65, 70, 61, 74, 55, 78, 65, 61, 79, 57, 58, 65, 68, 65, 76, 81, 55, 61, 70, 57, 58, 68, 61, 60, 4, 13, 0, 1, 11, 4, -2, 18, 13, 0, 15, 18, 7, 14, 19, -2, 11, 14, 6, 14, 23, 10, 11, 21, 14, 8, 31, 18, 14, 32, 8, 21, 24, 16, -32, -23, -34, -19, -12, -21, -17, -32, -33, -38, -34, -21, -24, 3, -1, -2, 1, -4, 0, 12, 10, 10, -2, 11, 1, 52, 49, 45, 48, 56, 53, 58, 49, -8, -14, -2, -3, -34, -30, -42, -36, -38, 79, 76, 81, 78, 66, 71, 72, 86, 70, 85, 76, 83, 87, 76, 82, 81, 72, 57, 74, 75, 65, 70, 63, -1, -16, 4, 2, -12, -18, 3, 1, -16, -3, 2, -5, -16, 3, -8, -2, -3, 75, 71, 60, 84, 58, 79, 77, 60, 73, 78, 71, 60, 79, 68, 74, 73, 86, 88, 85, 83, 85, 90, 75, 74, 69, 90, 88, 71, 84, 89, 82, 71, 90, 79, 85, 84, 35, 22, 34, 38, 22, 36, 37, 16, 26, 21, 2, -3, -16, -1, 2, -9, -2, 3, -18, -14, -2, -4, -1, 1, -12, 2, 2, -18, 0, 4, -16, -5, -8, 3, 8, 87, 82, 69, 84, 87, 76, 83, 88, 67, 80, 83, 75, 67, 72, 73, 80, 69, 93, 67, 87, 73, 71, 83, 82, 72, 58, 54, ExifInterface.START_CODE, 48, 40, 51, 38, ExifInterface.START_CODE, 54, 53, 59, 44, 63, 59, -35, -38, ExifInterface.MARKER_EOI, -40, -35, ExifInterface.MARKER_EOI, -36, -49, -50, -55, -34, -36, -53, -40, -35, -42, -53, -34, -45, ExifInterface.MARKER_EOI, -40, -7, -6, -25, -8, -27, -8, -25, -6, -17, -12, -19, 7, 9, -10, 8, -3, 8, 0, -7, -3, -14, -3, -11, -18, 7, 5, -9, -10, -15, 4, -9, 2, 1, 4, 6, -15, 7, 4, -2, 91, 78, 73, 74, 84, 68, 70, 90, 89, 84, 85, 81, 70, 94, 68, 74, 83, 70, 71, 81, 74, 73, 90, 77, 72, 73, 83, 67, 81, 84, 72, 49, 36, 31, 32, ExifInterface.START_CODE, 26, 43, 45, 32, 39, ExifInterface.START_CODE, 28, 31, 26, 46, 36, 53, 32, 26, 29, 52, 47, 32, 46, -23, -36, -41, -40, -30, -46, -24, -27, -33, 50, 37, 33, 51, 29, 30, 37, 40, 37, 48, 53, 27, 31, 36, 33, 31, 39, 27, 37, ExifInterface.START_CODE, 37, 48, 37, 29, 40, 27, 32, 33, 40, 29, 53, 43, 30, 26, 44, 22, 23, 30, 33, 30, 41, 46, 20, 24, 29, 26, 24, 32, 20, 30, 35, 41, 26, 39, 43, 22, 33};
    }

    static {
        A03();
    }

    public static C2261iB A00(C1977dL c1977dL, JSONObject jSONObject, String str) {
        return A01(c1977dL, jSONObject, str, false, -1, 0);
    }
}
