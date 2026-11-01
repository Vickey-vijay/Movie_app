package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: FeatureFlagsKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FeatureFlagsKtKt {
    /* JADX INFO: renamed from: -initializefeatureFlags, reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m3416initializefeatureFlags(l<? super FeatureFlagsKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, l<? super FeatureFlagsKt.Dsl, r> lVar) {
        p.j(featureFlags, "<this>");
        p.j(lVar, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builder = featureFlags.toBuilder();
        p.i(builder, "this.toBuilder()");
        FeatureFlagsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
