package com.vungle.ads.fpd;

import al.d;
import bl.f0;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import com.vungle.ads.internal.util.RangeUtil;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: SessionContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0007¢\u0006\u0004\b(\u0010'B'\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tH\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tH\u0007R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\n\u0010%\u0012\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "levelPercentile", "setLevelPercentile", "", "page", "setPage", "", "timeSpent", "setTimeSpent", "signupDate", "setSignupDate", "userScorePercentile", "setUserScorePercentile", "userID", "setUserID", "", "friends", "setFriends", "userLevelPercentile", "setUserLevelPercentile", "healthPercentile", "setHealthPercentile", "sessionStartTime", "setSessionStartTime", "sessionDuration", "setSessionDuration", "inGamePurchasesUSD", "setInGamePurchasesUSD", "Ljava/lang/Float;", "getLevelPercentile$annotations", "()V", "<init>", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Float;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SessionContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float levelPercentile;

    /* JADX INFO: compiled from: SessionContext.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/fpd/SessionContext;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }
    }

    public SessionContext() {
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    public final SessionContext setFriends(List<String> friends) {
        return this;
    }

    public final SessionContext setHealthPercentile(float healthPercentile) {
        return this;
    }

    public final SessionContext setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    public final SessionContext setPage(String page) {
        p.j(page, "page");
        return this;
    }

    public final SessionContext setSessionDuration(int sessionDuration) {
        return this;
    }

    public final SessionContext setSessionStartTime(int sessionStartTime) {
        return this;
    }

    public final SessionContext setSignupDate(int signupDate) {
        return this;
    }

    public final SessionContext setTimeSpent(int timeSpent) {
        return this;
    }

    public final SessionContext setUserID(String userID) {
        p.j(userID, "userID");
        return this;
    }

    public final SessionContext setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    public final SessionContext setUserScorePercentile(float userScorePercentile) {
        return this;
    }

    public /* synthetic */ SessionContext(int i10, Float f10, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, SessionContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
    }

    public static final void write$Self(SessionContext sessionContext, d dVar, a aVar) {
        p.j(sessionContext, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        boolean z10 = true;
        if (!dVar.q(aVar, 0) && sessionContext.levelPercentile == null) {
            z10 = false;
        }
        if (z10) {
            dVar.C(aVar, 0, f0.f5402a, sessionContext.levelPercentile);
        }
    }

    public final SessionContext setLevelPercentile(float levelPercentile) {
        if (RangeUtil.INSTANCE.isInRange(levelPercentile, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(levelPercentile);
        }
        return this;
    }
}
