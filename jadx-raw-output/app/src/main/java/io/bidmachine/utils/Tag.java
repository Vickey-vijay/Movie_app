package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class Tag {

    @NonNull
    private final String name;

    @Nullable
    private String tag;

    @NonNull
    public String toString() {
        if (this.tag == null) {
            this.tag = this.name + " @" + Integer.toHexString(hashCode());
        }
        return this.tag;
    }

    public Tag(@NonNull String str) {
        this.name = str;
    }
}
