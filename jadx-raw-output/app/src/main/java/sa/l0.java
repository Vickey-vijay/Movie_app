package sa;

import com.google.android.material.timepicker.TimeModel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: TimeUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f67173a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f67174b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f67175c = new a();

    /* JADX INFO: compiled from: TimeUtil.kt */
    public static final class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    public static final String d(long j10, long j11) {
        int i10 = (int) ((j10 * 100.0f) / j11);
        StringBuilder sb2 = new StringBuilder();
        ck.w wVar = ck.w.f6066a;
        String str = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        ck.p.i(str, "format(...)");
        sb2.append(str);
        sb2.append('%');
        return sb2.toString();
    }

    public static final long a(String str, String str2) {
        try {
            ThreadLocal<SimpleDateFormat> threadLocal = f67175c;
            return threadLocal.get().parse(str2).getTime() - threadLocal.get().parse(str).getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public static final String b(long j10) {
        int i10 = (int) (j10 / ((long) 1000));
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        if (i13 > 0) {
            ck.w wVar = ck.w.f6066a;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)}, 3));
            ck.p.i(str, "format(...)");
            return str;
        }
        ck.w wVar2 = ck.w.f6066a;
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i11)}, 2));
        ck.p.i(str2, "format(...)");
        return str2;
    }

    public static final String c() {
        String str = f67175c.get().format(Calendar.getInstance().getTime());
        ck.p.i(str, "format(...)");
        return str;
    }
}
