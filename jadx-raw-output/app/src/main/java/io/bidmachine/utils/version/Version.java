package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class Version implements Comparable<Version> {
    private final int major;
    private final int minor;
    private final int patch;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.major), Integer.valueOf(this.minor), Integer.valueOf(this.patch));
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        int iCompare = Integer.compare(this.major, version.major);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.minor, version.minor);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.patch, version.patch);
    }

    @NonNull
    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }

    public Version(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
    }

    @Nullable
    public static Version parseVersion(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[i13]);
                        } else {
                            i12 = Integer.parseInt(strArrSplit[2]);
                        }
                    } else {
                        i11 = Integer.parseInt(strArrSplit[1]);
                    }
                } else {
                    i10 = Integer.parseInt(strArrSplit[0]);
                }
            }
            return new Version(i10, i11, i12);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isAfter(@NonNull Version version) {
        if (compareTo(version) > 0) {
            return true;
        }
        return false;
    }

    public boolean isAfterOrEquals(@NonNull Version version) {
        if (compareTo(version) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isBefore(@NonNull Version version) {
        if (compareTo(version) < 0) {
            return true;
        }
        return false;
    }

    public boolean isBeforeOrEquals(@NonNull Version version) {
        if (compareTo(version) <= 0) {
            return true;
        }
        return false;
    }
}
