package yads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class zy0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f85652c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85653a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85654b = -1;

    public final void a(ts1 ts1Var) {
        int i10 = 0;
        while (true) {
            ss1[] ss1VarArr = ts1Var.f83163b;
            if (i10 >= ss1VarArr.length) {
                return;
            }
            ss1 ss1Var = ss1VarArr[i10];
            if (ss1Var instanceof px) {
                px pxVar = (px) ss1Var;
                if ("iTunSMPB".equals(pxVar.f81640d) && a(pxVar.f81641e)) {
                    return;
                }
            } else if (ss1Var instanceof zc1) {
                zc1 zc1Var = (zc1) ss1Var;
                if ("com.apple.iTunes".equals(zc1Var.f85339c) && "iTunSMPB".equals(zc1Var.f85340d) && a(zc1Var.f85341e)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = f85652c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = ib3.f78556a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f85653a = i11;
            this.f85654b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
