package io.bidmachine.util.version;

import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.text.Regex;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/version/Version;", "", "major", "", "minor", "patch", "(III)V", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "isAfter", "version", "isAfterOrEquals", "isBefore", "isBeforeOrEquals", "toString", "", VastTagName.COMPANION, "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int major;
    private final int minor;
    private final int patch;

    /* JADX INFO: compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/version/Version$Companion;", "", "()V", "parseVersion", "Lio/bidmachine/util/version/Version;", "versionString", "", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Version parseVersion(String versionString) {
            List listK;
            if (versionString == null || versionString.length() == 0) {
                return null;
            }
            try {
                List<String> listSplit = new Regex("\\.").split(versionString, 0);
                if (!listSplit.isEmpty()) {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listK = s.k();
                            break;
                        }
                        if (!(listIterator.previous().length() == 0)) {
                            listK = b0.I0(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                } else {
                    listK = s.k();
                    break;
                }
                String[] strArr = (String[]) listK.toArray(new String[0]);
                if (strArr.length == 0) {
                    return null;
                }
                int length = strArr.length;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < length) {
                    if (i10 == 0) {
                        i11 = Integer.parseInt(strArr[0]);
                    } else if (i10 != 1) {
                        i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArr[i10]) : Integer.parseInt(strArr[2]);
                    } else {
                        i12 = Integer.parseInt(strArr[1]);
                    }
                    i10++;
                }
                return new Version(i11, i12, i13);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getMajor() {
        return this.major;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final int getMinor() {
        return this.minor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final int getPatch() {
        return this.patch;
    }

    public static /* synthetic */ Version copy$default(Version version, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = version.major;
        }
        if ((i13 & 2) != 0) {
            i11 = version.minor;
        }
        if ((i13 & 4) != 0) {
            i12 = version.patch;
        }
        return version.copy(i10, i11, i12);
    }

    public static final Version parseVersion(String str) {
        return INSTANCE.parseVersion(str);
    }

    public final Version copy(int major, int minor, int patch) {
        return new Version(major, minor, patch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        p.j(other, "other");
        int iL = p.l(this.major, other.major);
        if (iL != 0) {
            return iL;
        }
        int iL2 = p.l(this.minor, other.minor);
        return iL2 != 0 ? iL2 : p.l(this.patch, other.patch);
    }

    public final boolean isAfter(Version version) {
        p.j(version, "version");
        return compareTo(version) > 0;
    }

    public final boolean isAfterOrEquals(Version version) {
        p.j(version, "version");
        return compareTo(version) >= 0;
    }

    public final boolean isBefore(Version version) {
        p.j(version, "version");
        return compareTo(version) < 0;
    }

    public final boolean isBeforeOrEquals(Version version) {
        p.j(version, "version");
        return compareTo(version) <= 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    public Version(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
    }
}
