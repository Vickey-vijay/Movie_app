package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class VersionRange {

    @Nullable
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    @Nullable
    private final Version f60978to;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionRange versionRange = (VersionRange) obj;
        return this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && Objects.equals(this.from, versionRange.from) && Objects.equals(this.f60978to, versionRange.f60978to);
    }

    @VisibleForTesting
    public static boolean isAfter(@NonNull Version version, @NonNull Version version2, boolean z10) {
        return (z10 && version2.isAfterOrEquals(version)) || (!z10 && version2.isAfter(version));
    }

    @VisibleForTesting
    public static boolean isBefore(@NonNull Version version, @NonNull Version version2, boolean z10) {
        return (z10 && version2.isBeforeOrEquals(version)) || (!z10 && version2.isBefore(version));
    }

    public boolean contains(@NonNull Version version) {
        Version version2;
        Version version3 = this.from;
        if (version3 != null && this.f60978to != null && isAfter(version3, version, this.isInclusiveFrom) && isBefore(this.f60978to, version, this.isInclusiveTo)) {
            return true;
        }
        Version version4 = this.from;
        if (version4 != null && this.f60978to == null && isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.f60978to) != null && isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        return this.from == null && this.f60978to == null;
    }

    public VersionRange(@Nullable Version version, @Nullable Version version2, boolean z10, boolean z11) {
        this.from = version;
        this.f60978to = version2;
        this.isInclusiveFrom = z10;
        this.isInclusiveTo = z11;
    }

    @Nullable
    public static VersionRange parseVersionRange(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith(C3426d4.j.f28586d);
            boolean zStartsWith2 = str.startsWith("(");
            if (!zStartsWith && !zStartsWith2) {
                zStartsWith = true;
            } else {
                str = str.substring(1);
            }
            boolean zEndsWith = str.endsWith(C3426d4.j.f28588e);
            boolean zEndsWith2 = str.endsWith(")");
            if (!zEndsWith && !zEndsWith2) {
                zEndsWith = true;
            } else {
                str = str.substring(0, str.length() - 1);
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length < 2) {
                Version version = Version.parseVersion(str);
                if (version == null) {
                    return null;
                }
                return new VersionRange(version, version, zStartsWith, zEndsWith);
            }
            return new VersionRange(Version.parseVersion(strArrSplit[0]), Version.parseVersion(strArrSplit[1]), zStartsWith, zEndsWith);
        } catch (Throwable unused) {
            return null;
        }
    }
}
