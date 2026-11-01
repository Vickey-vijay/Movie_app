package com.vungle.ads.internal.signals;

import al.d;
import bl.d2;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: SignaledAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\bE\u0010FBQ\b\u0017\u0012\u0006\u0010G\u001a\u00020\u0016\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010*\u001a\u00020\u0002\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u00101\u001a\u00020\u0002\u0012\b\b\u0001\u00106\u001a\u00020\u0016\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bE\u0010JJ!\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHÇ\u0001J\u0006\u0010\u000e\u001a\u00020\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R*\u0010#\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\u001e\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001f\u0012\u0004\b,\u0010\u001e\u001a\u0004\b+\u0010!R*\u0010-\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010$\u0012\u0004\b0\u0010\u001e\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R(\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u0010\u001f\u0012\u0004\b5\u0010\u001e\u001a\u0004\b2\u0010!\"\u0004\b3\u00104R(\u00106\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u001e\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010\u001f\u0012\u0004\b@\u0010\u001e\u001a\u0004\b>\u0010!\"\u0004\b?\u00104R(\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bA\u0010\u001f\u0012\u0004\bD\u0010\u001e\u001a\u0004\bB\u0010!\"\u0004\bC\u00104¨\u0006M"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd;", "", "", "lastAdLoadTime", "loadAdTime", "getTimeDifference", "(Ljava/lang/Long;J)J", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "calculateTimeBetweenAdAvailabilityAndPlayAd", "component1", "()Ljava/lang/Long;", "component2", "copy", "(Ljava/lang/Long;J)Lcom/vungle/ads/internal/signals/SignaledAd;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getLastAdLoadTime", "getLastAdLoadTime$annotations", "()V", "J", "getLoadAdTime", "()J", "getLoadAdTime$annotations", "templateSignals", "Ljava/lang/String;", "getTemplateSignals", "()Ljava/lang/String;", "setTemplateSignals", "(Ljava/lang/String;)V", "getTemplateSignals$annotations", "timeSinceLastAdLoad", "getTimeSinceLastAdLoad", "getTimeSinceLastAdLoad$annotations", "eventId", "getEventId", "setEventId", "getEventId$annotations", "timeBetweenAdAvailabilityAndPlayAd", "getTimeBetweenAdAvailabilityAndPlayAd", "setTimeBetweenAdAvailabilityAndPlayAd", "(J)V", "getTimeBetweenAdAvailabilityAndPlayAd$annotations", "screenOrientation", "I", "getScreenOrientation", "()I", "setScreenOrientation", "(I)V", "getScreenOrientation$annotations", "adAvailabilityCallbackTime", "getAdAvailabilityCallbackTime", "setAdAvailabilityCallbackTime", "getAdAvailabilityCallbackTime$annotations", "playAdTime", "getPlayAdTime", "setPlayAdTime", "getPlayAdTime$annotations", "<init>", "(Ljava/lang/Long;J)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;JILbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SignaledAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    /* JADX INFO: compiled from: SignaledAd.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<SignaledAd> serializer() {
            return SignaledAd$$serializer.INSTANCE;
        }
    }

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public /* synthetic */ SignaledAd(int i10, String str, long j10, String str2, long j11, int i11, y1 y1Var) {
        if (2 != (i10 & 2)) {
            o1.a(i10, 2, SignaledAd$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public static /* synthetic */ SignaledAd copy$default(SignaledAd signaledAd, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = signaledAd.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l10, j10);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final SignaledAd copy(Long lastAdLoadTime, long loadAdTime) {
        return new SignaledAd(lastAdLoadTime, loadAdTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignaledAd)) {
            return false;
        }
        SignaledAd signaledAd = (SignaledAd) other;
        return p.e(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public int hashCode() {
        Long l10 = this.lastAdLoadTime;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + Long.hashCode(this.loadAdTime);
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    private final long getTimeDifference(Long lastAdLoadTime, long loadAdTime) {
        if (lastAdLoadTime == null) {
            return -1L;
        }
        long jLongValue = loadAdTime - lastAdLoadTime.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(SignaledAd signaledAd, d dVar, a aVar) {
        p.j(signaledAd, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || signaledAd.templateSignals != null) {
            dVar.C(aVar, 0, d2.f5397a, signaledAd.templateSignals);
        }
        dVar.u(aVar, 1, signaledAd.timeSinceLastAdLoad);
        if (dVar.q(aVar, 2) || signaledAd.eventId != null) {
            dVar.C(aVar, 2, d2.f5397a, signaledAd.eventId);
        }
        if (dVar.q(aVar, 3) || signaledAd.timeBetweenAdAvailabilityAndPlayAd != 0) {
            dVar.u(aVar, 3, signaledAd.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (dVar.q(aVar, 4) || signaledAd.screenOrientation != 0) {
            dVar.n(aVar, 4, signaledAd.screenOrientation);
        }
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    public SignaledAd(Long l10, long j10) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j10);
    }

    public /* synthetic */ SignaledAd(Long l10, long j10, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j10);
    }
}
