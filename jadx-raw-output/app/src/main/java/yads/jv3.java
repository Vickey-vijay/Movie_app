package yads;

import com.yandex.mobile.ads.common.VideoEventListener;

/* JADX INFO: loaded from: classes9.dex */
public final class jv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEventListener f79214a;

    public final boolean equals(Object obj) {
        return (obj instanceof jv3) && ck.p.e(((jv3) obj).f79214a, this.f79214a);
    }

    public final int hashCode() {
        return this.f79214a.hashCode();
    }

    public jv3(VideoEventListener videoEventListener) {
        this.f79214a = videoEventListener;
    }
}
