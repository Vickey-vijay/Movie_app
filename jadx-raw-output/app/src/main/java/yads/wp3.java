package yads;

import com.yandex.mobile.ads.common.AdError;

/* JADX INFO: loaded from: classes10.dex */
public final class wp3 implements AdError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84292a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp3) && ck.p.e(this.f84292a, ((wp3) obj).f84292a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f84292a;
    }

    public final int hashCode() {
        return this.f84292a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description=" + this.f84292a + ")";
    }

    public wp3(String str) {
        this.f84292a = str;
    }
}
