package com.mgs.carparking.dbtable;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import lk.x;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: SearchHistoryEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@f(name = SearchHistoryEntity.TABLE_NAME)
public final class SearchHistoryEntity implements Parcelable {
    public static final String CONTENT = "CONTENT";
    public static final String CREATE_TIME = "create_time";
    public static final String TABLE_NAME = "VIDEO_SEARCH_HISTORY";

    @b(name = "CONTENT")
    private String content;

    @b(name = CREATE_TIME)
    private long createTime;
    public static final Companion Companion = new Companion(null);
    private static final Parcelable.Creator<SearchHistoryEntity> CREATOR = new Parcelable.Creator<SearchHistoryEntity>() { // from class: com.mgs.carparking.dbtable.SearchHistoryEntity$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchHistoryEntity createFromParcel(Parcel parcel) {
            p.j(parcel, ScarConstants.IN_SIGNAL_KEY);
            return new SearchHistoryEntity(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchHistoryEntity[] newArray(int i10) {
            return new SearchHistoryEntity[i10];
        }
    };

    public SearchHistoryEntity() {
    }

    private SearchHistoryEntity(Parcel parcel) {
        this.content = parcel.readString();
        this.createTime = parcel.readLong();
    }

    public /* synthetic */ SearchHistoryEntity(Parcel parcel, i iVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: compiled from: SearchHistoryEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Parcelable.Creator<SearchHistoryEntity> getCREATOR() {
            return SearchHistoryEntity.CREATOR;
        }
    }

    public final String getContent() {
        String str = this.content;
        p.g(str);
        if (x.R(str, "http", false, 2, null)) {
            String str2 = this.content;
            p.g(str2);
            if (str2.length() > 15) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = this.content;
                p.g(str3);
                String strSubstring = str3.substring(0, 15);
                p.i(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("...");
                return sb2.toString();
            }
        }
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setCreateTime(long j10) {
        this.createTime = j10;
    }

    public String toString() {
        return "SearchHistoryEntity{content='" + this.content + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.content);
        parcel.writeLong(this.createTime);
    }
}
