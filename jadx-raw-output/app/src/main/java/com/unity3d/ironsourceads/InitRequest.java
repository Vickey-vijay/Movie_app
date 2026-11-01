package com.unity3d.ironsourceads;

import ck.i;
import ck.p;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes8.dex */
public final class InitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<IronSourceAds.AdFormat> f45231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LogLevel f45232c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<? extends IronSourceAds.AdFormat> f45234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LogLevel f45235c;

        public Builder(String str) {
            p.j(str, "appKey");
            this.f45233a = str;
        }

        public final InitRequest build() {
            String str = this.f45233a;
            List<? extends IronSourceAds.AdFormat> listK = this.f45234b;
            if (listK == null) {
                listK = s.k();
            }
            LogLevel logLevel = this.f45235c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, listK, logLevel, null);
        }

        public final String getAppKey() {
            return this.f45233a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> list) {
            p.j(list, "legacyAdFormats");
            this.f45234b = list;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            p.j(logLevel, "logLevel");
            this.f45235c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, i iVar) {
        this(str, list, logLevel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f45230a = str;
        this.f45231b = list;
        this.f45232c = logLevel;
    }

    public final String getAppKey() {
        return this.f45230a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f45231b;
    }

    public final LogLevel getLogLevel() {
        return this.f45232c;
    }
}
