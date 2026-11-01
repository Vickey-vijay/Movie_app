package com.yandex.mobile.ads.common;

import android.location.Location;
import ck.i;
import ck.p;
import java.util.List;
import java.util.Map;
import yads.k4;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f50989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f50990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f50991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f50992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f50993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f50994i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f50998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f51000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f51001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f51002h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f51003i;

        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f50995a, this.f50996b, this.f50997c, this.f50999e, this.f51000f, this.f50998d, this.f51001g, this.f51002h, this.f51003i, null);
        }

        public final Builder setBiddingData(String str) {
            this.f51002h = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f51001g = map;
            return this;
        }

        public Builder(String str) {
            this.f50995a = str;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, i iVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(AdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (p.e(this.f50986a, adRequestConfiguration.f50986a) && p.e(this.f50987b, adRequestConfiguration.f50987b) && p.e(this.f50988c, adRequestConfiguration.f50988c) && p.e(this.f50989d, adRequestConfiguration.f50989d) && p.e(this.f50990e, adRequestConfiguration.f50990e) && p.e(this.f50991f, adRequestConfiguration.f50991f) && p.e(this.f50992g, adRequestConfiguration.f50992g)) {
            return p.e(this.f50993h, adRequestConfiguration.f50993h) && this.f50994i == adRequestConfiguration.f50994i;
        }
        return false;
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme) {
        this.f50986a = str;
        this.f50987b = str2;
        this.f50988c = str3;
        this.f50989d = str4;
        this.f50990e = list;
        this.f50991f = location;
        this.f50992g = map;
        this.f50993h = str5;
        this.f50994i = adTheme;
    }

    public final String getAdUnitId() {
        return this.f50986a;
    }

    public final String getAge() {
        return this.f50987b;
    }

    public final String getBiddingData() {
        return this.f50993h;
    }

    public final String getContextQuery() {
        return this.f50989d;
    }

    public final List<String> getContextTags() {
        return this.f50990e;
    }

    public final String getGender() {
        return this.f50988c;
    }

    public final Location getLocation() {
        return this.f50991f;
    }

    public final Map<String, String> getParameters() {
        return this.f50992g;
    }

    public final AdTheme getPreferredTheme() {
        return this.f50994i;
    }

    public int hashCode() {
        String str = this.f50987b;
        int iA = k4.a(this.f50986a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f50988c;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50989d;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f50990e;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f50991f;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f50992g;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f50993h;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f50994i;
        return iHashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
