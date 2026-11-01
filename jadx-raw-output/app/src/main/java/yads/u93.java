package yads;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u93 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, v93 v93Var, s93 s93Var, Map map, int i12) {
        s93 s93Var2;
        int i13 = v93Var.f83843h;
        if (i13 != -1 || v93Var.f83844i != -1) {
            if (((i13 == 1 ? (char) 1 : (char) 0) | (v93Var.f83844i == 1 ? (char) 2 : (char) 0)) != -1) {
                int i14 = v93Var.f83843h;
                spannableStringBuilder.setSpan(new StyleSpan((i14 == -1 && v93Var.f83844i == -1) ? -1 : (i14 == 1 ? 1 : 0) | (v93Var.f83844i == 1 ? 2 : 0)), i10, i11, 33);
            }
        }
        if (v93Var.f83841f == 1) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (v93Var.f83842g == 1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (v93Var.f83838c) {
            if (!v93Var.f83838c) {
                throw new IllegalStateException("Font color has not been defined.");
            }
            e23.a(spannableStringBuilder, new ForegroundColorSpan(v93Var.f83837b), i10, i11);
        }
        if (v93Var.f83840e) {
            if (!v93Var.f83840e) {
                throw new IllegalStateException("Background color has not been defined.");
            }
            e23.a(spannableStringBuilder, new BackgroundColorSpan(v93Var.f83839d), i10, i11);
        }
        if (v93Var.f83836a != null) {
            e23.a(spannableStringBuilder, new TypefaceSpan(v93Var.f83836a), i10, i11);
        }
        v53 v53Var = v93Var.f83853r;
        if (v53Var != null) {
            int i15 = v53Var.f83780a;
            e23.a(spannableStringBuilder, new w53(), i10, i11);
        }
        int i16 = v93Var.f83848m;
        if (i16 == 2) {
            s93 s93Var3 = s93Var;
            while (true) {
                if (s93Var3 == null) {
                    s93Var3 = null;
                    break;
                }
                v93 v93VarA = a(s93Var3.f82559f, s93Var3.f82560g, map);
                if (v93VarA != null && v93VarA.f83848m == 1) {
                    break;
                } else {
                    s93Var3 = s93Var3.f82563j;
                }
            }
            if (s93Var3 != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(s93Var3);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        s93Var2 = null;
                        break;
                    }
                    s93 s93Var4 = (s93) arrayDeque.pop();
                    v93 v93VarA2 = a(s93Var4.f82559f, s93Var4.f82560g, map);
                    if (v93VarA2 != null && v93VarA2.f83848m == 3) {
                        s93Var2 = s93Var4;
                        break;
                    }
                    ArrayList arrayList = s93Var4.f82566m;
                    for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                        arrayDeque.push(s93Var4.a(size));
                    }
                }
                if (s93Var2 != null) {
                    ArrayList arrayList2 = s93Var2.f82566m;
                    if (arrayList2 == null || arrayList2.size() != 1 || s93Var2.a(0).f82555b == null) {
                        ih1.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = s93Var2.a(0).f82555b;
                        int i17 = ib3.f78556a;
                        v93 v93VarA3 = a(s93Var2.f82559f, s93Var2.f82560g, map);
                        if (v93VarA3 == null || v93VarA3.f83849n == -1) {
                            a(s93Var3.f82559f, s93Var3.f82560g, map);
                        }
                        spannableStringBuilder.setSpan(new zr2(), i10, i11, 33);
                    }
                }
            }
        } else if (i16 == 3 || i16 == 4) {
            spannableStringBuilder.setSpan(new vf0(), i10, i11, 33);
        }
        if (v93Var.f83852q == 1) {
            e23.a(spannableStringBuilder, new c11(), i10, i11);
        }
        int i18 = v93Var.f83845j;
        if (i18 == 1) {
            e23.a(spannableStringBuilder, new AbsoluteSizeSpan((int) v93Var.f83846k, true), i10, i11);
        } else if (i18 == 2) {
            e23.a(spannableStringBuilder, new RelativeSizeSpan(v93Var.f83846k), i10, i11);
        } else {
            if (i18 != 3) {
                return;
            }
            e23.a(spannableStringBuilder, new RelativeSizeSpan(v93Var.f83846k / 100.0f), i10, i11);
        }
    }

    public static v93 a(v93 v93Var, String[] strArr, Map map) {
        int i10 = 0;
        if (v93Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (v93) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                v93 v93Var2 = new v93();
                int length = strArr.length;
                while (i10 < length) {
                    v93Var2.a((v93) map.get(strArr[i10]));
                    i10++;
                }
                return v93Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return v93Var.a((v93) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    v93Var.a((v93) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return v93Var;
    }
}
