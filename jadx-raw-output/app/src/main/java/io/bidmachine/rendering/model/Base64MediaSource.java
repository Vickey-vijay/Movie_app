package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/bidmachine/rendering/model/Base64MediaSource;", "Lio/bidmachine/rendering/model/MediaSource;", "", "component1", "base64", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getBase64", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Base64MediaSource extends MediaSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String base64;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Base64MediaSource(String str) {
        super(MediaSource.DeliveryType.PRELOAD, null);
        p.j(str, "base64");
        this.base64 = str;
    }

    public static /* synthetic */ Base64MediaSource copy$default(Base64MediaSource base64MediaSource, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = base64MediaSource.base64;
        }
        return base64MediaSource.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    public final Base64MediaSource copy(String base64) {
        p.j(base64, "base64");
        return new Base64MediaSource(base64);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Base64MediaSource) && p.e(this.base64, ((Base64MediaSource) other).base64);
    }

    public final String getBase64() {
        return this.base64;
    }

    public int hashCode() {
        return this.base64.hashCode();
    }

    public String toString() {
        return "Base64MediaSource(base64=" + this.base64 + ')';
    }
}
