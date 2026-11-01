package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f58229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f58230d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f58232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f58233c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f58234d = new HashMap();

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f58234d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f58231a, this.f58232b, this.f58233c, this.f58234d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f58233c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f58232b = str;
            return this;
        }

        public Builder(@NonNull String str) {
            this.f58231a = str;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i10) {
        this(str, str2, bArr, map);
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f58227a = str;
        this.f58228b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f58229c = bArr;
        this.f58230d = e.a(map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f58229c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f58230d;
    }

    @NonNull
    public String getMethod() {
        return this.f58228b;
    }

    @NonNull
    public String getUrl() {
        return this.f58227a;
    }

    public String toString() {
        return "Request{url=" + this.f58227a + ", method='" + this.f58228b + "', bodyLength=" + this.f58229c.length + ", headers=" + this.f58230d + '}';
    }
}
