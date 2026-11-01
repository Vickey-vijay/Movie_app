package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Ye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f56246c = "Ye";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f56247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56248b;

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, float f10) {
        synchronized (this) {
            this.f56247a.a(str, f10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, String str2) {
        synchronized (this) {
            this.f56247a.a(str, str2);
        }
        return this;
    }

    public final Ze c(String str) {
        return new Ze(str, this.f56248b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T d(String str) {
        synchronized (this) {
            this.f56247a.remove(str);
        }
        return this;
    }

    public Ye(Ia ia2, String str) {
        this.f56247a = ia2;
        this.f56248b = str;
    }

    @NonNull
    public Set<String> c() {
        return this.f56247a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f56247a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, long j10) {
        synchronized (this) {
            this.f56247a.a(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends Ye> T b(String str, int i10) {
        synchronized (this) {
            this.f56247a.a(i10, str);
        }
        return this;
    }

    public final <T extends Ye> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j10) {
        return this.f56247a.getLong(str, j10);
    }

    public final int a(@NonNull String str, int i10) {
        return this.f56247a.getInt(str, i10);
    }

    @Nullable
    public final String a(@NonNull String str, @Nullable String str2) {
        return this.f56247a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, boolean z10) {
        synchronized (this) {
            this.f56247a.a(str, z10);
        }
        return this;
    }

    public final boolean a(String str, boolean z10) {
        return this.f56247a.getBoolean(str, z10);
    }

    public final void b() {
        synchronized (this) {
            this.f56247a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f56247a.a(str);
    }
}
