package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f54401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54402c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f54400a, startupParamsItem.f54400a) && this.f54401b == startupParamsItem.f54401b && Objects.equals(this.f54402c, startupParamsItem.f54402c);
    }

    public int hashCode() {
        return Objects.hash(this.f54400a, this.f54401b, this.f54402c);
    }

    @Nullable
    public String getErrorDetails() {
        return this.f54402c;
    }

    @Nullable
    public String getId() {
        return this.f54400a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f54401b;
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f54400a + "', status=" + this.f54401b + ", errorDetails='" + this.f54402c + "'}";
    }

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f54400a = str;
        this.f54401b = startupParamsItemStatus;
        this.f54402c = str2;
    }
}
