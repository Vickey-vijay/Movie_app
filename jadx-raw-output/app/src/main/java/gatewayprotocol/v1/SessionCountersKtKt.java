package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: SessionCountersKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SessionCountersKtKt {
    /* JADX INFO: renamed from: -initializesessionCounters, reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m3440initializesessionCounters(l<? super SessionCountersKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builderNewBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, l<? super SessionCountersKt.Dsl, r> lVar) {
        p.j(sessionCounters, "<this>");
        p.j(lVar, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builder = sessionCounters.toBuilder();
        p.i(builder, "this.toBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
