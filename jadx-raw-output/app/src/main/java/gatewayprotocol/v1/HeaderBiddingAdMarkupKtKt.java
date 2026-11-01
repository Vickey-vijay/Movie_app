package gatewayprotocol.v1;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HeaderBiddingAdMarkupKtKt {
    /* JADX INFO: renamed from: -initializeheaderBiddingAdMarkup, reason: not valid java name */
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup m3418initializeheaderBiddingAdMarkup(l<? super HeaderBiddingAdMarkupKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builderNewBuilder = HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, l<? super HeaderBiddingAdMarkupKt.Dsl, r> lVar) {
        p.j(headerBiddingAdMarkup, "<this>");
        p.j(lVar, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder = headerBiddingAdMarkup.toBuilder();
        p.i(builder, "this.toBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
