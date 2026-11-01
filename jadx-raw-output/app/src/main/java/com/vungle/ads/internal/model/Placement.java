package com.vungle.ads.internal.model;

import al.d;
import bl.d2;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.internal.Constants;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B%\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b3\u00104B=\b\u0017\u0012\u0006\u00105\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0019\u001a\u00020\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b3\u00108J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0014HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R*\u0010,\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u0010%\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/vungle/ads/internal/model/Placement;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "isNative", "isInline", C3426d4.f28405w, "isMREC", "isInterstitial", "isAppOpen", "isRewardedVideo", "", "sleepTime", "snooze", "", "component1", "component2", "component3", "referenceId", "headerBidding", "type", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getReferenceId", "()Ljava/lang/String;", "getReferenceId$annotations", "()V", "Z", "getHeaderBidding", "()Z", "getHeaderBidding$annotations", "getType", "getType$annotations", "wakeupTime", "Ljava/lang/Long;", "getWakeupTime", "()Ljava/lang/Long;", "setWakeupTime", "(Ljava/lang/Long;)V", "getWakeupTime$annotations", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Placement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/Placement$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/Placement;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Placement(int i10, String str, boolean z10, String str2, y1 y1Var) {
        if (1 != (i10 & 1)) {
            o1.a(i10, 1, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i10 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i10 & 2) != 0) {
            z10 = placement.headerBidding;
        }
        if ((i10 & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z10, str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Placement copy(String referenceId, boolean headerBidding, String type) {
        p.j(referenceId, "referenceId");
        return new Placement(referenceId, headerBidding, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return p.e(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && p.e(this.type, placement.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.type;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public Placement(String str, boolean z10, String str2) {
        p.j(str, "referenceId");
        this.referenceId = str;
        this.headerBidding = z10;
        this.type = str2;
    }

    public static final void write$Self(Placement placement, d dVar, a aVar) {
        p.j(placement, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        dVar.p(aVar, 0, placement.referenceId);
        if (dVar.q(aVar, 1) || placement.headerBidding) {
            dVar.o(aVar, 1, placement.headerBidding);
        }
        if (dVar.q(aVar, 2) || placement.type != null) {
            dVar.C(aVar, 2, d2.f5397a, placement.type);
        }
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    public final boolean isAppOpen() {
        return p.e(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return p.e(this.type, "banner");
    }

    public final boolean isInline() {
        return p.e(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return p.e(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return p.e(this.type, "mrec");
    }

    public final boolean isNative() {
        return p.e(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return p.e(this.type, "rewarded");
    }

    public final void setWakeupTime(Long l10) {
        this.wakeupTime = l10;
    }

    public final void snooze(long j10) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j10 * ((long) 1000)));
    }

    public /* synthetic */ Placement(String str, boolean z10, String str2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2);
    }
}
