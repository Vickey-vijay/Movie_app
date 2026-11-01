package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: CachedAssetsConfigurationKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CachedAssetsConfigurationKtKt {
    /* JADX INFO: renamed from: -initializecachedAssetsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration m3401initializecachedAssetsConfiguration(l<? super CachedAssetsConfigurationKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        CachedAssetsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, l<? super CachedAssetsConfigurationKt.Dsl, r> lVar) {
        p.j(cachedAssetsConfiguration, "<this>");
        p.j(lVar, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder = cachedAssetsConfiguration.toBuilder();
        p.i(builder, "this.toBuilder()");
        CachedAssetsConfigurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
