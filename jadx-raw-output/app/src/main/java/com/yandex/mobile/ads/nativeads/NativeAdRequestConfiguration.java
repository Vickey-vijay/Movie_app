package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import ck.i;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f51053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f51054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f51055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f51056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f51057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f51058j;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f51060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f51061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f51062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f51063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f51064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f51065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f51066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f51067i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f51068j = true;

        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f51059a, this.f51060b, this.f51061c, this.f51063e, this.f51064f, this.f51062d, this.f51065g, this.f51066h, this.f51067i, this.f51068j, null);
        }

        public final Builder setBiddingData(String str) {
            this.f51066h = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f51065g = map;
            return this;
        }

        public final Builder setShouldLoadImagesAutomatically(boolean z10) {
            this.f51068j = z10;
            return this;
        }

        public Builder(String str) {
            this.f51059a = str;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10, i iVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z10);
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10) {
        this.f51049a = str;
        this.f51050b = str2;
        this.f51051c = str3;
        this.f51052d = str4;
        this.f51053e = list;
        this.f51054f = location;
        this.f51055g = map;
        this.f51056h = str5;
        this.f51057i = adTheme;
        this.f51058j = z10;
    }

    public final String getAdUnitId() {
        return this.f51049a;
    }

    public final String getAge() {
        return this.f51050b;
    }

    public final String getBiddingData() {
        return this.f51056h;
    }

    public final String getContextQuery() {
        return this.f51052d;
    }

    public final List<String> getContextTags() {
        return this.f51053e;
    }

    public final String getGender() {
        return this.f51051c;
    }

    public final Location getLocation() {
        return this.f51054f;
    }

    public final Map<String, String> getParameters() {
        return this.f51055g;
    }

    public final AdTheme getPreferredTheme() {
        return this.f51057i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f51058j;
    }
}
