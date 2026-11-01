package com.facebook.share.model;

import android.os.Parcel;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareMessengerActionButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/model/ShareMessengerActionButton;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "parcel", "<init>", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class ShareMessengerActionButton implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton(Parcel parcel) {
        p.j(parcel, "parcel");
        this.title = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.title);
    }
}
