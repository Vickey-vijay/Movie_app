package com.facebook.ads.redexgen.core;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JA {
    public static String[] A08 = {"QrT", "qnQt5WyeAQ09x35f49C3fjiJNyL2Wwm", "MYPg", "kl", "gHVF4DBtkYKODoSVDn", "z4XgsVt0P4PakGRoUHMjSa47eQapG64R", "b9pv7rqD0c4j71TLmNGUCRckoksDVk", "PMM3oo9z0bIH04LH4O"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<J9> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public JA(int i10, int i11) {
        A0C(i10);
        this.A01 = i11;
    }

    private SpannableString A04() {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int nextColor = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        int style = 0;
        int i11 = -1;
        for (int length = 0; length < this.A06.size(); length++) {
            J9 j10 = this.A06.get(length);
            boolean z10 = j10.A02;
            int i12 = j10.A01;
            if (i12 != 8) {
                style = i12 == 7 ? 1 : 0;
                if (i12 != 7) {
                    i11 = C08850v.A0Q[i12];
                }
            }
            int i13 = j10.A00;
            if (length + 1 < this.A06.size()) {
                i10 = this.A06.get(length + 1).A00;
            } else {
                i10 = nextColor;
            }
            if (i13 != i10) {
                if (color != -1 && !z10) {
                    A06(spannableStringBuilder, color, i13);
                    color = -1;
                } else if (color == -1 && z10) {
                    color = i13;
                }
                if (colorStartPosition != -1 && style == 0) {
                    A05(spannableStringBuilder, colorStartPosition, i13);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && style != 0) {
                    colorStartPosition = i13;
                }
                if (i11 != underlineStartPosition) {
                    A07(spannableStringBuilder, italicStartPosition, i13, underlineStartPosition);
                    underlineStartPosition = i11;
                    italicStartPosition = i13;
                }
            }
        }
        if (color != -1 && color != nextColor) {
            A06(spannableStringBuilder, color, nextColor);
        }
        if (colorStartPosition != -1 && colorStartPosition != nextColor) {
            A05(spannableStringBuilder, colorStartPosition, nextColor);
        }
        if (italicStartPosition != nextColor) {
            A07(spannableStringBuilder, italicStartPosition, nextColor, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    public final C2605o2 A08(int i10) {
        int i11;
        int maxTextLength;
        int startPadding;
        float f10;
        int line;
        int startEndPaddingDelta = this.A02 + this.A04;
        int i12 = 32 - startEndPaddingDelta;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i13 = 0; i13 < startPadding; i13++) {
            spannableStringBuilder.append(AbstractC09664a.A0e(this.A07.get(i13), i12));
            String[] strArr = A08;
            String str = strArr[7];
            String str2 = strArr[1];
            int maxTextLength2 = str.length();
            int startPadding2 = str2.length();
            if (maxTextLength2 == startPadding2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "Z1xB";
            strArr2[6] = "hIixFY3yygWtziyMrZmiBRgOnmfC1l";
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(AbstractC09664a.A0e(A04(), i12));
        int startPadding3 = spannableStringBuilder.length();
        if (startPadding3 == 0) {
            String[] strArr3 = A08;
            String str3 = strArr3[2];
            String str4 = strArr3[6];
            int maxTextLength3 = str3.length();
            int startPadding4 = str4.length();
            if (maxTextLength3 != startPadding4) {
                String[] strArr4 = A08;
                strArr4[0] = "rBt";
                strArr4[3] = "BH";
                return null;
            }
            return null;
        }
        int startPadding5 = spannableStringBuilder.length();
        int i14 = (32 - startEndPaddingDelta) - startPadding5;
        int i15 = startEndPaddingDelta - i14;
        if (i10 == Integer.MIN_VALUE) {
            int startPadding6 = this.A00;
            if (startPadding6 == 2) {
                int maxTextLength4 = Math.abs(i15);
                if (maxTextLength4 < 3 || i14 < 0) {
                    i10 = 1;
                } else {
                    i11 = this.A00;
                    String[] strArr5 = A08;
                    String str5 = strArr5[0];
                    String str6 = strArr5[3];
                    maxTextLength = str5.length();
                    startPadding = str6.length();
                    if (maxTextLength != startPadding) {
                        String[] strArr6 = A08;
                        strArr6[2] = "zsbn";
                        strArr6[6] = "2pz3wER7XyxppBOwf3KUzADVO23k2y";
                        if (i11 == 2) {
                            if (i15 > 0) {
                                i10 = 2;
                            }
                        }
                    } else {
                        String[] strArr7 = A08;
                        strArr7[0] = "Ac2";
                        strArr7[3] = "GK";
                        if (i11 == 2) {
                            if (i15 > 0) {
                                i10 = 2;
                            }
                        }
                    }
                    i10 = 0;
                }
            } else {
                i11 = this.A00;
                String[] strArr8 = A08;
                String str7 = strArr8[0];
                String str8 = strArr8[3];
                maxTextLength = str7.length();
                startPadding = str8.length();
                if (maxTextLength != startPadding) {
                    String[] strArr9 = A08;
                    strArr9[2] = "zsbn";
                    strArr9[6] = "2pz3wER7XyxppBOwf3KUzADVO23k2y";
                    if (i11 == 2) {
                        if (i15 > 0) {
                            i10 = 2;
                        }
                    }
                } else {
                    String[] strArr10 = A08;
                    strArr10[0] = "Ac2";
                    strArr10[3] = "GK";
                    if (i11 == 2) {
                        if (i15 > 0) {
                            i10 = 2;
                        }
                    }
                }
                i10 = 0;
            }
        }
        switch (i10) {
            case 1:
                f10 = 0.5f;
                break;
            case 2:
                int startPadding7 = 32 - i14;
                f10 = (0.8f * (startPadding7 / 32.0f)) + 0.1f;
                break;
            default:
                f10 = (0.8f * (startEndPaddingDelta / 32.0f)) + 0.1f;
                break;
        }
        int maxTextLength5 = this.A03;
        if (maxTextLength5 > 7) {
            int startPadding8 = this.A03;
            line = (startPadding8 - 15) - 2;
        } else {
            int startPadding9 = this.A00;
            if (startPadding9 == 1) {
                int i16 = this.A03;
                int startEndPaddingDelta2 = this.A01 - 1;
                String[] strArr11 = A08;
                String str9 = strArr11[2];
                String str10 = strArr11[6];
                int maxTextLength6 = str9.length();
                int startPadding10 = str10.length();
                if (maxTextLength6 == startPadding10) {
                    throw new RuntimeException();
                }
                String[] strArr12 = A08;
                strArr12[4] = "FzP30KGLJrbEGZLX6W";
                strArr12[5] = "LdbePQPUJr4EiMizjJFZUiWqoRbmx53S";
                line = i16 - startEndPaddingDelta2;
            } else {
                line = this.A03;
            }
        }
        return new C3C().A0G(spannableStringBuilder).A0F(Layout.Alignment.ALIGN_NORMAL).A07(line, 1).A04(f10).A0A(i10).A0H();
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i10 = length3 - 1; i10 >= 0; i10--) {
                J9 j10 = this.A06.get(i10);
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[6];
                int i11 = str.length();
                int length4 = str2.length();
                if (i11 == length4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[7] = "VxqvNxDPFU2KcS189G";
                strArr2[1] = "CD1791pAkSaTS5HjwfKDVAxBa1qJnUw";
                int length5 = j10.A00;
                if (length5 == length) {
                    int length6 = j10.A00;
                    j10.A00 = length6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0A() {
        this.A07.add(A04());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (numRows >= iMin) {
            this.A07.remove(0);
        }
    }

    public final void A0B(char c10) {
        if (this.A05.length() < 32) {
            this.A05.append(c10);
        }
    }

    public final void A0C(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i10) {
        this.A00 = i10;
    }

    public final void A0E(int i10) {
        this.A01 = i10;
    }

    public final void A0F(int i10, boolean z10) {
        this.A06.add(new J9(i10, z10, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}
