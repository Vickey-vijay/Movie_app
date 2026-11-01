package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: NetworkAssetParams.java */
/* JADX INFO: loaded from: classes2.dex */
public class n4 {

    @NonNull
    private final String adapterVersion;

    @NonNull
    private final String classpath;

    @NonNull
    private final String name;

    @NonNull
    private final String sdkVersion;

    @NonNull
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NonNull
    public String getClasspath() {
        return this.classpath;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public n4(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.name = str;
        this.adapterVersion = str2;
        this.classpath = str3;
        this.sdkVersion = str4;
    }
}
