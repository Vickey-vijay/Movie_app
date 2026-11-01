package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareVideo.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u000bB\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/ShareVideo$a;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "()Landroid/net/Uri;", "localUrl", "Lcom/facebook/share/model/ShareMedia$Type;", "d", "Lcom/facebook/share/model/ShareMedia$Type;", "getMediaType", "()Lcom/facebook/share/model/ShareMedia$Type;", "mediaType", "builder", "<init>", "(Lcom/facebook/share/model/ShareVideo$a;)V", "parcel", "(Landroid/os/Parcel;)V", "e", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareVideo extends ShareMedia<ShareVideo, a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Uri localUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ShareMedia.Type mediaType;
    public static final Parcelable.Creator<ShareVideo> CREATOR = new b();

    /* JADX INFO: compiled from: ShareVideo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/model/ShareVideo$a;", "Lcom/facebook/share/model/ShareMedia$a;", "Lcom/facebook/share/model/ShareVideo;", "Landroid/net/Uri;", "localUrl", "h", "d", "model", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/os/Parcel;", "parcel", "g", "(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareVideo$a;", "c", "Landroid/net/Uri;", "e", "()Landroid/net/Uri;", "setLocalUrl$facebook_common_release", "(Landroid/net/Uri;)V", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ShareMedia.a<ShareVideo, a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Uri localUrl;

        public ShareVideo d() {
            return new ShareVideo(this, null);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Uri getLocalUrl() {
            return this.localUrl;
        }

        public a f(ShareVideo model) {
            return model == null ? this : h(model.getLocalUrl());
        }

        public final a g(Parcel parcel) {
            p.j(parcel, "parcel");
            return f((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        public final a h(Uri localUrl) {
            this.localUrl = localUrl;
            return this;
        }
    }

    /* JADX INFO: compiled from: ShareVideo.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/ShareVideo$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareVideo;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/ShareVideo;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<ShareVideo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo createFromParcel(Parcel source) {
            p.j(source, "source");
            return new ShareVideo(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideo[] newArray(int size) {
            return new ShareVideo[size];
        }
    }

    public ShareVideo(a aVar) {
        super(aVar);
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = aVar.getLocalUrl();
    }

    public /* synthetic */ ShareVideo(a aVar, i iVar) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Uri getLocalUrl() {
        return this.localUrl;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.localUrl, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        p.j(parcel, "parcel");
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
