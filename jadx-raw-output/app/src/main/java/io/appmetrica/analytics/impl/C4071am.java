package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4071am extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f56381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f56382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f56383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<String> f56385e;

    public C4071am(@NonNull I3 i10) {
        this(i10.a().c(), i10.a().d(), i10.a().a(), i10.a().h(), i10.a().b());
    }

    public final boolean a(@NonNull C4071am c4071am) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4071am mergeFrom(@NonNull C4071am c4071am) {
        return new C4071am((String) WrapUtils.getOrDefaultNullable(this.f56381a, c4071am.f56381a), (String) WrapUtils.getOrDefaultNullable(this.f56382b, c4071am.f56382b), (Map) WrapUtils.getOrDefaultNullable(this.f56383c, c4071am.f56383c), this.f56384d || c4071am.f56384d, c4071am.f56384d ? c4071am.f56385e : this.f56385e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f56381a + "', installReferrerSource='" + this.f56382b + "', clientClids=" + this.f56383c + ", hasNewCustomHosts=" + this.f56384d + ", newCustomHosts=" + this.f56385e + '}';
    }

    public C4071am(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z10, @Nullable List<String> list) {
        this.f56381a = str;
        this.f56382b = str2;
        this.f56383c = map;
        this.f56384d = z10;
        this.f56385e = list;
    }

    public C4071am() {
        this(null, null, null, false, null);
    }
}
