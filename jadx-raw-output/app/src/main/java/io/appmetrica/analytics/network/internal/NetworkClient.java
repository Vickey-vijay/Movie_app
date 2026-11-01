package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f58215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f58216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f58217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f58218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f58219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f58220f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f58221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f58222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f58223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f58224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f58225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f58226f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f58221a, this.f58222b, this.f58223c, this.f58224d, this.f58225e, this.f58226f, 0);
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f58223c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withConnectTimeout(int i10) {
            this.f58221a = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z10) {
            this.f58225e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i10) {
            this.f58226f = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i10) {
            this.f58222b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z10) {
            this.f58224d = Boolean.valueOf(z10);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i10) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f58215a = num;
        this.f58216b = num2;
        this.f58217c = sSLSocketFactory;
        this.f58218d = bool;
        this.f58219e = bool2;
        this.f58220f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f58215a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f58219e;
    }

    public int getMaxResponseSize() {
        return this.f58220f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f58216b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f58217c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f58218d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f58215a + ", readTimeout=" + this.f58216b + ", sslSocketFactory=" + this.f58217c + ", useCaches=" + this.f58218d + ", instanceFollowRedirects=" + this.f58219e + ", maxResponseSize=" + this.f58220f + '}';
    }
}
