package o8;

import android.annotation.SuppressLint;
import android.content.Context;
import com.luck.picture.lib.R$string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f65135a = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f65136b = new SimpleDateFormat("yyyy-MM");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f65137c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String b(long j10) {
        String str = j10 < 0 ? "-" : "";
        long jAbs = Math.abs(j10) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        return j13 > 0 ? String.format(Locale.getDefault(), "%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)) : String.format(Locale.getDefault(), "%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11));
    }

    public static boolean g(long j10) {
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = f65136b;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    public static long i(long j10) {
        return (j10 / 1000) * 1000;
    }

    public static int a(long j10) {
        try {
            return (int) Math.abs(d() - j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String c(String str) {
        return str + f65135a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static long d() {
        String strG = s.g(Long.valueOf(System.currentTimeMillis()));
        if (strG.length() > 10) {
            strG = strG.substring(0, 10);
        }
        return s.e(strG);
    }

    public static String e(Context context, long j10) {
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        if (h(j10)) {
            return context.getString(R$string.ps_current_week);
        }
        if (g(j10)) {
            return context.getString(R$string.ps_current_month);
        }
        return f65136b.format(Long.valueOf(j10));
    }

    public static String f(long j10) {
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        return f65137c.format(Long.valueOf(j10));
    }

    public static boolean h(long j10) {
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(3);
        calendar.setTime(new Date(j10));
        if (calendar.get(3) == i10) {
            return true;
        }
        return false;
    }
}
