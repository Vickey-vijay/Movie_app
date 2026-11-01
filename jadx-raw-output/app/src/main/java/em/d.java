package em;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: DateUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {
    public static long a(String str) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
    }

    public static String b(Long l10) {
        return l10 == null ? "" : new SimpleDateFormat("yyyy-MM-dd HH:mm").format(l10);
    }

    public static String c() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
