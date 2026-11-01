package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareMessengerURLActionButton.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/facebook/share/model/ShareMessengerURLActionButton;", "Lcom/facebook/share/model/ShareMessengerActionButton;", "Landroid/os/Parcel;", "dest", "", "flags", "Lmj/r;", "writeToParcel", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "url", "d", "getFallbackUrl", "fallbackUrl", "", "e", "Z", "isMessengerExtensionURL", "()Z", InneractiveMediationDefs.GENDER_FEMALE, "getShouldHideWebviewShareButton", "shouldHideWebviewShareButton", "Lcom/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio;", "g", "Lcom/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio;", "getWebviewHeightRatio", "()Lcom/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio;", "webviewHeightRatio", "parcel", "<init>", "(Landroid/os/Parcel;)V", "h", "b", "WebviewHeightRatio", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Uri url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Uri fallbackUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isMessengerExtensionURL;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldHideWebviewShareButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final WebviewHeightRatio webviewHeightRatio;
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new a();

    /* JADX INFO: compiled from: ShareMessengerURLActionButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio;", "", "(Ljava/lang/String;I)V", "WebviewHeightRatioFull", "WebviewHeightRatioTall", "WebviewHeightRatioCompact", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static WebviewHeightRatio[] valuesCustom() {
            WebviewHeightRatio[] webviewHeightRatioArrValuesCustom = values();
            return (WebviewHeightRatio[]) Arrays.copyOf(webviewHeightRatioArrValuesCustom, webviewHeightRatioArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: ShareMessengerURLActionButton.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/ShareMessengerURLActionButton$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareMessengerURLActionButton;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/ShareMessengerURLActionButton;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton[] newArray(int size) {
            return new ShareMessengerURLActionButton[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        p.j(parcel, "parcel");
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.isMessengerExtensionURL = parcel.readByte() != 0;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (WebviewHeightRatio) parcel.readSerializable();
        this.shouldHideWebviewShareButton = parcel.readByte() != 0;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.url, 0);
        parcel.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.fallbackUrl, 0);
        parcel.writeSerializable(this.webviewHeightRatio);
        parcel.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
    }
}
