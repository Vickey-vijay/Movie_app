package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LimitedSessionTokenKtKt {
    /* JADX INFO: renamed from: -initializelimitedSessionToken, reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m3425initializelimitedSessionToken(l<? super LimitedSessionTokenKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, l<? super LimitedSessionTokenKt.Dsl, r> lVar) {
        p.j(limitedSessionToken, "<this>");
        p.j(lVar, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builder = limitedSessionToken.toBuilder();
        p.i(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
