package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Tag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60940b;

    public Tag(@NonNull String str) {
        this.f60939a = str;
    }

    @NonNull
    public String toString() {
        if (this.f60940b == null) {
            this.f60940b = this.f60939a + " @" + Integer.toHexString(hashCode());
        }
        return this.f60940b;
    }
}
