package com.unity3d.ads.core.data.model.exception;

import ck.i;
import ck.p;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: InitializationException.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* JADX INFO: compiled from: InitializationException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final InitializationException parseFrom(Exception exc) {
            String str;
            p.j(exc, "e");
            if (exc instanceof TimeoutCancellationException ? true : exc instanceof NetworkTimeoutException) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, exc, "timeout", exc.getMessage());
            }
            if (exc instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) exc;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            if (!(exc instanceof UnityAdsNetworkException)) {
                return exc instanceof InitializationException ? (InitializationException) exc : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, exc, "unknown", exc.getMessage());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) exc;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, exc, str, unityAdsNetworkException.getMessage());
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th2, String str2, String str3, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th2, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th2, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String str, Throwable th2, String str2, String str3) {
        p.j(str, "message");
        p.j(str2, "reason");
        return new InitializationException(str, th2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return p.e(getMessage(), initializationException.getMessage()) && p.e(this.throwable, initializationException.throwable) && p.e(this.reason, initializationException.reason) && p.e(this.reasonDebug, initializationException.reasonDebug);
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th2 = this.throwable;
        int iHashCode2 = (((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String str, Throwable th2, String str2, String str3) {
        super(str);
        p.j(str, "message");
        p.j(str2, "reason");
        this.message = str;
        this.throwable = th2;
        this.reason = str2;
        this.reasonDebug = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
