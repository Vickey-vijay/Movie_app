package com.yandex.mobile.ads.common;

import android.location.Location;
import ck.i;
import ck.p;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Location f50972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f50973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f50974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f50975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f50976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdTheme f50977h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f50980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f50982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f50983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f50984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f50985h;

        public final AdRequest build() {
            return new AdRequest(this.f50978a, this.f50979b, this.f50980c, this.f50981d, this.f50982e, this.f50983f, this.f50984g, this.f50985h, null);
        }

        public final Builder setBiddingData(String str) {
            this.f50984g = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f50983f = map;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, i iVar) {
        this(str, str2, str3, str4, list, location, map, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(AdRequest.class, obj.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (p.e(this.f50970a, adRequest.f50970a) && p.e(this.f50971b, adRequest.f50971b) && p.e(this.f50973d, adRequest.f50973d) && p.e(this.f50974e, adRequest.f50974e) && p.e(this.f50972c, adRequest.f50972c) && p.e(this.f50975f, adRequest.f50975f)) {
            return p.e(this.f50976g, adRequest.f50976g) && this.f50977h == adRequest.f50977h;
        }
        return false;
    }

    private AdRequest(String str, String str2, String str3, String str4, List list, Location location, Map map, AdTheme adTheme) {
        this.f50970a = str;
        this.f50971b = str2;
        this.f50972c = location;
        this.f50973d = str3;
        this.f50974e = list;
        this.f50975f = map;
        this.f50976g = str4;
        this.f50977h = adTheme;
    }

    public final String getAge() {
        return this.f50970a;
    }

    public final String getBiddingData() {
        return this.f50976g;
    }

    public final String getContextQuery() {
        return this.f50973d;
    }

    public final List<String> getContextTags() {
        return this.f50974e;
    }

    public final String getGender() {
        return this.f50971b;
    }

    public final Location getLocation() {
        return this.f50972c;
    }

    public final Map<String, String> getParameters() {
        return this.f50975f;
    }

    public final AdTheme getPreferredTheme() {
        return this.f50977h;
    }

    public int hashCode() {
        String str = this.f50970a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50971b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50973d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f50974e;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f50972c;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f50975f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f50976g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f50977h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
