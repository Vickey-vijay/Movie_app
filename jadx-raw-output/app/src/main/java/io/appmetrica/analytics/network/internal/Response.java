package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f58237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f58238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f58239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f58240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f58241g;

    public Response(@Nullable Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2) {
        this(z10, i10, bArr, bArr2, map, th2, null);
    }

    public int getCode() {
        return this.f58236b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f58238d;
    }

    @Nullable
    public Throwable getException() {
        return this.f58240f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f58239e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f58237c;
    }

    @Nullable
    public String getUrl() {
        return this.f58241g;
    }

    public boolean isCompleted() {
        return this.f58235a;
    }

    public String toString() {
        return "Response{completed=" + this.f58235a + ", code=" + this.f58236b + ", responseDataLength=" + this.f58237c.length + ", errorDataLength=" + this.f58238d.length + ", headers=" + this.f58239e + ", exception=" + this.f58240f + ", url=" + this.f58241g + '}';
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2, @Nullable String str) {
        Map mapA;
        this.f58235a = z10;
        this.f58236b = i10;
        this.f58237c = bArr;
        this.f58238d = bArr2;
        if (map == null) {
            mapA = Collections.emptyMap();
        } else {
            mapA = e.a(map);
        }
        this.f58239e = mapA;
        this.f58240f = th2;
        this.f58241g = str;
    }
}
