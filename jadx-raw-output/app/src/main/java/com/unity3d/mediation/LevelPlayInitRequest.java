package com.unity3d.mediation;

import ck.i;
import ck.p;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes10.dex */
public final class LevelPlayInitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<LevelPlay.AdFormat> f45328c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45330b;

        public Builder(String str) {
            p.j(str, "appKey");
            this.f45329a = str;
        }

        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f45329a, this.f45330b, null, 4, null);
        }

        public final String getAppKey() {
            return this.f45329a;
        }

        public final Builder withUserId(String str) {
            p.j(str, "userId");
            this.f45330b = str;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f45326a = str;
        this.f45327b = str2;
        this.f45328c = list;
    }

    public final String getAppKey() {
        return this.f45326a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f45328c;
    }

    public final String getUserId() {
        return this.f45327b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i10, i iVar) {
        this(str, str2, (i10 & 4) != 0 ? s.k() : list);
    }
}
