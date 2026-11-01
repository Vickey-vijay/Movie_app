package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import ck.p;
import java.util.List;

/* JADX INFO: compiled from: WebTriggerRegistrationRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(33)
public final class WebTriggerRegistrationRequest {
    private final Uri destination;
    private final List<WebTriggerParams> webTriggerParams;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return p.e(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && p.e(this.destination, webTriggerRegistrationRequest.destination);
    }

    public final Uri getDestination() {
        return this.destination;
    }

    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return (this.webTriggerParams.hashCode() * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }

    public WebTriggerRegistrationRequest(List<WebTriggerParams> list, Uri uri) {
        p.j(list, "webTriggerParams");
        p.j(uri, "destination");
        this.webTriggerParams = list;
        this.destination = uri;
    }
}
