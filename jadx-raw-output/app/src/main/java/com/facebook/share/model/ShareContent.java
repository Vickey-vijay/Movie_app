package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import ck.p;
import com.facebook.share.model.ShareContent;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004B\u0011\b\u0014\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "", "B", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "parcel", "", "", "a", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "getContentUrl", "()Landroid/net/Uri;", "contentUrl", "c", "Ljava/util/List;", "getPeopleIds", "()Ljava/util/List;", "peopleIds", "d", "Ljava/lang/String;", "getPlaceId", "()Ljava/lang/String;", "placeId", "e", "getPageId", "pageId", InneractiveMediationDefs.GENDER_FEMALE, "getRef", "ref", "Lcom/facebook/share/model/ShareHashtag;", "g", "Lcom/facebook/share/model/ShareHashtag;", "getShareHashtag", "()Lcom/facebook/share/model/ShareHashtag;", "shareHashtag", "<init>", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class ShareContent<M extends ShareContent<M, B>, B> implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Uri contentUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<String> peopleIds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String placeId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String pageId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String ref;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final ShareHashtag shareHashtag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareContent(Parcel parcel) {
        p.j(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = a(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.a().d(parcel).a();
    }

    public final List<String> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.shareHashtag, 0);
    }
}
