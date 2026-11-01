package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2342jY implements KW {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C2341jX A04;
    public final C4I A03 = new C4I(new byte[5]);
    public final SparseArray<InterfaceC1370Kf> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.KW
    public final void A52(C4J c4j) {
        C4R c4r;
        if (c4j.A0I() != 2) {
            return;
        }
        if (this.A04.A09 == 1 || this.A04.A09 == 2 || this.A04.A02 == 1) {
            c4r = (C4R) this.A04.A0I.get(0);
        } else {
            c4r = new C4R(((C4R) this.A04.A0I.get(0)).A02());
            this.A04.A0I.add(c4r);
        }
        if ((c4j.A0I() & 128) == 0) {
            return;
        }
        c4j.A0g(1);
        int iA0M = c4j.A0M();
        int i10 = 3;
        c4j.A0g(3);
        c4j.A0h(this.A03, 2);
        this.A03.A09(3);
        int i11 = 13;
        this.A04.A01 = this.A03.A04(13);
        c4j.A0h(this.A03, 2);
        int i12 = 4;
        this.A03.A09(4);
        c4j.A0g(this.A03.A04(12));
        int i13 = 21;
        if (this.A04.A09 == 2 && this.A04.A05 == null) {
            this.A04.A05 = this.A04.A0H.A5N(21, new C1366Kb(21, null, null, AbstractC09664a.A07));
            if (this.A04.A05 != null) {
                this.A04.A05.AA2(c4r, this.A04.A03, new C1369Ke(iA0M, 21, 8192));
            }
        }
        this.A01.clear();
        this.A02.clear();
        int iA07 = c4j.A07();
        while (iA07 > 0) {
            c4j.A0h(this.A03, 5);
            int iA04 = this.A03.A04(8);
            this.A03.A09(i10);
            int iA05 = this.A03.A04(i11);
            this.A03.A09(i12);
            int iA06 = this.A03.A04(12);
            C1366Kb c1366KbA00 = A00(c4j, iA06);
            if (iA04 == 6 || iA04 == 5) {
                iA04 = c1366KbA00.A00;
            }
            iA07 -= iA06 + 5;
            int i14 = this.A04.A09 == 2 ? iA04 : iA05;
            if (!this.A04.A0C.get(i14)) {
                InterfaceC1370Kf interfaceC1370KfA5N = (this.A04.A09 == 2 && iA04 == i13) ? this.A04.A05 : this.A04.A0H.A5N(iA04, c1366KbA00);
                if (this.A04.A09 == 2) {
                    SparseIntArray sparseIntArray = this.A02;
                    String[] strArr = A05;
                    if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                        throw new RuntimeException();
                    }
                    A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                    if (iA05 < sparseIntArray.get(i14, 8192)) {
                        this.A02.put(i14, iA05);
                        this.A01.put(i14, interfaceC1370KfA5N);
                    }
                } else {
                    this.A02.put(i14, iA05);
                    this.A01.put(i14, interfaceC1370KfA5N);
                }
            }
            i13 = 21;
            i10 = 3;
            i12 = 4;
            i11 = 13;
        }
        int size = this.A02.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iKeyAt = this.A02.keyAt(i15);
            int iValueAt = this.A02.valueAt(i15);
            this.A04.A0C.put(iKeyAt, true);
            this.A04.A0D.put(iValueAt, true);
            InterfaceC1370Kf interfaceC1370KfValueAt = this.A01.valueAt(i15);
            if (interfaceC1370KfValueAt != null) {
                if (interfaceC1370KfValueAt != this.A04.A05) {
                    interfaceC1370KfValueAt.AA2(c4r, this.A04.A03, new C1369Ke(iA0M, iKeyAt, 8192));
                }
                this.A04.A0B.put(iValueAt, interfaceC1370KfValueAt);
            }
        }
        if (this.A04.A09 != 2) {
            this.A04.A0B.remove(this.A00);
            this.A04.A02 = this.A04.A09 != 1 ? this.A04.A02 - 1 : 0;
            if (this.A04.A02 == 0) {
                this.A04.A03.A6G();
                this.A04.A08 = true;
                return;
            }
            return;
        }
        if (this.A04.A08) {
            return;
        }
        GY gy = this.A04.A03;
        String[] strArr2 = A05;
        if (strArr2[1].length() != strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A05;
        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
        gy.A6G();
        this.A04.A02 = 0;
        this.A04.A08 = true;
    }

    public C2342jY(C2341jX c2341jX, int i10) {
        this.A04 = c2341jX;
        this.A00 = i10;
    }

    private C1366Kb A00(C4J c4j, int i10) {
        int descriptorTag = c4j.A09();
        int descriptorLength = descriptorTag + i10;
        int i11 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c4j.A09() < descriptorLength) {
            int positionOfNextDescriptor = c4j.A0I();
            int iA09 = c4j.A09() + c4j.A0I();
            if (iA09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long jA0Q = c4j.A0Q();
                if (jA0Q == 1094921523) {
                    i11 = 129;
                } else if (jA0Q == 1161904947) {
                    i11 = 135;
                } else if (jA0Q == 1094921524) {
                    i11 = 172;
                } else if (jA0Q == 1212503619) {
                    i11 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i11 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i11 = 135;
            } else {
                String[] strArr = A05;
                String str = strArr[1];
                String str2 = strArr[2];
                int descriptorsStartPosition = str.length();
                if (descriptorsStartPosition != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c4j.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i11 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i11 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str3 = strArr3[1];
                    String str4 = strArr3[2];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String strA0W = c4j.A0W(3);
                        String[] strArr5 = A05;
                        String str5 = strArr5[1];
                        String str6 = strArr5[2];
                        int descriptorsStartPosition4 = str5.length();
                        if (descriptorsStartPosition4 != str6.length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i11 = 89;
                        arrayList = new ArrayList();
                        while (c4j.A09() < iA09) {
                            String strTrim2 = c4j.A0W(3).trim();
                            int iA0I = c4j.A0I();
                            byte[] bArr = new byte[4];
                            c4j.A0k(bArr, 0, 4);
                            arrayList.add(new C1365Ka(strTrim2, iA0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i11 = 257;
                    }
                }
            }
            c4j.A0g(iA09 - c4j.A09());
        }
        c4j.A0f(descriptorLength);
        return new C1366Kb(i11, strTrim, arrayList, Arrays.copyOfRange(c4j.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void AA2(C4R c4r, GY gy, C1369Ke c1369Ke) {
    }
}
