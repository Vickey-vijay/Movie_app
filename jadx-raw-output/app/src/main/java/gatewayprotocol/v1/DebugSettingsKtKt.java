package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: DebugSettingsKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DebugSettingsKtKt {
    /* JADX INFO: renamed from: -initializedebugSettings, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DebugSettings m3405initializedebugSettings(l<? super DebugSettingsKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder builderNewBuilder = NativeConfigurationOuterClass.DebugSettings.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.DebugSettings copy(NativeConfigurationOuterClass.DebugSettings debugSettings, l<? super DebugSettingsKt.Dsl, r> lVar) {
        p.j(debugSettings, "<this>");
        p.j(lVar, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder builder = debugSettings.toBuilder();
        p.i(builder, "this.toBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
