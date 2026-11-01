package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: AudienceManagementRequestKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AudienceManagementRequestKtKt {
    /* JADX INFO: renamed from: -initializeaudienceManagementRequest, reason: not valid java name */
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest m3398initializeaudienceManagementRequest(l<? super AudienceManagementRequestKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builderNewBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, l<? super AudienceManagementRequestKt.Dsl, r> lVar) {
        p.j(audienceManagementRequest, "<this>");
        p.j(lVar, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder = audienceManagementRequest.toBuilder();
        p.i(builder, "this.toBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        p.j(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        p.j(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        p.j(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
