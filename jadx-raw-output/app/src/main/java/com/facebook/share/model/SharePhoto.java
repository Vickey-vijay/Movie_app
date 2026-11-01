package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SharePhoto.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u000bB\u0011\b\u0012\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&B\u0011\b\u0010\u0012\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b%\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/SharePhoto$a;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "Landroid/graphics/Bitmap;", "c", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "d", "Landroid/net/Uri;", "e", "()Landroid/net/Uri;", UnifiedMediationParams.KEY_IMAGE_URL, "", "Z", InneractiveMediationDefs.GENDER_FEMALE, "()Z", "userGenerated", "", "Ljava/lang/String;", "()Ljava/lang/String;", "caption", "Lcom/facebook/share/model/ShareMedia$Type;", "g", "Lcom/facebook/share/model/ShareMedia$Type;", "getMediaType", "()Lcom/facebook/share/model/ShareMedia$Type;", "mediaType", "builder", "<init>", "(Lcom/facebook/share/model/SharePhoto$a;)V", "parcel", "(Landroid/os/Parcel;)V", "h", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class SharePhoto extends ShareMedia<SharePhoto, a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Uri imageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean userGenerated;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String caption;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final ShareMedia.Type mediaType;
    public static final Parcelable.Creator<SharePhoto> CREATOR = new b();

    /* JADX INFO: compiled from: SharePhoto.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lcom/facebook/share/model/SharePhoto$a;", "Lcom/facebook/share/model/ShareMedia$a;", "Lcom/facebook/share/model/SharePhoto;", "Landroid/graphics/Bitmap;", "bitmap", CampaignEx.JSON_KEY_AD_K, "Landroid/net/Uri;", UnifiedMediationParams.KEY_IMAGE_URL, InneractiveMediationDefs.GENDER_MALE, "", "userGenerated", "n", "", "caption", "l", "d", "model", "i", "Landroid/os/Parcel;", "parcel", "j", "(Landroid/os/Parcel;)Lcom/facebook/share/model/SharePhoto$a;", "<set-?>", "c", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "g", "()Landroid/net/Uri;", "Z", "h", "()Z", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "()V", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ShareMedia.a<SharePhoto, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Bitmap bitmap;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public Uri imageUrl;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean userGenerated;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public String caption;

        /* JADX INFO: renamed from: com.facebook.share.model.SharePhoto$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: SharePhoto.kt */
        @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/share/model/SharePhoto$a$a;", "", "Landroid/os/Parcel;", "out", "", "parcelFlags", "", "Lcom/facebook/share/model/SharePhoto;", "photos", "Lmj/r;", "b", "(Landroid/os/Parcel;ILjava/util/List;)V", "parcel", "a", "(Landroid/os/Parcel;)Ljava/util/List;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final List<SharePhoto> a(Parcel parcel) {
                p.j(parcel, "parcel");
                List<ShareMedia<?, ?>> listA = ShareMedia.a.INSTANCE.a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void b(Parcel out, int parcelFlags, List<SharePhoto> photos) {
                p.j(out, "out");
                p.j(photos, "photos");
                Object[] array = photos.toArray(new SharePhoto[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                out.writeParcelableArray((SharePhoto[]) array, parcelFlags);
            }
        }

        public SharePhoto d() {
            return new SharePhoto(this, null);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCaption() {
            return this.caption;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Uri getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getUserGenerated() {
            return this.userGenerated;
        }

        public a i(SharePhoto model) {
            return model == null ? this : ((a) super.b(model)).k(model.getBitmap()).m(model.getImageUrl()).n(model.getUserGenerated()).l(model.getCaption());
        }

        public final a j(Parcel parcel) {
            p.j(parcel, "parcel");
            return i((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        public final a k(Bitmap bitmap) {
            this.bitmap = bitmap;
            return this;
        }

        public final a l(String caption) {
            this.caption = caption;
            return this;
        }

        public final a m(Uri imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public final a n(boolean userGenerated) {
            this.userGenerated = userGenerated;
            return this;
        }
    }

    /* JADX INFO: compiled from: SharePhoto.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/SharePhoto$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/SharePhoto;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/SharePhoto;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<SharePhoto> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel source) {
            p.j(source, "source");
            return new SharePhoto(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int size) {
            return new SharePhoto[size];
        }
    }

    public SharePhoto(a aVar) {
        super(aVar);
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = aVar.getBitmap();
        this.imageUrl = aVar.getImageUrl();
        this.userGenerated = aVar.getUserGenerated();
        this.caption = aVar.getCaption();
    }

    public /* synthetic */ SharePhoto(a aVar, i iVar) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUserGenerated() {
        return this.userGenerated;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        parcel.writeString(this.caption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        p.j(parcel, "parcel");
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
