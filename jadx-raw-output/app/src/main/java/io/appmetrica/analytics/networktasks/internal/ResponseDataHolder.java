package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f58297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f58298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f58299d;

    public int getResponseCode() {
        return this.f58296a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f58297b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f58298c;
    }

    public boolean isValidResponse() {
        return this.f58299d.isResponseValid(this.f58296a);
    }

    public void setResponseCode(int i10) {
        this.f58296a = i10;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f58297b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f58298c = map;
    }

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f58299d = responseValidityChecker;
    }
}
