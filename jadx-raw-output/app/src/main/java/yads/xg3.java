package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xg3 {
    public static final Long a(String str) {
        if (str == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
            return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
        } catch (ParseException unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public static final Integer b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
