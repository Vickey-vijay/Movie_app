package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4085ba f55256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55257b;

    public G1() {
        this(new C4085ba());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f55256a.getClass();
            strA = Ka.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f55257b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f55257b = true;
    }

    public G1(C4085ba c4085ba) {
        this.f55257b = false;
        this.f55256a = c4085ba;
    }
}
