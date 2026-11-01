package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.inmobi.media.Bi;
import com.inmobi.media.H6;
import com.inmobi.media.Se;
import com.inmobi.media.T9;
import com.inmobi.media.Ue;
import ik.i;
import java.util.Iterator;
import java.util.List;
import lk.a0;
import nj.s;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class RootConfig extends Config {
    public static final Bi Companion = new Bi();
    public static final long DEFAULT_EXPIRY_IN_SEC = 86400;
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    private boolean monetizationDisabled;
    private int maxRetries = 3;
    private int retryInterval = 60;

    @Ue
    private GDPR gdpr = new GDPR();
    private final List<ComponentConfig> components = s.k();
    private final List<String> ipAddrTPSupport = s.k();

    @Keep
    public static final class ComponentConfig {
        private String type = "";
        private long expiry = Long.MAX_VALUE;
        private String url = "";

        public final long getExpiry() {
            return this.expiry;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (a0.k1(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 86400 && !H6.a(this.url)) {
                return true;
            }
            return false;
        }
    }

    @Keep
    public static final class GDPR {

        @Ue
        private Boolean transmitRequest = Boolean.TRUE;

        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "root";
    }

    public final long getExpiryInMillisForType(String str) {
        p.j(str, "type");
        for (ComponentConfig componentConfig : this.components) {
            if (p.e(str, componentConfig.getType())) {
                long expiry = componentConfig.getExpiry();
                i iVar = Se.f23518a;
                return expiry * ((long) 1000);
            }
        }
        i iVar2 = Se.f23518a;
        return ((long) 1000) * 86400;
    }

    public final List<String> getIPAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    public final String getUrlForType(String str) {
        Object next;
        p.j(str, "type");
        Iterator<T> it = this.components.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p.e(((ComponentConfig) next).getType(), str));
        ComponentConfig componentConfig = (ComponentConfig) next;
        String url = componentConfig != null ? componentConfig.getUrl() : null;
        return (url == null || url.length() == 0) ? DEFAULT_FALLBACK_URL : url;
    }

    public final boolean isMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (this.maxRetries >= 0 && this.retryInterval >= 0) {
            Iterator<T> it = this.components.iterator();
            while (it.hasNext()) {
                if (!((ComponentConfig) it.next()).isValid()) {
                    return false;
                }
            }
            GDPR gdpr = this.gdpr;
            if (gdpr != null && gdpr.isValid()) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setIncludeIdParams(T9 t10) {
        p.j(t10, "includeIds");
        setIncludeIds(t10);
    }

    @VisibleForTesting(otherwise = 2)
    public final void setMaxRetries(int i10) {
        this.maxRetries = i10;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setRetryInterval(int i10) {
        this.retryInterval = i10;
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr != null) {
            gdpr.getTransmitRequest();
        }
        GDPR gdpr2 = this.gdpr;
        if (gdpr2 == null || (transmitRequest = gdpr2.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }
}
