package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RequestUrlOverrideKtKt {
    /* JADX INFO: renamed from: -initializerequestUrlOverride, reason: not valid java name */
    public static final InitializationResponseOuterClass.RequestUrlOverride m3439initializerequestUrlOverride(l<? super RequestUrlOverrideKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builderNewBuilder = InitializationResponseOuterClass.RequestUrlOverride.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        RequestUrlOverrideKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.RequestUrlOverride copy(InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride, l<? super RequestUrlOverrideKt.Dsl, r> lVar) {
        p.j(requestUrlOverride, "<this>");
        p.j(lVar, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builder = requestUrlOverride.toBuilder();
        p.i(builder, "this.toBuilder()");
        RequestUrlOverrideKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
