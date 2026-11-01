package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseImportantLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58154a;

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        c cVar = this.f58154a;
        cVar.f58161b.getClass();
        for (String str3 : cVar.f58162c.a(a.a(str, str2, objArr))) {
            String str4 = cVar.f58160a.f58163a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }

    public BaseImportantLogger(@NonNull String str) {
        this.f58154a = new c(new d(str), new a(), new b());
    }
}
