package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Preference {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = C3426d4.i.W)
    public String mKey;

    @Nullable
    @ColumnInfo(name = "long_value")
    public Long mValue;

    public Preference(@NonNull String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.mKey.equals(preference.mKey)) {
            return false;
        }
        Long l10 = this.mValue;
        Long l11 = preference.mValue;
        if (l10 != null) {
            return l10.equals(l11);
        }
        return l11 == null;
    }

    public Preference(@NonNull String str, long j10) {
        this.mKey = str;
        this.mValue = Long.valueOf(j10);
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l10 = this.mValue;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
