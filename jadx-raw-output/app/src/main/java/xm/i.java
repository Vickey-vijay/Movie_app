package xm;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: DateCache.java */
/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static long f75000o = 3600;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f75002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SimpleDateFormat f75003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f75004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f75005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f75006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f75008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f75009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f75010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f75011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f75012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Locale f75013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DateFormatSymbols f75014n;

    public i(String str) {
        this.f75009i = -1L;
        this.f75010j = -1L;
        this.f75011k = -1;
        this.f75012l = null;
        this.f75013m = null;
        this.f75014n = null;
        this.f75001a = str;
        e(TimeZone.getDefault());
    }

    public synchronized String a(long j10) {
        long j11 = j10 / 1000;
        long j12 = this.f75010j;
        if (j11 >= j12 && (j12 <= 0 || j11 <= f75000o + j12)) {
            if (j12 == j11) {
                return this.f75012l;
            }
            Date date = new Date(j10);
            long j13 = j11 / 60;
            if (this.f75009i != j13) {
                this.f75009i = j13;
                String str = this.f75005e.format(date);
                this.f75006f = str;
                int iIndexOf = str.indexOf("ss");
                this.f75007g = this.f75006f.substring(0, iIndexOf);
                this.f75008h = this.f75006f.substring(iIndexOf + 2);
            }
            this.f75010j = j11;
            StringBuilder sb2 = new StringBuilder(this.f75006f.length());
            sb2.append(this.f75007g);
            int i10 = (int) (j11 % 60);
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
            sb2.append(this.f75008h);
            String string = sb2.toString();
            this.f75012l = string;
            return string;
        }
        return this.f75003c.format(new Date(j10));
    }

    public synchronized void e(TimeZone timeZone) {
        f(timeZone);
        if (this.f75013m != null) {
            this.f75003c = new SimpleDateFormat(this.f75002b, this.f75013m);
            this.f75005e = new SimpleDateFormat(this.f75004d, this.f75013m);
        } else if (this.f75014n != null) {
            this.f75003c = new SimpleDateFormat(this.f75002b, this.f75014n);
            this.f75005e = new SimpleDateFormat(this.f75004d, this.f75014n);
        } else {
            this.f75003c = new SimpleDateFormat(this.f75002b);
            this.f75005e = new SimpleDateFormat(this.f75004d);
        }
        this.f75003c.setTimeZone(timeZone);
        this.f75005e.setTimeZone(timeZone);
        this.f75010j = -1L;
        this.f75009i = -1L;
    }

    public final synchronized void f(TimeZone timeZone) {
        int iIndexOf = this.f75001a.indexOf("ZZZ");
        if (iIndexOf >= 0) {
            String strSubstring = this.f75001a.substring(0, iIndexOf);
            String strSubstring2 = this.f75001a.substring(iIndexOf + 3);
            int rawOffset = timeZone.getRawOffset();
            StringBuilder sb2 = new StringBuilder(this.f75001a.length() + 10);
            sb2.append(strSubstring);
            sb2.append("'");
            if (rawOffset >= 0) {
                sb2.append('+');
            } else {
                rawOffset = -rawOffset;
                sb2.append('-');
            }
            int i10 = rawOffset / 60000;
            int i11 = i10 / 60;
            int i12 = i10 % 60;
            if (i11 < 10) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i12 < 10) {
                sb2.append('0');
            }
            sb2.append(i12);
            sb2.append('\'');
            sb2.append(strSubstring2);
            this.f75002b = sb2.toString();
        } else {
            this.f75002b = this.f75001a;
        }
        d();
    }

    public int b() {
        return this.f75011k;
    }

    public final void d() {
        if (this.f75002b.indexOf("ss.SSS") >= 0) {
            throw new IllegalStateException("ms not supported");
        }
        int iIndexOf = this.f75002b.indexOf("ss");
        this.f75004d = this.f75002b.substring(0, iIndexOf) + "'ss'" + this.f75002b.substring(iIndexOf + 2);
    }

    public String c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f75011k = (int) (jCurrentTimeMillis % 1000);
        return a(jCurrentTimeMillis);
    }

    public i(String str, Locale locale) {
        this.f75009i = -1L;
        this.f75010j = -1L;
        this.f75011k = -1;
        this.f75012l = null;
        this.f75014n = null;
        this.f75001a = str;
        this.f75013m = locale;
        e(TimeZone.getDefault());
    }
}
