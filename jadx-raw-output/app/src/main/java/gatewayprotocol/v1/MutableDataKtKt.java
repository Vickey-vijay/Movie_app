package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: MutableDataKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MutableDataKtKt {
    /* JADX INFO: renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m3427initializemutableData(l<? super MutableDataKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builderNewBuilder = MutableDataOuterClass.MutableData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, l<? super MutableDataKt.Dsl, r> lVar) {
        p.j(mutableData, "<this>");
        p.j(lVar, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        p.i(builder, "this.toBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        p.j(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        p.j(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
