package io.bidmachine.util.version;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.text.Regex;
import lk.x;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: VersionRange.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/version/VersionRange;", "", TypedValues.TransitionType.S_FROM, "Lio/bidmachine/util/version/Version;", TypedValues.TransitionType.S_TO, "isInclusiveFrom", "", "isInclusiveTo", "(Lio/bidmachine/util/version/Version;Lio/bidmachine/util/version/Version;ZZ)V", "contains", "version", "equals", "other", VastTagName.COMPANION, "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VersionRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;
    private final Version to;

    /* JADX INFO: compiled from: VersionRange.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/version/VersionRange$Companion;", "", "()V", "isAfter", "", "border", "Lio/bidmachine/util/version/Version;", "version", "isInclusive", "isBefore", "parseVersionRange", "Lio/bidmachine/util/version/VersionRange;", "versionRangeString", "", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final VersionRange parseVersionRange(String versionRangeString) {
            List listK;
            if (versionRangeString == null || versionRangeString.length() == 0) {
                return null;
            }
            try {
                boolean zR = x.R(versionRangeString, C3426d4.j.f28586d, false, 2, null);
                boolean zR2 = x.R(versionRangeString, "(", false, 2, null);
                if (zR || zR2) {
                    versionRangeString = versionRangeString.substring(1);
                    p.i(versionRangeString, "this as java.lang.String).substring(startIndex)");
                } else {
                    zR = true;
                }
                boolean zD = x.D(versionRangeString, C3426d4.j.f28588e, false, 2, null);
                boolean zD2 = x.D(versionRangeString, ")", false, 2, null);
                if (zD || zD2) {
                    versionRangeString = versionRangeString.substring(0, versionRangeString.length() - 1);
                    p.i(versionRangeString, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    zD = true;
                }
                List<String> listSplit = new Regex("-").split(versionRangeString, 0);
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
                if (strArr.length >= 2) {
                    Version.Companion companion = Version.INSTANCE;
                    return new VersionRange(companion.parseVersion(strArr[0]), companion.parseVersion(strArr[1]), zR, zD);
                }
                Version version = Version.INSTANCE.parseVersion(versionRangeString);
                if (version != null) {
                    return new VersionRange(version, version, zR, zD);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean isAfter(Version border, Version version, boolean isInclusive) {
            p.j(border, "border");
            p.j(version, "version");
            return (isInclusive && version.isAfterOrEquals(border)) || (!isInclusive && version.isAfter(border));
        }

        public final boolean isBefore(Version border, Version version, boolean isInclusive) {
            p.j(border, "border");
            p.j(version, "version");
            return (isInclusive && version.isBeforeOrEquals(border)) || (!isInclusive && version.isBefore(border));
        }
    }

    public static final boolean isAfter(Version version, Version version2, boolean z10) {
        return INSTANCE.isAfter(version, version2, z10);
    }

    public static final boolean isBefore(Version version, Version version2, boolean z10) {
        return INSTANCE.isBefore(version, version2, z10);
    }

    public static final VersionRange parseVersionRange(String str) {
        return INSTANCE.parseVersionRange(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p.e(VersionRange.class, other.getClass())) {
            return false;
        }
        VersionRange versionRange = (VersionRange) other;
        return this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && p.e(this.from, versionRange.from) && p.e(this.to, versionRange.to);
    }

    public final boolean contains(Version version) {
        Version version2;
        p.j(version, "version");
        Version version3 = this.from;
        if (version3 != null && this.to != null) {
            Companion companion = INSTANCE;
            if (companion.isAfter(version3, version, this.isInclusiveFrom) && companion.isBefore(this.to, version, this.isInclusiveTo)) {
                return true;
            }
        }
        Version version4 = this.from;
        if (version4 != null && this.to == null && INSTANCE.isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.to) != null && INSTANCE.isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        return this.from == null && this.to == null;
    }

    public VersionRange(Version version, Version version2, boolean z10, boolean z11) {
        this.from = version;
        this.to = version2;
        this.isInclusiveFrom = z10;
        this.isInclusiveTo = z11;
    }
}
