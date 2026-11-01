package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearCreativeTag f59603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaFileTag f59604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastRequest f59605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f59606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f59607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f59608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f59609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f59610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumMap f59611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AppodealExtensionTag f59612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f59613k = new ArrayList();

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd[] newArray(int i10) {
            return new VastAd[i10];
        }
    }

    public VastAd(Parcel parcel) {
        this.f59603a = (LinearCreativeTag) parcel.readSerializable();
        this.f59604b = (MediaFileTag) parcel.readSerializable();
        this.f59606d = (ArrayList) parcel.readSerializable();
        this.f59607e = parcel.createStringArrayList();
        this.f59608f = parcel.createStringArrayList();
        this.f59609g = parcel.createStringArrayList();
        this.f59610h = parcel.createStringArrayList();
        this.f59611i = (EnumMap) parcel.readSerializable();
        this.f59612j = (AppodealExtensionTag) parcel.readSerializable();
        parcel.readList(this.f59613k, AdVerificationsExtensionTag.class.getClassLoader());
    }

    public void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.f59605c;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }

    public void b(ArrayList arrayList) {
        this.f59606d = arrayList;
    }

    public void c(ArrayList arrayList) {
        this.f59608f = arrayList;
    }

    public void d(ArrayList arrayList) {
        this.f59607e = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getAdParameters() {
        return this.f59603a.getAdParameters();
    }

    @NonNull
    public List<AdVerificationsExtensionTag> getAdVerificationsExtensionList() {
        return this.f59613k;
    }

    @Nullable
    public AppodealExtensionTag getAppodealExtension() {
        return this.f59612j;
    }

    @Nullable
    public CompanionTag getBanner(@NonNull Context context) {
        ArrayList arrayList = this.f59606d;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (CompanionTag companionTag : this.f59606d) {
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    if (Utils.isTablet(context) && width == 728 && height == 90) {
                        return companionTag;
                    }
                    if (!Utils.isTablet(context) && width == 320 && height == 50) {
                        return companionTag;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public String getClickThroughUrl() {
        VideoClicksTag videoClicksTag = this.f59603a.getVideoClicksTag();
        if (videoClicksTag != null) {
            return videoClicksTag.getClickThroughUrl();
        }
        return null;
    }

    @Nullable
    public List<String> getClickTrackingUrlList() {
        return this.f59609g;
    }

    @Nullable
    public CompanionTag getCompanion(int i10, int i11) {
        ArrayList arrayList = this.f59606d;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (CompanionTag companionTag : this.f59606d) {
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    float fMax = Math.max(width, height) / Math.min(width, height);
                    if (Math.min(width, height) >= 250 && fMax <= 2.5d && companionTag.hasCreative()) {
                        map.put(Float.valueOf(width / height), companionTag);
                    }
                }
            }
            if (!map.isEmpty()) {
                float f10 = i10 / i11;
                Set setKeySet = map.keySet();
                float fFloatValue = ((Float) setKeySet.iterator().next()).floatValue();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    float fFloatValue2 = ((Float) it.next()).floatValue();
                    if (Math.abs(fFloatValue - f10) > Math.abs(fFloatValue2 - f10)) {
                        fFloatValue = fFloatValue2;
                    }
                }
                return (CompanionTag) map.get(Float.valueOf(fFloatValue));
            }
            a(VastSpecError.GENERAL_COMPANION);
        }
        return null;
    }

    @Nullable
    public Float getDurationSec() {
        return this.f59603a.getDurationSec();
    }

    @Nullable
    public List<String> getErrorUrlList() {
        return this.f59608f;
    }

    @Nullable
    public List<String> getImpressionUrlList() {
        return this.f59607e;
    }

    @NonNull
    public MediaFileTag getPickedMediaFileTag() {
        return this.f59604b;
    }

    public int getSkipOffsetSec() {
        return this.f59603a.getSkipOffsetSec();
    }

    @Nullable
    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f59611i;
    }

    @Nullable
    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.f59610h;
    }

    public void setAdVerificationsExtensionList(@NonNull List<AdVerificationsExtensionTag> list) {
        this.f59613k = list;
    }

    public void setVastRequest(@Nullable VastRequest vastRequest) {
        this.f59605c = vastRequest;
    }

    public void setWrapperCompanionClickTrackingUrlList(@Nullable ArrayList<String> arrayList) {
        this.f59610h = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f59603a);
        parcel.writeSerializable(this.f59604b);
        parcel.writeSerializable(this.f59606d);
        parcel.writeStringList(this.f59607e);
        parcel.writeStringList(this.f59608f);
        parcel.writeStringList(this.f59609g);
        parcel.writeStringList(this.f59610h);
        parcel.writeSerializable(this.f59611i);
        parcel.writeSerializable(this.f59612j);
        parcel.writeList(this.f59613k);
    }

    public VastAd(LinearCreativeTag linearCreativeTag, MediaFileTag mediaFileTag) {
        this.f59603a = linearCreativeTag;
        this.f59604b = mediaFileTag;
    }

    public void a(AppodealExtensionTag appodealExtensionTag) {
        this.f59612j = appodealExtensionTag;
    }

    public void a(ArrayList arrayList) {
        this.f59609g = arrayList;
    }

    public void a(EnumMap enumMap) {
        this.f59611i = enumMap;
    }
}
