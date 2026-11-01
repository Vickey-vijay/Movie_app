package com.applovin.shadow.okhttp3;

import ck.i;
import ck.p;
import com.applovin.shadow.okhttp3.internal.Util;
import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;
import lk.a0;
import lk.x;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder maxAge(int i10, TimeUnit timeUnit) {
            p.j(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i10).toString());
        }

        public final Builder maxStale(int i10, TimeUnit timeUnit) {
            p.j(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final Builder minFresh(int i10, TimeUnit timeUnit) {
            p.j(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i10).toString());
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.indexOfElement(str, str2, i10);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00df  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code duplicated, block: B:46:0x010b  */
        /* JADX WARN: Code duplicated, block: B:47:0x0110  */
        /* JADX WARN: Code duplicated, block: B:49:0x0118  */
        /* JADX WARN: Code duplicated, block: B:50:0x011d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0125  */
        /* JADX WARN: Code duplicated, block: B:53:0x012b  */
        /* JADX WARN: Code duplicated, block: B:55:0x0133  */
        /* JADX WARN: Code duplicated, block: B:56:0x013b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0143  */
        /* JADX WARN: Code duplicated, block: B:59:0x0149  */
        /* JADX WARN: Code duplicated, block: B:61:0x0152  */
        /* JADX WARN: Code duplicated, block: B:62:0x0159  */
        /* JADX WARN: Code duplicated, block: B:64:0x0161  */
        /* JADX WARN: Code duplicated, block: B:65:0x0168  */
        /* JADX WARN: Code duplicated, block: B:67:0x0170  */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            String string;
            int i10;
            String string2;
            Headers headers2 = headers;
            p.j(headers2, "headers");
            int size = headers.size();
            boolean z10 = true;
            boolean z11 = true;
            int i11 = 0;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i11 < size) {
                String strName = headers2.name(i11);
                String strValue = headers2.value(i11);
                if (x.E(strName, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = a0.k1(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i10 = size;
                            if (strValue.charAt(iIndexOfElement2) == ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    p.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string2 = a0.k1(strSubstring2).toString();
                                } else {
                                    int i12 = iIndexOfNonWhitespace + 1;
                                    int iK0 = a0.k0(strValue, '\"', i12, false, 4, null);
                                    string2 = strValue.substring(i12, iK0);
                                    p.i(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iIndexOfElement = iK0 + 1;
                                }
                            }
                            z10 = true;
                            if (x.E("no-cache", string, true)) {
                                z12 = true;
                            } else if (x.E("no-store", string, true)) {
                                z13 = true;
                            } else if (x.E("max-age", string, true)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (x.E("s-maxage", string, true)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (x.E("private", string, true)) {
                                z14 = true;
                            } else if (x.E(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                                z15 = true;
                            } else if (x.E("must-revalidate", string, true)) {
                                z16 = true;
                            } else if (x.E("max-stale", string, true)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (x.E("min-fresh", string, true)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (x.E("only-if-cached", string, true)) {
                                z17 = true;
                            } else if (x.E("no-transform", string, true)) {
                                z18 = true;
                            } else if (x.E("immutable", string, true)) {
                                z19 = true;
                            }
                            size = i10;
                        } else {
                            i10 = size;
                        }
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                        z10 = true;
                        if (x.E("no-cache", string, true)) {
                            z12 = true;
                        } else if (x.E("no-store", string, true)) {
                            z13 = true;
                        } else if (x.E("max-age", string, true)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("s-maxage", string, true)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("private", string, true)) {
                            z14 = true;
                        } else if (x.E(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                            z15 = true;
                        } else if (x.E("must-revalidate", string, true)) {
                            z16 = true;
                        } else if (x.E("max-stale", string, true)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (x.E("min-fresh", string, true)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("only-if-cached", string, true)) {
                            z17 = true;
                        } else if (x.E("no-transform", string, true)) {
                            z18 = true;
                        } else if (x.E("immutable", string, true)) {
                            z19 = true;
                        }
                        size = i10;
                    }
                    i11++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (x.E(strName, "Pragma", z10)) {
                    }
                    i11++;
                    headers2 = headers;
                    size = size;
                }
                z11 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    p.i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = a0.k1(strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        i10 = size;
                        if (strValue.charAt(iIndexOfElement2) == ',') {
                        }
                        z10 = true;
                        if (x.E("no-cache", string, true)) {
                            z12 = true;
                        } else if (x.E("no-store", string, true)) {
                            z13 = true;
                        } else if (x.E("max-age", string, true)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("s-maxage", string, true)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("private", string, true)) {
                            z14 = true;
                        } else if (x.E(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                            z15 = true;
                        } else if (x.E("must-revalidate", string, true)) {
                            z16 = true;
                        } else if (x.E("max-stale", string, true)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (x.E("min-fresh", string, true)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (x.E("only-if-cached", string, true)) {
                            z17 = true;
                        } else if (x.E("no-transform", string, true)) {
                            z18 = true;
                        } else if (x.E("immutable", string, true)) {
                            z19 = true;
                        }
                        size = i10;
                    } else {
                        i10 = size;
                    }
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                    z10 = true;
                    if (x.E("no-cache", string, true)) {
                        z12 = true;
                    } else if (x.E("no-store", string, true)) {
                        z13 = true;
                    } else if (x.E("max-age", string, true)) {
                        nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                    } else if (x.E("s-maxage", string, true)) {
                        nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                    } else if (x.E("private", string, true)) {
                        z14 = true;
                    } else if (x.E(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                        z15 = true;
                    } else if (x.E("must-revalidate", string, true)) {
                        z16 = true;
                    } else if (x.E("max-stale", string, true)) {
                        nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if (x.E("min-fresh", string, true)) {
                        nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                    } else if (x.E("only-if-cached", string, true)) {
                        z17 = true;
                    } else if (x.E("no-transform", string, true)) {
                        z18 = true;
                    } else if (x.E("immutable", string, true)) {
                        z19 = true;
                    }
                    size = i10;
                }
                i11++;
                headers2 = headers;
                size = size;
            }
            return new CacheControl(z12, z13, nonNegativeInt, nonNegativeInt2, z14, z15, z16, nonNegativeInt3, nonNegativeInt4, z17, z18, z19, !z11 ? null : str, null);
        }

        private final int indexOfElement(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (a0.W(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }
    }

    private CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, i iVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m59deprecated_immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m60deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m61deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m62deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m63deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m64deprecated_noCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m65deprecated_noStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m66deprecated_noTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m67deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m68deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        p.i(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }
}
