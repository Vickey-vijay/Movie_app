package lk;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class v extends u {
    /* JADX WARN: Code duplicated, block: B:133:0x013e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    public static final boolean n(String str) {
        boolean z10;
        int i10;
        boolean z11;
        String str2;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int length = str.length() - 1;
        int i12 = 0;
        while (i12 <= length) {
            if (!(str.charAt(i12) <= ' ')) {
                break;
            }
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        while (length > i12) {
            if (!(str.charAt(length) <= ' ')) {
                break;
            }
            length--;
        }
        if (str.charAt(i12) == '+' || str.charAt(i12) == '-') {
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        if (str.charAt(i12) != '0') {
            z10 = false;
        } else {
            int i13 = i12 + 1;
            if (i13 > length) {
                return true;
            }
            if ((str.charAt(i13) | ' ') == 120) {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 <= length) {
                    char cCharAt = str.charAt(i15);
                    if (((cCharAt + 65488) & 65535) < 10) {
                        z14 = true;
                    } else {
                        if ((((cCharAt | ' ') + (-97)) & 65535) < 6) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (!z14) {
                        break;
                    }
                    i15++;
                }
                boolean z15 = i14 != i15;
                if (i15 <= length) {
                    if (str.charAt(i15) == '.') {
                        int i16 = i15 + 1;
                        i11 = i16;
                        while (i11 <= length) {
                            char cCharAt2 = str.charAt(i11);
                            if (((cCharAt2 + 65488) & 65535) < 10) {
                                z13 = true;
                            } else {
                                if ((((cCharAt2 | ' ') + (-97)) & 65535) < 6) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            if (!z13) {
                                break;
                            }
                            i11++;
                        }
                        if (i16 != i11) {
                            z12 = true;
                        }
                        if (!z15 || z12) {
                            i12 = i11;
                        } else {
                            i12 = -1;
                        }
                    } else {
                        i11 = i15;
                    }
                    z12 = false;
                    if (z15) {
                    }
                    i12 = i11;
                } else {
                    i12 = -1;
                }
                if (i12 == -1 || i12 > length) {
                    return false;
                }
                z10 = true;
            } else {
                i12 = i13 - 1;
                z10 = false;
            }
        }
        if (!z10) {
            int i17 = i12;
            while (i17 <= length) {
                if (!(((str.charAt(i17) - '0') & 65535) < 10)) {
                    break;
                }
                i17++;
            }
            boolean z16 = i12 != i17;
            if (i17 > length) {
                i12 = i17;
            } else {
                if (str.charAt(i17) == '.') {
                    int i18 = i17 + 1;
                    i10 = i18;
                    while (i10 <= length) {
                        if (!(((str.charAt(i10) - '0') & 65535) < 10)) {
                            break;
                        }
                        i10++;
                    }
                    if (i18 != i10) {
                        z11 = true;
                    }
                    if (!z16 || z11) {
                        i12 = i10;
                    } else {
                        if (length == (i10 + 3) - 1) {
                            str2 = "NaN";
                        } else {
                            str2 = length == (i10 + 8) - 1 ? "Infinity" : null;
                        }
                        i12 = (str2 != null && a0.h0(str, str2, i10, false) == i10) ? length + 1 : -1;
                    }
                } else {
                    i10 = i17;
                }
                z11 = false;
                if (z16) {
                    i12 = i10;
                } else {
                    i12 = i10;
                }
            }
            if (i12 == -1) {
                return false;
            }
            if (i12 > length) {
                return true;
            }
        }
        int i19 = i12 + 1;
        int iCharAt = str.charAt(i12) | ' ';
        if (iCharAt != (z10 ? 112 : 101)) {
            return !z10 && (iCharAt == 102 || iCharAt == 100) && i19 > length;
        }
        if (i19 > length) {
            return false;
        }
        if ((str.charAt(i19) == '+' || str.charAt(i19) == '-') && (i19 = i19 + 1) > length) {
            return false;
        }
        while (i19 <= length) {
            if (!(((str.charAt(i19) - '0') & 65535) < 10)) {
                break;
            }
            i19++;
        }
        if (i19 > length) {
            return true;
        }
        if (i19 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i19) | ' ';
        return iCharAt2 == 102 || iCharAt2 == 100;
    }

    public static final Double o(String str) {
        ck.p.j(str, "<this>");
        try {
            if (n(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Float p(String str) {
        ck.p.j(str, "<this>");
        try {
            if (n(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
