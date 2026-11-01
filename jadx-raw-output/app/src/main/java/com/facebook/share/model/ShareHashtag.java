package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareHashtag.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u0015\fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/facebook/share/model/ShareHashtag;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "hashtag", "Lcom/facebook/share/model/ShareHashtag$a;", "builder", "<init>", "(Lcom/facebook/share/model/ShareHashtag$a;)V", "parcel", "(Landroid/os/Parcel;)V", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareHashtag implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String hashtag;
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new b();

    /* JADX INFO: compiled from: ShareHashtag.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/share/model/ShareHashtag$a;", "", "Lcom/facebook/share/model/ShareHashtag;", "", "hashtag", "e", "model", "c", "Landroid/os/Parcel;", "parcel", "d", "(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareHashtag$a;", "a", "<set-?>", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String hashtag;

        public ShareHashtag a() {
            return new ShareHashtag(this, null);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHashtag() {
            return this.hashtag;
        }

        public a c(ShareHashtag model) {
            return model == null ? this : e(model.getHashtag());
        }

        public final a d(Parcel parcel) {
            p.j(parcel, "parcel");
            return c((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public final a e(String hashtag) {
            this.hashtag = hashtag;
            return this;
        }
    }

    /* JADX INFO: compiled from: ShareHashtag.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/ShareHashtag$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareHashtag;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/ShareHashtag;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<ShareHashtag> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(Parcel source) {
            p.j(source, "source");
            return new ShareHashtag(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int size) {
            return new ShareHashtag[size];
        }
    }

    public ShareHashtag(a aVar) {
        this.hashtag = aVar.getHashtag();
    }

    public /* synthetic */ ShareHashtag(a aVar, i iVar) {
        this(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.hashtag);
    }

    public ShareHashtag(Parcel parcel) {
        p.j(parcel, "parcel");
        this.hashtag = parcel.readString();
    }
}
