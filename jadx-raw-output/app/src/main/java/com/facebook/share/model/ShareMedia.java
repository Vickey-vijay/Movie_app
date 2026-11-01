package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import ck.i;
import ck.p;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import nj.s;

/* JADX INFO: compiled from: ShareMedia.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002\u0015\u0016B\u001d\b\u0014\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/facebook/share/model/ShareMedia;", "M", "Lcom/facebook/share/model/ShareMedia$a;", "B", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "params", "builder", "<init>", "(Lcom/facebook/share/model/ShareMedia$a;)V", "parcel", "(Landroid/os/Parcel;)V", "a", "Type", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends a<M, B>> implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Bundle params;

    /* JADX INFO: compiled from: ShareMedia.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/ShareMedia$Type;", "", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Type {
        PHOTO,
        VIDEO;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] typeArrValuesCustom = values();
            return (Type[]) Arrays.copyOf(typeArrValuesCustom, typeArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: ShareMedia.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \n*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0007\u001a\u00028\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00028\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/share/model/ShareMedia$a;", "Lcom/facebook/share/model/ShareMedia;", "M", "B", "", "Landroid/os/Bundle;", "parameters", "c", "(Landroid/os/Bundle;)Lcom/facebook/share/model/ShareMedia$a;", "model", "b", "(Lcom/facebook/share/model/ShareMedia;)Lcom/facebook/share/model/ShareMedia$a;", "a", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setParams$facebook_common_release", "(Landroid/os/Bundle;)V", "params", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class a<M extends ShareMedia<M, B>, B extends a<M, B>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Bundle params = new Bundle();

        /* JADX INFO: renamed from: com.facebook.share.model.ShareMedia$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: ShareMedia.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/share/model/ShareMedia$a$a;", "", "Landroid/os/Parcel;", "parcel", "", "Lcom/facebook/share/model/ShareMedia;", "a", "(Landroid/os/Parcel;)Ljava/util/List;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final List<ShareMedia<?, ?>> a(Parcel parcel) {
                p.j(parcel, "parcel");
                Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (parcelableArray == null) {
                    return s.k();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bundle getParams() {
            return this.params;
        }

        public B b(M model) {
            return model == null ? this : (B) c(model.params);
        }

        public final B c(Bundle parameters) {
            p.j(parameters, "parameters");
            this.params.putAll(parameters);
            return this;
        }
    }

    public ShareMedia(a<M, B> aVar) {
        p.j(aVar, "builder");
        this.params = new Bundle(aVar.getParams());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeBundle(this.params);
    }

    public ShareMedia(Parcel parcel) {
        p.j(parcel, "parcel");
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.params = bundle == null ? new Bundle() : bundle;
    }
}
