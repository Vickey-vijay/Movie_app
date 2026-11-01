package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public abstract class so3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f82715a = 0;

    public static long a(String str) {
        int i10 = ib3.f78556a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static void a(jb2 jb2Var) throws ob2 {
        int i10 = jb2Var.f78967b;
        String strC = jb2Var.c();
        if (strC == null || !strC.startsWith("WEBVTT")) {
            jb2Var.e(i10);
            throw new ob2("Expected WEBVTT. Got " + jb2Var.c(), null, true, 1);
        }
    }
}
