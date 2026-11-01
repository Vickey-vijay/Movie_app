package z4;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.Z7;
import java.util.Map;

/* JADX INFO: compiled from: TtmlRenderUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", Z7.f27998r).replaceAll("[ \t\\x0B\f\r]+", Z7.f27998r);
    }

    public static e d(e eVar, String[] strArr, Map<String, e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i10 = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            e eVar2 = new e();
            int length = strArr.length;
            while (i10 < length) {
                eVar2.a(map.get(strArr[i10]));
                i10++;
            }
            return eVar2;
        }
        if (eVar != null && strArr != null && strArr.length == 1) {
            return eVar.a(map.get(strArr[0]));
        }
        if (eVar != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i10 < length2) {
                eVar.a(map.get(strArr[i10]));
                i10++;
            }
        }
        return eVar;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, e eVar) {
        if (eVar.h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.h()), i10, i11, 33);
        }
        if (eVar.m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (eVar.n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (eVar.k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.c()), i10, i11, 33);
        }
        if (eVar.j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.b()), i10, i11, 33);
        }
        if (eVar.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.d()), i10, i11, 33);
        }
        if (eVar.i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.i()), i10, i11, 33);
        }
        int iF = eVar.f();
        if (iF != 1) {
            if (iF != 2) {
                if (iF == 3) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.e() / 100.0f), i10, i11, 33);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.e()), i10, i11, 33);
            return;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) eVar.e(), true), i10, i11, 33);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
