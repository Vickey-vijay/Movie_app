package com.facebook.ads.redexgen.core;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1660Vp implements InterfaceC1603Tj {
    public static byte[] A03;
    public static String[] A04 = {"Mm6eOmxrkeU2", "MUq44yb", "oKRPVLX0GnKoqIxxSACkHhthyeGglJDi", "kpHGdbOqKKCIQYGNabgqln8bHLF6fw56", "0pAnM9hA2pxuChyanVmC1wYC", "qxO1zNdoKC3MMUxTs0mhMJ4wGZPx", "", "oKuuJ477mGyxhVSdv1rWN1Mids3hq7ZK"};
    public static final String A05;
    public final C1951cu A00;
    public final InterfaceC1614Tu<UP> A01;
    public final InterfaceC1614Tu<UP> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[4] = "X42DzCMkQ4HFIzVdD0OsfCNEPJzG";
            bArrCopyOfRange[i13] = (byte) (i14 - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A04[4].length() == 9) {
            throw new RuntimeException();
        }
        A04[4] = "UWvzDGqGj7QUhJ5x6ip4Rlib";
        A03 = new byte[]{101, 99, -78, -87, 99, -73, -68, -77, -88, 125, 99, 115, -106, 119, -88, -105, -96, -90, -123, -90, -95, -92, -109, -103, -105, -124, -105, -107, -95, -92, -106, 118, -109, -90, -109, -108, -109, -91, -105, -110, -77, -70, -77, -62, -77, -78, 110, -77, -60, -77, -68, -62, -120, 110, 112, -90, -63, -55, -52, -59, -60, -128, -44, -49, -128, -61, -52, -59, -63, -46, -128, -59, -42, -59, -50, -44, -45, -128, -45, -44, -49, -46, -63, -57, -59, 107, -122, -114, -111, -118, -119, 69, -103, -108, 69, -119, -118, -104, -118, -105, -114, -122, -111, -114, -97, -118, 69, -122, -109, 69, -118, -101, -118, -109, -103, 69, -117, -105, -108, -110, 69, -119, -122, -103, -122, -121, -122, -104, -118, 69, -74, -47, ExifInterface.MARKER_EOI, -36, -43, -44, -112, -28, -33, -112, -35, -33, -26, -43, -112, -43, -26, -43, -34, -28, -29, -112, -42, -30, -33, -35, -112, ExifInterface.MARKER_EOI, -34, -99, -42, -36, ExifInterface.MARKER_EOI, -41, -40, -28, -112, -29, -28, -33, -30, -47, -41, -43, -112, -46, -47, -45, -37, -112, -28, -33, -112, -43, -26, -43, -34, -28, -29, -112, -44, -47, -28, -47, -46, -47, -29, -43, -40, -13, -5, -2, -9, -10, -78, 6, 1, -78, 2, -13, 4, 5, -9, -78, -13, 0, -78, -9, 8, -9, 0, 6, -78, -8, 4, 1, -1, -78, -5, 0, -65, -8, -2, -5, -7, -6, 6, -78, 5, 6, 1, 4, -13, -7, -9, 112, -117, -109, -106, -113, -114, 74, -98, -103, 74, -100, -113, -117, -114, 74, -98, -110, -113, 74, -104, -97, -105, -116, -113, -100, 74, -103, -112, 74, -113, -96, -113, -104, -98, -99, 74, -112, -100, -103, -105, 74, -114, -117, -98, -117, -116, -117, -99, -113, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -76, -90, -77, -86, -94, -83, -86, -69, -90, 97, -94, -91, 97, -90, -73, -90, -81, -75, -64, -27, -35, -29, -32, -34, -33, -21, -92, -72, -37, -68, -19, -36, -27, -21, -54, -21, -26, -23, -40, -34, -36, -55, -36, -38, -26, -23, -37, -69, -40, -21, -40, ExifInterface.MARKER_EOI, -40, -22, -36, -37, -18, -20, -8, -5, -19, -87, -19, -22, -3, -22, -21, -22, -4, -18, -87, -17, -22, -14, -11, -2, -5, -18, -87, -8, -20, -20, -2, -5, -5, -18, -19, -87, 0, -15, -18, -9, -87, -5, -18, -22, -19, -14, -9, -16, -87, -18, -1, -18, -9, -3, -4, -73, -16, 3, 3, -12, -4, -1, 3, -78, -81, -62, -81, -14, -19, -116, 127, 125, -119, -116, 126, 121, 126, 123, -114, 123, 124, 123, -115, 127, -98, -112, -98, -98, -108, -102, -103, -118, -108, -113, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, -68, -79, -75, -83, -22, -27, ExifInterface.MARKER_APP1, -37, -28, -93, -88, -97, -108, -3, -10, -13, -10, -9, -1, -10};
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f2 A[Catch: U3 -> 0x0138, TryCatch #5 {U3 -> 0x0138, blocks: (B:33:0x00e6, B:35:0x00f2, B:36:0x0101, B:22:0x0089, B:24:0x008f, B:26:0x009b, B:27:0x00dc, B:39:0x010a, B:40:0x010e, B:42:0x0114, B:43:0x0124, B:44:0x0128, B:46:0x012e), top: B:61:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final int A0B(int i10, Set<String> set, Set<String> set2) {
        String strA00 = A00(TTAdConstant.IMAGE_URL_CODE, 7, 120);
        int i11 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A6O(bArr, iArr));
            List<JSONObject> listA01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC1613Tt) linkedList.getLast()).ABp()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A6O(bArr, iArr));
                listA01 = A01(listA01, bArr, iArr);
            }
            Iterator<JSONObject> it = listA01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 114));
                    try {
                        if (set.contains(string)) {
                            int i12 = next.getInt(strA00) + 1;
                            if (i12 < i10) {
                                try {
                                    next.put(strA00, i12);
                                    this.A01.AJW(A09(next));
                                } catch (U3 e10) {
                                    e = e10;
                                    if (this.A00.A05().AAF()) {
                                        Log.e(A05, A00(130, 68, 89), e);
                                    }
                                    A05(AbstractC1590Sv.A2L, e);
                                    return i11;
                                } catch (JSONException e11) {
                                    e = e11;
                                    try {
                                        if (this.A00.A05().AAF()) {
                                            Log.e(A05, A00(198, 47, 123), e);
                                        }
                                        A05(AbstractC1590Sv.A2P, e);
                                    } catch (U3 e12) {
                                        e = e12;
                                        if (this.A00.A05().AAF()) {
                                            Log.e(A05, A00(130, 68, 89), e);
                                        }
                                        A05(AbstractC1590Sv.A2L, e);
                                        return i11;
                                    }
                                }
                            } else {
                                i11++;
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A05().AAF()) {
                                        String str = A00(39, 16, 55) + string + A00(0, 11, 44) + next.optString(A00(471, 4, 24), A00(475, 7, 113));
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e13) {
                                e = e13;
                                if (this.A00.A05().AAF()) {
                                    Log.e(A05, A00(198, 47, 123), e);
                                }
                                A05(AbstractC1590Sv.A2P, e);
                            }
                        }
                    } catch (U3 e14) {
                        e = e14;
                    } catch (JSONException e15) {
                        e = e15;
                    }
                } catch (JSONException e16) {
                    e = e16;
                }
            }
            Iterator<JSONObject> it2 = listA01.iterator();
            while (it2.hasNext()) {
                this.A02.AJW(A09(it2.next()));
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC1613Tt) it3.next()).A5h();
            }
        } catch (U3 e17) {
            e = e17;
        }
        return i11;
    }

    static {
        A03();
        A05 = C1660Vp.class.getSimpleName();
    }

    public C1660Vp(C1951cu c1951cu) throws IOException {
        this.A00 = c1951cu;
        this.A01 = new C1657Vm(C1611Tr.A00(A00(11, 28, 27), c1951cu), new W7(this));
        this.A02 = new C1657Vm(C1611Tr.A00(A00(322, 37, 96), c1951cu), new W3(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i10, i11));
            } catch (JSONException jsone) {
                if (this.A00.A05().AAF()) {
                    Log.e(A05, A00(85, 45, 14), jsone);
                }
                int start = AbstractC1590Sv.A2P;
                A05(start, jsone);
            }
            i10 += i11;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i10, int i11) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i10, i10 + i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        C1591Sw c1591Sw = new C1591Sw(str);
        c1591Sw.A05(1);
        this.A00.A08().AAz(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 3), i10, c1591Sw);
    }

    private void A05(int i10, Throwable th2) {
        this.A00.A08().AAy(A00(TypedValues.CycleType.TYPE_WAVE_PHASE, 15, 3), i10, new C1591Sw(th2));
    }

    public static byte[] A07(SQ sq, String str, UP up) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(TypedValues.CycleType.TYPE_WAVE_PERIOD, 2, 114), str);
            jSONObject.put(A00(466, 5, 95), up.A08());
            jSONObject.put(A00(471, 4, 24), up.A06().toString());
            jSONObject.put(A00(462, 4, 49), XG.A03(up.A04()));
            jSONObject.put(A00(450, 12, 125), XG.A03(up.A03()));
            jSONObject.put(A00(440, 10, 20), up.A07());
            jSONObject.put(A00(419, 4, 55), new JSONObject(up.A09()));
            jSONObject.put(A00(TTAdConstant.IMAGE_URL_CODE, 7, 120), 0);
        } catch (JSONException e10) {
            if (sq.A05().AAF()) {
                Log.e(A05, A00(294, 28, 42), e10);
            }
        }
        String string = jSONObject.toString();
        if (A04[3].charAt(18) == '3') {
            throw new RuntimeException();
        }
        A04[3] = "qXIRiOsc7TnqBEY389oLdIOolYF6NOqr";
        return string.getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A8k();
        } catch (U3 e10) {
            if (this.A00.A05().AAF()) {
                Log.e(A05, A00(245, 49, 19), e10);
                return 0;
            }
            return 0;
        }
    }

    public final List<JSONObject> A0C(int i10) {
        int totalFetched = 0;
        if (i10 == -1) {
            totalFetched = 1;
            i10 = 30;
        }
        int[] eventSizes = new int[i10];
        byte[] bArr = new byte[i10 * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC1613Tt interfaceC1613TtA6O = this.A01.A6O(bArr, eventSizes);
            linkedList2.add(interfaceC1613TtA6O);
            int iA6P = interfaceC1613TtA6O.A6P();
            linkedList = A01(linkedList, bArr, eventSizes);
            while (noLimit && (iA6P < i10 || totalFetched != 0)) {
                if (totalFetched != 0) {
                    Arrays.fill(eventSizes, 0);
                } else {
                    eventSizes = new int[i10 - iA6P];
                }
                interfaceC1613TtA6O = this.A01.A6O(bArr, eventSizes);
                linkedList2.add(interfaceC1613TtA6O);
                linkedList = A01(linkedList, bArr, eventSizes);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (noLimit) {
                this.A02.AJW(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (noLimit) {
                ((InterfaceC1613Tt) it2.next()).A5h();
            }
        } catch (U3 e10) {
            boolean noLimit = this.A00.A05().AAF();
            if (noLimit) {
                Log.e(A05, A00(359, 53, 114), e10);
            }
            A05(AbstractC1590Sv.A2M, e10);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Tj
    public final void A4t() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (U3 e10) {
            if (this.A00.A05().AAF()) {
                Log.e(A05, A00(55, 30, 73), e10);
            }
            A05(AbstractC1590Sv.A2J, e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tg != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1603Tj
    public final void AKL(UP up, AbstractC1601Tg<String> abstractC1601Tg) {
        XR.A00(XU.A07, new AsyncTaskC1604Tk(up, abstractC1601Tg, this.A01, this.A00), new Void[0]);
    }
}
