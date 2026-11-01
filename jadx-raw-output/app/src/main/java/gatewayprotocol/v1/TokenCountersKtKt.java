package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: TokenCountersKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class TokenCountersKtKt {
    /* JADX INFO: renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m3446initializetokenCounters(l<? super TokenCountersKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, l<? super TokenCountersKt.Dsl, r> lVar) {
        p.j(tokenCounters, "<this>");
        p.j(lVar, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        p.i(builder, "this.toBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
