package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public Response(@NonNull T t10) {
        this.zza = t10;
    }

    @NonNull
    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t10) {
        this.zza = t10;
    }
}
