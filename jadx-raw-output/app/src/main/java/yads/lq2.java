package yads;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f79882a;

    public final String a(String str) throws IOException, z02 {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!lk.a.c(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            ck.p.i(string, "toString(...)");
            return this.f79882a.format(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            ck.w wVar = ck.w.f6066a;
            ck.p.i(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f75480a;
            throw new z02("Native Ad json has not required attributes");
        }
    }

    public lq2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f79882a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }
}
