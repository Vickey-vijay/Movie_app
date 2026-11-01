package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lio/bidmachine/rendering/model/Base64ResourceSource;", "Lio/bidmachine/rendering/model/ResourceSource;", "", "a", "Ljava/lang/String;", "getBase64", "()Ljava/lang/String;", "base64", "<init>", "(Ljava/lang/String;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Base64ResourceSource implements ResourceSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String base64;

    public Base64ResourceSource(String str) {
        p.j(str, "base64");
        this.base64 = str;
    }

    public final String getBase64() {
        return this.base64;
    }
}
