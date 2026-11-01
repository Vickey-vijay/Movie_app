package com.vungle.ads.internal.signals;

import al.d;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes7.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\bO\u00105B¥\u0001\b\u0017\u0012\u0006\u0010P\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d\u0012\u0010\b\u0001\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\b\u0001\u0010.\u001a\u00020\u001d\u0012\b\b\u0001\u00102\u001a\u00020\t\u0012\u0010\b\u0001\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\b\u0001\u0010=\u001a\u00020\t\u0012\b\b\u0001\u0010@\u001a\u00020\t\u0012\b\b\u0001\u0010C\u001a\u00020\t\u0012\b\b\u0001\u0010G\u001a\u00020\t\u0012\b\b\u0001\u0010K\u001a\u00020\t\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bO\u0010SJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010\u0017\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010\u0017\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010.\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010\u001f\u0012\u0004\b1\u0010\u0017\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R(\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u0010\u0013\u0012\u0004\b6\u0010\u0017\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u00105R.\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u0010(\u0012\u0004\b<\u0010\u0017\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R(\u0010=\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010\u0013\u0012\u0004\b?\u0010\u0017\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u00105R(\u0010@\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u0010\u0013\u0012\u0004\bB\u0010\u0017\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u00105R(\u0010C\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010\u0013\u0012\u0004\bF\u0010\u0017\u001a\u0004\bD\u0010\u0015\"\u0004\bE\u00105R(\u0010G\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010\u0013\u0012\u0004\bJ\u0010\u0017\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u00105R(\u0010K\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bK\u0010\u0013\u0012\u0004\bN\u0010\u0017\u001a\u0004\bL\u0010\u0015\"\u0004\bM\u00105¨\u0006V"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "sessionCount", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getSessionCount", "()I", "getSessionCount$annotations", "()V", JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "getSessionId$annotations", "", "sessionCreationTime", "J", "getSessionCreationTime", "()J", "setSessionCreationTime", "(J)V", "getSessionCreationTime$annotations", "", "Lcom/vungle/ads/internal/signals/SignaledAd;", "signaledAd", "Ljava/util/List;", "getSignaledAd", "()Ljava/util/List;", "setSignaledAd", "(Ljava/util/List;)V", "getSignaledAd$annotations", "sessionDuration", "getSessionDuration", "setSessionDuration", "getSessionDuration$annotations", "sessionDepthCounter", "getSessionDepthCounter", "setSessionDepthCounter", "(I)V", "getSessionDepthCounter$annotations", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "unclosedAd", "getUnclosedAd", "setUnclosedAd", "getUnclosedAd$annotations", "isDevice", "setDevice", "isDevice$annotations", "isVPNConnected", "setVPNConnected", "isVPNConnected$annotations", "overlayGranted", "getOverlayGranted", "setOverlayGranted", "getOverlayGranted$annotations", "sensorCount", "getSensorCount", "setSensorCount", "getSensorCount$annotations", "httpProxyEnabled", "getHttpProxyEnabled", "setHttpProxyEnabled", "getHttpProxyEnabled$annotations", "<init>", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(IILjava/lang/String;JLjava/util/List;JILjava/util/List;IIIIILbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    /* JADX INFO: compiled from: SessionData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/signals/SessionData;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<SessionData> serializer() {
            return SessionData$$serializer.INSTANCE;
        }
    }

    public SessionData(int i10) {
        this.sessionCount = i10;
        String string = UUID.randomUUID().toString();
        p.i(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sessionData.sessionCount;
        }
        return sessionData.copy(i10);
    }

    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    public static /* synthetic */ void getSensorCount$annotations() {
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    public static /* synthetic */ void isDevice$annotations() {
    }

    public static /* synthetic */ void isVPNConnected$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final SessionData copy(int sessionCount) {
        return new SessionData(sessionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionData) && this.sessionCount == ((SessionData) other).sessionCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    public static final void write$Self(SessionData sessionData, d dVar, a aVar) {
        boolean z10;
        p.j(sessionData, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        dVar.n(aVar, 0, sessionData.sessionCount);
        if (dVar.q(aVar, 1)) {
            z10 = true;
        } else {
            String str = sessionData.sessionId;
            String string = UUID.randomUUID().toString();
            p.i(string, "randomUUID().toString()");
            if (p.e(str, string)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            dVar.p(aVar, 1, sessionData.sessionId);
        }
        if (dVar.q(aVar, 2) || sessionData.sessionCreationTime != System.currentTimeMillis() / 1000) {
            dVar.u(aVar, 2, sessionData.sessionCreationTime);
        }
        if (dVar.q(aVar, 3) || !p.e(sessionData.signaledAd, new ArrayList())) {
            dVar.m(aVar, 3, new bl.f(SignaledAd$$serializer.INSTANCE), sessionData.signaledAd);
        }
        if (dVar.q(aVar, 4) || sessionData.sessionDuration != 0) {
            dVar.u(aVar, 4, sessionData.sessionDuration);
        }
        if (dVar.q(aVar, 5) || sessionData.sessionDepthCounter != 0) {
            dVar.n(aVar, 5, sessionData.sessionDepthCounter);
        }
        if (dVar.q(aVar, 6) || !p.e(sessionData.unclosedAd, new ArrayList())) {
            dVar.m(aVar, 6, new bl.f(UnclosedAd$$serializer.INSTANCE), sessionData.unclosedAd);
        }
        if (dVar.q(aVar, 7) || sessionData.isDevice != 0) {
            dVar.n(aVar, 7, sessionData.isDevice);
        }
        if (dVar.q(aVar, 8) || sessionData.isVPNConnected != 0) {
            dVar.n(aVar, 8, sessionData.isVPNConnected);
        }
        if (dVar.q(aVar, 9) || sessionData.overlayGranted != 0) {
            dVar.n(aVar, 9, sessionData.overlayGranted);
        }
        if (dVar.q(aVar, 10) || sessionData.sensorCount != 0) {
            dVar.n(aVar, 10, sessionData.sensorCount);
        }
        if (dVar.q(aVar, 11) || sessionData.httpProxyEnabled != 0) {
            dVar.n(aVar, 11, sessionData.httpProxyEnabled);
        }
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    /* JADX INFO: renamed from: isDevice, reason: from getter */
    public final int getIsDevice() {
        return this.isDevice;
    }

    /* JADX INFO: renamed from: isVPNConnected, reason: from getter */
    public final int getIsVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        p.j(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        p.j(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    public /* synthetic */ SessionData(int i10, int i11, String str, long j10, List list, long j11, int i12, List list2, int i13, int i14, int i15, int i16, int i17, y1 y1Var) {
        String string;
        if (1 != (i10 & 1)) {
            o1.a(i10, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            string = UUID.randomUUID().toString();
            p.i(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.sessionId = string;
        this.sessionCreationTime = (i10 & 4) == 0 ? System.currentTimeMillis() / 1000 : j10;
        this.signaledAd = (i10 & 8) == 0 ? new ArrayList() : list;
        this.sessionDuration = (i10 & 16) == 0 ? 0L : j11;
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        this.unclosedAd = (i10 & 64) == 0 ? new ArrayList() : list2;
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }
}
