package io.bidmachine.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class Descriptor {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f59886id;
    public final String schemeIdUri;

    @Nullable
    public final String value;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Descriptor.class != obj.getClass()) {
            return false;
        }
        Descriptor descriptor = (Descriptor) obj;
        return Util.areEqual(this.schemeIdUri, descriptor.schemeIdUri) && Util.areEqual(this.value, descriptor.value) && Util.areEqual(this.f59886id, descriptor.f59886id);
    }

    public int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f59886id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public Descriptor(String str, @Nullable String str2, @Nullable String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.f59886id = str3;
    }
}
