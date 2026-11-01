package yads;

import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes3.dex */
public final class lr3 implements ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f79893a;

    public final boolean equals(Object obj) {
        return (obj instanceof lr3) && ck.p.e(((lr3) obj).f79893a, this.f79893a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f79893a.f78915b;
    }

    public final int hashCode() {
        return this.f79893a.f78915b.hashCode();
    }

    public lr3(j5 j5Var) {
        this.f79893a = j5Var;
    }
}
