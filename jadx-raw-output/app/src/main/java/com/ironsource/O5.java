package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class O5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27242e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3663q7 f27243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I5 f27244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J7 f27245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f27246d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27247a;

        public a(String str) {
            this.f27247a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Gd gd2 = new Gd();
                ArrayList<Pair<String, String>> arrayListD = O5.this.f27244b.d();
                if ("POST".equals(O5.this.f27244b.e())) {
                    gd2 = C3484g8.b(O5.this.f27244b.b(), this.f27247a, arrayListD);
                } else if ("GET".equals(O5.this.f27244b.e())) {
                    gd2 = C3484g8.a(O5.this.f27244b.b(), this.f27247a, arrayListD);
                }
                O5.this.a("response status code: " + gd2.f26675a);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
            }
        }
    }

    private void b(String str) {
        this.f27246d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f27244b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.f.C, str);
            a(map2, this.f27243a.a());
            a(map2, map);
            b(this.f27245c.a(map2));
        }
    }

    public O5(I5 i10, InterfaceC3663q7 interfaceC3663q7) {
        if (i10 != null) {
            if (i10.c() != null) {
                this.f27244b = i10;
                this.f27243a = interfaceC3663q7;
                this.f27245c = i10.c();
                this.f27246d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f27244b.f()) {
            Log.d(f27242e, str);
        }
    }
}
