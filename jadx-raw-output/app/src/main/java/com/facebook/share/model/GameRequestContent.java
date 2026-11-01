package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: GameRequestContent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 32\u00020\u0001:\u00034\n5B\u0011\b\u0010\u0012\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010&\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016¨\u00066"}, d2 = {"Lcom/facebook/share/model/GameRequestContent;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "c", "getCta", "cta", "", "d", "Ljava/util/List;", "getRecipients", "()Ljava/util/List;", "recipients", "e", "getTitle", "title", InneractiveMediationDefs.GENDER_FEMALE, "getData", "data", "Lcom/facebook/share/model/GameRequestContent$ActionType;", "g", "Lcom/facebook/share/model/GameRequestContent$ActionType;", "getActionType", "()Lcom/facebook/share/model/GameRequestContent$ActionType;", "actionType", "h", "getObjectId", "objectId", "Lcom/facebook/share/model/GameRequestContent$Filters;", "i", "Lcom/facebook/share/model/GameRequestContent$Filters;", "getFilters", "()Lcom/facebook/share/model/GameRequestContent$Filters;", "filters", "j", "getSuggestions", "suggestions", "parcel", "<init>", "(Landroid/os/Parcel;)V", CampaignEx.JSON_KEY_AD_K, "ActionType", "Filters", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class GameRequestContent implements ShareModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String cta;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<String> recipients;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String data;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final ActionType actionType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String objectId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Filters filters;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final List<String> suggestions;
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new a();

    /* JADX INFO: compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$ActionType;", "", "(Ljava/lang/String;I)V", "SEND", "ASKFOR", "TURN", "INVITE", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] actionTypeArrValuesCustom = values();
            return (ActionType[]) Arrays.copyOf(actionTypeArrValuesCustom, actionTypeArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Filters;", "", "(Ljava/lang/String;I)V", "APP_USERS", "APP_NON_USERS", "EVERYBODY", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Filters[] valuesCustom() {
            Filters[] filtersArrValuesCustom = values();
            return (Filters[]) Arrays.copyOf(filtersArrValuesCustom, filtersArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: GameRequestContent.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/share/model/GameRequestContent$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/GameRequestContent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/facebook/share/model/GameRequestContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<GameRequestContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int size) {
            return new GameRequestContent[size];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GameRequestContent(Parcel parcel) {
        p.j(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        parcel.writeString(this.message);
        parcel.writeString(this.cta);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }
}
