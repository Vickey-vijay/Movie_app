package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f58155d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f58157b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f58158c;

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f58157b) {
            c cVar = this.f58158c;
            String prefix = getPrefix();
            cVar.f58161b.getClass();
            for (String str2 : cVar.f58162c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f58160a.f58163a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public static void init(@NonNull Context context) {
        f58155d = C3426d4.j.f28586d + context.getPackageName() + "] : ";
    }

    @NonNull
    public String getPrefix() {
        return f58155d + this.f58156a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f58157b) {
            c cVar = this.f58158c;
            String prefix = getPrefix();
            cVar.f58161b.getClass();
            for (String str2 : cVar.f58162c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f58160a.f58163a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f58157b = z10;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f58157b) {
            c cVar = this.f58158c;
            String prefix = getPrefix();
            cVar.f58161b.getClass();
            for (String str2 : cVar.f58162c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f58160a.f58163a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f58158c = new c(new d(str), new a(), new b());
        this.f58156a = str2;
    }

    public void error(@Nullable Throwable th2, @Nullable String str, @Nullable Object... objArr) {
        if (this.f58157b) {
            c cVar = this.f58158c;
            String prefix = getPrefix();
            cVar.f58161b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f58162c.a(a.a(prefix, sb2.toString(), objArr))) {
                String str3 = cVar.f58160a.f58163a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
