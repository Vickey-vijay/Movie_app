package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: DiagnosticEventsConfigurationKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DiagnosticEventsConfigurationKtKt {
    /* JADX INFO: renamed from: -initializediagnosticEventsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration m3410initializediagnosticEventsConfiguration(l<? super DiagnosticEventsConfigurationKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration copy(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration, l<? super DiagnosticEventsConfigurationKt.Dsl, r> lVar) {
        p.j(diagnosticEventsConfiguration, "<this>");
        p.j(lVar, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder = diagnosticEventsConfiguration.toBuilder();
        p.i(builder, "this.toBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
