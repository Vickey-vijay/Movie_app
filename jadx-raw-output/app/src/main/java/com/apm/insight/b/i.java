package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LooperPrinterUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6341a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f6342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f6343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f6344d;

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public interface a {
    }

    public static void a() {
        if (f6343c) {
            return;
        }
        f6343c = true;
        f6342b = new b();
        Printer printerD = d();
        f6344d = printerD;
        if (printerD != null) {
            f6342b.f6345a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f6342b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Printer> f6345a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f6348d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Printer> f6346b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6349e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6347c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f6347c) {
                for (Printer printer : this.f6346b) {
                    if (!this.f6345a.contains(printer)) {
                        this.f6345a.add(printer);
                    }
                }
                this.f6346b.clear();
                this.f6347c = false;
            }
            if (this.f6345a.size() > i.f6341a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f6345a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f6342b.f6346b.contains(printer)) {
            return;
        }
        f6342b.f6346b.add(printer);
        f6342b.f6347c = true;
    }
}
