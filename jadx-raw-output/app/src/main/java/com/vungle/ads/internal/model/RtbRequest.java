package com.vungle.ads.internal.model;

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

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes4.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B'\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/model/RtbRequest;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "sdkUserAgent", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSdkUserAgent", "()Ljava/lang/String;", "getSdkUserAgent$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RtbRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String sdkUserAgent;

    /* JADX INFO: compiled from: RtbToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/RtbRequest$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/RtbRequest;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<RtbRequest> serializer() {
            return RtbRequest$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RtbRequest() {
        this((String) null, 1, (i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ RtbRequest(int i10, String str, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, RtbRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public static /* synthetic */ RtbRequest copy$default(RtbRequest rtbRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtbRequest.sdkUserAgent;
        }
        return rtbRequest.copy(str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public final RtbRequest copy(String sdkUserAgent) {
        return new RtbRequest(sdkUserAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RtbRequest) && p.e(this.sdkUserAgent, ((RtbRequest) other).sdkUserAgent);
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    public RtbRequest(String str) {
        this.sdkUserAgent = str;
    }

    public static final void write$Self(RtbRequest rtbRequest, d dVar, a aVar) {
        p.j(rtbRequest, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        boolean z10 = true;
        if (!dVar.q(aVar, 0) && rtbRequest.sdkUserAgent == null) {
            z10 = false;
        }
        if (z10) {
            dVar.C(aVar, 0, d2.f5397a, rtbRequest.sdkUserAgent);
        }
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public /* synthetic */ RtbRequest(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
