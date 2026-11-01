package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: AudienceManagementResponseKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AudienceManagementResponseKtKt {
    /* JADX INFO: renamed from: -initializeaudienceManagementResponse, reason: not valid java name */
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse m3399initializeaudienceManagementResponse(l<? super AudienceManagementResponseKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builderNewBuilder = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, l<? super AudienceManagementResponseKt.Dsl, r> lVar) {
        p.j(audienceManagementResponse, "<this>");
        p.j(lVar, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder = audienceManagementResponse.toBuilder();
        p.i(builder, "this.toBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        p.j(audienceManagementResponseOrBuilder, "<this>");
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
