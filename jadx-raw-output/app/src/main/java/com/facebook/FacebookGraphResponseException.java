package com.facebook;

import ck.p;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import kotlin.Metadata;
import q1.z;

/* JADX INFO: compiled from: FacebookGraphResponseException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "", "toString", "Lq1/z;", "graphResponse", "Lq1/z;", "getGraphResponse", "()Lq1/z;", "errorMessage", "<init>", "(Lq1/z;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookGraphResponseException extends FacebookException {
    private final z graphResponse;

    public final z getGraphResponse() {
        return this.graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        z zVar = this.graphResponse;
        FacebookRequestError error = zVar == null ? null : zVar.getError();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(Z7.f27998r);
        }
        if (error != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(error.getRequestStatusCode());
            sb2.append(", facebookErrorCode: ");
            sb2.append(error.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE java.lang.String());
            sb2.append(", facebookErrorType: ");
            sb2.append(error.getErrorType());
            sb2.append(", message: ");
            sb2.append(error.e());
            sb2.append(h.f44172e);
        }
        String string = sb2.toString();
        p.i(string, "errorStringBuilder.toString()");
        return string;
    }

    public FacebookGraphResponseException(z zVar, String str) {
        super(str);
        this.graphResponse = zVar;
    }
}
