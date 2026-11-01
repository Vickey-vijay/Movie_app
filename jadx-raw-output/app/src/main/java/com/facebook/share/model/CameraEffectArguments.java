package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: CameraEffectArguments.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B\u0011\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/model/CameraEffectArguments;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "params", "Lcom/facebook/share/model/CameraEffectArguments$a;", "builder", "<init>", "(Lcom/facebook/share/model/CameraEffectArguments$a;)V", "parcel", "(Landroid/os/Parcel;)V", "c", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CameraEffectArguments implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Bundle params;
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new b();

    /* JADX INFO: compiled from: CameraEffectArguments.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/facebook/share/model/CameraEffectArguments$a;", "", "Lcom/facebook/share/model/CameraEffectArguments;", "model", "d", "Landroid/os/Parcel;", "parcel", "c", "a", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "params", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Bundle params = new Bundle();

        public CameraEffectArguments a() {
            return new CameraEffectArguments(this, null);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bundle getParams() {
            return this.params;
        }

        public final a c(Parcel parcel) {
            p.j(parcel, "parcel");
            return d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        public a d(CameraEffectArguments model) {
            if (model != null) {
                this.params.putAll(model.params);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: CameraEffectArguments.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/CameraEffectArguments$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/CameraEffectArguments;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/CameraEffectArguments;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<CameraEffectArguments> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments[] newArray(int size) {
            return new CameraEffectArguments[size];
        }
    }

    public CameraEffectArguments(a aVar) {
        this.params = aVar.getParams();
    }

    public /* synthetic */ CameraEffectArguments(a aVar, i iVar) {
        this(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        parcel.writeBundle(this.params);
    }

    public CameraEffectArguments(Parcel parcel) {
        p.j(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
